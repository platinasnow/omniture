/**
 * Base_currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Base_currency  implements java.io.Serializable {
    private java.lang.String base_currency;

    private java.lang.String base_currency_text;

    private int in_queue;

    private int status;

    public Base_currency() {
    }

    public Base_currency(
           java.lang.String base_currency,
           java.lang.String base_currency_text,
           int in_queue,
           int status) {
           this.base_currency = base_currency;
           this.base_currency_text = base_currency_text;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the base_currency value for this Base_currency.
     * 
     * @return base_currency
     */
    public java.lang.String getBase_currency() {
        return base_currency;
    }


    /**
     * Sets the base_currency value for this Base_currency.
     * 
     * @param base_currency
     */
    public void setBase_currency(java.lang.String base_currency) {
        this.base_currency = base_currency;
    }


    /**
     * Gets the base_currency_text value for this Base_currency.
     * 
     * @return base_currency_text
     */
    public java.lang.String getBase_currency_text() {
        return base_currency_text;
    }


    /**
     * Sets the base_currency_text value for this Base_currency.
     * 
     * @param base_currency_text
     */
    public void setBase_currency_text(java.lang.String base_currency_text) {
        this.base_currency_text = base_currency_text;
    }


    /**
     * Gets the in_queue value for this Base_currency.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Base_currency.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Base_currency.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Base_currency.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Base_currency)) return false;
        Base_currency other = (Base_currency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.base_currency==null && other.getBase_currency()==null) || 
             (this.base_currency!=null &&
              this.base_currency.equals(other.getBase_currency()))) &&
            ((this.base_currency_text==null && other.getBase_currency_text()==null) || 
             (this.base_currency_text!=null &&
              this.base_currency_text.equals(other.getBase_currency_text()))) &&
            this.in_queue == other.getIn_queue() &&
            this.status == other.getStatus();
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
        if (getBase_currency() != null) {
            _hashCode += getBase_currency().hashCode();
        }
        if (getBase_currency_text() != null) {
            _hashCode += getBase_currency_text().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Base_currency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "base_currency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "base_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base_currency_text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "base_currency_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "in_queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
