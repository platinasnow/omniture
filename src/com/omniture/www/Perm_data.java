/**
 * Perm_data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Perm_data  implements java.io.Serializable {
    private int id;

    private java.lang.String access;

    private java.lang.String selectedvals;

    public Perm_data() {
    }

    public Perm_data(
           int id,
           java.lang.String access,
           java.lang.String selectedvals) {
           this.id = id;
           this.access = access;
           this.selectedvals = selectedvals;
    }


    /**
     * Gets the id value for this Perm_data.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Perm_data.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the access value for this Perm_data.
     * 
     * @return access
     */
    public java.lang.String getAccess() {
        return access;
    }


    /**
     * Sets the access value for this Perm_data.
     * 
     * @param access
     */
    public void setAccess(java.lang.String access) {
        this.access = access;
    }


    /**
     * Gets the selectedvals value for this Perm_data.
     * 
     * @return selectedvals
     */
    public java.lang.String getSelectedvals() {
        return selectedvals;
    }


    /**
     * Sets the selectedvals value for this Perm_data.
     * 
     * @param selectedvals
     */
    public void setSelectedvals(java.lang.String selectedvals) {
        this.selectedvals = selectedvals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Perm_data)) return false;
        Perm_data other = (Perm_data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.access==null && other.getAccess()==null) || 
             (this.access!=null &&
              this.access.equals(other.getAccess()))) &&
            ((this.selectedvals==null && other.getSelectedvals()==null) || 
             (this.selectedvals!=null &&
              this.selectedvals.equals(other.getSelectedvals())));
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
        _hashCode += getId();
        if (getAccess() != null) {
            _hashCode += getAccess().hashCode();
        }
        if (getSelectedvals() != null) {
            _hashCode += getSelectedvals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Perm_data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "perm_data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedvals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectedvals"));
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
