/**
 * FileStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class FileStatusResult  implements java.io.Serializable {
    private com.omniture.www.DataSourceFileStatus fileStatus;

    private com.omniture.www.Status status;

    public FileStatusResult() {
    }

    public FileStatusResult(
           com.omniture.www.DataSourceFileStatus fileStatus,
           com.omniture.www.Status status) {
           this.fileStatus = fileStatus;
           this.status = status;
    }


    /**
     * Gets the fileStatus value for this FileStatusResult.
     * 
     * @return fileStatus
     */
    public com.omniture.www.DataSourceFileStatus getFileStatus() {
        return fileStatus;
    }


    /**
     * Sets the fileStatus value for this FileStatusResult.
     * 
     * @param fileStatus
     */
    public void setFileStatus(com.omniture.www.DataSourceFileStatus fileStatus) {
        this.fileStatus = fileStatus;
    }


    /**
     * Gets the status value for this FileStatusResult.
     * 
     * @return status
     */
    public com.omniture.www.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FileStatusResult.
     * 
     * @param status
     */
    public void setStatus(com.omniture.www.Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileStatusResult)) return false;
        FileStatusResult other = (FileStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileStatus==null && other.getFileStatus()==null) || 
             (this.fileStatus!=null &&
              this.fileStatus.equals(other.getFileStatus()))) &&
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
        if (getFileStatus() != null) {
            _hashCode += getFileStatus().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "fileStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFileStatus"));
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
