package com.novel.iptv.services.impl;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;

import javax.imageio.ImageIO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;

import com.novel.iptv.exception.SysException;
import com.novel.iptv.services.IBaseService;
import com.novel.iptv.services.IMerchandiseService;
import com.novel.iptv.util.DateTimeUtils;
import com.novel.iptv.util.ExcelParserToObjects;
import com.novel.iptv.util.SystemConfig;
import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;

public class MerchandiseServiceImpl extends BaseServiceImpl implements IMerchandiseService {
	private Log log = LogFactory.getLog(this.getClass());
	private IBaseService baseService;
	public MerchandiseServiceImpl() {
	}



	public IBaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(IBaseService baseService) {
		this.baseService = baseService;
	}
	
	/**
	 * 判断本地图片是否gif格式
	 * @param path
	 * @return
	 */
	public boolean isGif(String path){
    	byte[] data = new byte[3];   
    	InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(path));
			in.read(data);
			if (data[0] == 'G' && data[1] == 'I' && data[2] == 'F') {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	/**
	 * 将远程图片保存成gif格式
	 * @param fromPath
	 * @param toPath
	 * @return
	 */
	public File convertToGifFromUrl(String fromPath, String toPath){
    	BufferedImage input = null;
		File outputFile = null;
		try {
			URL url = new URL(fromPath);
			input = ImageIO.read(url);
	    	outputFile = new File(toPath);
	    	ImageIO.write(input, "GIF", outputFile);
		} catch (IOException e) {
			outputFile = null;
		}
		return outputFile;
	}
	
	/**
	 * 将本地图片转换成gif格式
	 * @param fromPath
	 * @param toPath
	 * @return
	 */
	public File convertToGifFromLocal(String fromPath, String toPath){
    	BufferedImage input = null;
		File outputFile = null;
		try {
			input = ImageIO.read(new File(fromPath));
	    	outputFile = new File(toPath);
	    	ImageIO.write(input, "GIF", outputFile);
		} catch (IOException e) {
			outputFile = null;
		}
		return outputFile;
	}

	/**
	 * 计算商品库存总量
	 * @param attrStock
	 * @return
	 */
	public int countStock(String attrStock){
		int stock = 0, index;
		String[] array = attrStock.split(";");
		String temp = null;
		for(int i=0;i<array.length;i++){
			temp = array[i].trim();
			index = temp.lastIndexOf("=");
			if(index>=0){
				temp = temp.substring(index+1);
				try{
					stock += Integer.parseInt(temp);
				}catch(NumberFormatException e){
				}
			}
		}
		return stock;
	}



	@Override
	public List synMerchandiseByExcel(String path, InputStream inStream,
			String merchantCode, String merchantName, String imgSrcType,
			String synType) throws SysException, Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
