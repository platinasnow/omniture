/**
 * Classification_container.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Classification_container  implements java.io.Serializable {
    private com.omniture.www.Classification_node[] child_nodes;

    private java.lang.String div_name;

    private int div_num;

    private java.lang.String rel_id;

    public Classification_container() {
    }

    public Classification_container(
           com.omniture.www.Classification_node[] child_nodes,
           java.lang.String div_name,
           int div_num,
           java.lang.String rel_id) {
           this.child_nodes = child_nodes;
           this.div_name = div_name;
           this.div_num = div_num;
           this.rel_id = rel_id;
    }


    /**
     * Gets the child_nodes value for this Classification_container.
     * 
     * @return child_nodes
     */
    public com.omniture.www.Classification_node[] getChild_nodes() {
        return child_nodes;
    }


    /**
     * Sets the child_nodes value for this Classification_container.
     * 
     * @param child_nodes
     */
    public void setChild_nodes(com.omniture.www.Classification_node[] child_nodes) {
        this.child_nodes = child_nodes;
    }


    /**
     * Gets the div_name value for this Classification_container.
     * 
     * @return div_name
     */
    public java.lang.String getDiv_name() {
        return div_name;
    }


    /**
     * Sets the div_name value for this Classification_container.
     * 
     * @param div_name
     */
    public void setDiv_name(java.lang.String div_name) {
        this.div_name = div_name;
    }


    /**
     * Gets the div_num value for this Classification_container.
     * 
     * @return div_num
     */
    public int getDiv_num() {
        return div_num;
    }


    /**
     * Sets the div_num value for this Classification_container.
     * 
     * @param div_num
     */
    public void setDiv_num(int div_num) {
        this.div_num = div_num;
    }


    /**
     * Gets the rel_id value for this Classification_container.
     * 
     * @return rel_id
     */
    public java.lang.String getRel_id() {
        return rel_id;
    }


    /**
     * Sets the rel_id value for this Classification_container.
     * 
     * @param rel_id
     */
    public void setRel_id(java.lang.String rel_id) {
        this.rel_id = rel_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Classification_container)) return false;
        Classification_container other = (Classification_container) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.child_nodes==null && other.getChild_nodes()==null) || 
             (this.child_nodes!=null &&
              java.util.Arrays.equals(this.child_nodes, other.getChild_nodes()))) &&
            ((this.div_name==null && other.getDiv_name()==null) || 
             (this.div_name!=null &&
              this.div_name.equals(other.getDiv_name()))) &&
            this.div_num == other.getDiv_num() &&
            ((this.rel_id==null && other.getRel_id()==null) || 
             (this.rel_id!=null &&
              this.rel_id.equals(other.getRel_id())));
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
        if (getChild_nodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChild_nodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChild_nodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiv_name() != null) {
            _hashCode += getDiv_name().hashCode();
        }
        _hashCode += getDiv_num();
        if (getRel_id() != null) {
            _hashCode += getRel_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Classification_container.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "classification_container"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "child_nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "classification_node"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("div_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "div_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("div_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "div_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rel_id"));
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
