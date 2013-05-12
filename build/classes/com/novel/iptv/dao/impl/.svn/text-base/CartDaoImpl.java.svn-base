package com.novel.iptv.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.novel.iptv.dao.CartDao;
import com.novel.iptv.dao.IBaseDaoSupport;
import com.novel.iptv.model.hibernate.CartItem;

public class CartDaoImpl extends HibernateDaoSupport implements CartDao {

	@Override
	public Object insertObject(Object obj) {

		return this.getHibernateTemplate().save(obj);
	}

	@Override
	public void deleteObject(Object obj) {

		this.getHibernateTemplate().delete(obj);
	}
	
	@Override
	public void saveOrUpdate(Object obj) throws Exception{
		try {
			this.getHibernateTemplate().clear();
			this.getHibernateTemplate().saveOrUpdate(obj);

		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CartItem> getAllObject(String objectName,
			String[] orderProperty, boolean desc) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("from " + objectName + " as model ");
		String queryString = buffer.toString();

		buffer.append("where ");

		for (int i = 0; i < orderProperty.length; i++) {
			buffer.append(" model.cardNo=" + "'" + orderProperty[i] + "'");
		}
		queryString = buffer.substring(0, buffer.length());

		return getHibernateTemplate().find(queryString);
	}
	@Override
	public List<CartItem> getAllObject2(String objectName,
			String[] orderProperty, boolean desc) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("from " + objectName + " as model ");
		String queryString = buffer.toString();

		buffer.append("where ");

		for (int i = 0; i < orderProperty.length; i++) {
			buffer.append(" model.cartItemId=" + "'" + orderProperty[i] + "'");
		}
		queryString = buffer.substring(0, buffer.length());

		return getHibernateTemplate().find(queryString);
	}

	@Override
	public List<CartItem> getAllObject(String objectName,
			String[] orderProperty, boolean desc, int pageNo, int rpp) {
		if (pageNo < 1) {
			return null;
		} else {
			StringBuffer buffer = new StringBuffer();
			buffer.append("from " + objectName + " as model ");
			String queryString = buffer.toString();

			buffer.append("where ");
			for (int i = 0; i < orderProperty.length; i++) {
				buffer.append(" model.cardNo=" + "'" + orderProperty[i] + "'");
			}
			queryString = buffer.substring(0, buffer.length());

			Query query = this.getSession().createQuery(queryString);
			query.setFirstResult((pageNo - 1) * rpp);
			query.setMaxResults(rpp);
			return query.list();
		}
	}

	@Override
	public List findByProperty(String objectName, String propertyName,
			Object value) {
		String queryString = "from " + objectName + " as model where model."
				+ propertyName + "= ?";

		return getHibernateTemplate().find(queryString, value);

	}

}
