package com.novel.iptv.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * add by xgh
 */
public class BeanUtils {
	/**
	 * 对像复制
	 * 
	 * @标题:
	 * @描述:对像的属性名和类型必须相同
	 * @param objDest
	 *            目标对像
	 * @param objSource
	 *            源对像
	 */
	public static void copyProperties(Object objDest, Object objSource) {
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(objDest,
					objSource);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * MD5加密方法 16位的
	 * 
	 * @param plainText
	 */
	public static String Md5(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}

			// System.out.println("result: " + buf.toString());//32位的加密

			// System.out.println("result: " +
			// buf.toString().substring(8,24));//16位的加密
			return buf.toString().substring(8,24);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	}

}
