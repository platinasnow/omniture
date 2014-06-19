/**
 * Ds_weblog_settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ds_weblog_settings  implements java.io.Serializable {
    private java.lang.String dataSourceName;

    private java.lang.String dataSourceEmail;

    private com.omniture.www.Ds_weblog_formats logFormat;

    public Ds_weblog_settings() {
    }

    public Ds_weblog_settings(
           java.lang.String dataSourceName,
           java.lang.String dataSourceEmail,
           com.omniture.www.Ds_weblog_formats logFormat) {
           this.dataSourceName = dataSourceName;
           this.dataSourceEmail = dataSourceEmail;
           this.logFormat = logFormat;
    }


    /**
     * Gets the dataSourceName value for this Ds_weblog_settings.
     * 
     * @return dataSourceName
     */
    public java.lang.String getDataSourceName() {
        return dataSourceName;
    }


    /**
     * Sets the dataSourceName value for this Ds_weblog_settings.
     * 
     * @param dataSourceName
     */
    public void setDataSourceName(java.lang.String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


    /**
     * Gets the dataSourceEmail value for this Ds_weblog_settings.
     * 
     * @return dataSourceEmail
     */
    public java.lang.String getDataSourceEmail() {
        return dataSourceEmail;
    }


    /**
     * Sets the dataSourceEmail value for this Ds_weblog_settings.
     * 
     * @param dataSourceEmail
     */
    public void setDataSourceEmail(java.lang.String dataSourceEmail) {
        this.dataSourceEmail = dataSourceEmail;
    }


    /**
     * Gets the logFormat value for this Ds_weblog_settings.
     * 
     * @return logFormat
     */
    public com.omniture.www.Ds_weblog_formats getLogFormat() {
        return logFormat;
    }


    /**
     * Sets the logFormat value for this Ds_weblog_settings.
     * 
     * @param logFormat
     */
    public void setLogFormat(com.omniture.www.Ds_weblog_formats logFormat) {
        this.logFormat = logFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ds_weblog_settings)) return false;
        Ds_weblog_settings other = (Ds_weblog_settings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataSourceName==null && other.getDataSourceName()==null) || 
             (this.dataSourceName!=null &&
              this.dataSourceName.equals(other.getDataSourceName()))) &&
            ((this.dataSourceEmail==null && other.getDataSourceEmail()==null) || 
             (this.dataSourceEmail!=null &&
              this.dataSourceEmail.equals(other.getDataSourceEmail()))) &&
            ((this.logFormat==null && other.getLogFormat()==null) || 
             (this.logFormat!=null &&
              this.logFormat.equals(other.getLogFormat())));
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
        if (getDataSourceName() != null) {
            _hashCode += getDataSourceName().hashCode();
        }
        if (getDataSourceEmail() != null) {
            _hashCode += getDataSourceEmail().hashCode();
        }
        if (getLogFormat() != null) {
            _hashCode += getLogFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ds_weblog_settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_weblog_settings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSourceEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_weblog_formats"));
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
