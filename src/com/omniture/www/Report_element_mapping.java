/**
 * Report_element_mapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report_element_mapping  implements java.io.Serializable {
    private java.lang.String element;

    private com.omniture.www.Element_mapping[] mapping;

    public Report_element_mapping() {
    }

    public Report_element_mapping(
           java.lang.String element,
           com.omniture.www.Element_mapping[] mapping) {
           this.element = element;
           this.mapping = mapping;
    }


    /**
     * Gets the element value for this Report_element_mapping.
     * 
     * @return element
     */
    public java.lang.String getElement() {
        return element;
    }


    /**
     * Sets the element value for this Report_element_mapping.
     * 
     * @param element
     */
    public void setElement(java.lang.String element) {
        this.element = element;
    }


    /**
     * Gets the mapping value for this Report_element_mapping.
     * 
     * @return mapping
     */
    public com.omniture.www.Element_mapping[] getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this Report_element_mapping.
     * 
     * @param mapping
     */
    public void setMapping(com.omniture.www.Element_mapping[] mapping) {
        this.mapping = mapping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_element_mapping)) return false;
        Report_element_mapping other = (Report_element_mapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.element==null && other.getElement()==null) || 
             (this.element!=null &&
              this.element.equals(other.getElement()))) &&
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              java.util.Arrays.equals(this.mapping, other.getMapping())));
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
        if (getElement() != null) {
            _hashCode += getElement().hashCode();
        }
        if (getMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMapping(), i);
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
        new org.apache.axis.description.TypeDesc(Report_element_mapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_element_mapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element");
        elemField.setXmlName(new javax.xml.namespace.QName("", "element"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "element_mapping"));
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
