package com.novel.iptv.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.novel.iptv.dao.IBaseDaoSupport;


/**
 * @author xgh
 *
 */
public class BaseDaoSupportImpl extends HibernateDaoSupport implements IBaseDaoSupport
{
	private Log log = LogFactory.getLog(BaseDaoSupportImpl.class);
	
	public int delete(final String objectName, final String propertyName, final String[] idKey) throws Exception {
		if(idKey==null ||idKey.length<=0)
			return 0;
		//过滤非法字符
		if (objectName.indexOf("%") > 0 || objectName.indexOf("'") > 0
				|| propertyName.indexOf("'") > 0
				|| propertyName.indexOf("%") > 0) {
			throw new Exception("非法操作");
		}
		
		try{
			for (int i = 0; i < idKey.length; i++) {
				this.getHibernateTemplate().delete(this.getHibernateTemplate().get(objectName, Integer.parseInt(idKey[i])));
			}
        } catch (Exception e){
        	logger.error("BaseDaoSupportImpl.delete error:", e);
        	throw new Exception("删除错误");
        } finally {
			
		}
		return idKey.length;
	}
	
	public void saveOrUpdate(Object obj) throws Exception{
		try {
			this.getHibernateTemplate().saveOrUpdate(obj);
	
		} catch (Exception e) {
			log.error("BaseDaoSupportImpl.saveOrUpdate error:", e);
			throw e;
		}
	}

	public void saveOrUpdateList(List objList) throws  Exception {
		try {
			if(objList==null ||objList.size()<=0)
				throw new Exception("所要操作的对象为空或不存在.");
			
			Session session = this.getSession();
			for (int i = 0; i < objList.size(); i++) {
				session.saveOrUpdate(objList.get(i));
				
			}
		} catch (Exception e) {
			log.error("BaseDaoSupportImpl.saveOrUpdate error:", e);
			throw new Exception("保存/更新失败.");
		}
	}


	public Object insertObject(Object obj)
	{
		return this.getHibernateTemplate().save(obj);
	}

	public void deleteObject(Object obj)
	{
		this.getHibernateTemplate().delete(obj);
	}

	public void updateObject(Object obj)
	{
		this.getHibernateTemplate().update(obj);
	}
	
	public Object findByPK(Class objectClass, Serializable pk)
	{
		return this.getHibernateTemplate().get(objectClass, pk);
	}

	public List findByProperty(String objectName, String propertyName, Object value)
	{
		String queryString = "from "+objectName+" as model where model." 
				+ propertyName + "= ?";
		if(value==null){
			queryString = "from "+objectName+" as model where model." 
			+ propertyName + " is null";
			log.debug("queryString="+queryString);
			return getHibernateTemplate().find(queryString);
		}
		log.debug("queryString="+queryString);
		return getHibernateTemplate().find(queryString, value);
	}
	
