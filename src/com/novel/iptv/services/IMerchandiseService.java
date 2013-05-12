package com.novel.iptv.services;

import java.io.InputStream;
import java.util.List;

import com.novel.iptv.exception.SysException;

public interface IMerchandiseService extends IBaseService {
	/**
	 * 商品同步
	 * @param inStream 导入的excel流
	 * @param merchantCode 商家id
	 * @param merchantName 商家名称
	 * @return
	 */
	public List synMerchandiseByExcel(String path,
			InputStream inStream,String merchantCode,String merchantName, 
			String imgSrcType, String synType)throws SysException,Exception;
	
}
