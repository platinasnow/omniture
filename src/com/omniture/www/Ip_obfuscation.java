/**
 * Ip_obfuscation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ip_obfuscation  implements java.io.Serializable {
    private java.lang.String ip_obfuscation;

    private java.lang.String ip_obfuscation_text;

    private int in_queue;

    private int status;

    public Ip_obfuscation() {
    }

    public Ip_obfuscation(
           java.lang.String ip_obfuscation,
           java.lang.String ip_obfuscation_text,
           int in_queue,
           int status) {
           this.ip_obfuscation = ip_obfuscation;
           this.ip_obfuscation_text = ip_obfuscation_text;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the ip_obfuscation value for this Ip_obfuscation.
     * 
     * @return ip_obfuscation
     */
    public java.lang.String getIp_obfuscation() {
        return ip_obfuscation;
    }


    /**
     * Sets the ip_obfuscation value for this Ip_obfuscation.
     * 
     * @param ip_obfuscation
     */
    public void setIp_obfuscation(java.lang.String ip_obfuscation) {
        this.ip_obfuscation = ip_obfuscation;
    }


    /**
     * Gets the ip_obfuscation_text value for this Ip_obfuscation.
     * 
     * @return ip_obfuscation_text
     */
    public java.lang.String getIp_obfuscation_text() {
        return ip_obfuscation_text;
    }


    /**
     * Sets the ip_obfuscation_text value for this Ip_obfuscation.
     * 
     * @param ip_obfuscation_text
     */
    public void setIp_obfuscation_text(java.lang.String ip_obfuscation_text) {
        this.ip_obfuscation_text = ip_obfuscation_text;
    }


    /**
     * Gets the in_queue value for this Ip_obfuscation.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Ip_obfuscation.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Ip_obfuscation.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Ip_obfuscation.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ip_obfuscation)) return false;
        Ip_obfuscation other = (Ip_obfuscation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip_obfuscation==null && other.getIp_obfuscation()==null) || 
             (this.ip_obfuscation!=null &&
              this.ip_obfuscation.equals(other.getIp_obfuscation()))) &&
            ((this.ip_obfuscation_text==null && other.getIp_obfuscation_text()==null) || 
             (this.ip_obfuscation_text!=null &&
              this.ip_obfuscation_text.equals(other.getIp_obfuscation_text()))) &&
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
        if (getIp_obfuscation() != null) {
            _hashCode += getIp_obfuscation().hashCode();
        }
        if (getIp_obfuscation_text() != null) {
            _hashCode += getIp_obfuscation_text().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ip_obfuscation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ip_obfuscation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_obfuscation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_obfuscation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_obfuscation_text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_obfuscation_text"));
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
