/**
 * Hierarchy_node.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Hierarchy_node  implements java.io.Serializable {
    private int node_id;

    private int group_num;

    private java.lang.String name;

    private int div_num;

    public Hierarchy_node() {
    }

    public Hierarchy_node(
           int node_id,
           int group_num,
           java.lang.String name,
           int div_num) {
           this.node_id = node_id;
           this.group_num = group_num;
           this.name = name;
           this.div_num = div_num;
    }


    /**
     * Gets the node_id value for this Hierarchy_node.
     * 
     * @return node_id
     */
    public int getNode_id() {
        return node_id;
    }


    /**
     * Sets the node_id value for this Hierarchy_node.
     * 
     * @param node_id
     */
    public void setNode_id(int node_id) {
        this.node_id = node_id;
    }


    /**
     * Gets the group_num value for this Hierarchy_node.
     * 
     * @return group_num
     */
    public int getGroup_num() {
        return group_num;
    }


    /**
     * Sets the group_num value for this Hierarchy_node.
     * 
     * @param group_num
     */
    public void setGroup_num(int group_num) {
        this.group_num = group_num;
    }


    /**
     * Gets the name value for this Hierarchy_node.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Hierarchy_node.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the div_num value for this Hierarchy_node.
     * 
     * @return div_num
     */
    public int getDiv_num() {
        return div_num;
    }


    /**
     * Sets the div_num value for this Hierarchy_node.
     * 
     * @param div_num
     */
    public void setDiv_num(int div_num) {
        this.div_num = div_num;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hierarchy_node)) return false;
        Hierarchy_node other = (Hierarchy_node) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.node_id == other.getNode_id() &&
            this.group_num == other.getGroup_num() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.div_num == other.getDiv_num();
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
        _hashCode += getNode_id();
        _hashCode += getGroup_num();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getDiv_num();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hierarchy_node.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy_node"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("div_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "div_num"));
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
