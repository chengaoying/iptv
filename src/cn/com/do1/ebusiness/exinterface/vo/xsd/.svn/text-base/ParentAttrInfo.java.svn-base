/**
 * ParentAttrInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class ParentAttrInfo  implements java.io.Serializable {
    private java.lang.String attrOptDesc;

    private cn.com.do1.ebusiness.exinterface.vo.xsd.ChildAttrInfo[] childAttrList;

    public ParentAttrInfo() {
    }

    public ParentAttrInfo(
           java.lang.String attrOptDesc,
           cn.com.do1.ebusiness.exinterface.vo.xsd.ChildAttrInfo[] childAttrList) {
           this.attrOptDesc = attrOptDesc;
           this.childAttrList = childAttrList;
    }


    /**
     * Gets the attrOptDesc value for this ParentAttrInfo.
     * 
     * @return attrOptDesc
     */
    public java.lang.String getAttrOptDesc() {
        return attrOptDesc;
    }


    /**
     * Sets the attrOptDesc value for this ParentAttrInfo.
     * 
     * @param attrOptDesc
     */
    public void setAttrOptDesc(java.lang.String attrOptDesc) {
        this.attrOptDesc = attrOptDesc;
    }


    /**
     * Gets the childAttrList value for this ParentAttrInfo.
     * 
     * @return childAttrList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.ChildAttrInfo[] getChildAttrList() {
        return childAttrList;
    }


    /**
     * Sets the childAttrList value for this ParentAttrInfo.
     * 
     * @param childAttrList
     */
    public void setChildAttrList(cn.com.do1.ebusiness.exinterface.vo.xsd.ChildAttrInfo[] childAttrList) {
        this.childAttrList = childAttrList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.ChildAttrInfo getChildAttrList(int i) {
        return this.childAttrList[i];
    }

    public void setChildAttrList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.ChildAttrInfo _value) {
        this.childAttrList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParentAttrInfo)) return false;
        ParentAttrInfo other = (ParentAttrInfo) obj;
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
            ((this.childAttrList==null && other.getChildAttrList()==null) || 
             (this.childAttrList!=null &&
              java.util.Arrays.equals(this.childAttrList, other.getChildAttrList())));
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
        if (getChildAttrList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildAttrList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildAttrList(), i);
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
        new org.apache.axis.description.TypeDesc(ParentAttrInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "ParentAttrInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrOptDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "attrOptDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAttrList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "childAttrList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "ChildAttrInfo"));
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
