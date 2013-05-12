/**
 * OrderPromotionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class OrderPromotionInfo  implements java.io.Serializable {
    private java.lang.String orderId;

    private java.lang.String orderItemId;

    private java.lang.String promotionDesc;

    private java.lang.String promotionId;

    private java.lang.Integer promotionType;

    public OrderPromotionInfo() {
    }

    public OrderPromotionInfo(
           java.lang.String orderId,
           java.lang.String orderItemId,
           java.lang.String promotionDesc,
           java.lang.String promotionId,
           java.lang.Integer promotionType) {
           this.orderId = orderId;
           this.orderItemId = orderItemId;
           this.promotionDesc = promotionDesc;
           this.promotionId = promotionId;
           this.promotionType = promotionType;
    }


    /**
     * Gets the orderId value for this OrderPromotionInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderPromotionInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderItemId value for this OrderPromotionInfo.
     * 
     * @return orderItemId
     */
    public java.lang.String getOrderItemId() {
        return orderItemId;
    }


    /**
     * Sets the orderItemId value for this OrderPromotionInfo.
     * 
     * @param orderItemId
     */
    public void setOrderItemId(java.lang.String orderItemId) {
        this.orderItemId = orderItemId;
    }


    /**
     * Gets the promotionDesc value for this OrderPromotionInfo.
     * 
     * @return promotionDesc
     */
    public java.lang.String getPromotionDesc() {
        return promotionDesc;
    }


    /**
     * Sets the promotionDesc value for this OrderPromotionInfo.
     * 
     * @param promotionDesc
     */
    public void setPromotionDesc(java.lang.String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }


    /**
     * Gets the promotionId value for this OrderPromotionInfo.
     * 
     * @return promotionId
     */
    public java.lang.String getPromotionId() {
        return promotionId;
    }


    /**
     * Sets the promotionId value for this OrderPromotionInfo.
     * 
     * @param promotionId
     */
    public void setPromotionId(java.lang.String promotionId) {
        this.promotionId = promotionId;
    }


    /**
     * Gets the promotionType value for this OrderPromotionInfo.
     * 
     * @return promotionType
     */
    public java.lang.Integer getPromotionType() {
        return promotionType;
    }


    /**
     * Sets the promotionType value for this OrderPromotionInfo.
     * 
     * @param promotionType
     */
    public void setPromotionType(java.lang.Integer promotionType) {
        this.promotionType = promotionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderPromotionInfo)) return false;
        OrderPromotionInfo other = (OrderPromotionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderItemId==null && other.getOrderItemId()==null) || 
             (this.orderItemId!=null &&
              this.orderItemId.equals(other.getOrderItemId()))) &&
            ((this.promotionDesc==null && other.getPromotionDesc()==null) || 
             (this.promotionDesc!=null &&
              this.promotionDesc.equals(other.getPromotionDesc()))) &&
            ((this.promotionId==null && other.getPromotionId()==null) || 
             (this.promotionId!=null &&
              this.promotionId.equals(other.getPromotionId()))) &&
            ((this.promotionType==null && other.getPromotionType()==null) || 
             (this.promotionType!=null &&
              this.promotionType.equals(other.getPromotionType())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderItemId() != null) {
            _hashCode += getOrderItemId().hashCode();
        }
        if (getPromotionDesc() != null) {
            _hashCode += getPromotionDesc().hashCode();
        }
        if (getPromotionId() != null) {
            _hashCode += getPromotionId().hashCode();
        }
        if (getPromotionType() != null) {
            _hashCode += getPromotionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderPromotionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderPromotionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orderId"));
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
        elemField.setFieldName("promotionDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "promotionDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "promotionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "promotionType"));
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
