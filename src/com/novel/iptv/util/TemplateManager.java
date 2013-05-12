package com.novel.iptv.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;

public class TemplateManager {

	private transient final static Log log = LogFactory.getLog(TemplateManager.class);
	private static Configuration cfg = new Configuration();
	
	static{
		try{
			Properties pro = new Properties();
			InputStream is = TemplateManager.class.getClassLoader().getResourceAsStream("freemarker.properties");
			if (is != null) {
				pro.load(is);
				cfg.setSettings(pro);
				log.info("load freemarker.properties success!");
			}else{
				log.info("Not found freemarker.properties");
			}
		}catch(Exception e){
			log.error("load freemarker.properties failure!",e);
		}
	}
	
	public static Configuration getConfiguration(String templatePath){
		FileTemplateLoader ftl1;
		try {
			ftl1 = new FileTemplateLoader(new File(templatePath));
			TemplateLoader[] loaders = new TemplateLoader[] { ftl1 };
			MultiTemplateLoader mtl = new MultiTemplateLoader(loaders);
			cfg.setTemplateLoader(mtl); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return TemplateManager.cfg;
	}
}
