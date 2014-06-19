/**
 * Traffic_var.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Traffic_var  implements java.io.Serializable {
    private int property_number;

    private java.lang.String name;

    private java.lang.String default_name;

    private java.lang.String enabled;

    private int in_queue;

    private int status;

    public Traffic_var() {
    }

    public Traffic_var(
           int property_number,
           java.lang.String name,
           java.lang.String default_name,
           java.lang.String enabled,
           int in_queue,
           int status) {
           this.property_number = property_number;
           this.name = name;
           this.default_name = default_name;
           this.enabled = enabled;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the property_number value for this Traffic_var.
     * 
     * @return property_number
     */
    public int getProperty_number() {
        return property_number;
    }


    /**
     * Sets the property_number value for this Traffic_var.
     * 
     * @param property_number
     */
    public void setProperty_number(int property_number) {
        this.property_number = property_number;
    }


    /**
     * Gets the name value for this Traffic_var.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Traffic_var.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the default_name value for this Traffic_var.
     * 
     * @return default_name
     */
    public java.lang.String getDefault_name() {
        return default_name;
    }


    /**
     * Sets the default_name value for this Traffic_var.
     * 
     * @param default_name
     */
    public void setDefault_name(java.lang.String default_name) {
        this.default_name = default_name;
    }


    /**
     * Gets the enabled value for this Traffic_var.
     * 
     * @return enabled
     */
    public java.lang.String getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this Traffic_var.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.String enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the in_queue value for this Traffic_var.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Traffic_var.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Traffic_var.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Traffic_var.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Traffic_var)) return false;
        Traffic_var other = (Traffic_var) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.property_number == other.getProperty_number() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.default_name==null && other.getDefault_name()==null) || 
             (this.default_name!=null &&
              this.default_name.equals(other.getDefault_name()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
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
        _hashCode += getProperty_number();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDefault_name() != null) {
            _hashCode += getDefault_name().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Traffic_var.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "traffic_var"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
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
