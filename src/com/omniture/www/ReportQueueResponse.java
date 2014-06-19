/**
 * ReportQueueResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportQueueResponse  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String statusMsg;

    private int reportID;

    public ReportQueueResponse() {
    }

    public ReportQueueResponse(
           java.lang.String status,
           java.lang.String statusMsg,
           int reportID) {
           this.status = status;
           this.statusMsg = statusMsg;
           this.reportID = reportID;
    }


    /**
     * Gets the status value for this ReportQueueResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReportQueueResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusMsg value for this ReportQueueResponse.
     * 
     * @return statusMsg
     */
    public java.lang.String getStatusMsg() {
        return statusMsg;
    }


    /**
     * Sets the statusMsg value for this ReportQueueResponse.
     * 
     * @param statusMsg
     */
    public void setStatusMsg(java.lang.String statusMsg) {
        this.statusMsg = statusMsg;
    }


    /**
     * Gets the reportID value for this ReportQueueResponse.
     * 
     * @return reportID
     */
    public int getReportID() {
        return reportID;
    }


    /**
     * Sets the reportID value for this ReportQueueResponse.
     * 
     * @param reportID
     */
    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportQueueResponse)) return false;
        ReportQueueResponse other = (ReportQueueResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusMsg==null && other.getStatusMsg()==null) || 
             (this.statusMsg!=null &&
              this.statusMsg.equals(other.getStatusMsg()))) &&
            this.reportID == other.getReportID();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusMsg() != null) {
            _hashCode += getStatusMsg().hashCode();
        }
        _hashCode += getReportID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportQueueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportID"));
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
