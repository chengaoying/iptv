/**
 * QueryMerchandiseSortRequestVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.request.xsd;

public class QueryMerchandiseSortRequestVO  extends cn.com.do1.ebusiness.exinterface.vo.request.xsd.BaseRequestVO  implements java.io.Serializable {
    private java.lang.Integer LVL;

    private java.lang.String sortId;

    public QueryMerchandiseSortRequestVO() {
    }

    public QueryMerchandiseSortRequestVO(
           java.lang.String interfaceId,
           java.lang.String msgId,
           java.lang.String spId,
           java.lang.String spPin,
           java.lang.String timestamp,
           java.lang.Integer LVL,
           java.lang.String sortId) {
        super(
            interfaceId,
            msgId,
            spId,
            spPin,
            timestamp);
        this.LVL = LVL;
        this.sortId = sortId;
    }


    /**
     * Gets the LVL value for this QueryMerchandiseSortRequestVO.
     * 
     * @return LVL
     */
    public java.lang.Integer getLVL() {
        return LVL;
    }


    /**
     * Sets the LVL value for this QueryMerchandiseSortRequestVO.
     * 
     * @param LVL
     */
    public void setLVL(java.lang.Integer LVL) {
        this.LVL = LVL;
    }


    /**
     * Gets the sortId value for this QueryMerchandiseSortRequestVO.
     * 
     * @return sortId
     */
    public java.lang.String getSortId() {
        return sortId;
    }


    /**
     * Sets the sortId value for this QueryMerchandiseSortRequestVO.
     * 
     * @param sortId
     */
    public void setSortId(java.lang.String sortId) {
        this.sortId = sortId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryMerchandiseSortRequestVO)) return false;
        QueryMerchandiseSortRequestVO other = (QueryMerchandiseSortRequestVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.LVL==null && other.getLVL()==null) || 
             (this.LVL!=null &&
              this.LVL.equals(other.getLVL()))) &&
            ((this.sortId==null && other.getSortId()==null) || 
             (this.sortId!=null &&
              this.sortId.equals(other.getSortId())));
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
        if (getLVL() != null) {
            _hashCode += getLVL().hashCode();
        }
        if (getSortId() != null) {
            _hashCode += getSortId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryMerchandiseSortRequestVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryMerchandiseSortRequestVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "LVL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "sortId"));
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
