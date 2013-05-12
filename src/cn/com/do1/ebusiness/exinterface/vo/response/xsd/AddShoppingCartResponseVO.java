/**
 * AddShoppingCartResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class AddShoppingCartResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private java.lang.Integer merchandiseNum;

    private java.lang.Double totalPrice;

    public AddShoppingCartResponseVO() {
    }

    public AddShoppingCartResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           java.lang.Integer merchandiseNum,
           java.lang.Double totalPrice) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.merchandiseNum = merchandiseNum;
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the merchandiseNum value for this AddShoppingCartResponseVO.
     * 
     * @return merchandiseNum
     */
    public java.lang.Integer getMerchandiseNum() {
        return merchandiseNum;
    }


    /**
     * Sets the merchandiseNum value for this AddShoppingCartResponseVO.
     * 
     * @param merchandiseNum
     */
    public void setMerchandiseNum(java.lang.Integer merchandiseNum) {
        this.merchandiseNum = merchandiseNum;
    }


    /**
     * Gets the totalPrice value for this AddShoppingCartResponseVO.
     * 
     * @return totalPrice
     */
    public java.lang.Double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this AddShoppingCartResponseVO.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddShoppingCartResponseVO)) return false;
        AddShoppingCartResponseVO other = (AddShoppingCartResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.merchandiseNum==null && other.getMerchandiseNum()==null) || 
             (this.merchandiseNum!=null &&
              this.merchandiseNum.equals(other.getMerchandiseNum()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice())));
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
        if (getMerchandiseNum() != null) {
            _hashCode += getMerchandiseNum().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddShoppingCartResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "merchandiseNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
