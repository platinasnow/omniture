/**
 * Report_status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report_status  implements java.io.Serializable {
    private java.lang.String report_type;

    private int result_size;

    private java.lang.String queue_time;

    private java.lang.String status;

    private java.lang.String error_code;

    private java.lang.String error_msg;

    public Report_status() {
    }

    public Report_status(
           java.lang.String report_type,
           int result_size,
           java.lang.String queue_time,
           java.lang.String status,
           java.lang.String error_code,
           java.lang.String error_msg) {
           this.report_type = report_type;
           this.result_size = result_size;
           this.queue_time = queue_time;
           this.status = status;
           this.error_code = error_code;
           this.error_msg = error_msg;
    }


    /**
     * Gets the report_type value for this Report_status.
     * 
     * @return report_type
     */
    public java.lang.String getReport_type() {
        return report_type;
    }


    /**
     * Sets the report_type value for this Report_status.
     * 
     * @param report_type
     */
    public void setReport_type(java.lang.String report_type) {
        this.report_type = report_type;
    }


    /**
     * Gets the result_size value for this Report_status.
     * 
     * @return result_size
     */
    public int getResult_size() {
        return result_size;
    }


    /**
     * Sets the result_size value for this Report_status.
     * 
     * @param result_size
     */
    public void setResult_size(int result_size) {
        this.result_size = result_size;
    }


    /**
     * Gets the queue_time value for this Report_status.
     * 
     * @return queue_time
     */
    public java.lang.String getQueue_time() {
        return queue_time;
    }


    /**
     * Sets the queue_time value for this Report_status.
     * 
     * @param queue_time
     */
    public void setQueue_time(java.lang.String queue_time) {
        this.queue_time = queue_time;
    }


    /**
     * Gets the status value for this Report_status.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_status.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the error_code value for this Report_status.
     * 
     * @return error_code
     */
    public java.lang.String getError_code() {
        return error_code;
    }


    /**
     * Sets the error_code value for this Report_status.
     * 
     * @param error_code
     */
    public void setError_code(java.lang.String error_code) {
        this.error_code = error_code;
    }


    /**
     * Gets the error_msg value for this Report_status.
     * 
     * @return error_msg
     */
    public java.lang.String getError_msg() {
        return error_msg;
    }


    /**
     * Sets the error_msg value for this Report_status.
     * 
     * @param error_msg
     */
    public void setError_msg(java.lang.String error_msg) {
        this.error_msg = error_msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_status)) return false;
        Report_status other = (Report_status) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.report_type==null && other.getReport_type()==null) || 
             (this.report_type!=null &&
              this.report_type.equals(other.getReport_type()))) &&
            this.result_size == other.getResult_size() &&
            ((this.queue_time==null && other.getQueue_time()==null) || 
             (this.queue_time!=null &&
              this.queue_time.equals(other.getQueue_time()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.error_code==null && other.getError_code()==null) || 
             (this.error_code!=null &&
              this.error_code.equals(other.getError_code()))) &&
            ((this.error_msg==null && other.getError_msg()==null) || 
             (this.error_msg!=null &&
              this.error_msg.equals(other.getError_msg())));
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
        if (getReport_type() != null) {
            _hashCode += getReport_type().hashCode();
        }
        _hashCode += getResult_size();
        if (getQueue_time() != null) {
            _hashCode += getQueue_time().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getError_code() != null) {
            _hashCode += getError_code().hashCode();
        }
        if (getError_msg() != null) {
            _hashCode += getError_msg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_status.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_status"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result_size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queue_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error_msg"));
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
