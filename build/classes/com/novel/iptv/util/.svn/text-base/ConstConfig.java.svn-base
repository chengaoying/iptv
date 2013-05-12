package com.novel.iptv.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ConstConfig 定义各种静态常量,各个类要用到各个常量,尽量在此类 中定义.并且初始化全局变量
 */
public class ConstConfig {
    private transient final static Log log = LogFactory.getLog(ConstConfig.class);

    private static boolean isInited = false;

    static {
        try {
            init();// 用于EJB访问时装入相应属性，如果是用WEB启动，会被InitPropertyServlet覆盖
            isInited = true;
        }
        catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
    /**  工程相对路径 */
    public static String ctx;
    
    /**  WEB-INF/ftl/ */
    public static String temp_path;
    /**  html/ */
    public static String html_path;
    
    /** 团购列表模板名称 */
    public static String group_listName;
    /** 团购详情模板名称 */
    public static String group_DetailsName;

    /** 模板输出 编码格式（默认 UTF-8）*/
    public static String ENEDITCONDE;
    
    /** 商品列表图片规格*/
    public static String merList;
    
    /** 商品列表图片规格*/
    public static String merDestail;
    
    /** 团购列表图片大小*/
    public static String pic_g_list;
    /** 团购详情图片大小*/
    public static String pic_g_destail;
    
    /** 首页展柜虚拟商城查询*/
    public static String indexAD_mall;
    /** 首页展柜位查询*/
    public static String indexAD_ad;
    
    /** 首页滚动内容查询*/
    public static String indexContent;
    
    /** UUIDurl */
    public static String UUIDurl;
    /** resUrl */
    public static String resUrl;
    
    /** 导航菜单*/
    public static String menuItems;
    
    static public void init() {
        final Properties pro = new Properties();
        try {
            pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
        }
        catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        ConstConfig.temp_path = pro.getProperty("temp_path");
        ConstConfig.html_path = pro.getProperty("html_path");
        ConstConfig.group_listName = pro.getProperty("grouplist");
        ConstConfig.group_DetailsName = pro.getProperty("groupdisedetails");
        ConstConfig.ENEDITCONDE = pro.getProperty("encode");
        ConstConfig.ctx = pro.getProperty("ctx");
        ConstConfig.merList = pro.getProperty("mer_list");
        ConstConfig.merDestail = pro.getProperty("mer_destail");
        ConstConfig.pic_g_destail = pro.getProperty("pic_g_destail");
        ConstConfig.pic_g_list = pro.getProperty("pic_g_list");
        ConstConfig.indexAD_mall = pro.getProperty("index_mall");
        ConstConfig.indexAD_ad = pro.getProperty("index_ad");
        ConstConfig.indexContent = pro.getProperty("index_content");
        ConstConfig.UUIDurl = pro.getProperty("UUIDurl");
        ConstConfig.resUrl = pro.getProperty("resUrl");
        ConstConfig.menuItems = pro.getProperty("menuitems");
    }
}