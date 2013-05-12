/**
 * AddressInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.vo.xsd;

public class AddressInfo  implements java.io.Serializable {
    private java.lang.String city;

    private java.lang.String inceptPeople;

    private java.lang.String inceptPost;

    private java.lang.String inceptTel;

    private java.lang.String provice;

    private java.lang.String supplyAddress;

    public AddressInfo() {
    }

    public AddressInfo(
           java.lang.String city,
           java.lang.String inceptPeople,
           java.lang.String inceptPost,
           java.lang.String inceptTel,
           java.lang.String provice,
           java.lang.String supplyAddress) {
           this.city = city;
           this.inceptPeople = inceptPeople;
           this.inceptPost = inceptPost;
           this.inceptTel = inceptTel;
           this.provice = provice;
           this.supplyAddress = supplyAddress;
    }


    /**
     * Gets the city value for this AddressInfo.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AddressInfo.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the inceptPeople value for this AddressInfo.
     * 
     * @return inceptPeople
     */
    public java.lang.String getInceptPeople() {
        return inceptPeople;
    }


    /**
     * Sets the inceptPeople value for this AddressInfo.
     * 
     * @param inceptPeople
     */
    public void setInceptPeople(java.lang.String inceptPeople) {
        this.inceptPeople = inceptPeople;
    }


    /**
     * Gets the inceptPost value for this AddressInfo.
     * 
     * @return inceptPost
     */
    public java.lang.String getInceptPost() {
        return inceptPost;
    }


    /**
     * Sets the inceptPost value for this AddressInfo.
     * 
     * @param inceptPost
     */
    public void setInceptPost(java.lang.String inceptPost) {
        this.inceptPost = inceptPost;
    }


    /**
     * Gets the inceptTel value for this AddressInfo.
     * 
     * @return inceptTel
     */
    public java.lang.String getInceptTel() {
        return inceptTel;
    }


    /**
     * Sets the inceptTel value for this AddressInfo.
     * 
     * @param inceptTel
     */
    public void setInceptTel(java.lang.String inceptTel) {
        this.inceptTel = inceptTel;
    }


    /**
     * Gets the provice value for this AddressInfo.
     * 
     * @return provice
     */
    public java.lang.String getProvice() {
        return provice;
    }


    /**
     * Sets the provice value for this AddressInfo.
     * 
     * @param provice
     */
    public void setProvice(java.lang.String provice) {
        this.provice = provice;
    }


    /**
     * Gets the supplyAddress value for this AddressInfo.
     * 
     * @return supplyAddress
     */
    public java.lang.String getSupplyAddress() {
        return supplyAddress;
    }


    /**
     * Sets the supplyAddress value for this AddressInfo.
     * 
     * @param supplyAddress
     */
    public void setSupplyAddress(java.lang.String supplyAddress) {
        this.supplyAddress = supplyAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressInfo)) return false;
        AddressInfo other = (AddressInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.inceptPeople==null && other.getInceptPeople()==null) || 
             (this.inceptPeople!=null &&
              this.inceptPeople.equals(other.getInceptPeople()))) &&
            ((this.inceptPost==null && other.getInceptPost()==null) || 
             (this.inceptPost!=null &&
              this.inceptPost.equals(other.getInceptPost()))) &&
            ((this.inceptTel==null && other.getInceptTel()==null) || 
             (this.inceptTel!=null &&
              this.inceptTel.equals(other.getInceptTel()))) &&
            ((this.provice==null && other.getProvice()==null) || 
             (this.provice!=null &&
              this.provice.equals(other.getProvice()))) &&
            ((this.supplyAddress==null && other.getSupplyAddress()==null) || 
             (this.supplyAddress!=null &&
              this.supplyAddress.equals(other.getSupplyAddress())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getInceptPeople() != null) {
            _hashCode += getInceptPeople().hashCode();
        }
        if (getInceptPost() != null) {
            _hashCode += getInceptPost().hashCode();
        }
        if (getInceptTel() != null) {
            _hashCode += getInceptTel().hashCode();
        }
        if (getProvice() != null) {
            _hashCode += getProvice().hashCode();
        }
        if (getSupplyAddress() != null) {
            _hashCode += getSupplyAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "AddressInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inceptPeople");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "inceptPeople"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inceptPost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "inceptPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inceptTel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "inceptTel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "provice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "supplyAddress"));
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
