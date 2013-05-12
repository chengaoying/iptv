package com.novel.iptv.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author xgh
 *
 */
public interface IBaseDaoSupport
{
	/**
	 * 批量删除
	 * @标题:
	 * @描述:
	 * @param objectName 删除的对像名
	 * @param propertyName 主键名
	 * @param idKey 值
	 * @return
	 * @throws Exception ֵ
	 */
	public int delete(final String objectName, final String propertyName, final String[] idKey) throws Exception;
	
	/**
	 * 保存或更新对象
	 * @标题:
	 * @描述:
	 * @param obj
	 */
	public void saveOrUpdate(Object obj) throws Exception;
	
	/**
	 * 保存或更新对象 集合
	 * @标题:
	 * @描述:
	 * @param objList
	 * @throws Exception
	 */
	public void saveOrUpdateList(List objList) throws  Exception;
	
	/**
	 * 删除对象
	 * @param obj
	 */
	public void deleteObject(Object obj);
	

	/**
	 * 更新对象
	 * @param obj
	 */
	public void updateObject(Object obj);
	
	/**
	 * 储存对象
	 * @param obj
	 * @return
	 */
	public Object insertObject(Object obj);
	
	/**
	 * 以主键查找对象
	 * @param objectClass
	 * @param pk
	 * @return
	 */
	public Object findByPK(Class objectClass, Serializable pk);
	
	/**
	 * 以属性查找对象
	 * @param objectName
	 * @param propertyName
	 * @param value  当value==null时，查询条件为is null.
	 * @return
	 */
	public List findByProperty(String objectName, String propertyName, Object value);
	
	/**
	 * 
	 * @标题:
	 * @描述:以属性查找对象，可指定返回字段，可排序
	 * @param objectName 对象全名
	 * @param returnProperty 返回字段集合，没有时为null
	 * @param propertyName 查找的属性
	 * @param value 查找属性的值
	 * @param orderProperty 指定排序字段
	 * @param desc true为desc排序
	 * @return 1. 当returnProperty不为null时，返回的集合包含Properties对象
	 *         2. 当returnProperty为null是，返回objectName对象的集合
	 */
	public List findByProperty(final String objectName, final String[] returnProperty, final String propertyName, 
			final Object value, final String[] orderProperty, final boolean desc);
	
	/**
	 * 以属性查找对象（可分页）
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @param pageNo 第几页
	 * @param rpp 一页显示多少条数据
	 * @return
	 */
	public List findByProperty(String objectName, String propertyName, Object value, 
			int pageNo, int rpp);
	/**
	 * 以属性集合查找对象
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List findByProperty(String objectName, String[] propertyName, Object[] value);
	
	/**
	 * 以属性集合查找对象（可分页）
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @param pageNo
	 * @param rpp
	 * @return
	 */
	public List findByProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp);
	
	/**
	 * 以属性集合查找对象（可分页、排序）
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @param pageNo
	 * @param rpp
	 * @return
	 */
	public List findByProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp, String[] orderProperty, boolean desc);

	/**
	 * 返回对象的json
	 * @param objectClass
	 * @param pk
	 * @return
	 */
	public String findJsonByPK(final Class objectClass, final Serializable pk);
	
	/**
	 * 
	 * @param objectName
	 * @param orderProperty
	 * @param desc
	 * @return
	 * @throws WSException
	 * @throws Exception
	 */
	public List getAllObject(final String objectName,final String[] orderProperty, final boolean desc);

	/**
	 * 全部查询（可分页）
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @param pageNo 第几页
	 * @param rpp 一页显示多少条数据
	 * @return
	 */
	public List getAllObject(final String objectName,final String[] orderProperty, final boolean desc,int pageNo, int rpp );
	
	/**
	 * 以属性集合查找对象模糊查询（可分页、排序）
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @param pageNo
	 * @param rpp
	 * @return
	 */
	public List findByLikeProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp, String[] orderProperty, boolean desc);
	
	/**
	 * 以属性集合查找对象模糊查询,可排序
	 * @param objectName
	 * @param propertyName
	 * @param value
	 * @param pageNo
	 * @param rpp
	 * @return
	 */
	public List findByLikeProperty(String objectName, String[] propertyName, Object[] value,
			String[] orderProperty, boolean desc);
}
