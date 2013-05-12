package com.novel.iptv.index.temp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailContentRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryADRequestVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailContentResponseVO;
import cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryADResponseVO;

import com.novel.iptv.index.dao.IndexQueryAD;
import com.novel.iptv.util.ConstConfig;
import com.novel.iptv.util.TemplateEngine;
import com.novel.iptv.webservice.RequestHeadVO;
import com.novel.iptv.webservice.ServiceUtils;

public class IndexTemp {

	public static void publishHtmletan() {
		// 虚拟商城查询
		QueryADRequestVO queryVO = new QueryADRequestVO();
		RequestHeadVO requestheadvo = ServiceUtils.initHeadVO();
		BeanUtils.copyProperties(requestheadvo, queryVO);
		queryVO.setInterfaceId("112");
		queryVO.setCusId(ConstConfig.indexAD_mall);
		QueryADResponseVO resMall = IndexQueryAD.getInstance().queryADindex(queryVO);
		//广告展柜查询
		queryVO.setCusId(ConstConfig.indexAD_ad);
		QueryADResponseVO resAD = IndexQueryAD.getInstance().queryADindex(queryVO);
		//实时更新滚动字幕
		DetailContentRequestVO queryVOContent = new DetailContentRequestVO();
		BeanUtils.copyProperties(requestheadvo, queryVOContent);
		queryVOContent.setInterfaceId("115");
		queryVOContent.setSite(0);
		queryVOContent.setContentId(ConstConfig.indexContent);
		queryVOContent.setContentType(5);
		DetailContentResponseVO resContent=IndexQueryAD.getInstance().queryContent(queryVOContent);
		Map map = new HashMap();
		map.put("resMall", resMall);
		map.put("resAD", resAD);
		map.put("resContent", resContent);
		map.put("ctx", ConstConfig.ctx);
		TemplateEngine.publishHtml(ConstConfig.temp_path, "index.ftl", "","index.html", map);

	}

}
