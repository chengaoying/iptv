package com.novel.iptv.services;

import java.util.List;

import com.novel.iptv.model.hibernate.CartItem;

public interface CartService {
	
	public Object insertObject(Object obj);

	public void deleteObject(Object obj);
	
	public List<CartItem> getAllObject(final String objectName,final String[] orderProperty, final boolean desc);
	
	public List<CartItem> getAllObject2(final String objectName,final String[] orderProperty, final boolean desc);


	public List<CartItem> getAllObject(final String objectName,final String[] orderProperty, final boolean desc,int pageNo, int rpp );
	
	public List findByProperty(String objectName, String propertyName,Object value);
	
	public void saveOrUpdate(Object obj) throws Exception;

}
