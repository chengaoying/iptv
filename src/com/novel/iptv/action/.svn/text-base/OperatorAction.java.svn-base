package com.novel.iptv.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.actions.DispatchAction;

import com.novel.iptv.exception.SysException;
import com.novel.iptv.model.HtmlRequestVo;
import com.novel.iptv.model.OperatorQueryVO;
import com.novel.iptv.model.hibernate.Operator;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.util.BeanUtils;
import com.novel.iptv.util.BusiGoble.pageMessage;
import com.novel.iptv.util.BusiUtils;
import com.novel.iptv.util.DateTimeUtils;
import com.novel.iptv.util.HtmlUtil;
import com.novel.iptv.util.SpringFactory;

public class OperatorAction extends DispatchAction {
	private transient final static Log log = LogFactory.getLog(OperatorAction.class);
	private IBaseService baseService;
	
	public void setServlet(ActionServlet actionServlet)
	{
		super.setServlet(actionServlet);
		baseService=(IBaseService)SpringFactory.getInstance().getSpringBean("baseService");
	}
	
	public ActionForward addOperator(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("新增用户");
		String userName=BusiUtils.getParameter(request,"userName","");
		String loginName=BusiUtils.getParameter(request,"loginName","");
		String password=BusiUtils.getParameter(request,"password","");
		String isSys=BusiUtils.getParameter(request,"radiobutton","");
		String memo=BusiUtils.getParameter(request,"memo","");
		if(userName.equals("")||loginName.equals("")||password.equals("")||isSys.equals("")){
			request.setAttribute("returnMes", "必填项不能为空");
			return mapping.findForward("addOperator");
		}
		try {
			//判断登录名是否重名
			List list = baseService.findByProperty("Operator", "loginName", loginName);
			if(list!=null&&!list.isEmpty()){
				request.setAttribute("returnMes", "相同登录名:"+loginName +" 已存在");
				return mapping.findForward("addOperator");
			}
			Operator operator = new Operator();
			operator.setContent(memo==null?"":memo);
			operator.setLoginName(loginName);
			operator.setNickname(userName);
			String pwdMd5 = BeanUtils.Md5(password);
			operator.setPwd(pwdMd5);
			operator.setContent(memo);
			operator.setCreactdate(DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_DEFAULT));
			operator.setUpdadate(DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_DEFAULT));
			operator.setIsSys(Integer.parseInt(isSys));
			baseService.saveOrUpdate(operator);
			log.info("新增用户【"+userName+"】成功");
			request.setAttribute("returnMes", "新增用户成功");
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		return mapping.findForward("addOperator");
	}
	
	public ActionForward updateOperator(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("修改用户密码");
		try {
			String oldPassword=BusiUtils.getParameter(request,"oldPassword",null);
			String newPassword=BusiUtils.getParameter(request,"newPassword",null);
			String confirmPassword=BusiUtils.getParameter(request,"confirmPassword",null);
			if(oldPassword==null||newPassword==null||confirmPassword==null||oldPassword.equals("")||newPassword.equals("")||confirmPassword.equals("")){
				request.setAttribute("returnMes", "密码不能为空");
				return mapping.findForward("operatorUpdate");
			}
			if(!newPassword.trim().equals(confirmPassword.trim())){
				request.setAttribute("returnMes", "确认密码不匹配");
				return mapping.findForward("operatorUpdate");
			}
			String oldPwdMd5 = BeanUtils.Md5(oldPassword);
			String newPwdMd5 = BeanUtils.Md5(newPassword);
			HttpSession  session = request.getSession();
			Operator operator = (Operator)session.getAttribute("operatorMessage");
			if(!oldPwdMd5.equals(operator.getPwd())){
				request.setAttribute("returnMes", "旧密码验证错误");
				return mapping.findForward("operatorUpdate");
			}
			operator.setPwd(newPwdMd5);
			baseService.saveOrUpdate(operator);
			session.setAttribute("operatorMessage",operator);
			request.setAttribute("returnMes", "密码修改成功");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return mapping.findForward("operatorUpdate");
	}
	
	public ActionForward delOperator(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("删除用户");
		try {
			String delid = BusiUtils.getParameter(request, "delid", "");
			if(delid.equals("")){
				throw new SysException("无效删除操作");
			}
			Operator operator = (Operator)baseService.findByPK(Operator.class, Integer.valueOf(delid));
			HttpSession session = request.getSession();
			Operator loginOperator = (Operator)session.getAttribute("operatorMessage");
			if(operator.getUid().intValue()==loginOperator.getUid().intValue()||operator.getLoginName().equals("admin")){
				request.setAttribute("returnMes", "本用户不允许删除");
				return selectOperator(mapping, form,request, response) ;
			}
			baseService.deleteObject(operator);
			request.setAttribute("returnMes", "删除用户成功");
			return selectOperator(mapping, form,request, response) ;
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	
	public ActionForward selectOperator(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("查询用户");
		try {
			String nickname=BusiUtils.getParameter(request,"nickname","");
			String loginName=BusiUtils.getParameter(request,"loginName","");
			String pageNo = BusiUtils.getParameter(request, "nowPage", "1");
			String allPage = BusiUtils.getParameter(request, "totalPage", null);
			String path = request.getContextPath();
			String[] selId = new String[] { "nickname", "loginName" };
			String[] values = new String[] { nickname, loginName };
			String[] selTitle = new String[] { "用户名称：","登录名称：" };
			String[] types = new String[] { "text", "text" };
			List<String> seldatalist = new ArrayList<String>();
			seldatalist.add(nickname);
			seldatalist.add(loginName);
			List dataList = baseService.findByLikeProperty("Operator", selId, values, Integer.parseInt(pageNo), pageMessage.pageCount, new String[] { "uid" }, false);
			if(allPage==null&&dataList!=null&&!dataList.isEmpty()){
				List datas = baseService.findByLikeProperty("Operator", selId, values, new String[] { "uid" }, false);
				int totalPage = datas.size()/pageMessage.pageCount;
				if(datas.size()%pageMessage.pageCount>0)
					totalPage++;
				allPage=totalPage+"";
		    }
			HtmlRequestVo htmlRequestVo = new HtmlRequestVo("用户管理>>查询用户",path,path+"/Operator.do?method=selectOperator", new String[]{"编号","用户名称","登录名称","创建时间","更新时间","是否系统管理员","备注"}, buildOperatorQueryVO(dataList), new String[]{"uid","nickname","loginName","creactdate","updadate","isSys","content"},Integer.parseInt(pageNo),allPage==null?1:Integer.parseInt(allPage));
			htmlRequestVo.setSelTitle(selTitle);
			htmlRequestVo.setSelId(selId);
			htmlRequestVo.setDatalist(seldatalist);
			htmlRequestVo.setTypes(types);
			htmlRequestVo.setOperatorName(new String[]{"修改", "删除"});
			htmlRequestVo.setOperatorMethod(new String[]{"updateOper(this.id)", "deleteOper(this.id)"});
			String html =HtmlUtil.makeHtml(htmlRequestVo);
			request.setAttribute("operatorQuery",html);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return mapping.findForward("operatorQuery");
	}
	
	private List buildOperatorQueryVO(List operatorList){
		List returnList = new ArrayList();
		for (Iterator iterator = operatorList.iterator(); iterator.hasNext();) {
			OperatorQueryVO operatorQueryVO = new OperatorQueryVO();
			Operator operator = (Operator) iterator.next();
			BeanUtils.copyProperties(operatorQueryVO,operator);
			operatorQueryVO.setCreactdate(DateTimeUtils.formatDate(DateTimeUtils.parseDate(operatorQueryVO.getCreactdate(), DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3));
			operatorQueryVO.setUpdadate(DateTimeUtils.formatDate(DateTimeUtils.parseDate(operatorQueryVO.getUpdadate(), DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3));
			operatorQueryVO.setIsSys(operator.getIsSys().intValue()==1?"是":"否");
			returnList.add(operatorQueryVO);
		}
		return returnList;
	}
	
	public ActionForward gotoAltPage(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("更新用户");
		try {
			String uid = BusiUtils.getParameter(request, "uid", "");
			if(uid.equals("")){
				throw new SysException("无效的用户");
			}
			Operator operator = (Operator)baseService.findByPK(Operator.class, Integer.valueOf(uid));
			if(operator==null){
				throw new SysException("无效的用户");
			}
			if(operator.getIsSys().intValue()==1){
				HttpSession session = request.getSession();
				Operator operatorMessage = (Operator)session.getAttribute("operatorMessage");
				if(operatorMessage.getUid().intValue()!=Integer.parseInt(uid)){
					throw new SysException("不能修改管理员的资料");
				}
			}
			request.setAttribute("operator", operator);
			return mapping.findForward("altOperator");
		} catch (Exception e) {
			e.getStackTrace();
			request.setAttribute("returnMes", "修改用户失败："+e.getMessage());
			return selectOperator(mapping, form,request, response) ;
		}
	}

	public ActionForward altOperator(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		log.info("修改用户");
		String uid=BusiUtils.getParameter(request,"uid","");
		String userName=BusiUtils.getParameter(request,"alt_userName","");
		String loginName=BusiUtils.getParameter(request,"alt_loginName","");
		String isSys=BusiUtils.getParameter(request,"alt_radiobutton","");
		String memo=BusiUtils.getParameter(request,"alt_memo","");
		String isalt_psw=BusiUtils.getParameter(request,"isalt_psw","1");
		String password=BusiUtils.getParameter(request,"password","");
		if(userName.equals("")||loginName.equals("")||(isalt_psw.equals("1")&&password.equals(""))){
			request.setAttribute("returnMes", "必填项不能为空");
			return this.gotoAltPage(mapping, form, request, response);
		}
		try {
			//判断登录名是否重名
			List list = baseService.findByProperty("Operator", "loginName", loginName);
			if(list!=null&&!list.isEmpty()){
				Operator tem = null;
				for(int i=0;i<list.size();i++){
					tem = (Operator)list.get(i);
					if(tem!=null && !tem.getUid().toString().equals(uid)){
						request.setAttribute("returnMes", "相同登录名:"+loginName +" 已存在");
						return this.gotoAltPage(mapping, form, request, response);
					}
				}
			}
			Operator operator = (Operator)baseService.findByPK(Operator.class, Integer.valueOf(uid));
			if(operator==null){
				request.setAttribute("returnMes", "无效的用户");
				return this.gotoAltPage(mapping, form, request, response);
			}
			operator.setContent(memo==null?"":memo);
			operator.setLoginName(loginName);
			operator.setNickname(userName);
			operator.setContent(memo);
			operator.setUpdadate(DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_DEFAULT));
			operator.setIsSys(Integer.parseInt(isSys));
			if(isalt_psw.equals("1")){
				String pwdMd5 = BeanUtils.Md5(password);
				operator.setPwd(pwdMd5);
			}
			baseService.saveOrUpdate(operator);
			log.info("修改用户【"+userName+"】成功");
			request.setAttribute("returnMes", "修改用户成功");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return selectOperator(mapping, form,request, response) ;
	}
	
}
