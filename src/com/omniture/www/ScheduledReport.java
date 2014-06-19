/**
 * ScheduledReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduledReport  implements java.io.Serializable {
    private com.omniture.www.ScheduleRecurrenceParameter scheduleRecurrenceParameter;

    private com.omniture.www.DeliveryParameters deliveryParameters;

    private int id;

    private java.lang.String reportSuiteID;

    private boolean isFailed;

    private com.omniture.www.ExcelWorkbook excelWorkbook;

    public ScheduledReport() {
    }

    public ScheduledReport(
           com.omniture.www.ScheduleRecurrenceParameter scheduleRecurrenceParameter,
           com.omniture.www.DeliveryParameters deliveryParameters,
           int id,
           java.lang.String reportSuiteID,
           boolean isFailed,
           com.omniture.www.ExcelWorkbook excelWorkbook) {
           this.scheduleRecurrenceParameter = scheduleRecurrenceParameter;
           this.deliveryParameters = deliveryParameters;
           this.id = id;
           this.reportSuiteID = reportSuiteID;
           this.isFailed = isFailed;
           this.excelWorkbook = excelWorkbook;
    }


    /**
     * Gets the scheduleRecurrenceParameter value for this ScheduledReport.
     * 
     * @return scheduleRecurrenceParameter
     */
    public com.omniture.www.ScheduleRecurrenceParameter getScheduleRecurrenceParameter() {
        return scheduleRecurrenceParameter;
    }


    /**
     * Sets the scheduleRecurrenceParameter value for this ScheduledReport.
     * 
     * @param scheduleRecurrenceParameter
     */
    public void setScheduleRecurrenceParameter(com.omniture.www.ScheduleRecurrenceParameter scheduleRecurrenceParameter) {
        this.scheduleRecurrenceParameter = scheduleRecurrenceParameter;
    }


    /**
     * Gets the deliveryParameters value for this ScheduledReport.
     * 
     * @return deliveryParameters
     */
    public com.omniture.www.DeliveryParameters getDeliveryParameters() {
        return deliveryParameters;
    }


    /**
     * Sets the deliveryParameters value for this ScheduledReport.
     * 
     * @param deliveryParameters
     */
    public void setDeliveryParameters(com.omniture.www.DeliveryParameters deliveryParameters) {
        this.deliveryParameters = deliveryParameters;
    }


    /**
     * Gets the id value for this ScheduledReport.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ScheduledReport.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the reportSuiteID value for this ScheduledReport.
     * 
     * @return reportSuiteID
     */
    public java.lang.String getReportSuiteID() {
        return reportSuiteID;
    }


    /**
     * Sets the reportSuiteID value for this ScheduledReport.
     * 
     * @param reportSuiteID
     */
    public void setReportSuiteID(java.lang.String reportSuiteID) {
        this.reportSuiteID = reportSuiteID;
    }


    /**
     * Gets the isFailed value for this ScheduledReport.
     * 
     * @return isFailed
     */
    public boolean isIsFailed() {
        return isFailed;
    }


    /**
     * Sets the isFailed value for this ScheduledReport.
     * 
     * @param isFailed
     */
    public void setIsFailed(boolean isFailed) {
        this.isFailed = isFailed;
    }


    /**
     * Gets the excelWorkbook value for this ScheduledReport.
     * 
     * @return excelWorkbook
     */
    public com.omniture.www.ExcelWorkbook getExcelWorkbook() {
        return excelWorkbook;
    }


    /**
     * Sets the excelWorkbook value for this ScheduledReport.
     * 
     * @param excelWorkbook
     */
    public void setExcelWorkbook(com.omniture.www.ExcelWorkbook excelWorkbook) {
        this.excelWorkbook = excelWorkbook;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledReport)) return false;
        ScheduledReport other = (ScheduledReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleRecurrenceParameter==null && other.getScheduleRecurrenceParameter()==null) || 
             (this.scheduleRecurrenceParameter!=null &&
              this.scheduleRecurrenceParameter.equals(other.getScheduleRecurrenceParameter()))) &&
            ((this.deliveryParameters==null && other.getDeliveryParameters()==null) || 
             (this.deliveryParameters!=null &&
              this.deliveryParameters.equals(other.getDeliveryParameters()))) &&
            this.id == other.getId() &&
            ((this.reportSuiteID==null && other.getReportSuiteID()==null) || 
             (this.reportSuiteID!=null &&
              this.reportSuiteID.equals(other.getReportSuiteID()))) &&
            this.isFailed == other.isIsFailed() &&
            ((this.excelWorkbook==null && other.getExcelWorkbook()==null) || 
             (this.excelWorkbook!=null &&
              this.excelWorkbook.equals(other.getExcelWorkbook())));
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
        if (getScheduleRecurrenceParameter() != null) {
            _hashCode += getScheduleRecurrenceParameter().hashCode();
        }
        if (getDeliveryParameters() != null) {
            _hashCode += getDeliveryParameters().hashCode();
        }
        _hashCode += getId();
        if (getReportSuiteID() != null) {
            _hashCode += getReportSuiteID().hashCode();
        }
        _hashCode += (isIsFailed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExcelWorkbook() != null) {
            _hashCode += getExcelWorkbook().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleRecurrenceParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleRecurrenceParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleRecurrenceParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "deliveryParameters"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportSuiteID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportSuiteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excelWorkbook");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excelWorkbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "excelWorkbook"));
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
