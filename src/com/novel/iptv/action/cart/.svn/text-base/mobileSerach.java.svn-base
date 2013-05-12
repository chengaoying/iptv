package com.novel.iptv.action.cart;

import java.rmi.RemoteException;

import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryOrderRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.xsd.OrderInfo;

import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;


/*
 * 反查订单拿到用户的手机号码
 * 在购物车页面的文本框中显示
 * 
 */
public class mobileSerach {
	
	public static String serach(String s){
		
		QueryOrderRequestVO qor = new QueryOrderRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, qor);

		qor.setInterfaceId("105");
		qor.setCardNo(s);
		qor.setCurrentPage(1);
		qor.setPageSize(8);
		QueryOrderResponseVO resvo = null;

		try {
			resvo = ServiceUtils.getService4Order().queryOrder(qor);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String moblie  = "";
		OrderInfo[] list = resvo.getOrderList();
		if (list.length <= 0 || list[0] == null ) {
			return null;
			
		} else {
			for (int i = 0; i < list.length; i++) {
				OrderInfo info = list[0];
				moblie = info.getMobile();
			}
		}
		return moblie;
	}

}
