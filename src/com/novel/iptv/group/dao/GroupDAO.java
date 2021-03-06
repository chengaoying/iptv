package com.novel.iptv.group.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailMerchandiseRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DirectBuyRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryDetailRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailMerchandiseResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyDetailQueryResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO;

import com.novel.iptv.webservice.ServiceUtils;

public class GroupDAO {
	private transient final static Log log = LogFactory.getLog(GroupDAO.class);

	private static GroupDAO instance;

	public static GroupDAO getInstance() {
		if (instance == null) {
			instance = new GroupDAO();
		}
		return instance;
	}
	
	/**
	 * 团购列表接口
	 * @param revo
	 * @return
	 */
	public RushBuyQueryResponseVO getDATAList(RushBuyQueryRequestVO revo){
		try {
			//return ServiceUtils.getService4Promotion().rushBuyQuery(revo);
                    return null;
		}  catch (Exception e) {
			log.error("团购列表接口数据get错误： " + e.getMessage());
		}
		return null;
	}
	
	/**
	 * 团购详情接口
	 * @param revo
	 * @return
	 */
	public RushBuyDetailQueryResponseVO getDATADetail(RushBuyQueryDetailRequestVO revo){
		try {
			//return ServiceUtils.getService4Promotion().rushBuyDetailQuery(revo);
                    return null;
		}  catch (Exception e) {
			log.error("团购详情接口数据get错误： " + e.getMessage());
		}
		return null;
	}
	/**
	 * 商品详情
	 * @param requestVO
	 * @return
	 */
	public DetailMerchandiseResponseVO getMerdetail(DetailMerchandiseRequestVO requestVO){
		try {
			//return ServiceUtils.getService4Merchandise().detailMerchandise(requestVO);
                    return null;
		}  catch (Exception e) {
			log.error("团购详情接口数据get错误： " + e.getMessage());
		}
		return null;
	}
	
	/**
	 * 立即购买
	 * @param requestVO
	 * @return
	 */
	public DirectBuyResponseVO buy(DirectBuyRequestVO requestVO){
		try {
			//return ServiceUtils.getService4Order().directBuy(requestVO);
                    return null;
		}  catch (Exception e) {
			log.error("团购立即购买接口错误： " + e.getMessage());
		}
		return null;
	}
	
	
}
