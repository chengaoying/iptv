/**
 * ShoppingCartOrderResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class ShoppingCartOrderResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private java.lang.String orderDates;

    private java.lang.String orderIds;

    public ShoppingCartOrderResponseVO() {
    }

    public ShoppingCartOrderResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           java.lang.String orderDates,
           java.lang.String orderIds) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.orderDates = orderDates;
        this.orderIds = orderIds;
    }


    /**
     * Gets the orderDates value for this ShoppingCartOrderResponseVO.
     * 
     * @return orderDates
     */
    public java.lang.String getOrderDates() {
        return orderDates;
    }


    /**
     * Sets the orderDates value for this ShoppingCartOrderResponseVO.
     * 
     * @param orderDates
     */
    public void setOrderDates(java.lang.String orderDates) {
        this.orderDates = orderDates;
    }


    /**
     * Gets the orderIds value for this ShoppingCartOrderResponseVO.
     * 
     * @return orderIds
     */
    public java.lang.String getOrderIds() {
        return orderIds;
    }


    /**
     * Sets the orderIds value for this ShoppingCartOrderResponseVO.
     * 
     * @param orderIds
     */
    public void setOrderIds(java.lang.String orderIds) {
        this.orderIds = orderIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingCartOrderResponseVO)) return false;
        ShoppingCartOrderResponseVO other = (ShoppingCartOrderResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderDates==null && other.getOrderDates()==null) || 
             (this.orderDates!=null &&
              this.orderDates.equals(other.getOrderDates()))) &&
            ((this.orderIds==null && other.getOrderIds()==null) || 
             (this.orderIds!=null &&
              this.orderIds.equals(other.getOrderIds())));
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
        if (getOrderDates() != null) {
            _hashCode += getOrderDates().hashCode();
        }
        if (getOrderIds() != null) {
            _hashCode += getOrderIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingCartOrderResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartOrderResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "orderDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "orderIds"));
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
