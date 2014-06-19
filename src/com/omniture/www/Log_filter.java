/**
 * Log_filter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Log_filter  implements java.io.Serializable {
    private com.omniture.www.Log_search_fields field;

    private com.omniture.www.Log_comparisons compare;

    private java.lang.String string;

    public Log_filter() {
    }

    public Log_filter(
           com.omniture.www.Log_search_fields field,
           com.omniture.www.Log_comparisons compare,
           java.lang.String string) {
           this.field = field;
           this.compare = compare;
           this.string = string;
    }


    /**
     * Gets the field value for this Log_filter.
     * 
     * @return field
     */
    public com.omniture.www.Log_search_fields getField() {
        return field;
    }


    /**
     * Sets the field value for this Log_filter.
     * 
     * @param field
     */
    public void setField(com.omniture.www.Log_search_fields field) {
        this.field = field;
    }


    /**
     * Gets the compare value for this Log_filter.
     * 
     * @return compare
     */
    public com.omniture.www.Log_comparisons getCompare() {
        return compare;
    }


    /**
     * Sets the compare value for this Log_filter.
     * 
     * @param compare
     */
    public void setCompare(com.omniture.www.Log_comparisons compare) {
        this.compare = compare;
    }


    /**
     * Gets the string value for this Log_filter.
     * 
     * @return string
     */
    public java.lang.String getString() {
        return string;
    }


    /**
     * Sets the string value for this Log_filter.
     * 
     * @param string
     */
    public void setString(java.lang.String string) {
        this.string = string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Log_filter)) return false;
        Log_filter other = (Log_filter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.compare==null && other.getCompare()==null) || 
             (this.compare!=null &&
              this.compare.equals(other.getCompare()))) &&
            ((this.string==null && other.getString()==null) || 
             (this.string!=null &&
              this.string.equals(other.getString())));
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getCompare() != null) {
            _hashCode += getCompare().hashCode();
        }
        if (getString() != null) {
            _hashCode += getString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Log_filter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_filter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_search_fields"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_comparisons"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "string"));
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
