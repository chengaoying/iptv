/**
 * OrderItemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class OrderItemInfo  implements java.io.Serializable {
    private java.lang.String attributeDesc;

    private java.lang.Integer buyNum;

    private java.lang.Double discount;

    private java.lang.String merchandiseCode;

    private java.lang.String merchandiseName;

    private java.lang.String orderItemId;

    private java.lang.Integer orderItemStatus;

    private java.lang.Double price;

    public OrderItemInfo() {
    }

    public OrderItemInfo(
           java.lang.String attributeDesc,
           java.lang.Integer buyNum,
           java.lang.Double discount,
           java.lang.String merchandiseCode,
           java.lang.String merchandiseName,
           java.lang.String orderItemId,
           java.lang.Integer orderItemStatus,
           java.lang.Double price) {
           this.attributeDesc = attributeDesc;
           this.buyNum = buyNum;
           this.discount = discount;
           this.merchandiseCode = merchandiseCode;
           this.merchandiseName = merchandiseName;
           this.orderItemId = orderItemId;
           this.orderItemStatus = orderItemStatus;
           this.price = price;
    }


    /**
     * Gets the attributeDesc value for this OrderItemInfo.
     * 
     * @return attributeDesc
     */
    public java.lang.String getAttributeDesc() {
        return attributeDesc;
    }


    /**
     * Sets the attributeDesc value for this OrderItemInfo.
     * 
     * @param attributeDesc
     */
    public void setAttributeDesc(java.lang.String attributeDesc) {
        this.attributeDesc = attributeDesc;
    }


    /**
     * Gets the buyNum value for this OrderItemInfo.
     * 
     * @return buyNum
     */
    public java.lang.Integer getBuyNum() {
        return buyNum;
    }


    /**
     * Sets the buyNum value for this OrderItemInfo.
     * 
     * @param buyNum
     */
    public void setBuyNum(java.lang.Integer buyNum) {
        this.buyNum = buyNum;
    }


    /**
     * Gets the discount value for this OrderItemInfo.
     * 
     * @return discount
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this OrderItemInfo.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the merchandiseCode value for this OrderItemInfo.
     * 
     * @return merchandiseCode
     */
    public java.lang.String getMerchandiseCode() {
        return merchandiseCode;
    }


    /**
     * Sets the merchandiseCode value for this OrderItemInfo.
     * 
     * @param merchandiseCode
     */
    public void setMerchandiseCode(java.lang.String merchandiseCode) {
        this.merchandiseCode = merchandiseCode;
    }


    /**
     * Gets the merchandiseName value for this OrderItemInfo.
     * 
     * @return merchandiseName
     */
    public java.lang.String getMerchandiseName() {
        return merchandiseName;
    }


    /**
     * Sets the merchandiseName value for this OrderItemInfo.
     * 
     * @param merchandiseName
     */
    public void setMerchandiseName(java.lang.String merchandiseName) {
        this.merchandiseName = merchandiseName;
    }


    /**
     * Gets the orderItemId value for this OrderItemInfo.
     * 
     * @return orderItemId
     */
    public java.lang.String getOrderItemId() {
        return orderItemId;
    }


    /**
     * Sets the orderItemId value for this OrderItemInfo.
     * 
     * @param orderItemId
     */
    public void setOrderItemId(java.lang.String orderItemId) {
        this.orderItemId = orderItemId;
    }


    /**
     * Gets the orderItemStatus value for this OrderItemInfo.
     * 
     * @return orderItemStatus
     */
    public java.lang.Integer getOrderItemStatus() {
        return orderItemStatus;
    }


    /**
     * Sets the orderItemStatus value for this OrderItemInfo.
     * 
     * @param orderItemStatus
     */
    public void setOrderItemStatus(java.lang.Integer orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }


    /**
     * Gets the price value for this OrderItemInfo.
     * 
     * @return price
     */
    public java.lang.Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OrderItemInfo.
     * 
     * @param price
     */
    public void setPrice(java.lang.Double price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderItemInfo)) return false;
        OrderItemInfo other = (OrderItemInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeDesc==null && other.getAttributeDesc()==null) || 
             (this.attributeDesc!=null &&
              this.attributeDesc.equals(other.getAttributeDesc()))) &&
            ((this.buyNum==null && other.getBuyNum()==null) || 
             (this.buyNum!=null &&
              this.buyNum.equals(other.getBuyNum()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.merchandiseCode==null && other.getMerchandiseCode()==null) || 
             (this.merchandiseCode!=null &&
              this.merchandiseCode.equals(other.getMerchandiseCode()))) &&
            ((this.merchandiseName==null && other.getMerchandiseName()==null) || 
             (this.merchandiseName!=null &&
              this.merchandiseName.equals(other.getMerchandiseName()))) &&
            ((this.orderItemId==null && other.getOrderItemId()==null) || 
             (this.orderItemId!=null &&
              this.orderItemId.equals(other.getOrderItemId()))) &&
            ((this.orderItemStatus==null && other.getOrderItemStatus()==null) || 
             (this.orderItemStatus!=null &&
              this.orderItemStatus.equals(other.getOrderItemStatus()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        if (getAttributeDesc() != null) {
            _hashCode += getAttributeDesc().hashCode();
        }
        if (getBuyNum() != null) {
            _hashCode += getBuyNum().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getMerchandiseCode() != null) {
            _hashCode += getMerchandiseCode().hashCode();
        }
        if (getMerchandiseName() != null) {
            _hashCode += getMerchandiseName().hashCode();
        }
        if (getOrderItemId() != null) {
            _hashCode += getOrderItemId().hashCode();
        }
        if (getOrderItemStatus() != null) {
            _hashCode += getOrderItemStatus().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderItemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderItemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "attributeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "buyNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "merchandiseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "merchandiseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orderItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderItemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orderItemStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "price"));
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
