package com.novel.iptv.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class BaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private static Log log = LogFactory.getLog(BaseException.class);

	public BaseException() {
		super();
		log.error(new Exception("异常,检查"));
	}

	public BaseException(Throwable obj) {
		super(obj);
		log.error(obj);
	}

	public BaseException(String message) {
		super(message);
		log.equals(message);
	}

	public BaseException(String message, Throwable obj) {
		super(message, obj);
		log.error(message, obj);
	}

}
