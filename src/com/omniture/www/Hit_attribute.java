/**
 * Hit_attribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Hit_attribute  implements java.io.Serializable {
    private com.omniture.www.Hit_attribute_type type;

    private int id;

    private java.lang.String qs_var;

    public Hit_attribute() {
    }

    public Hit_attribute(
           com.omniture.www.Hit_attribute_type type,
           int id,
           java.lang.String qs_var) {
           this.type = type;
           this.id = id;
           this.qs_var = qs_var;
    }


    /**
     * Gets the type value for this Hit_attribute.
     * 
     * @return type
     */
    public com.omniture.www.Hit_attribute_type getType() {
        return type;
    }


    /**
     * Sets the type value for this Hit_attribute.
     * 
     * @param type
     */
    public void setType(com.omniture.www.Hit_attribute_type type) {
        this.type = type;
    }


    /**
     * Gets the id value for this Hit_attribute.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Hit_attribute.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the qs_var value for this Hit_attribute.
     * 
     * @return qs_var
     */
    public java.lang.String getQs_var() {
        return qs_var;
    }


    /**
     * Sets the qs_var value for this Hit_attribute.
     * 
     * @param qs_var
     */
    public void setQs_var(java.lang.String qs_var) {
        this.qs_var = qs_var;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hit_attribute)) return false;
        Hit_attribute other = (Hit_attribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.id == other.getId() &&
            ((this.qs_var==null && other.getQs_var()==null) || 
             (this.qs_var!=null &&
              this.qs_var.equals(other.getQs_var())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getId();
        if (getQs_var() != null) {
            _hashCode += getQs_var().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hit_attribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hit_attribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hit_attribute_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qs_var");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qs_var"));
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
