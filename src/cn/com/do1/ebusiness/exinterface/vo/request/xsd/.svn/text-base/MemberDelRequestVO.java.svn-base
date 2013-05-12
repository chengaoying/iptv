/**
 * MemberDelRequestVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.request.xsd;

public class MemberDelRequestVO  extends cn.com.do1.ebusiness.exinterface.vo.request.xsd.BaseRequestVO  implements java.io.Serializable {
    private java.lang.String memberId;

    private java.lang.String mobile;

    private java.lang.String tvCardId;

    public MemberDelRequestVO() {
    }

    public MemberDelRequestVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String spId,
           java.lang.String spPin,
           java.lang.String timestamp,
           java.lang.String memberId,
           java.lang.String mobile,
           java.lang.String tvCardId) {
        super(
            interfaceId,
            msgId,
            spId,
            spPin,
            timestamp);
        this.memberId = memberId;
        this.mobile = mobile;
        this.tvCardId = tvCardId;
    }


    /**
     * Gets the memberId value for this MemberDelRequestVO.
     * 
     * @return memberId
     */
    public java.lang.String getMemberId() {
        return memberId;
    }


    /**
     * Sets the memberId value for this MemberDelRequestVO.
     * 
     * @param memberId
     */
    public void setMemberId(java.lang.String memberId) {
        this.memberId = memberId;
    }


    /**
     * Gets the mobile value for this MemberDelRequestVO.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this MemberDelRequestVO.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the tvCardId value for this MemberDelRequestVO.
     * 
     * @return tvCardId
     */
    public java.lang.String getTvCardId() {
        return tvCardId;
    }


    /**
     * Sets the tvCardId value for this MemberDelRequestVO.
     * 
     * @param tvCardId
     */
    public void setTvCardId(java.lang.String tvCardId) {
        this.tvCardId = tvCardId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemberDelRequestVO)) return false;
        MemberDelRequestVO other = (MemberDelRequestVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.memberId==null && other.getMemberId()==null) || 
             (this.memberId!=null &&
              this.memberId.equals(other.getMemberId()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.tvCardId==null && other.getTvCardId()==null) || 
             (this.tvCardId!=null &&
              this.tvCardId.equals(other.getTvCardId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMemberId() != null) {
            _hashCode += getMemberId().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getTvCardId() != null) {
            _hashCode += getTvCardId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemberDelRequestVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "MemberDelRequestVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "memberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tvCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "tvCardId"));
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
