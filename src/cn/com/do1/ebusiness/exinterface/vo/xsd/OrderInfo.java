/**
 * OrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class OrderInfo  implements java.io.Serializable {
    private java.lang.String confirmDate;

    private java.lang.Integer deliveryType;

    private java.lang.Double discount;

    private java.lang.String endDate;

    private java.lang.String merchantId;

    private java.lang.String merchantName;

    private java.lang.String mobile;

    private java.lang.String orderId;

    private cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo[] orderItemList;

    private java.lang.Integer orderStatus;

    private java.lang.String orgOrderId;

    private java.lang.String payDate;

    private java.lang.Integer payType;

    private java.lang.Double postage;

    private java.lang.String promotionDesc;

    private java.lang.Integer promotionType;

    private java.lang.String submitDate;

    private java.lang.Double totalAmount;

    public OrderInfo() {
    }

    public OrderInfo(
           java.lang.String confirmDate,
           java.lang.Integer deliveryType,
           java.lang.Double discount,
           java.lang.String endDate,
           java.lang.String merchantId,
           java.lang.String merchantName,
           java.lang.String mobile,
           java.lang.String orderId,
           cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo[] orderItemList,
           java.lang.Integer orderStatus,
           java.lang.String orgOrderId,
           java.lang.String payDate,
           java.lang.Integer payType,
           java.lang.Double postage,
           java.lang.String promotionDesc,
           java.lang.Integer promotionType,
           java.lang.String submitDate,
           java.lang.Double totalAmount) {
           this.confirmDate = confirmDate;
           this.deliveryType = deliveryType;
           this.discount = discount;
           this.endDate = endDate;
           this.merchantId = merchantId;
           this.merchantName = merchantName;
           this.mobile = mobile;
           this.orderId = orderId;
           this.orderItemList = orderItemList;
           this.orderStatus = orderStatus;
           this.orgOrderId = orgOrderId;
           this.payDate = payDate;
           this.payType = payType;
           this.postage = postage;
           this.promotionDesc = promotionDesc;
           this.promotionType = promotionType;
           this.submitDate = submitDate;
           this.totalAmount = totalAmount;
    }


    /**
     * Gets the confirmDate value for this OrderInfo.
     * 
     * @return confirmDate
     */
    public java.lang.String getConfirmDate() {
        return confirmDate;
    }


    /**
     * Sets the confirmDate value for this OrderInfo.
     * 
     * @param confirmDate
     */
    public void setConfirmDate(java.lang.String confirmDate) {
        this.confirmDate = confirmDate;
    }


    /**
     * Gets the deliveryType value for this OrderInfo.
     * 
     * @return deliveryType
     */
    public java.lang.Integer getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this OrderInfo.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.Integer deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the discount value for this OrderInfo.
     * 
     * @return discount
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this OrderInfo.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the endDate value for this OrderInfo.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this OrderInfo.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the merchantId value for this OrderInfo.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this OrderInfo.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the merchantName value for this OrderInfo.
     * 
     * @return merchantName
     */
    public java.lang.String getMerchantName() {
        return merchantName;
    }


    /**
     * Sets the merchantName value for this OrderInfo.
     * 
     * @param merchantName
     */
    public void setMerchantName(java.lang.String merchantName) {
        this.merchantName = merchantName;
    }


    /**
     * Gets the mobile value for this OrderInfo.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this OrderInfo.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the orderId value for this OrderInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderItemList value for this OrderInfo.
     * 
     * @return orderItemList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo[] getOrderItemList() {
        return orderItemList;
    }


    /**
     * Sets the orderItemList value for this OrderInfo.
     * 
     * @param orderItemList
     */
    public void setOrderItemList(cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo[] orderItemList) {
        this.orderItemList = orderItemList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo getOrderItemList(int i) {
        return this.orderItemList[i];
    }

    public void setOrderItemList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo _value) {
        this.orderItemList[i] = _value;
    }


    /**
     * Gets the orderStatus value for this OrderInfo.
     * 
     * @return orderStatus
     */
    public java.lang.Integer getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this OrderInfo.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(java.lang.Integer orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the orgOrderId value for this OrderInfo.
     * 
     * @return orgOrderId
     */
    public java.lang.String getOrgOrderId() {
        return orgOrderId;
    }


    /**
     * Sets the orgOrderId value for this OrderInfo.
     * 
     * @param orgOrderId
     */
    public void setOrgOrderId(java.lang.String orgOrderId) {
        this.orgOrderId = orgOrderId;
    }


    /**
     * Gets the payDate value for this OrderInfo.
     * 
     * @return payDate
     */
    public java.lang.String getPayDate() {
        return payDate;
    }


    /**
     * Sets the payDate value for this OrderInfo.
     * 
     * @param payDate
     */
    public void setPayDate(java.lang.String payDate) {
        this.payDate = payDate;
    }


    /**
     * Gets the payType value for this OrderInfo.
     * 
     * @return payType
     */
    public java.lang.Integer getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this OrderInfo.
     * 
     * @param payType
     */
    public void setPayType(java.lang.Integer payType) {
        this.payType = payType;
    }


    /**
     * Gets the postage value for this OrderInfo.
     * 
     * @return postage
     */
    public java.lang.Double getPostage() {
        return postage;
    }


    /**
     * Sets the postage value for this OrderInfo.
     * 
     * @param postage
     */
    public void setPostage(java.lang.Double postage) {
        this.postage = postage;
    }


    /**
     * Gets the promotionDesc value for this OrderInfo.
     * 
     * @return promotionDesc
     */
    public java.lang.String getPromotionDesc() {
        return promotionDesc;
    }


    /**
     * Sets the promotionDesc value for this OrderInfo.
     * 
     * @param promotionDesc
     */
    public void setPromotionDesc(java.lang.String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }


    /**
     * Gets the promotionType value for this OrderInfo.
     * 
     * @return promotionType
     */
    public java.lang.Integer getPromotionType() {
        return promotionType;
    }


    /**
     * Sets the promotionType value for this OrderInfo.
     * 
     * @param promotionType
     */
    public void setPromotionType(java.lang.Integer promotionType) {
        this.promotionType = promotionType;
    }


    /**
     * Gets the submitDate value for this OrderInfo.
     * 
     * @return submitDate
     */
    public java.lang.String getSubmitDate() {
        return submitDate;
    }


    /**
     * Sets the submitDate value for this OrderInfo.
     * 
     * @param submitDate
     */
    public void setSubmitDate(java.lang.String submitDate) {
        this.submitDate = submitDate;
    }


    /**
     * Gets the totalAmount value for this OrderInfo.
     * 
     * @return totalAmount
     */
    public java.lang.Double getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this OrderInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderInfo)) return false;
        OrderInfo other = (OrderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.confirmDate==null && other.getConfirmDate()==null) || 
             (this.confirmDate!=null &&
              this.confirmDate.equals(other.getConfirmDate()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.merchantName==null && other.getMerchantName()==null) || 
             (this.merchantName!=null &&
              this.merchantName.equals(other.getMerchantName()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderItemList==null && other.getOrderItemList()==null) || 
             (this.orderItemList!=null &&
              java.util.Arrays.equals(this.orderItemList, other.getOrderItemList()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.orgOrderId==null && other.getOrgOrderId()==null) || 
             (this.orgOrderId!=null &&
              this.orgOrderId.equals(other.getOrgOrderId()))) &&
            ((this.payDate==null && other.getPayDate()==null) || 
             (this.payDate!=null &&
              this.payDate.equals(other.getPayDate()))) &&
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType()))) &&
            ((this.postage==null && other.getPostage()==null) || 
             (this.postage!=null &&
              this.postage.equals(other.getPostage()))) &&
            ((this.promotionDesc==null && other.getPromotionDesc()==null) || 
             (this.promotionDesc!=null &&
              this.promotionDesc.equals(other.getPromotionDesc()))) &&
            ((this.promotionType==null && other.getPromotionType()==null) || 
             (this.promotionType!=null &&
              this.promotionType.equals(other.getPromotionType()))) &&
            ((this.submitDate==null && other.getSubmitDate()==null) || 
             (this.submitDate!=null &&
              this.submitDate.equals(other.getSubmitDate()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount())));
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
        if (getConfirmDate() != null) {
            _hashCode += getConfirmDate().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getMerchantName() != null) {
            _hashCode += getMerchantName().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderItemList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getOrgOrderId() != null) {
            _hashCode += getOrgOrderId().hashCode();
        }
        if (getPayDate() != null) {
            _hashCode += getPayDate().hashCode();
        }
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        if (getPostage() != null) {
            _hashCode += getPostage().hashCode();
        }
        if (getPromotionDesc() != null) {
            _hashCode += getPromotionDesc().hashCode();
        }
        if (getPromotionType() != null) {
            _hashCode += getPromotionType().hashCode();
        }
        if (getSubmitDate() != null) {
            _hashCode += getSubmitDate().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "confirmDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "deliveryType"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orderItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "orgOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "payDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "payType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "postage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "promotionDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "promotionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "submitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "totalAmount"));
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
