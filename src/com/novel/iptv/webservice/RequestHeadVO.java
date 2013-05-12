package com.novel.iptv.webservice;

public class RequestHeadVO implements java.io.Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6747575517589928587L;
	private String interfaceId;
	private String msgId;
	private String spId;
	private String spPin;
	private String timestamp;

	public RequestHeadVO(){}
	
	public String getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(String interfaceId) {
		this.interfaceId = interfaceId;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getSpId() {
		return spId;
	}

	public void setSpId(String spId) {
		this.spId = spId;
	}

	public String getSpPin() {
		return spPin;
	}

	public void setSpPin(String spPin) {
		this.spPin = spPin;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
