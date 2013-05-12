/**
 * RecommendMerchandiseResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.response.xsd;

public class RecommendMerchandiseResponseVO  extends cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO  implements java.io.Serializable {
    private cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] mdList;

    public RecommendMerchandiseResponseVO() {
    }

    public RecommendMerchandiseResponseVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String respCode,
           java.lang.String respDesc,
           java.lang.String spId,
           java.lang.String timestamp,
           cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] mdList) {
        super(
            interfaceId,
            msgId,
            respCode,
            respDesc,
            spId,
            timestamp);
        this.mdList = mdList;
    }


    /**
     * Gets the mdList value for this RecommendMerchandiseResponseVO.
     * 
     * @return mdList
     */
    public cn.com.do1.ebusiness.exinterface.vo.xsd.MdInfo[] getMdList() {
        return mdList;
    }


    /**
     * Sets the mdList value for this RecommendMerchandiseResponseVO.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecommendMerchandiseResponseVO)) return false;
        RecommendMerchandiseResponseVO other = (RecommendMerchandiseResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mdList==null && other.getMdList()==null) || 
             (this.mdList!=null &&
              java.util.Arrays.equals(this.mdList, other.getMdList())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecommendMerchandiseResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "RecommendMerchandiseResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "mdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MdInfo"));
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
