/**
 * Metric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Metric  implements java.io.Serializable {
    private java.lang.String metric_name;

    private java.lang.String display_name;

    public Metric() {
    }

    public Metric(
           java.lang.String metric_name,
           java.lang.String display_name) {
           this.metric_name = metric_name;
           this.display_name = display_name;
    }


    /**
     * Gets the metric_name value for this Metric.
     * 
     * @return metric_name
     */
    public java.lang.String getMetric_name() {
        return metric_name;
    }


    /**
     * Sets the metric_name value for this Metric.
     * 
     * @param metric_name
     */
    public void setMetric_name(java.lang.String metric_name) {
        this.metric_name = metric_name;
    }


    /**
     * Gets the display_name value for this Metric.
     * 
     * @return display_name
     */
    public java.lang.String getDisplay_name() {
        return display_name;
    }


    /**
     * Sets the display_name value for this Metric.
     * 
     * @param display_name
     */
    public void setDisplay_name(java.lang.String display_name) {
        this.display_name = display_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Metric)) return false;
        Metric other = (Metric) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metric_name==null && other.getMetric_name()==null) || 
             (this.metric_name!=null &&
              this.metric_name.equals(other.getMetric_name()))) &&
            ((this.display_name==null && other.getDisplay_name()==null) || 
             (this.display_name!=null &&
              this.display_name.equals(other.getDisplay_name())));
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
        if (getMetric_name() != null) {
            _hashCode += getMetric_name().hashCode();
        }
        if (getDisplay_name() != null) {
            _hashCode += getDisplay_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Metric.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "metric"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("display_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "display_name"));
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
