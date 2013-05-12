package com.novel.iptv.group.internal.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailMerchandiseRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryDetailRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyDetailQueryResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO;

import com.novel.iptv.group.dao.GroupDAO;
import com.novel.iptv.group.internal.IGroupTemp;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.util.TemplateEngine;
import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;

public class GroupDisedetailsTemp implements IGroupTemp {
	
	
	@Override
	public void publishHtmletan() {
		//列表查询
		RushBuyQueryRequestVO queryVO = new RushBuyQueryRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, queryVO);
		queryVO.setInterfaceId("118");
		queryVO.setPageSize(1000);
		queryVO.setCurrentPage(1);
		queryVO.setType(2);
		queryVO.setStatus("4");
		queryVO.setSortType(2);
		RushBuyQueryResponseVO res = GroupDAO.getInstance().getDATAList(queryVO);
		
//		if(res != null && res.getRushbuyList()[0]!=null) {
//			//团购活动详情查询
//			RushBuyQueryDetailRequestVO revo=new RushBuyQueryDetailRequestVO();
//			BeanUtils.copyProperties(requestheadvo, revo);
//			revo.setInterfaceId("124");
//			for(int i=0;i<res.getTotalSize();i++){
//				revo.setId(res.getRushbuyList()[i].getId());
//				RushBuyDetailQueryResponseVO resvo = GroupDAO.getInstance().getDATADetail(revo);
//				Map map = new HashMap();
//				List list = new ArrayList();
//				list.add(resvo);
//				map.put("resvo", list);
//				map.put("ctx", ConstConfig.ctx);
//				map.put("temp", ConstConfig.html_path);
//				//查询商品详情
//				DetailMerchandiseRequestVO merqvo=new DetailMerchandiseRequestVO();
//				BeanUtils.copyProperties(requestheadvo, merqvo);
//				merqvo.setInterfaceId("103");
//				merqvo.setMerchandiseCode(resvo.getMerchandiseCode());
//				map.put("merdestail", GroupDAO.getInstance().getMerdetail(merqvo));
//				map.put("picsize", ConstConfig.pic_g_destail);
//				TemplateEngine.publishHtml(ConstConfig.temp_path,
//						ConstConfig.group_DetailsName, ConstConfig.html_path,
//						res.getRushbuyList(i).getId()+".html", map);
//			}
//		}
		
	}

}
