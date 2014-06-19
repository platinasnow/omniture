/**
 * ScheduleLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleLog  implements java.io.Serializable {
    private java.lang.String reportName;

    private com.omniture.www.ScheduleDeliveryType deliveryType;

    private com.omniture.www.DeliveryParameters deliveryParameters;

    private java.util.Calendar dateSent;

    private java.lang.String status;

    private java.lang.String filename;

    private java.lang.String subject;

    public ScheduleLog() {
    }

    public ScheduleLog(
           java.lang.String reportName,
           com.omniture.www.ScheduleDeliveryType deliveryType,
           com.omniture.www.DeliveryParameters deliveryParameters,
           java.util.Calendar dateSent,
           java.lang.String status,
           java.lang.String filename,
           java.lang.String subject) {
           this.reportName = reportName;
           this.deliveryType = deliveryType;
           this.deliveryParameters = deliveryParameters;
           this.dateSent = dateSent;
           this.status = status;
           this.filename = filename;
           this.subject = subject;
    }


    /**
     * Gets the reportName value for this ScheduleLog.
     * 
     * @return reportName
     */
    public java.lang.String getReportName() {
        return reportName;
    }


    /**
     * Sets the reportName value for this ScheduleLog.
     * 
     * @param reportName
     */
    public void setReportName(java.lang.String reportName) {
        this.reportName = reportName;
    }


    /**
     * Gets the deliveryType value for this ScheduleLog.
     * 
     * @return deliveryType
     */
    public com.omniture.www.ScheduleDeliveryType getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this ScheduleLog.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(com.omniture.www.ScheduleDeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the deliveryParameters value for this ScheduleLog.
     * 
     * @return deliveryParameters
     */
    public com.omniture.www.DeliveryParameters getDeliveryParameters() {
        return deliveryParameters;
    }


    /**
     * Sets the deliveryParameters value for this ScheduleLog.
     * 
     * @param deliveryParameters
     */
    public void setDeliveryParameters(com.omniture.www.DeliveryParameters deliveryParameters) {
        this.deliveryParameters = deliveryParameters;
    }


    /**
     * Gets the dateSent value for this ScheduleLog.
     * 
     * @return dateSent
     */
    public java.util.Calendar getDateSent() {
        return dateSent;
    }


    /**
     * Sets the dateSent value for this ScheduleLog.
     * 
     * @param dateSent
     */
    public void setDateSent(java.util.Calendar dateSent) {
        this.dateSent = dateSent;
    }


    /**
     * Gets the status value for this ScheduleLog.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ScheduleLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the filename value for this ScheduleLog.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this ScheduleLog.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the subject value for this ScheduleLog.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ScheduleLog.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleLog)) return false;
        ScheduleLog other = (ScheduleLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportName==null && other.getReportName()==null) || 
             (this.reportName!=null &&
              this.reportName.equals(other.getReportName()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.deliveryParameters==null && other.getDeliveryParameters()==null) || 
             (this.deliveryParameters!=null &&
              this.deliveryParameters.equals(other.getDeliveryParameters()))) &&
            ((this.dateSent==null && other.getDateSent()==null) || 
             (this.dateSent!=null &&
              this.dateSent.equals(other.getDateSent()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject())));
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
        if (getReportName() != null) {
            _hashCode += getReportName().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getDeliveryParameters() != null) {
            _hashCode += getDeliveryParameters().hashCode();
        }
        if (getDateSent() != null) {
            _hashCode += getDateSent().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleDeliveryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "deliveryParameters"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
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
