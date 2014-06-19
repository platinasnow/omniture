/**
 * Report_suite_ip_obfuscation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report_suite_ip_obfuscation  implements java.io.Serializable {
    private java.lang.String rsid;

    private java.lang.String site_title;

    private com.omniture.www.Ip_obfuscation[] ip_obfuscation;

    public Report_suite_ip_obfuscation() {
    }

    public Report_suite_ip_obfuscation(
           java.lang.String rsid,
           java.lang.String site_title,
           com.omniture.www.Ip_obfuscation[] ip_obfuscation) {
           this.rsid = rsid;
           this.site_title = site_title;
           this.ip_obfuscation = ip_obfuscation;
    }


    /**
     * Gets the rsid value for this Report_suite_ip_obfuscation.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Report_suite_ip_obfuscation.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the site_title value for this Report_suite_ip_obfuscation.
     * 
     * @return site_title
     */
    public java.lang.String getSite_title() {
        return site_title;
    }


    /**
     * Sets the site_title value for this Report_suite_ip_obfuscation.
     * 
     * @param site_title
     */
    public void setSite_title(java.lang.String site_title) {
        this.site_title = site_title;
    }


    /**
     * Gets the ip_obfuscation value for this Report_suite_ip_obfuscation.
     * 
     * @return ip_obfuscation
     */
    public com.omniture.www.Ip_obfuscation[] getIp_obfuscation() {
        return ip_obfuscation;
    }


    /**
     * Sets the ip_obfuscation value for this Report_suite_ip_obfuscation.
     * 
     * @param ip_obfuscation
     */
    public void setIp_obfuscation(com.omniture.www.Ip_obfuscation[] ip_obfuscation) {
        this.ip_obfuscation = ip_obfuscation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_suite_ip_obfuscation)) return false;
        Report_suite_ip_obfuscation other = (Report_suite_ip_obfuscation) obj;
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
            ((this.ip_obfuscation==null && other.getIp_obfuscation()==null) || 
             (this.ip_obfuscation!=null &&
              java.util.Arrays.equals(this.ip_obfuscation, other.getIp_obfuscation())));
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
        if (getIp_obfuscation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIp_obfuscation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIp_obfuscation(), i);
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
        new org.apache.axis.description.TypeDesc(Report_suite_ip_obfuscation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ip_obfuscation"));
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
        elemField.setFieldName("ip_obfuscation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_obfuscation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ip_obfuscation"));
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
