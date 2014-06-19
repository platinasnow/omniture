/**
 * ReportDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDescription  implements java.io.Serializable {
    private java.lang.String reportSuiteID;

    private java.lang.String date;

    private java.lang.String dateFrom;

    private java.lang.String dateTo;

    private com.omniture.www.ReportDefinitionDateGranularity dateGranularity;

    private com.omniture.www.ReportDefinitionMetric[] metrics;

    private java.lang.String sortBy;

    private com.omniture.www.ReportDefinitionElement[] elements;

    private com.omniture.www.ReportDefinitionLocale locale;
    
    private java.lang.String segment_id;

    public ReportDescription() {
    }

    public ReportDescription(
           java.lang.String reportSuiteID,
           java.lang.String date,
           java.lang.String dateFrom,
           java.lang.String dateTo,
           com.omniture.www.ReportDefinitionDateGranularity dateGranularity,
           com.omniture.www.ReportDefinitionMetric[] metrics,
           java.lang.String sortBy,
           com.omniture.www.ReportDefinitionElement[] elements,
           com.omniture.www.ReportDefinitionLocale locale,
           java.lang.String segment_id) {
           this.reportSuiteID = reportSuiteID;
           this.date = date;
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.dateGranularity = dateGranularity;
           this.metrics = metrics;
           this.sortBy = sortBy;
           this.elements = elements;
           this.locale = locale;
           this.segment_id = segment_id;
    }


    /**
     * Gets the reportSuiteID value for this ReportDescription.
     * 
     * @return reportSuiteID
     */
    public java.lang.String getReportSuiteID() {
        return reportSuiteID;
    }


    /**
     * Sets the reportSuiteID value for this ReportDescription.
     * 
     * @param reportSuiteID
     */
    public void setReportSuiteID(java.lang.String reportSuiteID) {
        this.reportSuiteID = reportSuiteID;
    }


    /**
     * Gets the date value for this ReportDescription.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this ReportDescription.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the dateFrom value for this ReportDescription.
     * 
     * @return dateFrom
     */
    public java.lang.String getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this ReportDescription.
     * 
     * @param dateFrom
     */
    public void setDateFrom(java.lang.String dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this ReportDescription.
     * 
     * @return dateTo
     */
    public java.lang.String getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this ReportDescription.
     * 
     * @param dateTo
     */
    public void setDateTo(java.lang.String dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the dateGranularity value for this ReportDescription.
     * 
     * @return dateGranularity
     */
    public com.omniture.www.ReportDefinitionDateGranularity getDateGranularity() {
        return dateGranularity;
    }


    /**
     * Sets the dateGranularity value for this ReportDescription.
     * 
     * @param dateGranularity
     */
    public void setDateGranularity(com.omniture.www.ReportDefinitionDateGranularity dateGranularity) {
        this.dateGranularity = dateGranularity;
    }


    /**
     * Gets the metrics value for this ReportDescription.
     * 
     * @return metrics
     */
    public com.omniture.www.ReportDefinitionMetric[] getMetrics() {
        return metrics;
    }


    /**
     * Sets the metrics value for this ReportDescription.
     * 
     * @param metrics
     */
    public void setMetrics(com.omniture.www.ReportDefinitionMetric[] metrics) {
        this.metrics = metrics;
    }


    /**
     * Gets the sortBy value for this ReportDescription.
     * 
     * @return sortBy
     */
    public java.lang.String getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this ReportDescription.
     * 
     * @param sortBy
     */
    public void setSortBy(java.lang.String sortBy) {
        this.sortBy = sortBy;
    }


    /**
     * Gets the elements value for this ReportDescription.
     * 
     * @return elements
     */
    public com.omniture.www.ReportDefinitionElement[] getElements() {
        return elements;
    }


    /**
     * Sets the elements value for this ReportDescription.
     * 
     * @param elements
     */
    public void setElements(com.omniture.www.ReportDefinitionElement[] elements) {
        this.elements = elements;
    }


    /**
     * Gets the locale value for this ReportDescription.
     * 
     * @return locale
     */
    public com.omniture.www.ReportDefinitionLocale getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ReportDescription.
     * 
     * @param locale
     */
    public void setLocale(com.omniture.www.ReportDefinitionLocale locale) {
        this.locale = locale;
    }
    
    public java.lang.String getSegment_id() {
		return segment_id;
	}

	public void setSegment_id(java.lang.String segment_id) {
		this.segment_id = segment_id;
	}

	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDescription)) return false;
        ReportDescription other = (ReportDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportSuiteID==null && other.getReportSuiteID()==null) || 
             (this.reportSuiteID!=null &&
              this.reportSuiteID.equals(other.getReportSuiteID()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            ((this.dateGranularity==null && other.getDateGranularity()==null) || 
             (this.dateGranularity!=null &&
              this.dateGranularity.equals(other.getDateGranularity()))) &&
            ((this.metrics==null && other.getMetrics()==null) || 
             (this.metrics!=null &&
              java.util.Arrays.equals(this.metrics, other.getMetrics()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy()))) &&
            ((this.elements==null && other.getElements()==null) || 
             (this.elements!=null &&
              java.util.Arrays.equals(this.elements, other.getElements()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
			((this.segment_id==null && other.getSegment_id()==null) || 
			(this.segment_id!=null &&
			this.segment_id.equals(other.getSegment_id())));
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
        if (getReportSuiteID() != null) {
            _hashCode += getReportSuiteID().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        if (getDateGranularity() != null) {
            _hashCode += getDateGranularity().hashCode();
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
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getSegment_id() != null) {
            _hashCode += getSegment_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportSuiteID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportSuiteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateGranularity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateGranularity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionDateGranularity"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metrics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metrics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionMetric"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionLocale"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegment_id"));
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
