/**
 * Tracking_server_data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Tracking_server_data  implements java.io.Serializable {
    private java.lang.String namespace;

    private java.lang.String tracking_server;

    public Tracking_server_data() {
    }

    public Tracking_server_data(
           java.lang.String namespace,
           java.lang.String tracking_server) {
           this.namespace = namespace;
           this.tracking_server = tracking_server;
    }


    /**
     * Gets the namespace value for this Tracking_server_data.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this Tracking_server_data.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the tracking_server value for this Tracking_server_data.
     * 
     * @return tracking_server
     */
    public java.lang.String getTracking_server() {
        return tracking_server;
    }


    /**
     * Sets the tracking_server value for this Tracking_server_data.
     * 
     * @param tracking_server
     */
    public void setTracking_server(java.lang.String tracking_server) {
        this.tracking_server = tracking_server;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tracking_server_data)) return false;
        Tracking_server_data other = (Tracking_server_data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            ((this.tracking_server==null && other.getTracking_server()==null) || 
             (this.tracking_server!=null &&
              this.tracking_server.equals(other.getTracking_server())));
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
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        if (getTracking_server() != null) {
            _hashCode += getTracking_server().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tracking_server_data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "tracking_server_data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tracking_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
