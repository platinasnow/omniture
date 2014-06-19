/**
 * Custom_calendar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Custom_calendar  implements java.io.Serializable {
    private com.omniture.www.Custom_calendar_type_enum cal_type;

    private java.util.Date anchor_date;

    private int in_queue;

    private int status;

    public Custom_calendar() {
    }

    public Custom_calendar(
           com.omniture.www.Custom_calendar_type_enum cal_type,
           java.util.Date anchor_date,
           int in_queue,
           int status) {
           this.cal_type = cal_type;
           this.anchor_date = anchor_date;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the cal_type value for this Custom_calendar.
     * 
     * @return cal_type
     */
    public com.omniture.www.Custom_calendar_type_enum getCal_type() {
        return cal_type;
    }


    /**
     * Sets the cal_type value for this Custom_calendar.
     * 
     * @param cal_type
     */
    public void setCal_type(com.omniture.www.Custom_calendar_type_enum cal_type) {
        this.cal_type = cal_type;
    }


    /**
     * Gets the anchor_date value for this Custom_calendar.
     * 
     * @return anchor_date
     */
    public java.util.Date getAnchor_date() {
        return anchor_date;
    }


    /**
     * Sets the anchor_date value for this Custom_calendar.
     * 
     * @param anchor_date
     */
    public void setAnchor_date(java.util.Date anchor_date) {
        this.anchor_date = anchor_date;
    }


    /**
     * Gets the in_queue value for this Custom_calendar.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Custom_calendar.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Custom_calendar.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Custom_calendar.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Custom_calendar)) return false;
        Custom_calendar other = (Custom_calendar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cal_type==null && other.getCal_type()==null) || 
             (this.cal_type!=null &&
              this.cal_type.equals(other.getCal_type()))) &&
            ((this.anchor_date==null && other.getAnchor_date()==null) || 
             (this.anchor_date!=null &&
              this.anchor_date.equals(other.getAnchor_date()))) &&
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
        if (getCal_type() != null) {
            _hashCode += getCal_type().hashCode();
        }
        if (getAnchor_date() != null) {
            _hashCode += getAnchor_date().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Custom_calendar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cal_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cal_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendar_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anchor_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anchor_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
