package com.novel.iptv.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class DateTimeUtils {
	/**
	 * "yyyyMMddHHmmss"
	 */
	public static final String PATTERN_DEFAULT = "yyyyMMddHHmmss";
	/**
	 * "yyyy-MM-dd"
	 */
	public static final String PATTERN_DATETIME = "yyyy-MM-dd";
	
	/**
	 * "yyyy-MM-dd hh:mm:ss"
	 */
	public static final String PATTERN_1="yyyy-MM-dd HH:mm:ss";
	
	/**
	 * MM月dd日hh时mm分
	 */
	public static final String PATTERN_2="MM月dd日HH时mm分";
	
	/**
	 * "yyyy-MM-dd hh:mm"
	 */
	public static final String PATTERN_3="yyyy-MM-dd HH:mm";
	
	/**
	 * "yyyyMMdd"
	 */
	public static final String PATTERN_4="yyyyMMdd";
	
	/**
	 * "yyyyMMddHHmm"
	 */
	public static final String PATTERN_5="yyyyMMddHHmm";
	/**
	 * 返回当时间戳,默认格式为yyyyMMddHHmmss
	 * 
	 * @param patternFormat
	 * 
	 *            返回时间格式
	 * @return
	 */
	public static String createTimeId(String patternFormat) {
		Date now = new Date();
		return new SimpleDateFormat(
				StringUtils.isEmpty(patternFormat) ? PATTERN_DEFAULT
						: patternFormat).format(now);
	}

	public static Date parseDate(String datestring, String pattern) {
		try {
			if(datestring==null||datestring.equals("")){
				return null;
			}else
				return new SimpleDateFormat(pattern).parse(datestring);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String formatDate(Date date, String pattern) {
		if(date==null){
			return "";
		}else
			return new SimpleDateFormat(
				StringUtils.isEmpty(pattern) ? PATTERN_DEFAULT : pattern)
				.format(date);
	}
	
	public static void main(String[] args) {
		System.out.println(DateTimeUtils.parseDate("201111111101", DateTimeUtils.PATTERN_DEFAULT));
		//System.out.println(DateTimeUtils.formatDate(DateTimeUtils.parseDate("201111111101", DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3));
	}
	
}
