/**
 * Ds_full_settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ds_full_settings  implements java.io.Serializable {
    private java.lang.String dataSourceName;

    private java.lang.String dataSourceEmail;

    private com.omniture.www.Ds_full_injection_type injectionType;

    private boolean allowOutOfOrderHits;

    private boolean stopOnWarning;

    public Ds_full_settings() {
    }

    public Ds_full_settings(
           java.lang.String dataSourceName,
           java.lang.String dataSourceEmail,
           com.omniture.www.Ds_full_injection_type injectionType,
           boolean allowOutOfOrderHits,
           boolean stopOnWarning) {
           this.dataSourceName = dataSourceName;
           this.dataSourceEmail = dataSourceEmail;
           this.injectionType = injectionType;
           this.allowOutOfOrderHits = allowOutOfOrderHits;
           this.stopOnWarning = stopOnWarning;
    }


    /**
     * Gets the dataSourceName value for this Ds_full_settings.
     * 
     * @return dataSourceName
     */
    public java.lang.String getDataSourceName() {
        return dataSourceName;
    }


    /**
     * Sets the dataSourceName value for this Ds_full_settings.
     * 
     * @param dataSourceName
     */
    public void setDataSourceName(java.lang.String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


    /**
     * Gets the dataSourceEmail value for this Ds_full_settings.
     * 
     * @return dataSourceEmail
     */
    public java.lang.String getDataSourceEmail() {
        return dataSourceEmail;
    }


    /**
     * Sets the dataSourceEmail value for this Ds_full_settings.
     * 
     * @param dataSourceEmail
     */
    public void setDataSourceEmail(java.lang.String dataSourceEmail) {
        this.dataSourceEmail = dataSourceEmail;
    }


    /**
     * Gets the injectionType value for this Ds_full_settings.
     * 
     * @return injectionType
     */
    public com.omniture.www.Ds_full_injection_type getInjectionType() {
        return injectionType;
    }


    /**
     * Sets the injectionType value for this Ds_full_settings.
     * 
     * @param injectionType
     */
    public void setInjectionType(com.omniture.www.Ds_full_injection_type injectionType) {
        this.injectionType = injectionType;
    }


    /**
     * Gets the allowOutOfOrderHits value for this Ds_full_settings.
     * 
     * @return allowOutOfOrderHits
     */
    public boolean isAllowOutOfOrderHits() {
        return allowOutOfOrderHits;
    }


    /**
     * Sets the allowOutOfOrderHits value for this Ds_full_settings.
     * 
     * @param allowOutOfOrderHits
     */
    public void setAllowOutOfOrderHits(boolean allowOutOfOrderHits) {
        this.allowOutOfOrderHits = allowOutOfOrderHits;
    }


    /**
     * Gets the stopOnWarning value for this Ds_full_settings.
     * 
     * @return stopOnWarning
     */
    public boolean isStopOnWarning() {
        return stopOnWarning;
    }


    /**
     * Sets the stopOnWarning value for this Ds_full_settings.
     * 
     * @param stopOnWarning
     */
    public void setStopOnWarning(boolean stopOnWarning) {
        this.stopOnWarning = stopOnWarning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ds_full_settings)) return false;
        Ds_full_settings other = (Ds_full_settings) obj;
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
            ((this.injectionType==null && other.getInjectionType()==null) || 
             (this.injectionType!=null &&
              this.injectionType.equals(other.getInjectionType()))) &&
            this.allowOutOfOrderHits == other.isAllowOutOfOrderHits() &&
            this.stopOnWarning == other.isStopOnWarning();
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
        if (getInjectionType() != null) {
            _hashCode += getInjectionType().hashCode();
        }
        _hashCode += (isAllowOutOfOrderHits() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStopOnWarning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ds_full_settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_full_settings"));
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
        elemField.setFieldName("injectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "injectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_full_injection_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOutOfOrderHits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowOutOfOrderHits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopOnWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stopOnWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
