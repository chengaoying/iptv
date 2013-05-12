package com.novel.iptv.model.hibernate;


import java.util.Date;

public class Tb_merchandise_attr {
	private String id;
	private String merchandise_code;
	private String opt_desc;
	private String opt_value;
	private int show_type;				
	private String pic_link;
	private int parent;					
	private String parent_id;
	private Date update_time;
	private String update_by;
	private int remove_flag;			
	private int idx;
	
	
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
	public String getOpt_desc() {
		return opt_desc;
	}
	public void setOpt_desc(String optDesc) {
		opt_desc = optDesc;
	}
	public String getOpt_value() {
		return opt_value;
	}
	public void setOpt_value(String optValue) {
		opt_value = optValue;
	}
	public int getShow_type() {
		return show_type;
	}
	public void setShow_type(int showType) {
		show_type = showType;
	}
	public String getPic_link() {
		return pic_link;
	}
	public void setPic_link(String picLink) {
		pic_link = picLink;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parentId) {
		parent_id = parentId;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date updateTime) {
		update_time = updateTime;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String updateBy) {
		update_by = updateBy;
	}
	public int getRemove_flag() {
		return remove_flag;
	}
	public void setRemove_flag(int removeFlag) {
		remove_flag = removeFlag;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
}
