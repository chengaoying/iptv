/**
 * ShoppingCartOrderRequestVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.request.xsd;

public class ShoppingCartOrderRequestVO  extends cn.com.do1.ebusiness.exinterface.vo.request.xsd.BaseRequestVO  implements java.io.Serializable {
    private cn.com.do1.ebusiness.exinterface.vo.xsd.AddressInfo accountAddress;

    private java.lang.String cardNo;

    private java.lang.Integer deliveryType;

    private java.lang.String invoiceRemark;

    private java.lang.String invoiceTitle;

    private java.lang.Integer isInvoiceNeeded;

    private java.lang.String messageDesc;

    private java.lang.String mobile;

    private java.lang.Integer orderSource;

    private java.lang.Integer payType;

    private java.lang.String sendAddressId;

    private cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo[] shopCartList;

    private java.lang.String supplyTimeReq;

    public ShoppingCartOrderRequestVO() {
    }

    public ShoppingCartOrderRequestVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String spId,
           java.lang.String spPin,
           java.lang.String timestamp,
           cn.com.do1.ebusiness.exinterface.vo.xsd.AddressInfo accountAddress,
           java.lang.String cardNo,
           java.lang.Integer deliveryType,
           java.lang.String invoiceRemark,
           java.lang.String invoiceTitle,
           java.lang.Integer isInvoiceNeeded,
           java.lang.String messageDesc,
           java.lang.String mobile,
           java.lang.Integer orderSource,
           java.lang.Integer payType,
           java.lang.String sendAddressId,
           cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo[] shopCartList,
           java.lang.String supplyTimeReq) {
        super(
            interfaceId,
            msgId,
            spId,
            spPin,
            timestamp);
        this.accountAddress = accountAddress;
        this.cardNo = cardNo;
        this.deliveryType = deliveryType;
        this.invoiceRemark = invoiceRemark;
        this.invoiceTitle = invoiceTitle;
        this.isInvoiceNeeded = isInvoiceNeeded;
        this.messageDesc = messageDesc;
        this.mobile = mobile;
        this.orderSource = orderSource;
        this.payType = payType;
        this.sendAddressId = sendAddressId;
        this.shopCartList = shopCartList;
        this.supplyTimeReq = supplyTimeReq;
    }


    /**
     * Gets the accountAddress value for this ShoppingCartOrderRequestVO.
     * 
     * @return accountAddress
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.AddressInfo getAccountAddress() {
        return accountAddress;
    }


    /**
     * Sets the accountAddress value for this ShoppingCartOrderRequestVO.
     * 
     * @param accountAddress
     */
    public void setAccountAddress(cn.com.do1.ebusiness.exinterface.vo.xsd.AddressInfo accountAddress) {
        this.accountAddress = accountAddress;
    }


    /**
     * Gets the cardNo value for this ShoppingCartOrderRequestVO.
     * 
     * @return cardNo
     */
    public java.lang.String getCardNo() {
        return cardNo;
    }


    /**
     * Sets the cardNo value for this ShoppingCartOrderRequestVO.
     * 
     * @param cardNo
     */
    public void setCardNo(java.lang.String cardNo) {
        this.cardNo = cardNo;
    }


    /**
     * Gets the deliveryType value for this ShoppingCartOrderRequestVO.
     * 
     * @return deliveryType
     */
    public java.lang.Integer getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this ShoppingCartOrderRequestVO.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.Integer deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the invoiceRemark value for this ShoppingCartOrderRequestVO.
     * 
     * @return invoiceRemark
     */
    public java.lang.String getInvoiceRemark() {
        return invoiceRemark;
    }


    /**
     * Sets the invoiceRemark value for this ShoppingCartOrderRequestVO.
     * 
     * @param invoiceRemark
     */
    public void setInvoiceRemark(java.lang.String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }


    /**
     * Gets the invoiceTitle value for this ShoppingCartOrderRequestVO.
     * 
     * @return invoiceTitle
     */
    public java.lang.String getInvoiceTitle() {
        return invoiceTitle;
    }


    /**
     * Sets the invoiceTitle value for this ShoppingCartOrderRequestVO.
     * 
     * @param invoiceTitle
     */
    public void setInvoiceTitle(java.lang.String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }


    /**
     * Gets the isInvoiceNeeded value for this ShoppingCartOrderRequestVO.
     * 
     * @return isInvoiceNeeded
     */
    public java.lang.Integer getIsInvoiceNeeded() {
        return isInvoiceNeeded;
    }


    /**
     * Sets the isInvoiceNeeded value for this ShoppingCartOrderRequestVO.
     * 
     * @param isInvoiceNeeded
     */
    public void setIsInvoiceNeeded(java.lang.Integer isInvoiceNeeded) {
        this.isInvoiceNeeded = isInvoiceNeeded;
    }


    /**
     * Gets the messageDesc value for this ShoppingCartOrderRequestVO.
     * 
     * @return messageDesc
     */
    public java.lang.String getMessageDesc() {
        return messageDesc;
    }


    /**
     * Sets the messageDesc value for this ShoppingCartOrderRequestVO.
     * 
     * @param messageDesc
     */
    public void setMessageDesc(java.lang.String messageDesc) {
        this.messageDesc = messageDesc;
    }


    /**
     * Gets the mobile value for this ShoppingCartOrderRequestVO.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this ShoppingCartOrderRequestVO.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the orderSource value for this ShoppingCartOrderRequestVO.
     * 
     * @return orderSource
     */
    public java.lang.Integer getOrderSource() {
        return orderSource;
    }


    /**
     * Sets the orderSource value for this ShoppingCartOrderRequestVO.
     * 
     * @param orderSource
     */
    public void setOrderSource(java.lang.Integer orderSource) {
        this.orderSource = orderSource;
    }


    /**
     * Gets the payType value for this ShoppingCartOrderRequestVO.
     * 
     * @return payType
     */
    public java.lang.Integer getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this ShoppingCartOrderRequestVO.
     * 
     * @param payType
     */
    public void setPayType(java.lang.Integer payType) {
        this.payType = payType;
    }


    /**
     * Gets the sendAddressId value for this ShoppingCartOrderRequestVO.
     * 
     * @return sendAddressId
     */
    public java.lang.String getSendAddressId() {
        return sendAddressId;
    }


    /**
     * Sets the sendAddressId value for this ShoppingCartOrderRequestVO.
     * 
     * @param sendAddressId
     */
    public void setSendAddressId(java.lang.String sendAddressId) {
        this.sendAddressId = sendAddressId;
    }


    /**
     * Gets the shopCartList value for this ShoppingCartOrderRequestVO.
     * 
     * @return shopCartList
     */
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo[] getShopCartList() {
        return shopCartList;
    }


    /**
     * Sets the shopCartList value for this ShoppingCartOrderRequestVO.
     * 
     * @param shopCartList
     */
    public void setShopCartList(cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo[] shopCartList) {
        this.shopCartList = shopCartList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo getShopCartList(int i) {
        return this.shopCartList[i];
    }

    public void setShopCartList(int i, cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo _value) {
        this.shopCartList[i] = _value;
    }


    /**
     * Gets the supplyTimeReq value for this ShoppingCartOrderRequestVO.
     * 
     * @return supplyTimeReq
     */
    public java.lang.String getSupplyTimeReq() {
        return supplyTimeReq;
    }


    /**
     * Sets the supplyTimeReq value for this ShoppingCartOrderRequestVO.
     * 
     * @param supplyTimeReq
     */
    public void setSupplyTimeReq(java.lang.String supplyTimeReq) {
        this.supplyTimeReq = supplyTimeReq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingCartOrderRequestVO)) return false;
        ShoppingCartOrderRequestVO other = (ShoppingCartOrderRequestVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountAddress==null && other.getAccountAddress()==null) || 
             (this.accountAddress!=null &&
              this.accountAddress.equals(other.getAccountAddress()))) &&
            ((this.cardNo==null && other.getCardNo()==null) || 
             (this.cardNo!=null &&
              this.cardNo.equals(other.getCardNo()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.invoiceRemark==null && other.getInvoiceRemark()==null) || 
             (this.invoiceRemark!=null &&
              this.invoiceRemark.equals(other.getInvoiceRemark()))) &&
            ((this.invoiceTitle==null && other.getInvoiceTitle()==null) || 
             (this.invoiceTitle!=null &&
              this.invoiceTitle.equals(other.getInvoiceTitle()))) &&
            ((this.isInvoiceNeeded==null && other.getIsInvoiceNeeded()==null) || 
             (this.isInvoiceNeeded!=null &&
              this.isInvoiceNeeded.equals(other.getIsInvoiceNeeded()))) &&
            ((this.messageDesc==null && other.getMessageDesc()==null) || 
             (this.messageDesc!=null &&
              this.messageDesc.equals(other.getMessageDesc()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.orderSource==null && other.getOrderSource()==null) || 
             (this.orderSource!=null &&
              this.orderSource.equals(other.getOrderSource()))) &&
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType()))) &&
            ((this.sendAddressId==null && other.getSendAddressId()==null) || 
             (this.sendAddressId!=null &&
              this.sendAddressId.equals(other.getSendAddressId()))) &&
            ((this.shopCartList==null && other.getShopCartList()==null) || 
             (this.shopCartList!=null &&
              java.util.Arrays.equals(this.shopCartList, other.getShopCartList()))) &&
            ((this.supplyTimeReq==null && other.getSupplyTimeReq()==null) || 
             (this.supplyTimeReq!=null &&
              this.supplyTimeReq.equals(other.getSupplyTimeReq())));
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
        if (getAccountAddress() != null) {
            _hashCode += getAccountAddress().hashCode();
        }
        if (getCardNo() != null) {
            _hashCode += getCardNo().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getInvoiceRemark() != null) {
            _hashCode += getInvoiceRemark().hashCode();
        }
        if (getInvoiceTitle() != null) {
            _hashCode += getInvoiceTitle().hashCode();
        }
        if (getIsInvoiceNeeded() != null) {
            _hashCode += getIsInvoiceNeeded().hashCode();
        }
        if (getMessageDesc() != null) {
            _hashCode += getMessageDesc().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getOrderSource() != null) {
            _hashCode += getOrderSource().hashCode();
        }
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        if (getSendAddressId() != null) {
            _hashCode += getSendAddressId().hashCode();
        }
        if (getShopCartList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopCartList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopCartList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupplyTimeReq() != null) {
            _hashCode += getSupplyTimeReq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingCartOrderRequestVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartOrderRequestVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "accountAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "AddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "cardNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "invoiceRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "invoiceTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInvoiceNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "isInvoiceNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "messageDesc"));
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
        elemField.setFieldName("orderSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "orderSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "payType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "sendAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopCartList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "shopCartList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShopCartInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyTimeReq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "supplyTimeReq"));
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
