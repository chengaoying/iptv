/**
 * RushBuyQueryResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class RushBuyQueryResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private java.lang.Integer currentSize;

    private cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo[] rushbuyList;

    private java.lang.Integer totalSize;

    public RushBuyQueryResponseVO() {
    }

    public RushBuyQueryResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           java.lang.Integer currentSize,
           cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo[] rushbuyList,
           java.lang.Integer totalSize) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.currentSize = currentSize;
        this.rushbuyList = rushbuyList;
        this.totalSize = totalSize;
    }


    /**
     * Gets the currentSize value for this RushBuyQueryResponseVO.
     * 
     * @return currentSize
     */
    public java.lang.Integer getCurrentSize() {
        return currentSize;
    }


    /**
     * Sets the currentSize value for this RushBuyQueryResponseVO.
     * 
     * @param currentSize
     */
    public void setCurrentSize(java.lang.Integer currentSize) {
        this.currentSize = currentSize;
    }


    /**
     * Gets the rushbuyList value for this RushBuyQueryResponseVO.
     * 
     * @return rushbuyList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo[] getRushbuyList() {
        return rushbuyList;
    }


    /**
     * Sets the rushbuyList value for this RushBuyQueryResponseVO.
     * 
     * @param rushbuyList
     */
    public void setRushbuyList(cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo[] rushbuyList) {
        this.rushbuyList = rushbuyList;
    }

    public cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo getRushbuyList(int i) {
        return this.rushbuyList[i];
    }

    public void setRushbuyList(int i, cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo _value) {
        this.rushbuyList[i] = _value;
    }


    /**
     * Gets the totalSize value for this RushBuyQueryResponseVO.
     * 
     * @return totalSize
     */
    public java.lang.Integer getTotalSize() {
        return totalSize;
    }


    /**
     * Sets the totalSize value for this RushBuyQueryResponseVO.
     * 
     * @param totalSize
     */
    public void setTotalSize(java.lang.Integer totalSize) {
        this.totalSize = totalSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RushBuyQueryResponseVO)) return false;
        RushBuyQueryResponseVO other = (RushBuyQueryResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currentSize==null && other.getCurrentSize()==null) || 
             (this.currentSize!=null &&
              this.currentSize.equals(other.getCurrentSize()))) &&
            ((this.rushbuyList==null && other.getRushbuyList()==null) || 
             (this.rushbuyList!=null &&
              java.util.Arrays.equals(this.rushbuyList, other.getRushbuyList()))) &&
            ((this.totalSize==null && other.getTotalSize()==null) || 
             (this.totalSize!=null &&
              this.totalSize.equals(other.getTotalSize())));
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
        if (getCurrentSize() != null) {
            _hashCode += getCurrentSize().hashCode();
        }
        if (getRushbuyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRushbuyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRushbuyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalSize() != null) {
            _hashCode += getTotalSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RushBuyQueryResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "RushBuyQueryResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "currentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rushbuyList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "rushbuyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "RushbuyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "totalSize"));
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
