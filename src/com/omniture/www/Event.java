/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Event  implements java.io.Serializable {
    private java.lang.String event_name;

    private com.omniture.www.Event_type_enum event_type;

    private int default_metric;

    private int rel_id;

    private int custom_event;

    private int event_number;

    private java.lang.String relation_string;

    private int in_queue;

    private int status;

    public Event() {
    }

    public Event(
           java.lang.String event_name,
           com.omniture.www.Event_type_enum event_type,
           int default_metric,
           int rel_id,
           int custom_event,
           int event_number,
           java.lang.String relation_string,
           int in_queue,
           int status) {
           this.event_name = event_name;
           this.event_type = event_type;
           this.default_metric = default_metric;
           this.rel_id = rel_id;
           this.custom_event = custom_event;
           this.event_number = event_number;
           this.relation_string = relation_string;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the event_name value for this Event.
     * 
     * @return event_name
     */
    public java.lang.String getEvent_name() {
        return event_name;
    }


    /**
     * Sets the event_name value for this Event.
     * 
     * @param event_name
     */
    public void setEvent_name(java.lang.String event_name) {
        this.event_name = event_name;
    }


    /**
     * Gets the event_type value for this Event.
     * 
     * @return event_type
     */
    public com.omniture.www.Event_type_enum getEvent_type() {
        return event_type;
    }


    /**
     * Sets the event_type value for this Event.
     * 
     * @param event_type
     */
    public void setEvent_type(com.omniture.www.Event_type_enum event_type) {
        this.event_type = event_type;
    }


    /**
     * Gets the default_metric value for this Event.
     * 
     * @return default_metric
     */
    public int getDefault_metric() {
        return default_metric;
    }


    /**
     * Sets the default_metric value for this Event.
     * 
     * @param default_metric
     */
    public void setDefault_metric(int default_metric) {
        this.default_metric = default_metric;
    }


    /**
     * Gets the rel_id value for this Event.
     * 
     * @return rel_id
     */
    public int getRel_id() {
        return rel_id;
    }


    /**
     * Sets the rel_id value for this Event.
     * 
     * @param rel_id
     */
    public void setRel_id(int rel_id) {
        this.rel_id = rel_id;
    }


    /**
     * Gets the custom_event value for this Event.
     * 
     * @return custom_event
     */
    public int getCustom_event() {
        return custom_event;
    }


    /**
     * Sets the custom_event value for this Event.
     * 
     * @param custom_event
     */
    public void setCustom_event(int custom_event) {
        this.custom_event = custom_event;
    }


    /**
     * Gets the event_number value for this Event.
     * 
     * @return event_number
     */
    public int getEvent_number() {
        return event_number;
    }


    /**
     * Sets the event_number value for this Event.
     * 
     * @param event_number
     */
    public void setEvent_number(int event_number) {
        this.event_number = event_number;
    }


    /**
     * Gets the relation_string value for this Event.
     * 
     * @return relation_string
     */
    public java.lang.String getRelation_string() {
        return relation_string;
    }


    /**
     * Sets the relation_string value for this Event.
     * 
     * @param relation_string
     */
    public void setRelation_string(java.lang.String relation_string) {
        this.relation_string = relation_string;
    }


    /**
     * Gets the in_queue value for this Event.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Event.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Event.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Event.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.event_name==null && other.getEvent_name()==null) || 
             (this.event_name!=null &&
              this.event_name.equals(other.getEvent_name()))) &&
            ((this.event_type==null && other.getEvent_type()==null) || 
             (this.event_type!=null &&
              this.event_type.equals(other.getEvent_type()))) &&
            this.default_metric == other.getDefault_metric() &&
            this.rel_id == other.getRel_id() &&
            this.custom_event == other.getCustom_event() &&
            this.event_number == other.getEvent_number() &&
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
        if (getEvent_name() != null) {
            _hashCode += getEvent_name().hashCode();
        }
        if (getEvent_type() != null) {
            _hashCode += getEvent_type().hashCode();
        }
        _hashCode += getDefault_metric();
        _hashCode += getRel_id();
        _hashCode += getCustom_event();
        _hashCode += getEvent_number();
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
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "event_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_metric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_metric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rel_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom_event");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custom_event"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_number"));
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
