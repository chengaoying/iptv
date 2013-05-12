package com.novel.iptv.util;

public class PubUtils {

	public PubUtils() {
	}

	/**
	 * 替换
	 * 
	 * @param textBuffer
	 *            StringBuffer字符类型
	 * @param origin
	 *            目标
	 * @param replacement
	 *            值
	 * @return
	 */
	public static StringBuffer replaceAll(StringBuffer textBuffer,
			String origin, String replacement) {
		StringBuffer result = new StringBuffer(128);
		int i = textBuffer.indexOf(origin);
		final int oLen = origin.length();
		int start = 0;
		while (i > -1) {
			result.append(textBuffer.substring(start, i));
			result.append(replacement);
			start = i + oLen;
			i = textBuffer.indexOf(origin, i + 1);
			if (i <= -1) {
				result.append(textBuffer
						.subSequence(start, textBuffer.length()));
			}
		}
		return result;
	}

	public static StringBuffer replaceAll(String string, String origin,
			String replacement) {
		StringBuffer str = new StringBuffer(string);
		return replaceAll(str, origin, replacement);
	}

	public static String byte2hex(byte[] b) { // 二进制转字符串
		StringBuffer sb = new StringBuffer();
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = Integer.toHexString(b[n] & 0XFF);
			if (stmp.length() == 1) {
				sb.append("0" + stmp);
			} else {
				sb.append(stmp);
			}

		}
		return sb.toString();
	}

	public static byte[] hex2byte(String str) { // 字符串转二进制
		if (str == null)
			return null;
		str = str.trim();
		int len = str.length();
		if (len == 0 || len % 2 == 1)
			return null;
		byte[] b = new byte[len / 2];
		try {
			for (int i = 0; i < str.length(); i += 2) {
				b[i / 2] = (byte) Integer
						.decode("0X" + str.substring(i, i + 2)).intValue();
			}
			return b;
		} catch (Exception e) {
			return null;
		}
	}
}
