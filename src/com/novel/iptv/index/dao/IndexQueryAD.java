package com.novel.iptv.index.dao;

import java.util.Date;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailContentRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryADRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailContentResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryADResponseVO;

import com.novel.iptv.util.DateTimeUtils;
import com.novel.iptv.webservice.ServiceUtils;

public class IndexQueryAD {
	
	private static IndexQueryAD instance;

	public static IndexQueryAD getInstance() {
		if (instance == null) {
			instance = new IndexQueryAD();
		}
		return instance;
	}
	
	/**
	 * 展柜查询
	 * @param queryVO
	 * @return
	 */
	public QueryADResponseVO queryADindex(QueryADRequestVO queryVO){
		try {
//			queryVO.setBeginTime(DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_4)+"000000");
//			queryVO.setEndTime(DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_4)+"000000");
//			return ServiceUtils.getService4Portal().queryAD(queryVO);
                    return null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DetailContentResponseVO queryContent(DetailContentRequestVO queryVO){
		try {
			//return ServiceUtils.getService4Portal().detailContent(queryVO);
                    return null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
