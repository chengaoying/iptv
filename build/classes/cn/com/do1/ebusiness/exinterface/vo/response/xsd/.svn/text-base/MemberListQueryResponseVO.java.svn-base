/**
 * MemberListQueryResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class MemberListQueryResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private java.lang.Integer currentSize;

    private cn.com.do1.ebusiness.exinterface.vo.xsd.MemberInfo[] memberList;

    private java.lang.Integer totalSize;

    public MemberListQueryResponseVO() {
    }

    public MemberListQueryResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           java.lang.Integer currentSize,
           cn.com.do1.ebusiness.exinterface.vo.xsd.MemberInfo[] memberList,
           java.lang.Integer totalSize) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.currentSize = currentSize;
        this.memberList = memberList;
        this.totalSize = totalSize;
    }


    /**
     * Gets the currentSize value for this MemberListQueryResponseVO.
     * 
     * @return currentSize
     */
    public java.lang.Integer getCurrentSize() {
        return currentSize;
    }


    /**
     * Sets the currentSize value for this MemberListQueryResponseVO.
     * 
     * @param currentSize
     */
    public void setCurrentSize(java.lang.Integer currentSize) {
        this.currentSize = currentSize;
    }


    /**
     * Gets the memberList value for this MemberListQueryResponseVO.
     * 
     * @return memberList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.MemberInfo[] getMemberList() {
        return memberList;
    }


    /**
     * Sets the memberList value for this MemberListQueryResponseVO.
     * 
     * @param memberList
     */
    public void setMemberList(cn.com.do1.ebusiness.exinterface.vo.xsd.MemberInfo[] memberList) {
        this.memberList = memberList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.MemberInfo getMemberList(int i) {
        return this.memberList[i];
    }

    public void setMemberList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.MemberInfo _value) {
        this.memberList[i] = _value;
    }


    /**
     * Gets the totalSize value for this MemberListQueryResponseVO.
     * 
     * @return totalSize
     */
    public java.lang.Integer getTotalSize() {
        return totalSize;
    }


    /**
     * Sets the totalSize value for this MemberListQueryResponseVO.
     * 
     * @param totalSize
     */
    public void setTotalSize(java.lang.Integer totalSize) {
        this.totalSize = totalSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemberListQueryResponseVO)) return false;
        MemberListQueryResponseVO other = (MemberListQueryResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currentSize==null && other.getCurrentSize()==null) || 
             (this.currentSize!=null &&
              this.currentSize.equals(other.getCurrentSize()))) &&
            ((this.memberList==null && other.getMemberList()==null) || 
             (this.memberList!=null &&
              java.util.Arrays.equals(this.memberList, other.getMemberList()))) &&
            ((this.totalSize==null && other.getTotalSize()==null) || 
             (this.totalSize!=null &&
              this.totalSize.equals(other.getTotalSize())));
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
        if (getCurrentSize() != null) {
            _hashCode += getCurrentSize().hashCode();
        }
        if (getMemberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalSize() != null) {
            _hashCode += getTotalSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemberListQueryResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "MemberListQueryResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "currentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "memberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MemberInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "totalSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
