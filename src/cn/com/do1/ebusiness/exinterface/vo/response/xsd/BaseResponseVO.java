/**
 * BaseResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class BaseResponseVO  implements java.io.Serializable {
    private java.lang.String interfaceId;

    private java.lang.String msgId;

    private java.lang.String respCode;

    private java.lang.String respDesc;

    private java.lang.String spId;

    private java.lang.String timestamp;

    public BaseResponseVO() {
    }

    public BaseResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp) {
           this.interfaceId = interfaceId;
           this.msgId = msgId;
           this.respCode = respCode;
           this.respDesc = respDesc;
           this.spId = spId;
           this.timestamp = timestamp;
    }


    /**
     * Gets the interfaceId value for this BaseResponseVO.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this BaseResponseVO.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }


    /**
     * Gets the msgId value for this BaseResponseVO.
     * 
     * @return msgId
     */
    public java.lang.String getMsgId() {
        return msgId;
    }


    /**
     * Sets the msgId value for this BaseResponseVO.
     * 
     * @param msgId
     */
    public void setMsgId(java.lang.String msgId) {
        this.msgId = msgId;
    }


    /**
     * Gets the respCode value for this BaseResponseVO.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this BaseResponseVO.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respDesc value for this BaseResponseVO.
     * 
     * @return respDesc
     */
    public java.lang.String getRespDesc() {
        return respDesc;
    }


    /**
     * Sets the respDesc value for this BaseResponseVO.
     * 
     * @param respDesc
     */
    public void setRespDesc(java.lang.String respDesc) {
        this.respDesc = respDesc;
    }


    /**
     * Gets the spId value for this BaseResponseVO.
     * 
     * @return spId
     */
    public java.lang.String getSpId() {
        return spId;
    }


    /**
     * Sets the spId value for this BaseResponseVO.
     * 
     * @param spId
     */
    public void setSpId(java.lang.String spId) {
        this.spId = spId;
    }


    /**
     * Gets the timestamp value for this BaseResponseVO.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this BaseResponseVO.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseResponseVO)) return false;
        BaseResponseVO other = (BaseResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interfaceId==null && other.getInterfaceId()==null) || 
             (this.interfaceId!=null &&
              this.interfaceId.equals(other.getInterfaceId()))) &&
            ((this.msgId==null && other.getMsgId()==null) || 
             (this.msgId!=null &&
              this.msgId.equals(other.getMsgId()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respDesc==null && other.getRespDesc()==null) || 
             (this.respDesc!=null &&
              this.respDesc.equals(other.getRespDesc()))) &&
            ((this.spId==null && other.getSpId()==null) || 
             (this.spId!=null &&
              this.spId.equals(other.getSpId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        if (getMsgId() != null) {
            _hashCode += getMsgId().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespDesc() != null) {
            _hashCode += getRespDesc().hashCode();
        }
        if (getSpId() != null) {
            _hashCode += getSpId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "BaseResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "interfaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "msgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "respDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "spId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
