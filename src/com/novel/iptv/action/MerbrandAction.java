package com.novel.iptv.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.actions.DispatchAction;

import com.novel.iptv.exception.SysException;
import com.novel.iptv.model.HtmlRequestVo;
import com.novel.iptv.model.MerbrandVo;
import com.novel.iptv.model.hibernate.Merbrand;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.util.BeanUtils;
import com.novel.iptv.util.BusiGoble.pageMessage;
import com.novel.iptv.util.BusiUtils;
import com.novel.iptv.util.DateTimeUtils;
import com.novel.iptv.util.HtmlUtil;
import com.novel.iptv.util.SpringFactory;

public class MerbrandAction extends DispatchAction {

	private transient final static Log log = LogFactory
			.getLog(MerbrandAction.class);
	private IBaseService baseService;

	public void setServlet(ActionServlet actionServlet) {
		super.setServlet(actionServlet);
		baseService = (IBaseService) SpringFactory.getInstance().getSpringBean("baseService");
	}

	public ActionForward addMerbrand(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("新增品牌");
		String brandCode=BusiUtils.getParameter(request,"brandCode","");
		String brandName=BusiUtils.getParameter(request,"brandName","");
		String merbrandCode=BusiUtils.getParameter(request,"merbrandCode","");
		String merbrandName=BusiUtils.getParameter(request,"merbrandName","");
		String merchantCode=BusiUtils.getParameter(request,"merchantCode","");
		String merchantName=BusiUtils.getParameter(request,"merchantName","");
		String memo=BusiUtils.getParameter(request,"memo","");
		if(brandCode.equals("")||merchantCode.equals("")||merbrandCode.equals("")){
			request.setAttribute("returnMes", "必填项不能为空");
			return mapping.findForward("addMerbrand");
		}
		try {
			//判断商城品牌编号是否重复
			List list = baseService.findByProperty("Merbrand", new String[]{"brandCode","merchantCode"}, new String[]{brandCode,merchantCode});
			if(list!=null&&!list.isEmpty()){
				request.setAttribute("returnMes", "相同商城品牌:"+brandName +" 已存在");
				return mapping.findForward("addMerbrand");
			}
			//判断商家品牌编号是否重复
			list = baseService.findByProperty("Merbrand", new String[]{"merbrandCode","merchantCode"}, new String[]{merbrandCode,merchantCode});
			if(list!=null&&!list.isEmpty()){
				request.setAttribute("returnMes", "相同商家品牌编号:"+merbrandCode +" 已存在");
				return mapping.findForward("addMerbrand");
			}
			Merbrand brand = new Merbrand();
			brand.setBrandCode(brandCode);
			brand.setBrandName(brandName);
			brand.setMerbrandCode(merbrandCode);
			brand.setMerbrandName(merbrandName);
			brand.setMerchantCode(merchantCode);
			brand.setMerchantName(merchantName);
			brand.setMemo(memo);
			brand.setCreactdate(DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_DEFAULT));
			baseService.saveOrUpdate(brand);
			log.info("新增品牌【"+brandName+"】成功");
			request.setAttribute("returnMes", "新增品牌【"+brandName+"】成功");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return mapping.findForward("addMerbrand");
	}
	
	public ActionForward delMerbrand(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("删除品牌");
		try {
			String bid = BusiUtils.getParameter(request, "bid", "");
			if(bid.equals("")){
				throw new SysException("无效删除操作");
			}
			Merbrand brand = (Merbrand)baseService.findByPK(Merbrand.class, Integer.valueOf(bid));
			baseService.deleteObject(brand);
			request.setAttribute("returnMes", "删除品牌成功");
		} catch (Exception e) {
			e.getStackTrace();
			request.setAttribute("returnMes", "删除品牌失败："+e.getMessage());
		}
		return merbrandSearch(mapping, form,request, response) ;
	}
	
	public ActionForward gotoUpdate(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("更新品牌");
		try {
			String bid = BusiUtils.getParameter(request, "bid", "");
			if(bid.equals("")){
				throw new SysException("无效的品牌");
			}
			Merbrand brand = (Merbrand)baseService.findByPK(Merbrand.class, Integer.valueOf(bid));
			request.setAttribute("brand", brand);
			return mapping.findForward("updateMerbrand");
		} catch (Exception e) {
			e.getStackTrace();
			request.setAttribute("returnMes", "修改品牌失败："+e.getMessage());
			return merbrandSearch(mapping, form,request, response) ;
		}
	}

