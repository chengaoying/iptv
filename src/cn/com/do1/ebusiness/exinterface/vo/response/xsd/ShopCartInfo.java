/**
 * ShopCartInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class ShopCartInfo  implements java.io.Serializable {
    private java.lang.Integer buyNum;

    private java.lang.String shopCartId;

    public ShopCartInfo() {
    }

    public ShopCartInfo(
           java.lang.Integer buyNum,
           java.lang.String shopCartId) {
           this.buyNum = buyNum;
           this.shopCartId = shopCartId;
    }


    /**
     * Gets the buyNum value for this ShopCartInfo.
     * 
     * @return buyNum
     */
    public java.lang.Integer getBuyNum() {
        return buyNum;
    }


    /**
     * Sets the buyNum value for this ShopCartInfo.
     * 
     * @param buyNum
     */
    public void setBuyNum(java.lang.Integer buyNum) {
        this.buyNum = buyNum;
    }


    /**
     * Gets the shopCartId value for this ShopCartInfo.
     * 
     * @return shopCartId
     */
    public java.lang.String getShopCartId() {
        return shopCartId;
    }


    /**
     * Sets the shopCartId value for this ShopCartInfo.
     * 
     * @param shopCartId
     */
    public void setShopCartId(java.lang.String shopCartId) {
        this.shopCartId = shopCartId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShopCartInfo)) return false;
        ShopCartInfo other = (ShopCartInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buyNum==null && other.getBuyNum()==null) || 
             (this.buyNum!=null &&
              this.buyNum.equals(other.getBuyNum()))) &&
            ((this.shopCartId==null && other.getShopCartId()==null) || 
             (this.shopCartId!=null &&
              this.shopCartId.equals(other.getShopCartId())));
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
        if (getBuyNum() != null) {
            _hashCode += getBuyNum().hashCode();
        }
        if (getShopCartId() != null) {
            _hashCode += getShopCartId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShopCartInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShopCartInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "buyNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopCartId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "shopCartId"));
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
