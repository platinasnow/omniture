/**
 * Finding_method.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Finding_method  implements java.io.Serializable {
    private int relation_id;

    private int exp_type;

    private int alloc_type;

    private java.lang.String relation_string;

    private int in_queue;

    private int status;

    public Finding_method() {
    }

    public Finding_method(
           int relation_id,
           int exp_type,
           int alloc_type,
           java.lang.String relation_string,
           int in_queue,
           int status) {
           this.relation_id = relation_id;
           this.exp_type = exp_type;
           this.alloc_type = alloc_type;
           this.relation_string = relation_string;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the relation_id value for this Finding_method.
     * 
     * @return relation_id
     */
    public int getRelation_id() {
        return relation_id;
    }


    /**
     * Sets the relation_id value for this Finding_method.
     * 
     * @param relation_id
     */
    public void setRelation_id(int relation_id) {
        this.relation_id = relation_id;
    }


    /**
     * Gets the exp_type value for this Finding_method.
     * 
     * @return exp_type
     */
    public int getExp_type() {
        return exp_type;
    }


    /**
     * Sets the exp_type value for this Finding_method.
     * 
     * @param exp_type
     */
    public void setExp_type(int exp_type) {
        this.exp_type = exp_type;
    }


    /**
     * Gets the alloc_type value for this Finding_method.
     * 
     * @return alloc_type
     */
    public int getAlloc_type() {
        return alloc_type;
    }


    /**
     * Sets the alloc_type value for this Finding_method.
     * 
     * @param alloc_type
     */
    public void setAlloc_type(int alloc_type) {
        this.alloc_type = alloc_type;
    }


    /**
     * Gets the relation_string value for this Finding_method.
     * 
     * @return relation_string
     */
    public java.lang.String getRelation_string() {
        return relation_string;
    }


    /**
     * Sets the relation_string value for this Finding_method.
     * 
     * @param relation_string
     */
    public void setRelation_string(java.lang.String relation_string) {
        this.relation_string = relation_string;
    }


    /**
     * Gets the in_queue value for this Finding_method.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Finding_method.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Finding_method.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Finding_method.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Finding_method)) return false;
        Finding_method other = (Finding_method) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.relation_id == other.getRelation_id() &&
            this.exp_type == other.getExp_type() &&
            this.alloc_type == other.getAlloc_type() &&
            ((this.relation_string==null && other.getRelation_string()==null) || 
             (this.relation_string!=null &&
              this.relation_string.equals(other.getRelation_string()))) &&
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
        _hashCode += getRelation_id();
        _hashCode += getExp_type();
        _hashCode += getAlloc_type();
        if (getRelation_string() != null) {
            _hashCode += getRelation_string().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Finding_method.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "finding_method"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exp_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exp_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alloc_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alloc_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
