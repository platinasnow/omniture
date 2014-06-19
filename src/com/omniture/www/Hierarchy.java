/**
 * Hierarchy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Hierarchy  implements java.io.Serializable {
    private java.lang.String[] classifications;

    private com.omniture.www.Hierarchy_node[] hierarchies;

    private int in_queue;

    private int status;

    public Hierarchy() {
    }

    public Hierarchy(
           java.lang.String[] classifications,
           com.omniture.www.Hierarchy_node[] hierarchies,
           int in_queue,
           int status) {
           this.classifications = classifications;
           this.hierarchies = hierarchies;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the classifications value for this Hierarchy.
     * 
     * @return classifications
     */
    public java.lang.String[] getClassifications() {
        return classifications;
    }


    /**
     * Sets the classifications value for this Hierarchy.
     * 
     * @param classifications
     */
    public void setClassifications(java.lang.String[] classifications) {
        this.classifications = classifications;
    }


    /**
     * Gets the hierarchies value for this Hierarchy.
     * 
     * @return hierarchies
     */
    public com.omniture.www.Hierarchy_node[] getHierarchies() {
        return hierarchies;
    }


    /**
     * Sets the hierarchies value for this Hierarchy.
     * 
     * @param hierarchies
     */
    public void setHierarchies(com.omniture.www.Hierarchy_node[] hierarchies) {
        this.hierarchies = hierarchies;
    }


    /**
     * Gets the in_queue value for this Hierarchy.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Hierarchy.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Hierarchy.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Hierarchy.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hierarchy)) return false;
        Hierarchy other = (Hierarchy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classifications==null && other.getClassifications()==null) || 
             (this.classifications!=null &&
              java.util.Arrays.equals(this.classifications, other.getClassifications()))) &&
            ((this.hierarchies==null && other.getHierarchies()==null) || 
             (this.hierarchies!=null &&
              java.util.Arrays.equals(this.hierarchies, other.getHierarchies()))) &&
            this.in_queue == other.getIn_queue() &&
            this.status == other.getStatus();
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
        if (getClassifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHierarchies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hierarchy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classifications");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hierarchies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy_node"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "in_queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
