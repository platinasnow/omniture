/**
 * Correlation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Correlation  implements java.io.Serializable {
    private com.omniture.www.Correlation_rel_id[] rel_ids;

    private int size;

    private int in_queue;

    private int queue_id;

    private int status;

    public Correlation() {
    }

    public Correlation(
           com.omniture.www.Correlation_rel_id[] rel_ids,
           int size,
           int in_queue,
           int queue_id,
           int status) {
           this.rel_ids = rel_ids;
           this.size = size;
           this.in_queue = in_queue;
           this.queue_id = queue_id;
           this.status = status;
    }


    /**
     * Gets the rel_ids value for this Correlation.
     * 
     * @return rel_ids
     */
    public com.omniture.www.Correlation_rel_id[] getRel_ids() {
        return rel_ids;
    }


    /**
     * Sets the rel_ids value for this Correlation.
     * 
     * @param rel_ids
     */
    public void setRel_ids(com.omniture.www.Correlation_rel_id[] rel_ids) {
        this.rel_ids = rel_ids;
    }


    /**
     * Gets the size value for this Correlation.
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * Sets the size value for this Correlation.
     * 
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }


    /**
     * Gets the in_queue value for this Correlation.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Correlation.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the queue_id value for this Correlation.
     * 
     * @return queue_id
     */
    public int getQueue_id() {
        return queue_id;
    }


    /**
     * Sets the queue_id value for this Correlation.
     * 
     * @param queue_id
     */
    public void setQueue_id(int queue_id) {
        this.queue_id = queue_id;
    }


    /**
     * Gets the status value for this Correlation.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Correlation.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Correlation)) return false;
        Correlation other = (Correlation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rel_ids==null && other.getRel_ids()==null) || 
             (this.rel_ids!=null &&
              java.util.Arrays.equals(this.rel_ids, other.getRel_ids()))) &&
            this.size == other.getSize() &&
            this.in_queue == other.getIn_queue() &&
            this.queue_id == other.getQueue_id() &&
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
        if (getRel_ids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRel_ids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRel_ids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSize();
        _hashCode += getIn_queue();
        _hashCode += getQueue_id();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Correlation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "correlation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rel_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rel_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_rel_id"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "in_queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queue_id"));
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
