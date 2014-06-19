/**
 * Permissions_account_groups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Permissions_account_groups  implements java.io.Serializable {
    private com.omniture.www.Permission_group[] available_group_list;

    private com.omniture.www.Permission_group[] selected_group_list;

    public Permissions_account_groups() {
    }

    public Permissions_account_groups(
           com.omniture.www.Permission_group[] available_group_list,
           com.omniture.www.Permission_group[] selected_group_list) {
           this.available_group_list = available_group_list;
           this.selected_group_list = selected_group_list;
    }


    /**
     * Gets the available_group_list value for this Permissions_account_groups.
     * 
     * @return available_group_list
     */
    public com.omniture.www.Permission_group[] getAvailable_group_list() {
        return available_group_list;
    }


    /**
     * Sets the available_group_list value for this Permissions_account_groups.
     * 
     * @param available_group_list
     */
    public void setAvailable_group_list(com.omniture.www.Permission_group[] available_group_list) {
        this.available_group_list = available_group_list;
    }


    /**
     * Gets the selected_group_list value for this Permissions_account_groups.
     * 
     * @return selected_group_list
     */
    public com.omniture.www.Permission_group[] getSelected_group_list() {
        return selected_group_list;
    }


    /**
     * Sets the selected_group_list value for this Permissions_account_groups.
     * 
     * @param selected_group_list
     */
    public void setSelected_group_list(com.omniture.www.Permission_group[] selected_group_list) {
        this.selected_group_list = selected_group_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permissions_account_groups)) return false;
        Permissions_account_groups other = (Permissions_account_groups) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.available_group_list==null && other.getAvailable_group_list()==null) || 
             (this.available_group_list!=null &&
              java.util.Arrays.equals(this.available_group_list, other.getAvailable_group_list()))) &&
            ((this.selected_group_list==null && other.getSelected_group_list()==null) || 
             (this.selected_group_list!=null &&
              java.util.Arrays.equals(this.selected_group_list, other.getSelected_group_list())));
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
        if (getAvailable_group_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_group_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_group_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelected_group_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelected_group_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelected_group_list(), i);
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
        new org.apache.axis.description.TypeDesc(Permissions_account_groups.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account_groups"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_group_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_group_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected_group_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selected_group_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group"));
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
