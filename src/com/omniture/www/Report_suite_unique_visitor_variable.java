/**
 * Report_suite_unique_visitor_variable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report_suite_unique_visitor_variable  implements java.io.Serializable {
    private java.lang.String rsid;

    private java.lang.String site_title;

    private com.omniture.www.Unique_visitor_variable[] unique_visitor_variable;

    public Report_suite_unique_visitor_variable() {
    }

    public Report_suite_unique_visitor_variable(
           java.lang.String rsid,
           java.lang.String site_title,
           com.omniture.www.Unique_visitor_variable[] unique_visitor_variable) {
           this.rsid = rsid;
           this.site_title = site_title;
           this.unique_visitor_variable = unique_visitor_variable;
    }


    /**
     * Gets the rsid value for this Report_suite_unique_visitor_variable.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Report_suite_unique_visitor_variable.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the site_title value for this Report_suite_unique_visitor_variable.
     * 
     * @return site_title
     */
    public java.lang.String getSite_title() {
        return site_title;
    }


    /**
     * Sets the site_title value for this Report_suite_unique_visitor_variable.
     * 
     * @param site_title
     */
    public void setSite_title(java.lang.String site_title) {
        this.site_title = site_title;
    }


    /**
     * Gets the unique_visitor_variable value for this Report_suite_unique_visitor_variable.
     * 
     * @return unique_visitor_variable
     */
    public com.omniture.www.Unique_visitor_variable[] getUnique_visitor_variable() {
        return unique_visitor_variable;
    }


    /**
     * Sets the unique_visitor_variable value for this Report_suite_unique_visitor_variable.
     * 
     * @param unique_visitor_variable
     */
    public void setUnique_visitor_variable(com.omniture.www.Unique_visitor_variable[] unique_visitor_variable) {
        this.unique_visitor_variable = unique_visitor_variable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_suite_unique_visitor_variable)) return false;
        Report_suite_unique_visitor_variable other = (Report_suite_unique_visitor_variable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsid==null && other.getRsid()==null) || 
             (this.rsid!=null &&
              this.rsid.equals(other.getRsid()))) &&
            ((this.site_title==null && other.getSite_title()==null) || 
             (this.site_title!=null &&
              this.site_title.equals(other.getSite_title()))) &&
            ((this.unique_visitor_variable==null && other.getUnique_visitor_variable()==null) || 
             (this.unique_visitor_variable!=null &&
              java.util.Arrays.equals(this.unique_visitor_variable, other.getUnique_visitor_variable())));
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
        if (getRsid() != null) {
            _hashCode += getRsid().hashCode();
        }
        if (getSite_title() != null) {
            _hashCode += getSite_title().hashCode();
        }
        if (getUnique_visitor_variable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnique_visitor_variable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnique_visitor_variable(), i);
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
        new org.apache.axis.description.TypeDesc(Report_suite_unique_visitor_variable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_unique_visitor_variable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site_title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_visitor_variable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unique_visitor_variable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "unique_visitor_variable"));
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
