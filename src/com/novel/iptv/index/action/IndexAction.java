package com.novel.iptv.index.action;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.Action;

public class IndexAction extends Action {
	private transient final static Log log = LogFactory.getLog(IndexAction.class);
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		String userId = null;
		String userToken = null;
		String returnUrl = null;
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String name = params.nextElement();
			if ("result".equalsIgnoreCase(name)) {
				result = request.getParameter(name);
			}
			if (userId==null && "userId".equalsIgnoreCase(name)) {
				userId = request.getParameter(name);
			}
			if (userToken==null && "userToken".equalsIgnoreCase(name)) {
				userToken = request.getParameter(name);
			}
			if (returnUrl==null && "returnInfo".equalsIgnoreCase(name)) {
				returnUrl = request.getParameter(name);
			}
		}
		if ("0".equals(result)) {
			HttpSession session=request.getSession();
			session.setAttribute("userId", userId);
			session.setAttribute("userToken", userToken);
			return mapping.findForward("index");
		} else {
			log.info("获取UUID错误");
			return mapping.findForward("error");
		}
	}
}
