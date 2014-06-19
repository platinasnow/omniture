/**
 * Report_categories.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report_categories  implements java.io.Serializable {
    private int ecommerce_all;

    private int traffic_all;

    private int paths_all;

    private int custom_paths_all;

    private int tools_all;

    private int sem_all;

    public Report_categories() {
    }

    public Report_categories(
           int ecommerce_all,
           int traffic_all,
           int paths_all,
           int custom_paths_all,
           int tools_all,
           int sem_all) {
           this.ecommerce_all = ecommerce_all;
           this.traffic_all = traffic_all;
           this.paths_all = paths_all;
           this.custom_paths_all = custom_paths_all;
           this.tools_all = tools_all;
           this.sem_all = sem_all;
    }


    /**
     * Gets the ecommerce_all value for this Report_categories.
     * 
     * @return ecommerce_all
     */
    public int getEcommerce_all() {
        return ecommerce_all;
    }


    /**
     * Sets the ecommerce_all value for this Report_categories.
     * 
     * @param ecommerce_all
     */
    public void setEcommerce_all(int ecommerce_all) {
        this.ecommerce_all = ecommerce_all;
    }


    /**
     * Gets the traffic_all value for this Report_categories.
     * 
     * @return traffic_all
     */
    public int getTraffic_all() {
        return traffic_all;
    }


    /**
     * Sets the traffic_all value for this Report_categories.
     * 
     * @param traffic_all
     */
    public void setTraffic_all(int traffic_all) {
        this.traffic_all = traffic_all;
    }


    /**
     * Gets the paths_all value for this Report_categories.
     * 
     * @return paths_all
     */
    public int getPaths_all() {
        return paths_all;
    }


    /**
     * Sets the paths_all value for this Report_categories.
     * 
     * @param paths_all
     */
    public void setPaths_all(int paths_all) {
        this.paths_all = paths_all;
    }


    /**
     * Gets the custom_paths_all value for this Report_categories.
     * 
     * @return custom_paths_all
     */
    public int getCustom_paths_all() {
        return custom_paths_all;
    }


    /**
     * Sets the custom_paths_all value for this Report_categories.
     * 
     * @param custom_paths_all
     */
    public void setCustom_paths_all(int custom_paths_all) {
        this.custom_paths_all = custom_paths_all;
    }


    /**
     * Gets the tools_all value for this Report_categories.
     * 
     * @return tools_all
     */
    public int getTools_all() {
        return tools_all;
    }


    /**
     * Sets the tools_all value for this Report_categories.
     * 
     * @param tools_all
     */
    public void setTools_all(int tools_all) {
        this.tools_all = tools_all;
    }


    /**
     * Gets the sem_all value for this Report_categories.
     * 
     * @return sem_all
     */
    public int getSem_all() {
        return sem_all;
    }


    /**
     * Sets the sem_all value for this Report_categories.
     * 
     * @param sem_all
     */
    public void setSem_all(int sem_all) {
        this.sem_all = sem_all;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_categories)) return false;
        Report_categories other = (Report_categories) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ecommerce_all == other.getEcommerce_all() &&
            this.traffic_all == other.getTraffic_all() &&
            this.paths_all == other.getPaths_all() &&
            this.custom_paths_all == other.getCustom_paths_all() &&
            this.tools_all == other.getTools_all() &&
            this.sem_all == other.getSem_all();
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
        _hashCode += getEcommerce_all();
        _hashCode += getTraffic_all();
        _hashCode += getPaths_all();
        _hashCode += getCustom_paths_all();
        _hashCode += getTools_all();
        _hashCode += getSem_all();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_categories.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_categories"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecommerce_all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecommerce_all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffic_all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffic_all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paths_all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paths_all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom_paths_all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custom_paths_all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tools_all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tools_all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sem_all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sem_all"));
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
