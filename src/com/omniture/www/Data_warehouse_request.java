/**
 * Data_warehouse_request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Data_warehouse_request  implements java.io.Serializable {
    private int status;

    private java.lang.String message;

    private java.lang.String data_url;

    private java.lang.String filesize;

    public Data_warehouse_request() {
    }

    public Data_warehouse_request(
           int status,
           java.lang.String message,
           java.lang.String data_url,
           java.lang.String filesize) {
           this.status = status;
           this.message = message;
           this.data_url = data_url;
           this.filesize = filesize;
    }


    /**
     * Gets the status value for this Data_warehouse_request.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Data_warehouse_request.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the message value for this Data_warehouse_request.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Data_warehouse_request.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the data_url value for this Data_warehouse_request.
     * 
     * @return data_url
     */
    public java.lang.String getData_url() {
        return data_url;
    }


    /**
     * Sets the data_url value for this Data_warehouse_request.
     * 
     * @param data_url
     */
    public void setData_url(java.lang.String data_url) {
        this.data_url = data_url;
    }


    /**
     * Gets the filesize value for this Data_warehouse_request.
     * 
     * @return filesize
     */
    public java.lang.String getFilesize() {
        return filesize;
    }


    /**
     * Sets the filesize value for this Data_warehouse_request.
     * 
     * @param filesize
     */
    public void setFilesize(java.lang.String filesize) {
        this.filesize = filesize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data_warehouse_request)) return false;
        Data_warehouse_request other = (Data_warehouse_request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.data_url==null && other.getData_url()==null) || 
             (this.data_url!=null &&
              this.data_url.equals(other.getData_url()))) &&
            ((this.filesize==null && other.getFilesize()==null) || 
             (this.filesize!=null &&
              this.filesize.equals(other.getFilesize())));
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
        _hashCode += getStatus();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getData_url() != null) {
            _hashCode += getData_url().hashCode();
        }
        if (getFilesize() != null) {
            _hashCode += getFilesize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Data_warehouse_request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filesize"));
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
