package com.novel.iptv.model.hibernate;


public class Tb_delivery_fee {
	private String id;
	private String merchandise_code;		
	private double province;				
	private double outside_province;		
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMerchandise_code() {
		return merchandise_code;
	}
	public void setMerchandise_code(String merchandiseCode) {
		merchandise_code = merchandiseCode;
	}
	public double getProvince() {
		return province;
	}
	public void setProvince(double province) {
		this.province = province;
	}
	public double getOutside_province() {
		return outside_province;
	}
	public void setOutside_province(double outsideProvince) {
		outside_province = outsideProvince;
	}
}
