/**
 * ReportData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String url;

    private int year;

    private int month;

    private int day;

    private int hour;

    private double[] counts;

    private double[] breakdown_total;

    private com.omniture.www.ReportData[] breakdown;

    public ReportData() {
    }

    public ReportData(
           java.lang.String name,
           java.lang.String url,
           int year,
           int month,
           int day,
           int hour,
           double[] counts,
           double[] breakdown_total,
           com.omniture.www.ReportData[] breakdown) {
           this.name = name;
           this.url = url;
           this.year = year;
           this.month = month;
           this.day = day;
           this.hour = hour;
           this.counts = counts;
           this.breakdown_total = breakdown_total;
           this.breakdown = breakdown;
    }


    /**
     * Gets the name value for this ReportData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ReportData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this ReportData.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ReportData.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the year value for this ReportData.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this ReportData.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the month value for this ReportData.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this ReportData.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the day value for this ReportData.
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this ReportData.
     * 
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this ReportData.
     * 
     * @return hour
     */
    public int getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this ReportData.
     * 
     * @param hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }


    /**
     * Gets the counts value for this ReportData.
     * 
     * @return counts
     */
    public double[] getCounts() {
        return counts;
    }


    /**
     * Sets the counts value for this ReportData.
     * 
     * @param counts
     */
    public void setCounts(double[] counts) {
        this.counts = counts;
    }


    /**
     * Gets the breakdown_total value for this ReportData.
     * 
     * @return breakdown_total
     */
    public double[] getBreakdown_total() {
        return breakdown_total;
    }


    /**
     * Sets the breakdown_total value for this ReportData.
     * 
     * @param breakdown_total
     */
    public void setBreakdown_total(double[] breakdown_total) {
        this.breakdown_total = breakdown_total;
    }


    /**
     * Gets the breakdown value for this ReportData.
     * 
     * @return breakdown
     */
    public com.omniture.www.ReportData[] getBreakdown() {
        return breakdown;
    }


    /**
     * Sets the breakdown value for this ReportData.
     * 
     * @param breakdown
     */
    public void setBreakdown(com.omniture.www.ReportData[] breakdown) {
        this.breakdown = breakdown;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportData)) return false;
        ReportData other = (ReportData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            this.year == other.getYear() &&
            this.month == other.getMonth() &&
            this.day == other.getDay() &&
            this.hour == other.getHour() &&
            ((this.counts==null && other.getCounts()==null) || 
             (this.counts!=null &&
              java.util.Arrays.equals(this.counts, other.getCounts()))) &&
            ((this.breakdown_total==null && other.getBreakdown_total()==null) || 
             (this.breakdown_total!=null &&
              java.util.Arrays.equals(this.breakdown_total, other.getBreakdown_total()))) &&
            ((this.breakdown==null && other.getBreakdown()==null) || 
             (this.breakdown!=null &&
              java.util.Arrays.equals(this.breakdown, other.getBreakdown())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += getYear();
        _hashCode += getMonth();
        _hashCode += getDay();
        _hashCode += getHour();
        if (getCounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBreakdown_total() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBreakdown_total());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBreakdown_total(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBreakdown() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBreakdown());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBreakdown(), i);
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
        new org.apache.axis.description.TypeDesc(ReportData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakdown_total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "breakdown_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakdown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "breakdown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportData"));
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
