package com.novel.iptv.webservice;

import java.net.URL;

import cn.com.do1.ebusiness.exinterface.ws.MerchandiseServiceLocator;
import cn.com.do1.ebusiness.exinterface.ws.MerchandiseServicePortType;
import cn.com.do1.ebusiness.exinterface.ws.OrderServiceLocator;
import cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType;
import cn.com.do1.ebusiness.exinterface.ws.PortalServiceLocator;
import cn.com.do1.ebusiness.exinterface.ws.PortalServicePortType;
import cn.com.do1.ebusiness.exinterface.ws.PromotionServiceLocator;
import cn.com.do1.ebusiness.exinterface.ws.PromotionServicePortType;
import cn.com.do1.ebusiness.exinterface.ws.SystemServiceLocator;
import cn.com.do1.ebusiness.exinterface.ws.SystemServicePortType;

import com.novel.iptv.util.BusiUtils;
import com.novel.iptv.util.DateTimeUtils;
import com.novel.iptv.util.SystemConfig;

public class ServiceUtils  implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -548858278563114415L;

	public static MerchandiseServicePortType getService4Merchandise()
			throws Exception {
		URL url = new URL(SystemConfig.getDefaultConfig("WEB_SERVICE_IP") + "/MerchandiseService?wsdl");
		return new MerchandiseServiceLocator().getMerchandiseServiceHttpSoap11Endpoint(url);
	}

	public static OrderServicePortType getService4Order() throws Exception {
		URL url = new URL(SystemConfig.getDefaultConfig("WEB_SERVICE_IP") + "/OrderService?wsdl");
		return new OrderServiceLocator().getOrderServiceHttpSoap11Endpoint(url);
	}

	public static PortalServicePortType getService4Portal() throws Exception {
		URL url = new URL(SystemConfig.getDefaultConfig("WEB_SERVICE_IP") + "/PortalService?wsdl");
		return new PortalServiceLocator().getPortalServiceHttpSoap11Endpoint(url);
	}

	public static SystemServicePortType getService4System() throws Exception {
		URL url = new URL(SystemConfig.getDefaultConfig("WEB_SERVICE_IP") + "/SystemService?wsdl");
		return new SystemServiceLocator().getSystemServiceHttpSoap11Endpoint(url);
	}
	
	public static PromotionServicePortType getService4Promotion() throws Exception {
		URL url = new URL(SystemConfig.getDefaultConfig("WEB_SERVICE_IP") + "/PromotionService?wsdl");
		return new PromotionServiceLocator().getPromotionServiceHttpSoap11Endpoint(url);
	}
	
	public static RequestHeadVO initHeadVO() {
		RequestHeadVO requestHeadVO = new RequestHeadVO();
		try {
			requestHeadVO.setInterfaceId(SystemConfig.getDefaultConfig("INTERFACE_ID"));
			requestHeadVO.setSpId(SystemConfig.getDefaultConfig("WEB_SERVICE_SPID"));
			requestHeadVO.setSpPin(SystemConfig.getDefaultConfig("WEB_SERVICE_SPPIN"));
			requestHeadVO.setMsgId(BusiUtils.createSerialNo(36));
			requestHeadVO.setTimestamp(DateTimeUtils.createTimeId(DateTimeUtils.PATTERN_DEFAULT));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return requestHeadVO;
	}
}
