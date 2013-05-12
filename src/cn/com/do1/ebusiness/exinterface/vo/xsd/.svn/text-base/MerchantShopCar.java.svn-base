/**
 * MerchantShopCar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class MerchantShopCar  implements java.io.Serializable {
    private cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar[] mdList;

    private java.lang.String merchantId;

    private java.lang.String merchantName;

    public MerchantShopCar() {
    }

    public MerchantShopCar(
           cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar[] mdList,
           java.lang.String merchantId,
           java.lang.String merchantName) {
           this.mdList = mdList;
           this.merchantId = merchantId;
           this.merchantName = merchantName;
    }


    /**
     * Gets the mdList value for this MerchantShopCar.
     * 
     * @return mdList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar[] getMdList() {
        return mdList;
    }


    /**
     * Sets the mdList value for this MerchantShopCar.
     * 
     * @param mdList
     */
    public void setMdList(cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar[] mdList) {
        this.mdList = mdList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar getMdList(int i) {
        return this.mdList[i];
    }

    public void setMdList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar _value) {
        this.mdList[i] = _value;
    }


    /**
     * Gets the merchantId value for this MerchantShopCar.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this MerchantShopCar.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the merchantName value for this MerchantShopCar.
     * 
     * @return merchantName
     */
    public java.lang.String getMerchantName() {
        return merchantName;
    }


    /**
     * Sets the merchantName value for this MerchantShopCar.
     * 
     * @param merchantName
     */
    public void setMerchantName(java.lang.String merchantName) {
        this.merchantName = merchantName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantShopCar)) return false;
        MerchantShopCar other = (MerchantShopCar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mdList==null && other.getMdList()==null) || 
             (this.mdList!=null &&
              java.util.Arrays.equals(this.mdList, other.getMdList()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.merchantName==null && other.getMerchantName()==null) || 
             (this.merchantName!=null &&
              this.merchantName.equals(other.getMerchantName())));
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
        if (getMdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getMerchantName() != null) {
            _hashCode += getMerchantName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantShopCar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MerchantShopCar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "mdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MdShopCar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "merchantName"));
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
