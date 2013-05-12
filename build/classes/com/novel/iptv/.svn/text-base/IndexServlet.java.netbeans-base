package com.novel.iptv;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.novel.iptv.temp.Temp;

public class IndexServlet extends HttpServlet {
	
	private static final Log log = LogFactory.getLog(IndexServlet.class);

	/** 容器路径根目录 */
	public static String contextPath = "";
	public void init(ServletConfig config) {
		try {
			log.info("开启加载");
			super.init(config);
			contextPath = getServletContext().getRealPath("/");
			Temp.Htmlpush();
		} catch (Exception e) {
			log.error("加载失败：" + e.getMessage(), e);
		}
	}
	
}
