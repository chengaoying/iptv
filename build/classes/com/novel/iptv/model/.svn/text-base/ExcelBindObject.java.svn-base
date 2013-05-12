package com.novel.iptv.model;

import com.novel.iptv.exception.SysException;

public abstract class ExcelBindObject {

	private Class<?> lazyClass;
	private Object lazyClassInstance;

	// 构造函数
	public ExcelBindObject(Class v_lazyClass) {
		super();
		lazyClass = v_lazyClass;
	}

	// getXXX,setXXX

	public Class getLazyClass() {
		return lazyClass;
	}

	public void setLazyClass(Class v_lazyClass) {

		lazyClass = v_lazyClass;
	}

	public Object getLazyClassInstance() {
		return lazyClassInstance;
	};

	public abstract Object setValue(int index, Object value, Object ob);

	public Object bindObject() {
		try {
//			if (lazyClassInstance == null) {
				this.lazyClassInstance = this.getLazyClass().newInstance();
//			}
			return getLazyClassInstance();
		} catch (InstantiationException e) {
			throw new SysException("类对象无法被实例化");
		} catch (IllegalAccessException e) {
			throw new SysException("无法访问指定类的定义");
		}
	}

}
