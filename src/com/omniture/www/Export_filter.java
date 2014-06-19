/**
 * Export_filter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Export_filter  implements java.io.Serializable {
    private com.omniture.www.Date_received[] date_received_dates;

    private com.omniture.www.Column[] columns;

    public Export_filter() {
    }

    public Export_filter(
           com.omniture.www.Date_received[] date_received_dates,
           com.omniture.www.Column[] columns) {
           this.date_received_dates = date_received_dates;
           this.columns = columns;
    }


    /**
     * Gets the date_received_dates value for this Export_filter.
     * 
     * @return date_received_dates
     */
    public com.omniture.www.Date_received[] getDate_received_dates() {
        return date_received_dates;
    }


    /**
     * Sets the date_received_dates value for this Export_filter.
     * 
     * @param date_received_dates
     */
    public void setDate_received_dates(com.omniture.www.Date_received[] date_received_dates) {
        this.date_received_dates = date_received_dates;
    }


    /**
     * Gets the columns value for this Export_filter.
     * 
     * @return columns
     */
    public com.omniture.www.Column[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this Export_filter.
     * 
     * @param columns
     */
    public void setColumns(com.omniture.www.Column[] columns) {
        this.columns = columns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Export_filter)) return false;
        Export_filter other = (Export_filter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_received_dates==null && other.getDate_received_dates()==null) || 
             (this.date_received_dates!=null &&
              java.util.Arrays.equals(this.date_received_dates, other.getDate_received_dates()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns())));
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
        if (getDate_received_dates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDate_received_dates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDate_received_dates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
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
        new org.apache.axis.description.TypeDesc(Export_filter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "export_filter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_received_dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_received_dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "date_received"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "column"));
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
