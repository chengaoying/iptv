package com.novel.iptv.group.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DirectBuyRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO;

import com.novel.iptv.group.dao.GroupDAO;
import com.novel.iptv.util.BusiUtils;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;

public class GroupAction extends DispatchAction {
	
	public ActionForward querylist(ActionMapping mapping, ActionForm form,HttpServletRequest request, 
			HttpServletResponse response) {
		try {
			int page=1;
			String str=BusiUtils.getParameter(request,"page","");
			if(str!=null && str!=""){
				page=Integer.parseInt(str);
			}
			RushBuyQueryRequestVO queryVO = new RushBuyQueryRequestVO();
			RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
			BeanUtils.copyProperties(requestheadvo, queryVO);
			queryVO.setInterfaceId("118");
			queryVO.setPageSize(4);
			queryVO.setCurrentPage(page);
			queryVO.setType(2);
			queryVO.setStatus("4");
			queryVO.setSortType(2);
			RushBuyQueryResponseVO res = GroupDAO.getInstance().getDATAList(queryVO);
			request.setAttribute("rush", res);
			request.setAttribute("page", queryVO.getCurrentPage());
			request.setAttribute("temp", ConstConfig.html_path);
			request.setAttribute("picsize", ConstConfig.pic_g_list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("list");
	}
	public ActionForward buypush(ActionMapping mapping, ActionForm form,HttpServletRequest request, 
			HttpServletResponse response) {
		String cardNo = null;  //智能卡号
		if (request.getSession().getAttribute("userId") != null && request.getSession().getAttribute("userId") != "") {
			cardNo = request.getSession().getAttribute("userId").toString();
		} else {
			return mapping.findForward("index");
		}
		String merCode = BusiUtils.getParameter(request,"merCode",""); //商品编号
		String phone = BusiUtils.getParameter(request,"phone","");  //手机号码
		int haveByeNum = Integer.parseInt(BusiUtils.getParameter(request,"haveNum",""));//已经购买的数量
		int buyNumLimit = Integer.parseInt(BusiUtils.getParameter(request,"buyNum",""));//限制购买数量
		if(buyNumLimit <= haveByeNum && buyNumLimit!=0){
			request.setAttribute("msg", "操作失败,购买数量已满");
			return mapping.findForward("error");
		}
		DirectBuyRequestVO requestVO = new DirectBuyRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, requestVO);
		requestVO.setInterfaceId("107");
		requestVO.setMerchandiseCode(merCode);
		requestVO.setCardNo(cardNo);
		requestVO.setMobile(phone);
		requestVO.setBuyNum(1);
		requestVO.setIsGroup(0);
		requestVO.setDeliveryType(3);
		requestVO.setPayType(3);
		requestVO.setOrderSource(5);
		DirectBuyResponseVO res = GroupDAO.getInstance().buy(requestVO);
		if("0000".equals(res.getRespCode())){
			request.setAttribute("msg", "操作成功，您的订单已经接收，稍后会有客服联系您！谢谢。");
		}else 
			request.setAttribute("msg", res.getRespDesc());
		return mapping.findForward("error");
	}
}
