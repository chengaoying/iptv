package com.novel.iptv.dao;

import java.util.List;

import com.novel.iptv.model.hibernate.CartItem;

public interface CartDao {
	
	public Object insertObject(Object obj);
	
	public void deleteObject(Object obj);
	
	public List findByProperty(String objectName, String propertyName, Object value);
	
	public List<CartItem> getAllObject(String objectName,
			String[] orderProperty, boolean desc);
	
	public List<CartItem> getAllObject2(String objectName,
			String[] orderProperty, boolean desc);
	
	public List<CartItem> getAllObject(String objectName,
			String[] orderProperty, boolean desc, int pageNo, int rpp);
	
	public void saveOrUpdate(Object obj) throws Exception;
}
