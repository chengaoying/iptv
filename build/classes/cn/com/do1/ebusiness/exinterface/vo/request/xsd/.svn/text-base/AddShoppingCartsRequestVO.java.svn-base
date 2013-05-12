/**
 * AddShoppingCartsRequestVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.request.xsd;

public class AddShoppingCartsRequestVO  extends cn.com.do1.ebusiness.exinterface.vo.request.xsd.BaseRequestVO  implements java.io.Serializable {
    private java.lang.String cardNo;

    private java.lang.String mobile;

    private cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem[] shoppingCartItems;

    public AddShoppingCartsRequestVO() {
    }

    public AddShoppingCartsRequestVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String spId,
           java.lang.String spPin,
           java.lang.String timestamp,
           java.lang.String cardNo,
           java.lang.String mobile,
           cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem[] shoppingCartItems) {
        super(
            interfaceId,
            msgId,
            spId,
            spPin,
            timestamp);
        this.cardNo = cardNo;
        this.mobile = mobile;
        this.shoppingCartItems = shoppingCartItems;
    }


    /**
     * Gets the cardNo value for this AddShoppingCartsRequestVO.
     * 
     * @return cardNo
     */
    public java.lang.String getCardNo() {
        return cardNo;
    }


    /**
     * Sets the cardNo value for this AddShoppingCartsRequestVO.
     * 
     * @param cardNo
     */
    public void setCardNo(java.lang.String cardNo) {
        this.cardNo = cardNo;
    }


    /**
     * Gets the mobile value for this AddShoppingCartsRequestVO.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this AddShoppingCartsRequestVO.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the shoppingCartItems value for this AddShoppingCartsRequestVO.
     * 
     * @return shoppingCartItems
     */
    public cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem[] getShoppingCartItems() {
        return shoppingCartItems;
    }


    /**
     * Sets the shoppingCartItems value for this AddShoppingCartsRequestVO.
     * 
     * @param shoppingCartItems
     */
    public void setShoppingCartItems(cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem[] shoppingCartItems) {
        this.shoppingCartItems = shoppingCartItems;
    }

    public cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem getShoppingCartItems(int i) {
        return this.shoppingCartItems[i];
    }

    public void setShoppingCartItems(int i, cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem _value) {
        this.shoppingCartItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddShoppingCartsRequestVO)) return false;
        AddShoppingCartsRequestVO other = (AddShoppingCartsRequestVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardNo==null && other.getCardNo()==null) || 
             (this.cardNo!=null &&
              this.cardNo.equals(other.getCardNo()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.shoppingCartItems==null && other.getShoppingCartItems()==null) || 
             (this.shoppingCartItems!=null &&
              java.util.Arrays.equals(this.shoppingCartItems, other.getShoppingCartItems())));
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
        if (getCardNo() != null) {
            _hashCode += getCardNo().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getShoppingCartItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShoppingCartItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShoppingCartItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddShoppingCartsRequestVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartsRequestVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "cardNo"));
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
        elemField.setFieldName("shoppingCartItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "shoppingCartItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