	public ActionForward updateMerbrand(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("修改品牌");
		String bid=BusiUtils.getParameter(request,"bid","");
		String brandCode=BusiUtils.getParameter(request,"brandCode","");
		String brandName=BusiUtils.getParameter(request,"brandName","");
		String merbrandCode=BusiUtils.getParameter(request,"merbrandCode","");
		String merbrandName=BusiUtils.getParameter(request,"merbrandName","");
		String merchantCode=BusiUtils.getParameter(request,"merchantCode","");
		String merchantName=BusiUtils.getParameter(request,"merchantName","");
		String memo=BusiUtils.getParameter(request,"memo","");
		if(bid.equals("")){
			request.setAttribute("returnMes", "无效的品牌");
			return this.gotoUpdate(mapping, form, request, response);
		}
		if(brandCode.equals("")||merchantCode.equals("")||merbrandCode.equals("")){
			request.setAttribute("returnMes", "必填项不能为空");
			return this.gotoUpdate(mapping, form, request, response);
		}
		try {
			//判断商城品牌编号是否重复
			List list = baseService.findByProperty("Merbrand", new String[]{"brandCode","merchantCode"}, new String[]{brandCode,merchantCode});
			if(list!=null&&!list.isEmpty()){
				Merbrand tem = null;
				for(int i=0;i<list.size();i++){
					tem = (Merbrand)list.get(i);
					if(tem!=null && !tem.getBid().toString().equals(bid)){
						request.setAttribute("returnMes", "相同商城品牌:"+brandName +" 已存在");
						return this.gotoUpdate(mapping, form, request, response);
					}
				}
			}
			//判断商家品牌编号是否重复
			list = baseService.findByProperty("Merbrand", new String[]{"merbrandCode","merchantCode"}, new String[]{merbrandCode,merchantCode});
			if(list!=null&&!list.isEmpty()){
				Merbrand tem = null;
				for(int i=0;i<list.size();i++){
					tem = (Merbrand)list.get(i);
					if(tem!=null && !tem.getBid().toString().equals(bid)){
						request.setAttribute("returnMes", "相同商家品牌编号:"+merbrandCode +" 已存在");
						return this.gotoUpdate(mapping, form, request, response);
					}
				}
			}
			
			Merbrand brand = (Merbrand)baseService.findByPK(Merbrand.class, Integer.valueOf(bid));
			brand.setBrandCode(brandCode);
			brand.setBrandName(brandName);
			brand.setMerbrandCode(merbrandCode);
			brand.setMerbrandName(merbrandName);
			brand.setMerchantCode(merchantCode);
			brand.setMerchantName(merchantName);
			brand.setMemo(memo);
			baseService.saveOrUpdate(brand);
			log.info("修改品牌【"+brandName+"】成功");
			request.setAttribute("returnMes", "修改品牌【"+brandName+"】成功");
			return this.merbrandSearch(mapping, form, request, response);
		} catch (Exception e) {
			e.getStackTrace();
			request.setAttribute("returnMes", "修改品牌失败");
			return this.gotoUpdate(mapping, form, request, response);
		}
	}
	
	public ActionForward merbrandSearch(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			log.info("品牌查询");
			String pageNo = BusiUtils.getParameter(request, "nowPage", "1");
			String allPage = BusiUtils.getParameter(request, "totalPage", "");
			String brandCode=BusiUtils.getParameter(request,"brandCode","");
			String brandName=BusiUtils.getParameter(request,"brandName","");
			String merbrandCode=BusiUtils.getParameter(request,"merbrandCode","");
			String merbrandName=BusiUtils.getParameter(request,"merbrandName","");
			//String merchantCode=BusiUtils.getParameter(request,"merchantCode","");
			String merchantName=BusiUtils.getParameter(request,"merchantName","");
			String path = request.getContextPath();
			List<String> seldatalist = new ArrayList<String>();
			seldatalist.add(brandCode);
			seldatalist.add(brandName);
			seldatalist.add(merbrandCode);
			seldatalist.add(merbrandName);
			//seldatalist.add(merchantCode);
			seldatalist.add(merchantName);
			String[] selId = new String[] { "brandCode", "brandName", 
					"merbrandCode", "merbrandName", "merchantName" };
			String[] values = new String[] { brandCode, brandName,
					merbrandCode, merbrandName, merchantName };
			List dataList = baseService.findByLikeProperty("Merbrand",
					selId, values, Integer.parseInt(pageNo),
					pageMessage.pageCount, new String[] { "bid" }, false);
			if ((allPage.equals("") || allPage.equals("-1"))
					&& dataList != null && !dataList.isEmpty()) {
				List datas = baseService.findByLikeProperty("Merbrand",
						selId, values, new String[] { "bid" }, false);
				int totalPage = datas.size() / pageMessage.pageCount;
				if (datas.size() % pageMessage.pageCount > 0)
					totalPage++;
				allPage = totalPage + "";
			}
			String[] selTitle = new String[] { "商城品牌编号：", "商城品牌名称：", "商家品牌编号：", "商家品牌名称：", "商家名称：" };
			String[] types = new String[] { "text", "text", "text", "text", "text" };
			HtmlRequestVo htmlRequestVo = new HtmlRequestVo("商品管理>>品牌查询", path,
					path + "/merbrand.do?method=merbrandSearch", new String[] { "编号", "商城品牌编号", "商城品牌名称", 
							"商家品牌编号", "商家品牌名称", "商家编号", "商家名称", "创建时间", "备注" }, 
							buildMerbrandQueryVo(dataList), new String[] {
							"bid", "brandCode", "brandName",
							"merbrandCode", "merbrandName", "merchantCode", "merchantName",
							"creactdate", "memo" }, Integer.parseInt(pageNo),
					allPage.equals("") ? 1 : Integer.parseInt(allPage));
			htmlRequestVo.setSelTitle(selTitle);
			htmlRequestVo.setSelId(selId);
			htmlRequestVo.setDatalist(seldatalist);
			htmlRequestVo.setTypes(types);
			htmlRequestVo.setOperatorName(new String[]{"修改", "删除"});
			htmlRequestVo.setOperatorMethod(new String[]{"updateMerbrand(this.id)", "deleteMerbrand(this.id)"});
			String html = HtmlUtil.makeHtml(htmlRequestVo);
			// System.out.println(html);
			request.setAttribute("merbrandQuery", html);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapping.findForward("merbrandQuery");
	}

	private List buildMerbrandQueryVo(List brandList) {
		List returnList = new ArrayList();
		for (Iterator iterator = brandList.iterator(); iterator.hasNext();) {
			Merbrand brand = (Merbrand) iterator.next();
			if(brand!=null){
				MerbrandVo vo = new MerbrandVo();
				BeanUtils.copyProperties(vo, brand);
				vo.setCreactdate(DateTimeUtils.formatDate(DateTimeUtils.parseDate(vo.getCreactdate(),DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3));
				returnList.add(vo);
			}
		}
		return returnList;
	}
}
