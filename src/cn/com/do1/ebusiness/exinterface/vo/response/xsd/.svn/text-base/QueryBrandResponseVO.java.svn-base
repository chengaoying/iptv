/**
 * QueryBrandResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class QueryBrandResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private cn.com.do1.ebusiness.exinterface.vo.xsd.BrandInfo[] brandList;

    private java.lang.Integer currentSize;

    private java.lang.Integer totalSize;

    public QueryBrandResponseVO() {
    }

    public QueryBrandResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           cn.com.do1.ebusiness.exinterface.vo.xsd.BrandInfo[] brandList,
           java.lang.Integer currentSize,
           java.lang.Integer totalSize) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.brandList = brandList;
        this.currentSize = currentSize;
        this.totalSize = totalSize;
    }


    /**
     * Gets the brandList value for this QueryBrandResponseVO.
     * 
     * @return brandList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.BrandInfo[] getBrandList() {
        return brandList;
    }


    /**
     * Sets the brandList value for this QueryBrandResponseVO.
     * 
     * @param brandList
     */
    public void setBrandList(cn.com.do1.ebusiness.exinterface.vo.xsd.BrandInfo[] brandList) {
        this.brandList = brandList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.BrandInfo getBrandList(int i) {
        return this.brandList[i];
    }

    public void setBrandList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.BrandInfo _value) {
        this.brandList[i] = _value;
    }


    /**
     * Gets the currentSize value for this QueryBrandResponseVO.
     * 
     * @return currentSize
     */
    public java.lang.Integer getCurrentSize() {
        return currentSize;
    }


    /**
     * Sets the currentSize value for this QueryBrandResponseVO.
     * 
     * @param currentSize
     */
    public void setCurrentSize(java.lang.Integer currentSize) {
        this.currentSize = currentSize;
    }


    /**
     * Gets the totalSize value for this QueryBrandResponseVO.
     * 
     * @return totalSize
     */
    public java.lang.Integer getTotalSize() {
        return totalSize;
    }


    /**
     * Sets the totalSize value for this QueryBrandResponseVO.
     * 
     * @param totalSize
     */
    public void setTotalSize(java.lang.Integer totalSize) {
        this.totalSize = totalSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBrandResponseVO)) return false;
        QueryBrandResponseVO other = (QueryBrandResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.brandList==null && other.getBrandList()==null) || 
             (this.brandList!=null &&
              java.util.Arrays.equals(this.brandList, other.getBrandList()))) &&
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
        if (getBrandList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrandList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrandList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryBrandResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryBrandResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "brandList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "BrandInfo"));
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