	public List findByProperty(final String objectName, final String[] returnProperty, final String propertyName, 
			final Object value, final String[] orderProperty, final boolean desc)
	{	
		List result=null;
		if (returnProperty !=null && returnProperty.length>0)
		{
			StringBuffer queryStringBuf=new StringBuffer();
			queryStringBuf.append("select ");
			for (int i=0; i<returnProperty.length; i++)
			{
				queryStringBuf.append("model."+returnProperty[i]).append(",");
			}
			queryStringBuf.deleteCharAt(queryStringBuf.length()-1);
			queryStringBuf.append(" from "+objectName).append(" as model ");
			if (propertyName !=null)
				queryStringBuf.append(" where model."+propertyName+"=? ");
			if (orderProperty!=null && orderProperty.length>0)
			{
				queryStringBuf.append(" order by ");
				for (int j=0; j<orderProperty.length; j++)
				{
					queryStringBuf.append("model."+orderProperty[j]).append(",");
				}
				queryStringBuf.deleteCharAt(queryStringBuf.length()-1);
				if (desc)
					queryStringBuf.append(" desc");
				else
					queryStringBuf.append(" asc");
			}
			log.debug("queryString="+queryStringBuf.toString());
			List list=null;
			if (propertyName !=null)
				list=getHibernateTemplate().find(queryStringBuf.toString(), value);
			else
				list=getHibernateTemplate().find(queryStringBuf.toString());
			if (list != null && !list.isEmpty())
			{			
				result=new ArrayList();
				for (int ii=0; ii<list.size(); ii++)
				{
					Properties properties=new Properties();
					if (returnProperty.length==1)
						properties.put(returnProperty[0], list.get(ii));
					else
					{
						Object[] objs=(Object[])list.get(ii);
						for (int k=0; k<returnProperty.length; k++)
						{
							properties.put(returnProperty[k], objs[k]);
						}
					}
					result.add(properties);
				}
			}
		}
		else
		{
			result=(List)getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) 
				{		
					Criteria criteria=session.createCriteria(objectName);
					if (propertyName !=null)
						criteria.add(Expression.eq(propertyName, value));
					if (orderProperty!=null && orderProperty.length>0)
					{
						if (desc)
						{
							for (int j=0; j<orderProperty.length; j++)
							{
								criteria.addOrder(Order.desc(orderProperty[j]));
							}
						}
						else
						{
							for (int jj=0; jj<orderProperty.length; jj++)
							{
								criteria.addOrder(Order.asc(orderProperty[jj]));
							}
						}
					}
					return criteria.list();
				}
			});
		}
		return result;
	}
	
	public List findByProperty(String objectName, String propertyName, Object value, 
			int pageNo, int rpp)
	{
		String queryString = "from "+objectName+" as model where model." 
			+ propertyName + "= ?";
		log.debug("queryString="+queryString);
		Query query=this.getSession().createQuery(queryString);
		query.setParameter(0, value);
		query.setFirstResult((pageNo-1)*rpp);
		query.setMaxResults(rpp);
		return query.list();
	}
	
	public List findByProperty(String objectName, String[] propertyName, Object[] value)
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		if (propertyName.length >0){
			buffer.append("where ");
			for (int i=0; i<propertyName.length; i++)
			{
				buffer.append("model."+propertyName[i]+"=? and ");
			}
			log.debug("queryString="+buffer.substring(0, buffer.length()-4));
			return getHibernateTemplate().find(buffer.substring(0, buffer.length()-4), value);
		}else{
			log.debug("queryString="+buffer);
			return getHibernateTemplate().find(buffer.toString(), value);
		}
	}
	
	public List findByProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp)
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		String sql = null;
		if (propertyName.length >0){
			buffer.append("where ");
			for (int i=0; i<propertyName.length; i++)
			{
				buffer.append("model."+propertyName[i]+"=? and ");
			}
			sql = buffer.substring(0, buffer.length()-4);
		}else{
			sql = buffer.toString();
		}
		log.debug("queryString="+sql);
		Query query=this.getSession().createQuery(sql);
		query.setFirstResult((pageNo-1)*rpp);
		query.setMaxResults(rpp);
		return query.list();
	}
	
	public List findByProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp, String[] orderProperty, boolean desc)
	{
		StringBuffer buffer=new StringBuffer();
		StringBuffer buffer2=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		if (propertyName.length >0){
			buffer.append("where ");
			for (int i=0; i<propertyName.length; i++)
			{
				buffer.append("model."+propertyName[i]+"=? and ");
			}
			buffer2.append(buffer.substring(0, buffer.length()-4));
		}else{
			buffer2.append(buffer);
		}
		if (orderProperty!=null && orderProperty.length>0)
		{
			for (int j=0; j<orderProperty.length; j++)
			{
				buffer2.append( "order by model."+orderProperty[j]);
			}			
			
			if (desc){
				buffer2.append(" desc");
			}else{
				buffer2.append(" asc");
			}
		}
		log.debug("queryString="+buffer2);
		Query query=this.getSession().createQuery(buffer2.toString());
		for (int i=0; i<value.length; i++)
		{
			query.setParameter(i, value[i]);
		}
		query.setFirstResult((pageNo-1)*rpp);
		query.setMaxResults(rpp);
		return query.list();
	}
	
	public List findByLikeProperty(String objectName, String[] propertyName, Object[] value,
			int pageNo, int rpp, String[] orderProperty, boolean desc)
	{
		StringBuffer buffer=new StringBuffer();
		StringBuffer buffer2=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		if (propertyName.length >0){
			buffer.append("where ");
			for (int i=0; i<propertyName.length; i++)
			{
				buffer.append("model."+propertyName[i]+" like '%"+value[i]+"%' and ");
			}
			buffer2.append(buffer.substring(0, buffer.length()-4));
		}else{
			buffer2.append(buffer);
		}
		if (orderProperty!=null && orderProperty.length>0)
		{
			for (int j=0; j<orderProperty.length; j++)
			{
				buffer2.append( "order by model."+orderProperty[j]);
			}			
			
			if (desc){
				buffer2.append(" desc");
			}else{
				buffer2.append(" asc");
			}
		}
		log.debug("queryString="+buffer2);
		Query query=this.getSession().createQuery(buffer2.toString());
		query.setFirstResult((pageNo-1)*rpp);
		query.setMaxResults(rpp);
		return query.list();
	}
	
	public List findByLikeProperty(String objectName, String[] propertyName, Object[] value,
			String[] orderProperty, boolean desc)
	{
		StringBuffer buffer=new StringBuffer();
		StringBuffer buffer2=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		if (propertyName.length >0){
			buffer.append("where ");
			for (int i=0; i<propertyName.length; i++)
			{
				buffer.append("model."+propertyName[i]+" like '%"+value[i]+"%' and ");
			}
			buffer2.append(buffer.substring(0, buffer.length()-4));
		}else{
			buffer2.append(buffer);
		}
		if (orderProperty!=null && orderProperty.length>0)
		{
			for (int j=0; j<orderProperty.length; j++)
			{
				buffer2.append( "order by model."+orderProperty[j]);
			}			
			
			if (desc){
				buffer2.append(" desc");
			}else{
				buffer2.append(" asc");
			}
		}
		log.debug("queryString="+buffer2);
		Query query=this.getSession().createQuery(buffer2.toString());
		return query.list();
	}
	
		
	public String findJsonByPK(final Class objectClass, final Serializable pk) {
		return (String)this.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Object obj= session.get(objectClass, pk);
				JsonConfig jsonConfig=new JsonConfig();
				jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
				JSONObject json = JSONObject.fromObject(obj,jsonConfig);
				return json.toString();
			}});
	}
	
	public List getAllObject(final String objectName,final String[] orderProperty, final boolean desc){
		StringBuffer buffer=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		String queryString = buffer.toString();
		if (null!=orderProperty&&orderProperty.length >0){
			buffer.append("order by ");
			for (int i=0; i<orderProperty.length; i++)
			{
				buffer.append(" model."+orderProperty[i]+(desc?" desc":" asc")+",");
			}
			queryString = buffer.substring(0, buffer.length()-1);
		}
		log.debug("queryString ==== "+queryString);
		return getHibernateTemplate().find(queryString);
	}
	
	public List getAllObject(final String objectName,final String[] orderProperty, final boolean desc,int pageNo, int rpp ){
		StringBuffer buffer=new StringBuffer();
		buffer.append("from "+objectName+" as model ");
		String queryString = buffer.toString();
		if (null!=orderProperty&&orderProperty.length >0){
			buffer.append("order by ");
			for (int i=0; i<orderProperty.length; i++)
			{
				buffer.append(" model."+orderProperty[i]+(desc?" desc":" asc")+",");
			}
			queryString = buffer.substring(0, buffer.length()-1);
		}
		log.debug("queryString ==== "+queryString);
		Query query=this.getSession().createQuery(queryString);
		query.setFirstResult((pageNo-1)*rpp);
		query.setMaxResults(rpp);
		return query.list();
	}

}
