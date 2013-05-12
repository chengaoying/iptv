package com.novel.iptv.action;

import java.util.Hashtable;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.novel.iptv.model.hibernate.Operator;

public class SessionListener implements HttpSessionListener {
	private transient final static Log log = LogFactory.getLog(SessionListener.class);
	private static java.util.Hashtable hUserName = new Hashtable();

	public void sessionCreated(HttpSessionEvent se) {
//		System.out.println("已创建新用户session -- " + se);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		log.info("会话过期");
		HttpSession session=se.getSession();
		if(session!=null&&session.getAttribute("operatorMessage")!=null){
			Operator operator = (Operator)session.getAttribute("operatorMessage");
			hUserName.remove(operator.getLoginName());
		}
//		System.out.println("删除用户session -- " + se);
	}

	public synchronized static boolean isLogined(HttpSession session,
			String sUserName) {
		boolean flag = false;
		if (hUserName.containsKey(sUserName)) {
			flag = true;
			HttpSession vsession = (HttpSession) hUserName.get(sUserName);
			try {
				vsession.invalidate();
//				System.out.println("用户 - " + sUserName + " || session 已存在 - "
//						+ session);
//				System.out.println("已设置 - " + sUserName + " || session 失效并移除");
			} catch (Exception ex) {
			}
		} else {
			flag = false;

		}
		hUserName.remove(sUserName);
		hUserName.put(sUserName, session);
//		System.out.println("创建用户 - " + sUserName + " || session - " + session);
		return flag;
	}

	public synchronized static void userLogined(HttpSession session,
			String sUserName) {
		hUserName.remove(sUserName);
		hUserName.put(sUserName, session);
//		System.out.println("创建用户 - " + sUserName + " || session - " + session);
	}
	
	public synchronized static boolean deleteUserName(HttpSession session,
			String sUserName) {
//		System.out.println("删除用户 - " + sUserName + " || session - " + session);
		hUserName.remove(sUserName); // 删除用户
		return true;
	}

	public synchronized static boolean isOnline(HttpSession session,
			String sUserName) {
		boolean flag = false;
		HttpSession vsession = null;
		try {
			vsession = (HttpSession) hUserName.get(sUserName);
		} catch (Exception e) {

		}
		if (vsession != null) {
			flag = true;
		}
		return flag;

	}
}
