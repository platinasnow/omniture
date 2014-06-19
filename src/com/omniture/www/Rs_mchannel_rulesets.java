/**
 * Rs_mchannel_rulesets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Rs_mchannel_rulesets  implements java.io.Serializable {
    private java.lang.String rsid;

    private com.omniture.www.Mchannel_ruleset[] rulesets;

    public Rs_mchannel_rulesets() {
    }

    public Rs_mchannel_rulesets(
           java.lang.String rsid,
           com.omniture.www.Mchannel_ruleset[] rulesets) {
           this.rsid = rsid;
           this.rulesets = rulesets;
    }


    /**
     * Gets the rsid value for this Rs_mchannel_rulesets.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Rs_mchannel_rulesets.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the rulesets value for this Rs_mchannel_rulesets.
     * 
     * @return rulesets
     */
    public com.omniture.www.Mchannel_ruleset[] getRulesets() {
        return rulesets;
    }


    /**
     * Sets the rulesets value for this Rs_mchannel_rulesets.
     * 
     * @param rulesets
     */
    public void setRulesets(com.omniture.www.Mchannel_ruleset[] rulesets) {
        this.rulesets = rulesets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_mchannel_rulesets)) return false;
        Rs_mchannel_rulesets other = (Rs_mchannel_rulesets) obj;
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
            ((this.rulesets==null && other.getRulesets()==null) || 
             (this.rulesets!=null &&
              java.util.Arrays.equals(this.rulesets, other.getRulesets())));
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
        if (getRulesets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRulesets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRulesets(), i);
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
        new org.apache.axis.description.TypeDesc(Rs_mchannel_rulesets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "rs_mchannel_rulesets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rulesets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rulesets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_ruleset"));
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
