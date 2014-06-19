/**
 * ReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportResponse  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String statusMsg;

    private com.omniture.www.Report report;

    public ReportResponse() {
    }

    public ReportResponse(
           java.lang.String status,
           java.lang.String statusMsg,
           com.omniture.www.Report report) {
           this.status = status;
           this.statusMsg = statusMsg;
           this.report = report;
    }


    /**
     * Gets the status value for this ReportResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReportResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusMsg value for this ReportResponse.
     * 
     * @return statusMsg
     */
    public java.lang.String getStatusMsg() {
        return statusMsg;
    }


    /**
     * Sets the statusMsg value for this ReportResponse.
     * 
     * @param statusMsg
     */
    public void setStatusMsg(java.lang.String statusMsg) {
        this.statusMsg = statusMsg;
    }


    /**
     * Gets the report value for this ReportResponse.
     * 
     * @return report
     */
    public com.omniture.www.Report getReport() {
        return report;
    }


    /**
     * Sets the report value for this ReportResponse.
     * 
     * @param report
     */
    public void setReport(com.omniture.www.Report report) {
        this.report = report;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportResponse)) return false;
        ReportResponse other = (ReportResponse) obj;
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
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport())));
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
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportResponse"));
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
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report"));
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
