/**
 * Ecommerce.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ecommerce  implements java.io.Serializable {
    private com.omniture.www.Ecommerce_type_enum ecommerce;

    private java.lang.String ecommerce_text;

    private int in_queue;

    private int status;

    public Ecommerce() {
    }

    public Ecommerce(
           com.omniture.www.Ecommerce_type_enum ecommerce,
           java.lang.String ecommerce_text,
           int in_queue,
           int status) {
           this.ecommerce = ecommerce;
           this.ecommerce_text = ecommerce_text;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the ecommerce value for this Ecommerce.
     * 
     * @return ecommerce
     */
    public com.omniture.www.Ecommerce_type_enum getEcommerce() {
        return ecommerce;
    }


    /**
     * Sets the ecommerce value for this Ecommerce.
     * 
     * @param ecommerce
     */
    public void setEcommerce(com.omniture.www.Ecommerce_type_enum ecommerce) {
        this.ecommerce = ecommerce;
    }


    /**
     * Gets the ecommerce_text value for this Ecommerce.
     * 
     * @return ecommerce_text
     */
    public java.lang.String getEcommerce_text() {
        return ecommerce_text;
    }


    /**
     * Sets the ecommerce_text value for this Ecommerce.
     * 
     * @param ecommerce_text
     */
    public void setEcommerce_text(java.lang.String ecommerce_text) {
        this.ecommerce_text = ecommerce_text;
    }


    /**
     * Gets the in_queue value for this Ecommerce.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Ecommerce.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Ecommerce.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Ecommerce.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ecommerce)) return false;
        Ecommerce other = (Ecommerce) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ecommerce==null && other.getEcommerce()==null) || 
             (this.ecommerce!=null &&
              this.ecommerce.equals(other.getEcommerce()))) &&
            ((this.ecommerce_text==null && other.getEcommerce_text()==null) || 
             (this.ecommerce_text!=null &&
              this.ecommerce_text.equals(other.getEcommerce_text()))) &&
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
        if (getEcommerce() != null) {
            _hashCode += getEcommerce().hashCode();
        }
        if (getEcommerce_text() != null) {
            _hashCode += getEcommerce_text().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ecommerce.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ecommerce"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecommerce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecommerce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ecommerce_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecommerce_text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecommerce_text"));
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
