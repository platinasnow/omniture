/**
 * Ds_traffic_settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ds_traffic_settings  implements java.io.Serializable {
    private java.lang.String dataSourceName;

    private java.lang.String dataSourceEmail;

    private com.omniture.www.Ds_traffic_data_scope dataScope;

    private java.lang.String[] standardBreakdowns;

    private java.lang.String[] customBreakdownNames;

    private java.lang.String[] customBreakdownValues;

    private java.lang.String[] metricList;

    public Ds_traffic_settings() {
    }

    public Ds_traffic_settings(
           java.lang.String dataSourceName,
           java.lang.String dataSourceEmail,
           com.omniture.www.Ds_traffic_data_scope dataScope,
           java.lang.String[] standardBreakdowns,
           java.lang.String[] customBreakdownNames,
           java.lang.String[] customBreakdownValues,
           java.lang.String[] metricList) {
           this.dataSourceName = dataSourceName;
           this.dataSourceEmail = dataSourceEmail;
           this.dataScope = dataScope;
           this.standardBreakdowns = standardBreakdowns;
           this.customBreakdownNames = customBreakdownNames;
           this.customBreakdownValues = customBreakdownValues;
           this.metricList = metricList;
    }


    /**
     * Gets the dataSourceName value for this Ds_traffic_settings.
     * 
     * @return dataSourceName
     */
    public java.lang.String getDataSourceName() {
        return dataSourceName;
    }


    /**
     * Sets the dataSourceName value for this Ds_traffic_settings.
     * 
     * @param dataSourceName
     */
    public void setDataSourceName(java.lang.String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


    /**
     * Gets the dataSourceEmail value for this Ds_traffic_settings.
     * 
     * @return dataSourceEmail
     */
    public java.lang.String getDataSourceEmail() {
        return dataSourceEmail;
    }


    /**
     * Sets the dataSourceEmail value for this Ds_traffic_settings.
     * 
     * @param dataSourceEmail
     */
    public void setDataSourceEmail(java.lang.String dataSourceEmail) {
        this.dataSourceEmail = dataSourceEmail;
    }


    /**
     * Gets the dataScope value for this Ds_traffic_settings.
     * 
     * @return dataScope
     */
    public com.omniture.www.Ds_traffic_data_scope getDataScope() {
        return dataScope;
    }


    /**
     * Sets the dataScope value for this Ds_traffic_settings.
     * 
     * @param dataScope
     */
    public void setDataScope(com.omniture.www.Ds_traffic_data_scope dataScope) {
        this.dataScope = dataScope;
    }


    /**
     * Gets the standardBreakdowns value for this Ds_traffic_settings.
     * 
     * @return standardBreakdowns
     */
    public java.lang.String[] getStandardBreakdowns() {
        return standardBreakdowns;
    }


    /**
     * Sets the standardBreakdowns value for this Ds_traffic_settings.
     * 
     * @param standardBreakdowns
     */
    public void setStandardBreakdowns(java.lang.String[] standardBreakdowns) {
        this.standardBreakdowns = standardBreakdowns;
    }


    /**
     * Gets the customBreakdownNames value for this Ds_traffic_settings.
     * 
     * @return customBreakdownNames
     */
    public java.lang.String[] getCustomBreakdownNames() {
        return customBreakdownNames;
    }


    /**
     * Sets the customBreakdownNames value for this Ds_traffic_settings.
     * 
     * @param customBreakdownNames
     */
    public void setCustomBreakdownNames(java.lang.String[] customBreakdownNames) {
        this.customBreakdownNames = customBreakdownNames;
    }


    /**
     * Gets the customBreakdownValues value for this Ds_traffic_settings.
     * 
     * @return customBreakdownValues
     */
    public java.lang.String[] getCustomBreakdownValues() {
        return customBreakdownValues;
    }


    /**
     * Sets the customBreakdownValues value for this Ds_traffic_settings.
     * 
     * @param customBreakdownValues
     */
    public void setCustomBreakdownValues(java.lang.String[] customBreakdownValues) {
        this.customBreakdownValues = customBreakdownValues;
    }


    /**
     * Gets the metricList value for this Ds_traffic_settings.
     * 
     * @return metricList
     */
    public java.lang.String[] getMetricList() {
        return metricList;
    }


    /**
     * Sets the metricList value for this Ds_traffic_settings.
     * 
     * @param metricList
     */
    public void setMetricList(java.lang.String[] metricList) {
        this.metricList = metricList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ds_traffic_settings)) return false;
        Ds_traffic_settings other = (Ds_traffic_settings) obj;
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
            ((this.dataScope==null && other.getDataScope()==null) || 
             (this.dataScope!=null &&
              this.dataScope.equals(other.getDataScope()))) &&
            ((this.standardBreakdowns==null && other.getStandardBreakdowns()==null) || 
             (this.standardBreakdowns!=null &&
              java.util.Arrays.equals(this.standardBreakdowns, other.getStandardBreakdowns()))) &&
            ((this.customBreakdownNames==null && other.getCustomBreakdownNames()==null) || 
             (this.customBreakdownNames!=null &&
              java.util.Arrays.equals(this.customBreakdownNames, other.getCustomBreakdownNames()))) &&
            ((this.customBreakdownValues==null && other.getCustomBreakdownValues()==null) || 
             (this.customBreakdownValues!=null &&
              java.util.Arrays.equals(this.customBreakdownValues, other.getCustomBreakdownValues()))) &&
            ((this.metricList==null && other.getMetricList()==null) || 
             (this.metricList!=null &&
              java.util.Arrays.equals(this.metricList, other.getMetricList())));
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
        if (getDataScope() != null) {
            _hashCode += getDataScope().hashCode();
        }
        if (getStandardBreakdowns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStandardBreakdowns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStandardBreakdowns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomBreakdownNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomBreakdownNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomBreakdownNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomBreakdownValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomBreakdownValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomBreakdownValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetricList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ds_traffic_settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_traffic_settings"));
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
        elemField.setFieldName("dataScope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_traffic_data_scope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardBreakdowns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standardBreakdowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customBreakdownNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customBreakdownNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customBreakdownValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customBreakdownValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricList"));
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
