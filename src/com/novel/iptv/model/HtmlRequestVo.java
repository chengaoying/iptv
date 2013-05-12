package com.novel.iptv.model;

import java.util.List;

public class HtmlRequestVo {
	/**
	 * 可选属性,最上面模糊搜索的控件的title列表 ，如果为null则不需要模糊查询 如：String[]selTitle = new String[]{"商城订单号","商家订单号","商家编号","商家名称"};
	 */
	private String[]selTitle;
	/**
	 * 可选属性,最上面模糊搜索的控件的id列表，如果为null则不需要模糊查询  如：String[]selId = new String[]{"orderid","merorderid","merchantCode","merchantName"};
	 */
	private String[]selId;    
	/**
	 * 可选属性,模糊搜索控件的初始值列表，如果为null则不需要模糊查询
	 */
	private List datalist;   
	/**
	 * 可选属性,模糊搜索控件的类型，如果为null则不需要模糊查询  现在只支持text文本框类型，需添加别的类型请改代码
	 */
	private String[]types;    
	//===========
	/**
	 * 可选属性,需要的操作名称。如：new String[]{"删除"}
	 */
	private String[]operatorName;  
	/**
	 * 可选属性,操作对应的方法。如:new String[]{"deleteOper(this.id)"}
	 */
	private String[]operatorMethod;
	//===========
	/**
	 * 可选属性,表格单元格行宽,必须与单元格的数量相同。如:new String[]{"25%","25%","25%","25%"}
	 */
	private String[]tdWidth;
	/**
	 * 必须属性,取内容对象的那个字段.如：new String[]{"oid","orderid","merorderid","merchantCode","merchantName","creactdate","memo"}
	 */
	private String[]parameters;    
	/**
	 * 必须属性,表格的title
	 */
	private String title;     
	/**
	 * 必须属性,工程路径 request.getContextPath();
	 */
	private String basePath; 
	/**
	 * 必须属性,表格from的action
	 */
	private String actionUrl; 
	/**
	 * 必须属性,表头列表
	 */
	private String[] headers; 
	/**
	 * 必须属性,表格内容列表
	 */
	private List objList;     
	/**
	 * 必须属性,显示第几页
	 */
	private int nowPage;
	/**
	 * 必须属性,总共几页
	 */
	private int totalpage;
	
	public HtmlRequestVo(){}
	public HtmlRequestVo(String title, String basePath, String actionUrl,
			String[] headers, List objList, String[] parameters, int nowPage,
			int totalpage) {
		super();
		this.title = title;
		this.basePath = basePath;
		this.actionUrl = actionUrl;
		this.headers = headers;
		this.objList = objList;
		this.parameters = parameters;
		this.nowPage = nowPage;
		this.totalpage = totalpage;
	}
	public String[] getTdWidth() {
		return tdWidth;
	}
	public void setTdWidth(String[] tdWidth) {
		this.tdWidth = tdWidth;
	}
	public String[] getSelTitle() {
		return selTitle;
	}
	public void setSelTitle(String[] selTitle) {
		this.selTitle = selTitle;
	}
	public String[] getSelId() {
		return selId;
	}
	public void setSelId(String[] selId) {
		this.selId = selId;
	}
	public List getDatalist() {
		return datalist;
	}
	public void setDatalist(List datalist) {
		this.datalist = datalist;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	public String getActionUrl() {
		return actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public String[] getHeaders() {
		return headers;
	}
	public void setHeaders(String[] headers) {
		this.headers = headers;
	}
	public List getObjList() {
		return objList;
	}
	public void setObjList(List objList) {
		this.objList = objList;
	}
	public String[] getParameters() {
		return parameters;
	}
	public void setParameters(String[] parameters) {
		this.parameters = parameters;
	}
	public String[] getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String[] operatorName) {
		this.operatorName = operatorName;
	}
	public String[] getOperatorMethod() {
		return operatorMethod;
	}
	public void setOperatorMethod(String[] operatorMethod) {
		this.operatorMethod = operatorMethod;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
}
