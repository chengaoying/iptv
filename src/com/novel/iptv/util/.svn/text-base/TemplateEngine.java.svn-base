package com.novel.iptv.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.novel.iptv.IndexServlet;

import freemarker.core.Environment;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class TemplateEngine {
	
	private transient final static Log log = LogFactory.getLog(TemplateEngine.class);
	
	/**
	 * 发布静态页面
	 * @param templatePath 模板相对文件路径
	 * @param templateName 模板文件名称
	 * @param htmlName 发布静态页面名称
	 * @param map 封装的数据
	 * @throws Exception
	 */
	public static void publishHtml(String templatePath,String templateName,String htmlpath,String htmlName,Map map) {
		try{
			//模板路径
			Configuration cfg = TemplateManager.getConfiguration(IndexServlet.contextPath+templatePath);
			cfg.setEncoding(Locale.getDefault(), ConstConfig.ENEDITCONDE); //设置config编码格式
			cfg.setClassicCompatible(true); //设置非空模板属性
			Template t = cfg.getTemplate(templateName); //获得到模板名称
			t.setEncoding(ConstConfig.ENEDITCONDE);//设置模板编码格式
			FileUtil.check_Path(ConstConfig.temp_path);  //检查模板路径是否错误
			File dest = new File(IndexServlet.contextPath+htmlpath+"/"+htmlName);  
			Writer out = new BufferedWriter(new OutputStreamWriter(
				     new FileOutputStream(dest),ConstConfig.ENEDITCONDE));
			Environment env = t.createProcessingEnvironment(map, out);
			env.setClassicCompatible(true);
			env.process();
		}catch (Exception e) {
            log.error("Build Error"+templateName,e);
        }
	}

	
	
}
