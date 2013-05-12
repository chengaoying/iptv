package com.novel.iptv.action;

import java.util.ArrayList;
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

import com.novel.iptv.model.hibernate.Tb_merchandise_image;
import com.novel.iptv.model.hibernate.Tb_merchandise_info;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.util.SpringFactory;

public class DetailAction extends DispatchAction{
	private transient final static Log log = LogFactory.getLog(LoginAction.class);
	private IBaseService baseService;
	public void setServlet(ActionServlet actionServlet)
	{
		super.setServlet(actionServlet);
		baseService=(IBaseService)SpringFactory.getInstance().getSpringBean("baseService");
	}
	public ActionForward detail(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response){
		log.info("查找详情");
		String id = request.getParameter("id");
		HttpSession session =request.getSession();
		List merLis =baseService.findByProperty("Tb_merchandise_info", "code", id);
		if(merLis.size()==0||merLis==null){
			request.setAttribute("msg", "您选择的商品不存在或者已经下架");
			return mapping.findForward("error");
		}
		Tb_merchandise_info mer =(Tb_merchandise_info)merLis.get(0);
		
		List images =baseService.findByProperty("Tb_merchandise_image", "merchandise_code",mer.getCode());
		String s=null;	
		if(images.size()>0){
				Tb_merchandise_image image =(Tb_merchandise_image)images.get(0);
				String imgpath = image.getImage_path();
				s =imgpath.substring(0,imgpath.indexOf(".")) + ConstConfig.merDestail +imgpath.substring(imgpath.indexOf("."),imgpath.length());								
			}
		request.setAttribute("mer", mer);
		request.setAttribute("img", s);
		
		session.removeAttribute("two");
		session.removeAttribute("page");
		session.removeAttribute("tit_three");
		session.removeAttribute("tit_two");
		session.removeAttribute("one");
		session.removeAttribute("three");
		return mapping.findForward("detail");
	}
}
