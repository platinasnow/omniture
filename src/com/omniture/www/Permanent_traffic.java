/**
 * Permanent_traffic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Permanent_traffic  implements java.io.Serializable {
    private int new_hits_per_day;

    private java.util.Date go_live_date;

    private int in_queue;

    private int status;

    private com.omniture.www.Simple_report_suite[] report_suites;

    public Permanent_traffic() {
    }

    public Permanent_traffic(
           int new_hits_per_day,
           java.util.Date go_live_date,
           int in_queue,
           int status,
           com.omniture.www.Simple_report_suite[] report_suites) {
           this.new_hits_per_day = new_hits_per_day;
           this.go_live_date = go_live_date;
           this.in_queue = in_queue;
           this.status = status;
           this.report_suites = report_suites;
    }


    /**
     * Gets the new_hits_per_day value for this Permanent_traffic.
     * 
     * @return new_hits_per_day
     */
    public int getNew_hits_per_day() {
        return new_hits_per_day;
    }


    /**
     * Sets the new_hits_per_day value for this Permanent_traffic.
     * 
     * @param new_hits_per_day
     */
    public void setNew_hits_per_day(int new_hits_per_day) {
        this.new_hits_per_day = new_hits_per_day;
    }


    /**
     * Gets the go_live_date value for this Permanent_traffic.
     * 
     * @return go_live_date
     */
    public java.util.Date getGo_live_date() {
        return go_live_date;
    }


    /**
     * Sets the go_live_date value for this Permanent_traffic.
     * 
     * @param go_live_date
     */
    public void setGo_live_date(java.util.Date go_live_date) {
        this.go_live_date = go_live_date;
    }


    /**
     * Gets the in_queue value for this Permanent_traffic.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Permanent_traffic.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Permanent_traffic.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Permanent_traffic.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the report_suites value for this Permanent_traffic.
     * 
     * @return report_suites
     */
    public com.omniture.www.Simple_report_suite[] getReport_suites() {
        return report_suites;
    }


    /**
     * Sets the report_suites value for this Permanent_traffic.
     * 
     * @param report_suites
     */
    public void setReport_suites(com.omniture.www.Simple_report_suite[] report_suites) {
        this.report_suites = report_suites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permanent_traffic)) return false;
        Permanent_traffic other = (Permanent_traffic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.new_hits_per_day == other.getNew_hits_per_day() &&
            ((this.go_live_date==null && other.getGo_live_date()==null) || 
             (this.go_live_date!=null &&
              this.go_live_date.equals(other.getGo_live_date()))) &&
            this.in_queue == other.getIn_queue() &&
            this.status == other.getStatus() &&
            ((this.report_suites==null && other.getReport_suites()==null) || 
             (this.report_suites!=null &&
              java.util.Arrays.equals(this.report_suites, other.getReport_suites())));
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
        _hashCode += getNew_hits_per_day();
        if (getGo_live_date() != null) {
            _hashCode += getGo_live_date().hashCode();
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        if (getReport_suites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReport_suites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReport_suites(), i);
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
        new org.apache.axis.description.TypeDesc(Permanent_traffic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permanent_traffic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_hits_per_day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_hits_per_day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("go_live_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "go_live_date"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_suites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_suites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suite"));
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
