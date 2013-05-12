package com.novel.iptv.action;


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

import com.novel.iptv.model.hibernate.Operator;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.util.BeanUtils;
import com.novel.iptv.util.BusiUtils;
import com.novel.iptv.util.SpringFactory;

public class LoginAction extends DispatchAction {
	private transient final static Log log = LogFactory.getLog(LoginAction.class);
	private IBaseService baseService;
	
	public void setServlet(ActionServlet actionServlet)
	{
		super.setServlet(actionServlet);
		baseService=(IBaseService)SpringFactory.getInstance().getSpringBean("baseService");
	}
	
	public ActionForward loginIn(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		try {
			log.info("用户登录");
			String userName = BusiUtils.getParameter(request, "userName", null);
			String passWord = BusiUtils.getParameter(request, "passWord", null);
			if(userName==null||passWord==null||userName.equals("")||passWord.equals("")){
				request.setAttribute("errorMes", "用户名或密码不能为空,请重新输入登录信息");
				return mapping.findForward("LOGIN");
			}
			List datalist = baseService.findByProperty("Operator", "loginName", userName);
			if(datalist==null||datalist.isEmpty()){
				request.setAttribute("errorMes", "用户名或密码错误,请重新输入登录信息");
				return mapping.findForward("LOGIN");
			}
			Operator operator=(Operator)datalist.get(0);
			String pwdMd5 = BeanUtils.Md5(passWord);
			if(!operator.getPwd().trim().equals(pwdMd5)){
				request.setAttribute("errorMes", "用户名或密码错误,请重新输入登录信息");
				return mapping.findForward("LOGIN");
			}
			HttpSession session = request.getSession();
			if(SessionListener.isOnline(session, operator.getLoginName())){
				request.setAttribute("errorMes", "用户名为:"+operator.getLoginName()+"已登录");
				return mapping.findForward("LOGIN");
			}
			SessionListener.userLogined(session, operator.getLoginName());
			session.setAttribute("operatorMessage", operator);//记录用户登录信息
			log.info("用户登录成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//验证用户名密码
		return mapping.findForward("MAIN");
	}
	public ActionForward closeBrowse(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) 
	{
		try {
			log.info("关闭浏览器");
			HttpSession session = request.getSession();
			if(session!=null)
				session.invalidate();
			log.info("清除session信息");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//验证用户名密码
		return null;
	}

}
