package com.novel.iptv.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.novel.iptv.exception.SysException;

/**
 * 系统配置文件(.properties)处理类 <BR>
 * 未加入缓存,因为读取不会很频繁
 * 
 * 
 */
public class SystemConfig {
	private static final String DEFAULT_CONFIG = "SystemConfig.properties";

	private static ClassLoader defaultClassLoader;

	private SystemConfig() {
	}

	/**
	 * Returns the default classloader (may be null).
	 * 
	 * @return The default classloader
	 */
	public static ClassLoader getDefaultClassLoader() {
		return defaultClassLoader;
	}

	/**
	 * Sets the default classloader
	 * 
	 * @param defaultClassLoader
	 *            - the new default ClassLoader
	 */
	public static void setDefaultClassLoader(ClassLoader defaultClassLoader) {
		SystemConfig.defaultClassLoader = defaultClassLoader;
	}

	/**
	 * Returns a resource on the classpath as a Properties object
	 * 
	 * @param resource
	 *            The resource to find
	 * @return The resource
	 * @throws IOException
	 *             If the resource cannot be found or read
	 */
	public static Properties getResourceAsProperties(String resource)
			throws IOException {
		Properties props = new Properties();
		InputStream in = null;
		String propfile = resource;
		in = getResourceAsStream(propfile);
		props.load(in);
		in.close();
		return props;
	}

	/**
	 * Returns a resource on the classpath as a Properties object
	 * 
	 * @param loader
	 *            The classloader used to load the resource
	 * @param resource
	 *            The resource to find
	 * @return The resource
	 * @throws IOException
	 *             If the resource cannot be found or read
	 */
	public static Properties getResourceAsProperties(ClassLoader loader,
			String resource) throws IOException {
		Properties props = new Properties();
		InputStream in = null;
		String propfile = resource;
		in = getResourceAsStream(loader, propfile);
		props.load(in);
		in.close();
		return props;
	}

	/**
	 * Returns a resource on the classpath as a Stream object
	 * 
	 * @param resource
	 *            The resource to find
	 * @return The resource
	 * @throws IOException
	 *             If the resource cannot be found or read
	 */
	public static InputStream getResourceAsStream(String resource)
			throws IOException {
		return getResourceAsStream(getClassLoader(), resource);
	}

	/**
	 * Returns a resource on the classpath as a Stream object
	 * 
	 * @param loader
	 *            The classloader used to load the resource
	 * @param resource
	 *            The resource to find
	 * @return The resource
	 * @throws IOException
	 *             If the resource cannot be found or read
	 */
	public static InputStream getResourceAsStream(ClassLoader loader,
			String resource) throws IOException {
		InputStream in = null;
		if (loader != null)
			in = loader.getResourceAsStream(resource);
		if (in == null)
			in = ClassLoader.getSystemResourceAsStream(resource);
		if (in == null)
			throw new IOException("Could not find resource " + resource);
		return in;
	}

	private static ClassLoader getClassLoader() {
		if (defaultClassLoader != null) {
			return defaultClassLoader;
		} else {
			return Thread.currentThread().getContextClassLoader();
		}
	}

	// 本行以上代码拷贝自com.ibatis.common.resources.Resources

	/**
	 * 从默认配置文件(SystemConfig.properties)中读取配置
	 * 
	 * @param key
	 *            键
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public static String getDefaultConfig(String key, String defaultValue) {
		return loadProperties(DEFAULT_CONFIG).getProperty(key, defaultValue);
	}

	public static String getDefaultConfig(String key) {
		return loadProperties(DEFAULT_CONFIG).getProperty(key);
	}

	public static String getConfig(String resource, String key) {
		return loadProperties(resource).getProperty(key);
	}

	public static String getConfig(String resource, String key,
			String defaultValue) {
		return loadProperties(resource).getProperty(key);
	}

	public static Properties loadProperties(String resource) {
		try {
			Properties props = getResourceAsProperties(resource);
			if (props != null) {
				return props;
			}
			throw new SysException("Resource " + resource + " is not exist.");
		} catch (IOException e) {
			throw new SysException(e);
		}
	}
}
