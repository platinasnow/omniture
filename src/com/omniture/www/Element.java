/**
 * Element.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Element  implements java.io.Serializable {
    private java.lang.String element_name;

    private java.lang.String display_name;

    public Element() {
    }

    public Element(
           java.lang.String element_name,
           java.lang.String display_name) {
           this.element_name = element_name;
           this.display_name = display_name;
    }


    /**
     * Gets the element_name value for this Element.
     * 
     * @return element_name
     */
    public java.lang.String getElement_name() {
        return element_name;
    }


    /**
     * Sets the element_name value for this Element.
     * 
     * @param element_name
     */
    public void setElement_name(java.lang.String element_name) {
        this.element_name = element_name;
    }


    /**
     * Gets the display_name value for this Element.
     * 
     * @return display_name
     */
    public java.lang.String getDisplay_name() {
        return display_name;
    }


    /**
     * Sets the display_name value for this Element.
     * 
     * @param display_name
     */
    public void setDisplay_name(java.lang.String display_name) {
        this.display_name = display_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Element)) return false;
        Element other = (Element) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.element_name==null && other.getElement_name()==null) || 
             (this.element_name!=null &&
              this.element_name.equals(other.getElement_name()))) &&
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
        if (getElement_name() != null) {
            _hashCode += getElement_name().hashCode();
        }
        if (getDisplay_name() != null) {
            _hashCode += getDisplay_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Element.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "element"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "element_name"));
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
