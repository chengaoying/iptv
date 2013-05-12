/**
 * QueryContentResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class QueryContentResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private cn.com.do1.ebusiness.exinterface.vo.xsd.ContentInfo[] contentList;

    private java.lang.Integer currentSize;

    private java.lang.Integer totalSize;

    public QueryContentResponseVO() {
    }

    public QueryContentResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           cn.com.do1.ebusiness.exinterface.vo.xsd.ContentInfo[] contentList,
           java.lang.Integer currentSize,
           java.lang.Integer totalSize) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.contentList = contentList;
        this.currentSize = currentSize;
        this.totalSize = totalSize;
    }


    /**
     * Gets the contentList value for this QueryContentResponseVO.
     * 
     * @return contentList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.ContentInfo[] getContentList() {
        return contentList;
    }


    /**
     * Sets the contentList value for this QueryContentResponseVO.
     * 
     * @param contentList
     */
    public void setContentList(cn.com.do1.ebusiness.exinterface.vo.xsd.ContentInfo[] contentList) {
        this.contentList = contentList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.ContentInfo getContentList(int i) {
        return this.contentList[i];
    }

    public void setContentList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.ContentInfo _value) {
        this.contentList[i] = _value;
    }


    /**
     * Gets the currentSize value for this QueryContentResponseVO.
     * 
     * @return currentSize
     */
    public java.lang.Integer getCurrentSize() {
        return currentSize;
    }


    /**
     * Sets the currentSize value for this QueryContentResponseVO.
     * 
     * @param currentSize
     */
    public void setCurrentSize(java.lang.Integer currentSize) {
        this.currentSize = currentSize;
    }


    /**
     * Gets the totalSize value for this QueryContentResponseVO.
     * 
     * @return totalSize
     */
    public java.lang.Integer getTotalSize() {
        return totalSize;
    }


    /**
     * Sets the totalSize value for this QueryContentResponseVO.
     * 
     * @param totalSize
     */
    public void setTotalSize(java.lang.Integer totalSize) {
        this.totalSize = totalSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryContentResponseVO)) return false;
        QueryContentResponseVO other = (QueryContentResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentList==null && other.getContentList()==null) || 
             (this.contentList!=null &&
              java.util.Arrays.equals(this.contentList, other.getContentList()))) &&
            ((this.currentSize==null && other.getCurrentSize()==null) || 
             (this.currentSize!=null &&
              this.currentSize.equals(other.getCurrentSize()))) &&
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
        if (getContentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentSize() != null) {
            _hashCode += getCurrentSize().hashCode();
        }
        if (getTotalSize() != null) {
            _hashCode += getTotalSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryContentResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryContentResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "contentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "ContentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "currentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "totalSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
