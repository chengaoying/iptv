package com.novel.iptv.group.internal.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.hibernate.hql.ast.tree.FromClause;
import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo;

import com.novel.iptv.group.dao.GroupDAO;
import com.novel.iptv.group.internal.IGroupTemp;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.util.TemplateEngine;  
import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;

public class GroupListTemp implements IGroupTemp {

	@Override
	public void publishHtmletan() {
		try {
			RushBuyQueryRequestVO queryVO = new RushBuyQueryRequestVO();
			RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
			BeanUtils.copyProperties(requestheadvo, queryVO);
			queryVO.setInterfaceId("118");
			queryVO.setPageSize(4);
			queryVO.setCurrentPage(1);
			queryVO.setType(2);
			queryVO.setStatus("4");
			queryVO.setSortType(2);
			RushBuyQueryResponseVO res = GroupDAO.getInstance().getDATAList(queryVO);
//			if(res.getRushbuyList(0)!= null){
//				Map map = new HashMap();
//				List list = new ArrayList();
//				list.add(res);
//				map.put("rush", list);
//				map.put("ruslist", res.getRushbuyList());
//				map.put("ctx", ConstConfig.ctx);
//				map.put("temp", ConstConfig.html_path);
//				map.put("picsize", ConstConfig.pic_g_list);
//				if(res.getTotalSize()%res.getCurrentSize()!=0){
//					map.put("page", 2);
//				}else
//					map.put("page", 1);
//				TemplateEngine.publishHtml(ConstConfig.temp_path,
//						ConstConfig.group_listName, ConstConfig.html_path,
//						"glist.html", map);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
