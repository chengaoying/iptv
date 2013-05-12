package com.novel.iptv.services.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.novel.iptv.dao.IBaseDaoSupport;
import com.novel.iptv.services.IBaseService;



/**
 * @author xgh
 *
 */
public class BaseServiceImpl implements IBaseService
{
	private Log log = LogFactory.getLog(this.getClass());
	private IBaseDaoSupport baseDao=null;
	
	public int delete(final String objectName, final String propertyName, final String[] idKey) throws Exception{
		return baseDao.delete(objectName, propertyName, idKey);
	}
	
	public void saveOrUpdate(Object obj) throws Exception{
		baseDao.saveOrUpdate(obj);
	}
	
	public void deleteObject(Object obj)
	{
		baseDao.deleteObject(obj);
	}

	public Object findByPK(Class objectClass, Serializable pk)
	{
		return baseDao.findByPK(objectClass, pk);
	}

	public List findByProperty(String objectName, String propertyName,
			Object value)
	{	
		return baseDao.findByProperty(objectName, propertyName, value);
	}
	
	public List findByProperty(final String objectName, final String[] returnProperty, final String propertyName, 
			final Object value, final String[] orderProperty, final boolean desc)
	{	
		return baseDao.findByProperty(objectName, returnProperty, propertyName, value, orderProperty, desc);
	}

	public List findByProperty(String objectName, String propertyName,
			Object value, int pageNo, int rpp)
	{
		return baseDao.findByProperty(objectName, propertyName, value, pageNo, rpp);
	}
	
	public List findByProperty(String objectName, String[] propertyName,
			Object[] value)
	{
		return baseDao.findByProperty(objectName, propertyName, value);
	}
	//
	public List findByProperty(String objectName, String[] propertyName,
			Object[] value, int pageNo, int rpp, String[] orderProperty, boolean desc)
	{
		return baseDao.findByProperty(objectName, propertyName, value, pageNo, rpp, orderProperty, desc);
	}
	
	public List findByProperty(String objectName, String[] propertyName,
			Object[] value, int pageNo, int rpp)
	{
		return baseDao.findByProperty(objectName, propertyName, value, pageNo, rpp);
	}

	public void updateObject(Object obj) {
		baseDao.updateObject(obj);
	}

	public IBaseDaoSupport getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDaoSupport baseDao) {
		this.baseDao = baseDao;
	}

	public void saveOrUpdateList(List objList) throws Exception {
		baseDao.saveOrUpdateList(objList);
	}

	public List getAllObject(final String objectName,final String[] orderProperty, final boolean desc){
		return baseDao.getAllObject(objectName,orderProperty,desc);
	}

	public Object insertObject(Object obj) {
		return baseDao.insertObject(obj);
	}
	public List getAllObject(final String objectName,final String[] orderProperty, final boolean desc,int pageNo, int rpp ){
		return baseDao.getAllObject(objectName, orderProperty, desc, pageNo, rpp);
	}
	public List findByLikeProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp, String[] orderProperty, boolean desc){
		return baseDao.findByLikeProperty(objectName, propertyName, value, pageNo, rpp, orderProperty, desc);
	}
	public List findByLikeProperty(String objectName, String[] propertyName, Object[] value,
			String[] orderProperty, boolean desc){
		return baseDao.findByLikeProperty(objectName, propertyName, value, orderProperty, desc);
	}
	
}
