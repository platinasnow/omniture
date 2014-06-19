/**
 * Ds_setup_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ds_setup_result  implements java.io.Serializable {
    private int dataSourceID;

    private com.omniture.www.Status status;

    public Ds_setup_result() {
    }

    public Ds_setup_result(
           int dataSourceID,
           com.omniture.www.Status status) {
           this.dataSourceID = dataSourceID;
           this.status = status;
    }


    /**
     * Gets the dataSourceID value for this Ds_setup_result.
     * 
     * @return dataSourceID
     */
    public int getDataSourceID() {
        return dataSourceID;
    }


    /**
     * Sets the dataSourceID value for this Ds_setup_result.
     * 
     * @param dataSourceID
     */
    public void setDataSourceID(int dataSourceID) {
        this.dataSourceID = dataSourceID;
    }


    /**
     * Gets the status value for this Ds_setup_result.
     * 
     * @return status
     */
    public com.omniture.www.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Ds_setup_result.
     * 
     * @param status
     */
    public void setStatus(com.omniture.www.Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ds_setup_result)) return false;
        Ds_setup_result other = (Ds_setup_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dataSourceID == other.getDataSourceID() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += getDataSourceID();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ds_setup_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_setup_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "status"));
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
