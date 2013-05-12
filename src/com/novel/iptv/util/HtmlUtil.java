package com.novel.iptv.util;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

import com.novel.iptv.model.HtmlRequestVo;

public class HtmlUtil {

	public static String makeHtml(HtmlRequestVo htmlRequestVo){
		int colspan=htmlRequestVo.getParameters().length;
		if(htmlRequestVo.getOperatorName()!=null)
			colspan++;
		StringBuffer contentSb = new StringBuffer();
		StringBuffer returnHtml = new StringBuffer("<form id='form1' name='form1' method='post' action='"+htmlRequestVo.getActionUrl()+"'>");
		returnHtml.append("<table width='100%' border='1' ellpadding='0' cellspacing='0'>");
		returnHtml.append("<tr align='left' valign='middle'>");
		returnHtml.append("<td colspan="+colspan+" width='98%' id='titleBG' height='28'>"+htmlRequestVo.getTitle()+"</td>");
		returnHtml.append("</tr>");
		if(htmlRequestVo.getSelTitle()!=null&&htmlRequestVo.getSelId()!=null&&htmlRequestVo.getTypes()!=null){
			returnHtml.append(buildSelectHtml(htmlRequestVo.getSelTitle(),htmlRequestVo.getSelId(),htmlRequestVo.getDatalist(),htmlRequestVo.getTypes(),htmlRequestVo.getBasePath(),colspan));
		}
		returnHtml.append(buildHeader(htmlRequestVo.getHeaders(),htmlRequestVo.getOperatorName()));
		try {
			for (Iterator iterator = htmlRequestVo.getObjList().iterator(); iterator.hasNext();) {
				Object object = iterator.next();
				Class objClass = object.getClass();
				Field[] fields = objClass.getDeclaredFields();
				String[] namesStrings = field2Name(fields);
				contentSb.append("<tr id='table01'>");
				for (int i = 0; i < htmlRequestVo.getParameters().length; i++) {
					for (int j = 0; j < namesStrings.length; j++) {
						if (namesStrings[j].trim().equals(htmlRequestVo.getParameters()[i])) {
							if(htmlRequestVo.getTdWidth()!=null&&htmlRequestVo.getTdWidth().length==colspan){
								contentSb.append("<td width = '"+htmlRequestVo.getTdWidth()[i]+"'>");
							}else{
								contentSb.append("<td>");
							}
							contentSb.append(fields[j].get(object) == null||fields[j].get(object).toString().equals("") ? "&nbsp;": fields[j].get(object).toString());
							contentSb.append("</td>");
						}
					}
				}
				if(htmlRequestVo.getOperatorName()!=null){
					if(htmlRequestVo.getTdWidth()!=null&&htmlRequestVo.getTdWidth().length==colspan){
						contentSb.append("<td width = '"+htmlRequestVo.getTdWidth()[colspan-1]+"'>");
					}else{
						contentSb.append("<td>");
					}
					for (int i = 0; i < htmlRequestVo.getOperatorName().length; i++) {
						contentSb.append("<a href='#' id='"+fields[0].get(object).toString()+"' onclick='"+htmlRequestVo.getOperatorMethod()[i]+"' >"+htmlRequestVo.getOperatorName()[i]+"</a>&nbsp;&nbsp;");
					}
					contentSb.append("</td>");
				}
				contentSb.append("</tr>");
			}
			returnHtml.append(contentSb);
			returnHtml.append(builderTrunPage(htmlRequestVo.getBasePath(),htmlRequestVo.getTotalpage(),htmlRequestVo.getNowPage(),colspan));
			returnHtml.append("</table></form>");
		} catch (Exception e) {
			returnHtml.append(builderTrunPage(htmlRequestVo.getBasePath(),0,0,colspan));
			returnHtml.append("</table></form>");
		}
		return returnHtml.toString();
	}
	
	 private static String[] field2Name(Field[] f) {
		  String[] name = new String[f.length];
		  for (int i = 0; i < f.length; i++) {
		   name[i] = f[i].getName();
		  }
		  return name;
	 }
	 
	 private static String buildHeader(String[] headers,String[]operatorName){
		 StringBuffer sb = new StringBuffer();
         sb.append("<div id='tabletitle'>");
		 sb.append("<tr id='tabletitletr'>");
		 for (int i = 0; i < headers.length; i++) {
			 sb.append("<td><div class='font01'>"+headers[i]+"</div></td>");
		 }
		 if(operatorName!=null)
			 sb.append("<td><div class='font01'>操作</div></td>");
		 sb.append("</tr>");
		 sb.append("</div>");
		 return sb.toString();
	 }
	 
	 private static String buildSelectHtml(String[]selTitle,String[]selId,List datalist,String[]types,String path,int colspan){
		 StringBuffer sb = new StringBuffer();
		 sb.append("<tr><td valign='top' colspan="+colspan+"><table width='100%'  cellpadding='0' cellspacing='0' id='table_tit'>");
		 sb.append("<tr>");
		 for (int i = 0; i < types.length; i++) {
			if(types[i].equals("text")){
				sb.append("<td>"+selTitle[i]+"<input type='text' name='"+selId[i]+"' id='"+selId[i]+"' value='"+datalist.get(i).toString()+"' /></td>");
			} else if(types[i].equals("date")){
				sb.append("<td>"+selTitle[i]+"<input type='text' name='"+selId[i]+"' id='"+selId[i]+"' value='"+datalist.get(i).toString()+"' onFocus='WdatePicker()' class='Wdate' size='10' /></td>");
			}
		 }
		 sb.append("<td><img src='"+path+"/images/chaxun.gif' width='70' style='cursor:pointer' height='22' onclick='select()'/></td>");
		 sb.append("</tr>");
		 sb.append("</table></td></tr>");
		 return sb.toString();
	 }
	 
	 private static String builderTrunPage(String path,int totalPage,int nowPage,int colspan){
		StringBuffer sb = new StringBuffer();
		sb.append("<input type=hidden id='nowPage' name='nowPage' value="+nowPage+" />");
		sb.append("<input type=hidden id='totalPage' name='totalPage' value="+totalPage+" />");
		sb.append("<tr align='right' valign='middle' id='titleBG'>");
		sb.append("<td colspan="+colspan+" ><label>");
		sb.append("<img src='"+path+"/images/menu_index.gif' style='cursor:pointer' width='62' height='20' onclick='pageFirst()' />&nbsp;");
		sb.append("<img src='"+path+"/images/menu_up.gif' style='cursor:pointer' width='62' height='21' onclick='pagePrev()' /> &nbsp;");
		sb.append(nowPage+"/"+totalPage+"&nbsp;"); 
		sb.append("<img src='"+path+"/images/menu_down.gif' style='cursor:pointer' width='62' height='21' onclick='pageNext()' />&nbsp;"); 
		sb.append("<img src='"+path+"/images/menu_end.gif' style='cursor:pointer' width='57' height='21' onclick='pageLast()' />&nbsp;"); 
		sb.append("<input align='center' name='goTOPage' id='goTOPage' type='text' size='4' value="+nowPage+" />&nbsp;"); 
		sb.append("<img src='"+path+"/images/menu_search1.gif' style='cursor:pointer' width='47' height='21' onclick='goToPage()' />&nbsp;"); 
		sb.append("</label></td>"); 
		sb.append("</tr>");
		return sb.toString();
	 }

}
