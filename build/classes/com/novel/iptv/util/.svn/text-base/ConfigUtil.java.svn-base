package com.novel.iptv.util;

import org.apache.log4j.Logger;
import org.jconfig.Configuration;
import org.jconfig.ConfigurationManager;

/**
 * @author xgh
 *
 */
public class ConfigUtil
{
	public static Configuration configuration;
	public static Logger log = Logger.getLogger(ConfigUtil.class); 
    
    static
    {
        configuration = ConfigurationManager.getConfiguration();
    }
    
    public static String getProperties(String key, String defaultValue)
    {
        return configuration.getProperty(key, defaultValue);
    }
    
    public static String getProperties(String key, String defaultValue,
            String category)
    {
        return configuration.getProperty(key, defaultValue, category);
    }
    
    public static int getIntProperty(String key, int defaultValue)
    {
        return configuration.getIntProperty(key, defaultValue);
    }
    
    public static int getIntProperty(String key, int defaultValue,
            String category)
    {
        return configuration.getIntProperty(key, defaultValue, category);
    }
    
    public static Integer getIntProperty(String key, Integer defaultValue,
			String category) {
        return configuration.getIntProperty(key, defaultValue, category);
    }
    
    public static String[] getArray(String key, String[] defaultValue, String category) {
    	
    	return configuration.getArray(key, defaultValue, category);
	}
    
    public static String[] getPropertyNames(String category) {
    	return configuration.getPropertyNames(category);
    }
}
