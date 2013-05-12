/**
 * ChildAttrInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class ChildAttrInfo  implements java.io.Serializable {
    private java.lang.String attrOptDesc;

    private java.lang.String attrOptValue;

    public ChildAttrInfo() {
    }

    public ChildAttrInfo(
           java.lang.String attrOptDesc,
           java.lang.String attrOptValue) {
           this.attrOptDesc = attrOptDesc;
           this.attrOptValue = attrOptValue;
    }


    /**
     * Gets the attrOptDesc value for this ChildAttrInfo.
     * 
     * @return attrOptDesc
     */
    public java.lang.String getAttrOptDesc() {
        return attrOptDesc;
    }


    /**
     * Sets the attrOptDesc value for this ChildAttrInfo.
     * 
     * @param attrOptDesc
     */
    public void setAttrOptDesc(java.lang.String attrOptDesc) {
        this.attrOptDesc = attrOptDesc;
    }


    /**
     * Gets the attrOptValue value for this ChildAttrInfo.
     * 
     * @return attrOptValue
     */
    public java.lang.String getAttrOptValue() {
        return attrOptValue;
    }


    /**
     * Sets the attrOptValue value for this ChildAttrInfo.
     * 
     * @param attrOptValue
     */
    public void setAttrOptValue(java.lang.String attrOptValue) {
        this.attrOptValue = attrOptValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildAttrInfo)) return false;
        ChildAttrInfo other = (ChildAttrInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attrOptDesc==null && other.getAttrOptDesc()==null) || 
             (this.attrOptDesc!=null &&
              this.attrOptDesc.equals(other.getAttrOptDesc()))) &&
            ((this.attrOptValue==null && other.getAttrOptValue()==null) || 
             (this.attrOptValue!=null &&
              this.attrOptValue.equals(other.getAttrOptValue())));
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
        if (getAttrOptDesc() != null) {
            _hashCode += getAttrOptDesc().hashCode();
        }
        if (getAttrOptValue() != null) {
            _hashCode += getAttrOptValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildAttrInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "ChildAttrInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrOptDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "attrOptDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrOptValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "attrOptValue"));
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
