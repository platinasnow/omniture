/**
 * Ds_generic_settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ds_generic_settings  implements java.io.Serializable {
    private java.lang.String dataSourceName;

    private java.lang.String dataSourceEmail;

    private java.lang.String[] metricNames;

    private java.lang.String[] metricEvents;

    private java.lang.String[] dimensionNames;

    private java.lang.String[] dimensionVariables;

    public Ds_generic_settings() {
    }

    public Ds_generic_settings(
           java.lang.String dataSourceName,
           java.lang.String dataSourceEmail,
           java.lang.String[] metricNames,
           java.lang.String[] metricEvents,
           java.lang.String[] dimensionNames,
           java.lang.String[] dimensionVariables) {
           this.dataSourceName = dataSourceName;
           this.dataSourceEmail = dataSourceEmail;
           this.metricNames = metricNames;
           this.metricEvents = metricEvents;
           this.dimensionNames = dimensionNames;
           this.dimensionVariables = dimensionVariables;
    }


    /**
     * Gets the dataSourceName value for this Ds_generic_settings.
     * 
     * @return dataSourceName
     */
    public java.lang.String getDataSourceName() {
        return dataSourceName;
    }


    /**
     * Sets the dataSourceName value for this Ds_generic_settings.
     * 
     * @param dataSourceName
     */
    public void setDataSourceName(java.lang.String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


    /**
     * Gets the dataSourceEmail value for this Ds_generic_settings.
     * 
     * @return dataSourceEmail
     */
    public java.lang.String getDataSourceEmail() {
        return dataSourceEmail;
    }


    /**
     * Sets the dataSourceEmail value for this Ds_generic_settings.
     * 
     * @param dataSourceEmail
     */
    public void setDataSourceEmail(java.lang.String dataSourceEmail) {
        this.dataSourceEmail = dataSourceEmail;
    }


    /**
     * Gets the metricNames value for this Ds_generic_settings.
     * 
     * @return metricNames
     */
    public java.lang.String[] getMetricNames() {
        return metricNames;
    }


    /**
     * Sets the metricNames value for this Ds_generic_settings.
     * 
     * @param metricNames
     */
    public void setMetricNames(java.lang.String[] metricNames) {
        this.metricNames = metricNames;
    }


    /**
     * Gets the metricEvents value for this Ds_generic_settings.
     * 
     * @return metricEvents
     */
    public java.lang.String[] getMetricEvents() {
        return metricEvents;
    }


    /**
     * Sets the metricEvents value for this Ds_generic_settings.
     * 
     * @param metricEvents
     */
    public void setMetricEvents(java.lang.String[] metricEvents) {
        this.metricEvents = metricEvents;
    }


    /**
     * Gets the dimensionNames value for this Ds_generic_settings.
     * 
     * @return dimensionNames
     */
    public java.lang.String[] getDimensionNames() {
        return dimensionNames;
    }


    /**
     * Sets the dimensionNames value for this Ds_generic_settings.
     * 
     * @param dimensionNames
     */
    public void setDimensionNames(java.lang.String[] dimensionNames) {
        this.dimensionNames = dimensionNames;
    }


    /**
     * Gets the dimensionVariables value for this Ds_generic_settings.
     * 
     * @return dimensionVariables
     */
    public java.lang.String[] getDimensionVariables() {
        return dimensionVariables;
    }


    /**
     * Sets the dimensionVariables value for this Ds_generic_settings.
     * 
     * @param dimensionVariables
     */
    public void setDimensionVariables(java.lang.String[] dimensionVariables) {
        this.dimensionVariables = dimensionVariables;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ds_generic_settings)) return false;
        Ds_generic_settings other = (Ds_generic_settings) obj;
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
            ((this.metricNames==null && other.getMetricNames()==null) || 
             (this.metricNames!=null &&
              java.util.Arrays.equals(this.metricNames, other.getMetricNames()))) &&
            ((this.metricEvents==null && other.getMetricEvents()==null) || 
             (this.metricEvents!=null &&
              java.util.Arrays.equals(this.metricEvents, other.getMetricEvents()))) &&
            ((this.dimensionNames==null && other.getDimensionNames()==null) || 
             (this.dimensionNames!=null &&
              java.util.Arrays.equals(this.dimensionNames, other.getDimensionNames()))) &&
            ((this.dimensionVariables==null && other.getDimensionVariables()==null) || 
             (this.dimensionVariables!=null &&
              java.util.Arrays.equals(this.dimensionVariables, other.getDimensionVariables())));
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
        if (getMetricNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetricEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimensionNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensionNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensionNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimensionVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensionVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensionVariables(), i);
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
        new org.apache.axis.description.TypeDesc(Ds_generic_settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_generic_settings"));
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
        elemField.setFieldName("metricNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dimensionNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dimensionVariables"));
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
