package com.novel.iptv.util;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class BusiUtils {

	/**
	 * 生成以时间戳为基础，定长的流水号，长度必须大于14，默认返回长度为14的字符串
	 * 
	 * @param length
	 *            流水号总长度
	 * @return
	 */
	public static String createSerialNo(int length) {
		String baseText = "0123456789";
		String base = DateTimeUtils.createTimeId(null);
		if (length > 14) {
			StringBuffer text = new StringBuffer(128);
			Random random = new Random();
			int unitLength = length - 14;
			for (int i = 0; i < unitLength; i++) {
				text.append(baseText.charAt(random.nextInt(baseText.length())));
			}
			base += text.toString();
		}
		return base;
	}
	
	public static String getParameter(HttpServletRequest request,String paramenterName,String defaultValue){
		Object obj = request.getParameter(paramenterName);
		if(obj==null)
			return defaultValue;
		String returnStr ="";
		try {
			returnStr=new String(obj.toString().getBytes("iso-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return returnStr.trim();
	}
	
	public static void main(String[] args) throws Exception {
	}
	
	/**
	 * 实时更新查文本时过滤掉html标签 add by xgh
	 * @param htmlStr
	 * @return
	 */
    public static String delHTMLTag(String htmlStr){ 
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式 
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式 
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式 
         
        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE); 
        Matcher m_script=p_script.matcher(htmlStr); 
        htmlStr=m_script.replaceAll(""); //过滤script标签 
         
        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE); 
        Matcher m_style=p_style.matcher(htmlStr); 
        htmlStr=m_style.replaceAll(""); //过滤style标签 
         
        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE); 
        Matcher m_html=p_html.matcher(htmlStr); 
        htmlStr=m_html.replaceAll(""); //过滤html标签 

        return htmlStr.trim(); //返回文本字符串 
    } 

    /**
     * 浮点型保留精确到小数点后2位
     * @param putvalue
     * @return
     */
    public static double formatDouble(double putvalue){
	   DecimalFormat df = new DecimalFormat("#0.00");
	   return new Double(df.format(putvalue));
	}

	public static String translateStatus(int status) {
		String result = "未知";
		switch (status) {
		case 0: {
			result = "未支付";
			break;
		}
		case 1: {
			result = "支付中";
			break;
		}
		case 2: {
			result = "待发货";
			break;
		}
		case 3: {
			result = "已发货";
			break;
		}
		case 4: {
			result = "已签收";
			break;
		}
		case 5: {
			result = "已支付";
			break;
		}
		case 6: {
			result = "已完结";
			break;
		}
		case 7: {
			result = "缺货";
			break;
		}
		case -1: {
			result = "已取消";
			break;
		}
		case -2: {
			result = "已退费";
			break;
		}
		case -3: {
			result = "未核实";
			break;
		}
		}
		return result;
	}
}
