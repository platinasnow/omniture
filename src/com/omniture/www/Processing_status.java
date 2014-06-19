/**
 * Processing_status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Processing_status  implements java.io.Serializable {
    private int elevator_latency;

    private int lobby_latency;

    public Processing_status() {
    }

    public Processing_status(
           int elevator_latency,
           int lobby_latency) {
           this.elevator_latency = elevator_latency;
           this.lobby_latency = lobby_latency;
    }


    /**
     * Gets the elevator_latency value for this Processing_status.
     * 
     * @return elevator_latency
     */
    public int getElevator_latency() {
        return elevator_latency;
    }


    /**
     * Sets the elevator_latency value for this Processing_status.
     * 
     * @param elevator_latency
     */
    public void setElevator_latency(int elevator_latency) {
        this.elevator_latency = elevator_latency;
    }


    /**
     * Gets the lobby_latency value for this Processing_status.
     * 
     * @return lobby_latency
     */
    public int getLobby_latency() {
        return lobby_latency;
    }


    /**
     * Sets the lobby_latency value for this Processing_status.
     * 
     * @param lobby_latency
     */
    public void setLobby_latency(int lobby_latency) {
        this.lobby_latency = lobby_latency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Processing_status)) return false;
        Processing_status other = (Processing_status) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.elevator_latency == other.getElevator_latency() &&
            this.lobby_latency == other.getLobby_latency();
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
        _hashCode += getElevator_latency();
        _hashCode += getLobby_latency();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Processing_status.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "processing_status"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elevator_latency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elevator_latency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lobby_latency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lobby_latency"));
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
