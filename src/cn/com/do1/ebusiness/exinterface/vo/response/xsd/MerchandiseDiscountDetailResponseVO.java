/**
 * MerchandiseDiscountDetailResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class MerchandiseDiscountDetailResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private java.lang.String beginTime;

    private java.lang.Double discount;

    private java.lang.String endTime;

    private java.lang.String id;

    private java.lang.String imagePath;

    private cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] mdList;

    private java.lang.String remark;

    private java.lang.Integer status;

    private java.lang.String title;

    public MerchandiseDiscountDetailResponseVO() {
    }

    public MerchandiseDiscountDetailResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           java.lang.String beginTime,
           java.lang.Double discount,
           java.lang.String endTime,
           java.lang.String id,
           java.lang.String imagePath,
           cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] mdList,
           java.lang.String remark,
           java.lang.Integer status,
           java.lang.String title) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.beginTime = beginTime;
        this.discount = discount;
        this.endTime = endTime;
        this.id = id;
        this.imagePath = imagePath;
        this.mdList = mdList;
        this.remark = remark;
        this.status = status;
        this.title = title;
    }


    /**
     * Gets the beginTime value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return beginTime
     */
    public java.lang.String getBeginTime() {
        return beginTime;
    }


    /**
     * Sets the beginTime value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param beginTime
     */
    public void setBeginTime(java.lang.String beginTime) {
        this.beginTime = beginTime;
    }


    /**
     * Gets the discount value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return discount
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the endTime value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the id value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the imagePath value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return imagePath
     */
    public java.lang.String getImagePath() {
        return imagePath;
    }


    /**
     * Sets the imagePath value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param imagePath
     */
    public void setImagePath(java.lang.String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * Gets the mdList value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return mdList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] getMdList() {
        return mdList;
    }


    /**
     * Sets the mdList value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param mdList
     */
    public void setMdList(cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] mdList) {
        this.mdList = mdList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo getMdList(int i) {
        return this.mdList[i];
    }

    public void setMdList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo _value) {
        this.mdList[i] = _value;
    }


    /**
     * Gets the remark value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the status value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the title value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this MerchandiseDiscountDetailResponseVO.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchandiseDiscountDetailResponseVO)) return false;
        MerchandiseDiscountDetailResponseVO other = (MerchandiseDiscountDetailResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.beginTime==null && other.getBeginTime()==null) || 
             (this.beginTime!=null &&
              this.beginTime.equals(other.getBeginTime()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.imagePath==null && other.getImagePath()==null) || 
             (this.imagePath!=null &&
              this.imagePath.equals(other.getImagePath()))) &&
            ((this.mdList==null && other.getMdList()==null) || 
             (this.mdList!=null &&
              java.util.Arrays.equals(this.mdList, other.getMdList()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getBeginTime() != null) {
            _hashCode += getBeginTime().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getImagePath() != null) {
            _hashCode += getImagePath().hashCode();
        }
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
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchandiseDiscountDetailResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "MerchandiseDiscountDetailResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "beginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "imagePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "mdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "title"));
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
