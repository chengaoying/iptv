/**
 * ShoppingCartItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.request.xsd;

public class ShoppingCartItem  implements java.io.Serializable {
    private java.lang.String attributeId;

    private java.lang.String groupMdStr;

    private java.lang.String merchandiseCode;

    public ShoppingCartItem() {
    }

    public ShoppingCartItem(
           java.lang.String attributeId,
           java.lang.String groupMdStr,
           java.lang.String merchandiseCode) {
           this.attributeId = attributeId;
           this.groupMdStr = groupMdStr;
           this.merchandiseCode = merchandiseCode;
    }


    /**
     * Gets the attributeId value for this ShoppingCartItem.
     * 
     * @return attributeId
     */
    public java.lang.String getAttributeId() {
        return attributeId;
    }


    /**
     * Sets the attributeId value for this ShoppingCartItem.
     * 
     * @param attributeId
     */
    public void setAttributeId(java.lang.String attributeId) {
        this.attributeId = attributeId;
    }


    /**
     * Gets the groupMdStr value for this ShoppingCartItem.
     * 
     * @return groupMdStr
     */
    public java.lang.String getGroupMdStr() {
        return groupMdStr;
    }


    /**
     * Sets the groupMdStr value for this ShoppingCartItem.
     * 
     * @param groupMdStr
     */
    public void setGroupMdStr(java.lang.String groupMdStr) {
        this.groupMdStr = groupMdStr;
    }


    /**
     * Gets the merchandiseCode value for this ShoppingCartItem.
     * 
     * @return merchandiseCode
     */
    public java.lang.String getMerchandiseCode() {
        return merchandiseCode;
    }


    /**
     * Sets the merchandiseCode value for this ShoppingCartItem.
     * 
     * @param merchandiseCode
     */
    public void setMerchandiseCode(java.lang.String merchandiseCode) {
        this.merchandiseCode = merchandiseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingCartItem)) return false;
        ShoppingCartItem other = (ShoppingCartItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeId==null && other.getAttributeId()==null) || 
             (this.attributeId!=null &&
              this.attributeId.equals(other.getAttributeId()))) &&
            ((this.groupMdStr==null && other.getGroupMdStr()==null) || 
             (this.groupMdStr!=null &&
              this.groupMdStr.equals(other.getGroupMdStr()))) &&
            ((this.merchandiseCode==null && other.getMerchandiseCode()==null) || 
             (this.merchandiseCode!=null &&
              this.merchandiseCode.equals(other.getMerchandiseCode())));
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
        if (getAttributeId() != null) {
            _hashCode += getAttributeId().hashCode();
        }
        if (getGroupMdStr() != null) {
            _hashCode += getGroupMdStr().hashCode();
        }
        if (getMerchandiseCode() != null) {
            _hashCode += getMerchandiseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingCartItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "attributeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMdStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "groupMdStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "merchandiseCode"));
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
