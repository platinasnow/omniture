/**
 * Calculated_metric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Calculated_metric  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String formula;

    private java.lang.String friendly_formula;

    private int metric_type;

    private java.lang.String metric_type_string;

    private int decimal_places;

    private int formula_id;

    private int in_queue;

    private int status;

    public Calculated_metric() {
    }

    public Calculated_metric(
           java.lang.String name,
           java.lang.String formula,
           java.lang.String friendly_formula,
           int metric_type,
           java.lang.String metric_type_string,
           int decimal_places,
           int formula_id,
           int in_queue,
           int status) {
           this.name = name;
           this.formula = formula;
           this.friendly_formula = friendly_formula;
           this.metric_type = metric_type;
           this.metric_type_string = metric_type_string;
           this.decimal_places = decimal_places;
           this.formula_id = formula_id;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the name value for this Calculated_metric.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Calculated_metric.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the formula value for this Calculated_metric.
     * 
     * @return formula
     */
    public java.lang.String getFormula() {
        return formula;
    }


    /**
     * Sets the formula value for this Calculated_metric.
     * 
     * @param formula
     */
    public void setFormula(java.lang.String formula) {
        this.formula = formula;
    }


    /**
     * Gets the friendly_formula value for this Calculated_metric.
     * 
     * @return friendly_formula
     */
    public java.lang.String getFriendly_formula() {
        return friendly_formula;
    }


    /**
     * Sets the friendly_formula value for this Calculated_metric.
     * 
     * @param friendly_formula
     */
    public void setFriendly_formula(java.lang.String friendly_formula) {
        this.friendly_formula = friendly_formula;
    }


    /**
     * Gets the metric_type value for this Calculated_metric.
     * 
     * @return metric_type
     */
    public int getMetric_type() {
        return metric_type;
    }


    /**
     * Sets the metric_type value for this Calculated_metric.
     * 
     * @param metric_type
     */
    public void setMetric_type(int metric_type) {
        this.metric_type = metric_type;
    }


    /**
     * Gets the metric_type_string value for this Calculated_metric.
     * 
     * @return metric_type_string
     */
    public java.lang.String getMetric_type_string() {
        return metric_type_string;
    }


    /**
     * Sets the metric_type_string value for this Calculated_metric.
     * 
     * @param metric_type_string
     */
    public void setMetric_type_string(java.lang.String metric_type_string) {
        this.metric_type_string = metric_type_string;
    }


    /**
     * Gets the decimal_places value for this Calculated_metric.
     * 
     * @return decimal_places
     */
    public int getDecimal_places() {
        return decimal_places;
    }


    /**
     * Sets the decimal_places value for this Calculated_metric.
     * 
     * @param decimal_places
     */
    public void setDecimal_places(int decimal_places) {
        this.decimal_places = decimal_places;
    }


    /**
     * Gets the formula_id value for this Calculated_metric.
     * 
     * @return formula_id
     */
    public int getFormula_id() {
        return formula_id;
    }


    /**
     * Sets the formula_id value for this Calculated_metric.
     * 
     * @param formula_id
     */
    public void setFormula_id(int formula_id) {
        this.formula_id = formula_id;
    }


    /**
     * Gets the in_queue value for this Calculated_metric.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Calculated_metric.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Calculated_metric.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Calculated_metric.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Calculated_metric)) return false;
        Calculated_metric other = (Calculated_metric) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.formula==null && other.getFormula()==null) || 
             (this.formula!=null &&
              this.formula.equals(other.getFormula()))) &&
            ((this.friendly_formula==null && other.getFriendly_formula()==null) || 
             (this.friendly_formula!=null &&
              this.friendly_formula.equals(other.getFriendly_formula()))) &&
            this.metric_type == other.getMetric_type() &&
            ((this.metric_type_string==null && other.getMetric_type_string()==null) || 
             (this.metric_type_string!=null &&
              this.metric_type_string.equals(other.getMetric_type_string()))) &&
            this.decimal_places == other.getDecimal_places() &&
            this.formula_id == other.getFormula_id() &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFormula() != null) {
            _hashCode += getFormula().hashCode();
        }
        if (getFriendly_formula() != null) {
            _hashCode += getFriendly_formula().hashCode();
        }
        _hashCode += getMetric_type();
        if (getMetric_type_string() != null) {
            _hashCode += getMetric_type_string().hashCode();
        }
        _hashCode += getDecimal_places();
        _hashCode += getFormula_id();
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Calculated_metric.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "calculated_metric"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendly_formula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "friendly_formula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric_type_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric_type_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimal_places");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decimal_places"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formula_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formula_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
