/**
 * Simple_report_suites_rval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Simple_report_suites_rval  implements java.io.Serializable {
    private com.omniture.www.Simple_report_suite[] report_suites;

    public Simple_report_suites_rval() {
    }

    public Simple_report_suites_rval(
           com.omniture.www.Simple_report_suite[] report_suites) {
           this.report_suites = report_suites;
    }


    /**
     * Gets the report_suites value for this Simple_report_suites_rval.
     * 
     * @return report_suites
     */
    public com.omniture.www.Simple_report_suite[] getReport_suites() {
        return report_suites;
    }


    /**
     * Sets the report_suites value for this Simple_report_suites_rval.
     * 
     * @param report_suites
     */
    public void setReport_suites(com.omniture.www.Simple_report_suite[] report_suites) {
        this.report_suites = report_suites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Simple_report_suites_rval)) return false;
        Simple_report_suites_rval other = (Simple_report_suites_rval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(Simple_report_suites_rval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suites_rval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
