/**
 * Rollup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Rollup  implements java.io.Serializable {
    private java.lang.String rsid;

    private java.lang.String site_title;

    private com.omniture.www.Timezone_enum time_zone;

    private java.lang.String[] rollup_report_suites;

    public Rollup() {
    }

    public Rollup(
           java.lang.String rsid,
           java.lang.String site_title,
           com.omniture.www.Timezone_enum time_zone,
           java.lang.String[] rollup_report_suites) {
           this.rsid = rsid;
           this.site_title = site_title;
           this.time_zone = time_zone;
           this.rollup_report_suites = rollup_report_suites;
    }


    /**
     * Gets the rsid value for this Rollup.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Rollup.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the site_title value for this Rollup.
     * 
     * @return site_title
     */
    public java.lang.String getSite_title() {
        return site_title;
    }


    /**
     * Sets the site_title value for this Rollup.
     * 
     * @param site_title
     */
    public void setSite_title(java.lang.String site_title) {
        this.site_title = site_title;
    }


    /**
     * Gets the time_zone value for this Rollup.
     * 
     * @return time_zone
     */
    public com.omniture.www.Timezone_enum getTime_zone() {
        return time_zone;
    }


    /**
     * Sets the time_zone value for this Rollup.
     * 
     * @param time_zone
     */
    public void setTime_zone(com.omniture.www.Timezone_enum time_zone) {
        this.time_zone = time_zone;
    }


    /**
     * Gets the rollup_report_suites value for this Rollup.
     * 
     * @return rollup_report_suites
     */
    public java.lang.String[] getRollup_report_suites() {
        return rollup_report_suites;
    }


    /**
     * Sets the rollup_report_suites value for this Rollup.
     * 
     * @param rollup_report_suites
     */
    public void setRollup_report_suites(java.lang.String[] rollup_report_suites) {
        this.rollup_report_suites = rollup_report_suites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rollup)) return false;
        Rollup other = (Rollup) obj;
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
            ((this.time_zone==null && other.getTime_zone()==null) || 
             (this.time_zone!=null &&
              this.time_zone.equals(other.getTime_zone()))) &&
            ((this.rollup_report_suites==null && other.getRollup_report_suites()==null) || 
             (this.rollup_report_suites!=null &&
              java.util.Arrays.equals(this.rollup_report_suites, other.getRollup_report_suites())));
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
        if (getTime_zone() != null) {
            _hashCode += getTime_zone().hashCode();
        }
        if (getRollup_report_suites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRollup_report_suites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRollup_report_suites(), i);
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
        new org.apache.axis.description.TypeDesc(Rollup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "rollup"));
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
        elemField.setFieldName("time_zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "timezone_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollup_report_suites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rollup_report_suites"));
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
