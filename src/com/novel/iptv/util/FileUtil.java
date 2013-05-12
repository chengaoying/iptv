package com.novel.iptv.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileUtil {
	private transient final static Log log = LogFactory.getLog(FileUtil.class);
	/**
	 * 删除某个文件夹下的所有文件夹和文件
	 * 
	 * @param delpath
	 *            String
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @return boolean
	 */
	public static boolean deletefile(String delpath)
			throws FileNotFoundException, IOException {
		try {
			File file = new File(delpath);
			if (!file.exists()) {
				return false;
			} else if (!file.isDirectory()) {
				file.delete();
			} else if (file.isDirectory()) {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File delfile = new File(delpath + "\\" + filelist[i]);
					if (!delfile.isDirectory()) {
						log.info("删除文件成功  absolutepath=       "
								+ delfile.getAbsolutePath());
						delfile.delete();
					} else if (delfile.isDirectory()) {
						log.info("删除文件成功  absolutepath=       "
								+ delfile.getAbsolutePath());
						deletefile(delpath + "\\" + filelist[i]);
					}
				}
				file.delete();
			}
		} catch (FileNotFoundException e) {
			log.error("删除文件deletefile() Exception:" + e.getMessage(), e);
			return false;
		}
		return true;
	}
	
	/**
	 * 创建文件夹 
	 * @param filename 名称  
	 */
	public static void creactFile(String filename) {
		File file = new File(filename);
		if (!file.exists()) {
			file.mkdirs();
		}
	}
	
	/**
	 * 创建一个文件
	 * @param fileName 文件名称
	 * @param NewStr 文件内容
	 */
	public static boolean saveFile(String fileName, String NewStr) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(new File(fileName))));
			bw.write(NewStr);
			bw.close();
			log.info(fileName);
		} catch (Exception e) {
			log.error("" + e.getMessage(), e);
		}
		return false;
	}

	/**
	 * 读取文件(如：d:/test)
	 * @param fileName
	 * @return
	 */
	public static String readFileByLines(String fileName) {
		File file = new File(fileName);
		BufferedReader reader = null;
		String ret = "0";
		try {
			if (!file.exists()) {// 如果文件不存在,则新建.
				File parentDir = new File(file.getParent());
				if (!parentDir.exists())// 如果所在目录不存在,则新建.
					parentDir.mkdirs();
				file.createNewFile();
			}
			reader = new BufferedReader(new FileReader(file));
			int line = 1;
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				ret = tempString;
				line++;
			}
			reader.close();
		} catch (Exception e) {
			log.error("读取文件Error：" + e.getMessage(), e);
		}
		return ret;
	}
	
	/**
	 * 检查目录是否存在，不存在的话则新建目录
	 * @param path
	 */
	public static void check_Path(String path) {
		File destPath = new File(path);
		if(!destPath.exists()){
			destPath.mkdirs();
		}
	}
}
