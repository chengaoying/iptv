/**
 * QueryOrderRequestVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.request.xsd;

public class QueryOrderRequestVO  extends cn.com.do1.ebusiness.exinterface.vo.request.xsd.BaseRequestVO  implements java.io.Serializable {
    private java.lang.String cardNo;

    private java.lang.Integer currentPage;

    private java.lang.String merchandiseName;

    private java.lang.String mobile;

    private java.lang.Integer orderStatus;

    private java.lang.String orderTimeEnd;

    private java.lang.String orderTimeStart;

    private java.lang.String orgOrderId;

    private java.lang.Integer pageSize;

    public QueryOrderRequestVO() {
    }

    public QueryOrderRequestVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String spId,
           java.lang.String spPin,
           java.lang.String timestamp,
           java.lang.String cardNo,
           java.lang.Integer currentPage,
           java.lang.String merchandiseName,
           java.lang.String mobile,
           java.lang.Integer orderStatus,
           java.lang.String orderTimeEnd,
           java.lang.String orderTimeStart,
           java.lang.String orgOrderId,
           java.lang.Integer pageSize) {
        super(
            interfaceId,
            msgId,
            spId,
            spPin,
            timestamp);
        this.cardNo = cardNo;
        this.currentPage = currentPage;
        this.merchandiseName = merchandiseName;
        this.mobile = mobile;
        this.orderStatus = orderStatus;
        this.orderTimeEnd = orderTimeEnd;
        this.orderTimeStart = orderTimeStart;
        this.orgOrderId = orgOrderId;
        this.pageSize = pageSize;
    }


    /**
     * Gets the cardNo value for this QueryOrderRequestVO.
     * 
     * @return cardNo
     */
    public java.lang.String getCardNo() {
        return cardNo;
    }


    /**
     * Sets the cardNo value for this QueryOrderRequestVO.
     * 
     * @param cardNo
     */
    public void setCardNo(java.lang.String cardNo) {
        this.cardNo = cardNo;
    }


    /**
     * Gets the currentPage value for this QueryOrderRequestVO.
     * 
     * @return currentPage
     */
    public java.lang.Integer getCurrentPage() {
        return currentPage;
    }


    /**
     * Sets the currentPage value for this QueryOrderRequestVO.
     * 
     * @param currentPage
     */
    public void setCurrentPage(java.lang.Integer currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * Gets the merchandiseName value for this QueryOrderRequestVO.
     * 
     * @return merchandiseName
     */
    public java.lang.String getMerchandiseName() {
        return merchandiseName;
    }


    /**
     * Sets the merchandiseName value for this QueryOrderRequestVO.
     * 
     * @param merchandiseName
     */
    public void setMerchandiseName(java.lang.String merchandiseName) {
        this.merchandiseName = merchandiseName;
    }


    /**
     * Gets the mobile value for this QueryOrderRequestVO.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this QueryOrderRequestVO.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the orderStatus value for this QueryOrderRequestVO.
     * 
     * @return orderStatus
     */
    public java.lang.Integer getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this QueryOrderRequestVO.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(java.lang.Integer orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the orderTimeEnd value for this QueryOrderRequestVO.
     * 
     * @return orderTimeEnd
     */
    public java.lang.String getOrderTimeEnd() {
        return orderTimeEnd;
    }


    /**
     * Sets the orderTimeEnd value for this QueryOrderRequestVO.
     * 
     * @param orderTimeEnd
     */
    public void setOrderTimeEnd(java.lang.String orderTimeEnd) {
        this.orderTimeEnd = orderTimeEnd;
    }


    /**
     * Gets the orderTimeStart value for this QueryOrderRequestVO.
     * 
     * @return orderTimeStart
     */
    public java.lang.String getOrderTimeStart() {
        return orderTimeStart;
    }


    /**
     * Sets the orderTimeStart value for this QueryOrderRequestVO.
     * 
     * @param orderTimeStart
     */
    public void setOrderTimeStart(java.lang.String orderTimeStart) {
        this.orderTimeStart = orderTimeStart;
    }


    /**
     * Gets the orgOrderId value for this QueryOrderRequestVO.
     * 
     * @return orgOrderId
     */
    public java.lang.String getOrgOrderId() {
        return orgOrderId;
    }


    /**
     * Sets the orgOrderId value for this QueryOrderRequestVO.
     * 
     * @param orgOrderId
     */
    public void setOrgOrderId(java.lang.String orgOrderId) {
        this.orgOrderId = orgOrderId;
    }


    /**
     * Gets the pageSize value for this QueryOrderRequestVO.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this QueryOrderRequestVO.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOrderRequestVO)) return false;
        QueryOrderRequestVO other = (QueryOrderRequestVO) obj;
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
            ((this.currentPage==null && other.getCurrentPage()==null) || 
             (this.currentPage!=null &&
              this.currentPage.equals(other.getCurrentPage()))) &&
            ((this.merchandiseName==null && other.getMerchandiseName()==null) || 
             (this.merchandiseName!=null &&
              this.merchandiseName.equals(other.getMerchandiseName()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.orderTimeEnd==null && other.getOrderTimeEnd()==null) || 
             (this.orderTimeEnd!=null &&
              this.orderTimeEnd.equals(other.getOrderTimeEnd()))) &&
            ((this.orderTimeStart==null && other.getOrderTimeStart()==null) || 
             (this.orderTimeStart!=null &&
              this.orderTimeStart.equals(other.getOrderTimeStart()))) &&
            ((this.orgOrderId==null && other.getOrgOrderId()==null) || 
             (this.orgOrderId!=null &&
              this.orgOrderId.equals(other.getOrgOrderId()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize())));
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
        if (getCurrentPage() != null) {
            _hashCode += getCurrentPage().hashCode();
        }
        if (getMerchandiseName() != null) {
            _hashCode += getMerchandiseName().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getOrderTimeEnd() != null) {
            _hashCode += getOrderTimeEnd().hashCode();
        }
        if (getOrderTimeStart() != null) {
            _hashCode += getOrderTimeStart().hashCode();
        }
        if (getOrgOrderId() != null) {
            _hashCode += getOrgOrderId().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOrderRequestVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryOrderRequestVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "cardNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "currentPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "merchandiseName"));
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
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTimeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "orderTimeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTimeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "orderTimeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "orgOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "pageSize"));
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
