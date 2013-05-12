/**
 * 
 */
package com.novel.iptv.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author xgh
 *
 */
public class SpringFactory 
{
	private Log log = LogFactory.getLog(this.getClass());
	
    private ApplicationContext ctx=null;
    
    private static SpringFactory instance=null;
    
    public static SpringFactory getInstance()
    {
    	if (instance ==null)
    		instance=new SpringFactory();
    	return instance;
    }
    
    private SpringFactory()
    {
    	loadSpringContext();
    }
    
    public void loadSpringContext()
    {
    	WebApplicationContext webAppContext=ContextLoader.getCurrentWebApplicationContext();
    	if (webAppContext ==null)
    	{
	    	String[] springFile=ConfigUtil.getProperties("ConfigFile","applicationContext.xml","SpringConfig").split(",");
	        ctx=new ClassPathXmlApplicationContext(springFile); 
	        log.info("Load Spring Context successful.");
    	}
    	else
    	{
    		ctx=(ApplicationContext)webAppContext;
    		log.info("Spring Content has already loaded successful.");
    	}
    }
    
    public void destorySpringContext()
    {
        if (ctx !=null)
        {
        	if (ctx instanceof ClassPathXmlApplicationContext)
        		((ClassPathXmlApplicationContext)ctx).close();
            ctx=null;
            log.info("Destory SpringContext successful.");
        }
        else
        {
        	log.info("Spring Content has already destoryed successful.");
        }
    }
    
    /**
     * 
     * @param beanName
     * @return
     */
    public Object getSpringBean(String beanName)
    {
        Object obj=null;
        if (ctx !=null)
        {
            obj=ctx.getBean(beanName);
        }
        else
        {
            log.info("Spring Content is not been loaded.");
        }
        return obj;
    }

}
