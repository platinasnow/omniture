/**
 * Report.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report  implements java.io.Serializable {
    private com.omniture.www.ReportReportSuite reportSuite;

    private java.lang.String period;

    private com.omniture.www.ReportElement[] elements;

    private com.omniture.www.ReportMetric[] metrics;

    private com.omniture.www.ReportType type;

    private com.omniture.www.ReportData[] data;

    private double[] totals;

    public Report() {
    }

    public Report(
           com.omniture.www.ReportReportSuite reportSuite,
           java.lang.String period,
           com.omniture.www.ReportElement[] elements,
           com.omniture.www.ReportMetric[] metrics,
           com.omniture.www.ReportType type,
           com.omniture.www.ReportData[] data,
           double[] totals) {
           this.reportSuite = reportSuite;
           this.period = period;
           this.elements = elements;
           this.metrics = metrics;
           this.type = type;
           this.data = data;
           this.totals = totals;
    }


    /**
     * Gets the reportSuite value for this Report.
     * 
     * @return reportSuite
     */
    public com.omniture.www.ReportReportSuite getReportSuite() {
        return reportSuite;
    }


    /**
     * Sets the reportSuite value for this Report.
     * 
     * @param reportSuite
     */
    public void setReportSuite(com.omniture.www.ReportReportSuite reportSuite) {
        this.reportSuite = reportSuite;
    }


    /**
     * Gets the period value for this Report.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this Report.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }


    /**
     * Gets the elements value for this Report.
     * 
     * @return elements
     */
    public com.omniture.www.ReportElement[] getElements() {
        return elements;
    }


    /**
     * Sets the elements value for this Report.
     * 
     * @param elements
     */
    public void setElements(com.omniture.www.ReportElement[] elements) {
        this.elements = elements;
    }


    /**
     * Gets the metrics value for this Report.
     * 
     * @return metrics
     */
    public com.omniture.www.ReportMetric[] getMetrics() {
        return metrics;
    }


    /**
     * Sets the metrics value for this Report.
     * 
     * @param metrics
     */
    public void setMetrics(com.omniture.www.ReportMetric[] metrics) {
        this.metrics = metrics;
    }


    /**
     * Gets the type value for this Report.
     * 
     * @return type
     */
    public com.omniture.www.ReportType getType() {
        return type;
    }


    /**
     * Sets the type value for this Report.
     * 
     * @param type
     */
    public void setType(com.omniture.www.ReportType type) {
        this.type = type;
    }


    /**
     * Gets the data value for this Report.
     * 
     * @return data
     */
    public com.omniture.www.ReportData[] getData() {
        return data;
    }


    /**
     * Sets the data value for this Report.
     * 
     * @param data
     */
    public void setData(com.omniture.www.ReportData[] data) {
        this.data = data;
    }


    /**
     * Gets the totals value for this Report.
     * 
     * @return totals
     */
    public double[] getTotals() {
        return totals;
    }


    /**
     * Sets the totals value for this Report.
     * 
     * @param totals
     */
    public void setTotals(double[] totals) {
        this.totals = totals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report)) return false;
        Report other = (Report) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportSuite==null && other.getReportSuite()==null) || 
             (this.reportSuite!=null &&
              this.reportSuite.equals(other.getReportSuite()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.elements==null && other.getElements()==null) || 
             (this.elements!=null &&
              java.util.Arrays.equals(this.elements, other.getElements()))) &&
            ((this.metrics==null && other.getMetrics()==null) || 
             (this.metrics!=null &&
              java.util.Arrays.equals(this.metrics, other.getMetrics()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.totals==null && other.getTotals()==null) || 
             (this.totals!=null &&
              java.util.Arrays.equals(this.totals, other.getTotals())));
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
        if (getReportSuite() != null) {
            _hashCode += getReportSuite().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetrics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetrics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetrics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotals(), i);
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
        new org.apache.axis.description.TypeDesc(Report.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportSuite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportSuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportReportSuite"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportElement"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metrics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metrics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportMetric"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
