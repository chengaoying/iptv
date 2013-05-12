package com.novel.iptv.services.impl;

import java.util.List;

import com.novel.iptv.dao.impl.CartDaoImpl;
import com.novel.iptv.model.hibernate.CartItem;
import com.novel.iptv.services.CartService;

public class CartServiceImpl implements CartService{
	
	private CartDaoImpl cartDao = null;

	public CartDaoImpl getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDaoImpl cartDao) {
		this.cartDao = cartDao;
	}

	@Override
	public void deleteObject(Object obj) {
	      cartDao.deleteObject(obj);
	}

	@Override
	public List<CartItem> getAllObject(String objectName, String[] orderProperty,
			boolean desc) {
		// TODO Auto-generated method stub
		return cartDao.getAllObject(objectName, orderProperty, desc);
	}
	
	@Override
	public List<CartItem> getAllObject2(String objectName, String[] orderProperty,
			boolean desc) {
		// TODO Auto-generated method stub
		return cartDao.getAllObject2(objectName, orderProperty, desc);
	}


	@Override
	public List<CartItem> getAllObject(String objectName, String[] orderProperty,
			boolean desc, int pageNo, int rpp) {
		// TODO Auto-generated method stub
		return cartDao.getAllObject(objectName, orderProperty, desc, pageNo, rpp);
	}

	@Override
	public Object insertObject(Object obj) {
		cartDao.insertObject(obj);
		return "成功加入购物车!";
	}

	@Override
	public List findByProperty(String objectName, String propertyName,
			Object value) {

		return cartDao.findByProperty(objectName, propertyName, value);
		
	}

	@Override
	public void saveOrUpdate(Object obj) throws Exception {

		cartDao.saveOrUpdate(obj);
		
	}



}
