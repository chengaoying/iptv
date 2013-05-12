package com.novel.iptv.action.order;

import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailOrderRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryOrderRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO;

import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;
import com.novel.iptv.util.DateTimeUtils;

public class UserOrderQuery extends DispatchAction {

	public ActionForward orderSearch(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String cardNo = null;
		if (request.getSession().getAttribute("userId") != null && request.getSession().getAttribute("userId") != "") {
			cardNo = request.getSession().getAttribute("userId").toString();
		} else {
			return mapping.findForward("index");
		}
		QueryOrderRequestVO qor = new QueryOrderRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, qor);

		int pageno = Integer.parseInt(request.getParameter("currentPage"));
		qor.setInterfaceId("105");
		qor.setCardNo(cardNo);
		qor.setCurrentPage(pageno);
		qor.setPageSize(8);
		//qor.setTimestamp(DateTimeUtils.PATTERN_DATETIME);
		QueryOrderResponseVO resvo = null;

		// System.out.println("pageno:"+pageno);

		try {
			resvo = ServiceUtils.getService4Order().queryOrder(qor);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(resvo == null){
		    return mapping.findForward("error");
		}

		request.setAttribute("resvo", resvo);
		request.setAttribute("pageno", pageno);
		// System.out.println("resvo:"+ resvo.getMsgId());

		return mapping.findForward("userOrderSearch");
	}

	public ActionForward orderSearch_detail(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		DetailOrderRequestVO dorv = new DetailOrderRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, dorv);

		int pageno = Integer.parseInt(request.getParameter("pageno"));
		// System.out.println("pageno:"+pageno);

		String orderid = request.getParameter("orderid");

		dorv.setInterfaceId("106");
		dorv.setCurrentPage(pageno);
		dorv.setPageSize(8);
		dorv.setOrderId(orderid);
		dorv.setMsgId("test");

		DetailOrderResponseVO detvo = null;

		try {
			detvo = ServiceUtils.getService4Order().detailOrder(dorv);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("detvo", detvo);
		request.setAttribute("pageno", pageno);

		return mapping.findForward("userOrderSearch_detail");
	}

	public ActionForward orderSearch_list(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String cardNo = null;
		if (request.getSession().getAttribute("userId") != null && request.getSession().getAttribute("userId") != "") {
			cardNo = request.getSession().getAttribute("userId").toString();
		} else {
			return mapping.findForward("index");
		}
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		if(month.length() < 2){
			month = "0" + month;
		}
		if(day.length() < 2){
			day = "0" + day;
		}
		
		String date2 = year + month + day;
		//System.out.println("date2"+date2);
		
		/*if(year == null || month == null || day == null){
			return mapping.findForward("error");
		}*/
		
		
		int pageno = Integer.parseInt(request.getParameter("pageno"));
		//System.out.println("pageno:"+pageno);
		//System.out.println(date2);

		//System.out.println(DateTimeUtils.createTimeId(DateTimeUtils.PATTERN_DATETIME));

		QueryOrderRequestVO quvo = new QueryOrderRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, quvo);

		quvo.setCardNo(cardNo);
		quvo.setCurrentPage(pageno);
		quvo.setInterfaceId("105");
		quvo.setPageSize(8);
		quvo.setOrderTimeEnd(DateTimeUtils.createTimeId(DateTimeUtils.PATTERN_DEFAULT));
		quvo.setOrderTimeStart(date2+"000000");

		QueryOrderResponseVO resvo2 = null;
		
		try {
			resvo2 = ServiceUtils.getService4Order().queryOrder(quvo);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
  
		
		if(resvo2 == null || resvo2.getCurrentSize() < 1){
			request.setAttribute("msg", "您当天暂无订单!");
		    return mapping.findForward("error");
		}
		//System.out.println("resvo2:"+resvo2.getInterfaceId());
		
		request.setAttribute("resvo2", resvo2);
		request.setAttribute("pageno", pageno);
		
		request.setAttribute("year", year);
		request.setAttribute("month", month);
		request.setAttribute("day", day);

		return mapping.findForward("orderSearch_list");
	}

}
