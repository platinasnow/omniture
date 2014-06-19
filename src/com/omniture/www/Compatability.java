/**
 * Compatability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Compatability  implements java.io.Serializable {
    private int relation_id;

    private java.lang.String relation_name;

    private java.lang.String report_suite;

    private java.lang.String site_title;

    private long compatability_hash;

    public Compatability() {
    }

    public Compatability(
           int relation_id,
           java.lang.String relation_name,
           java.lang.String report_suite,
           java.lang.String site_title,
           long compatability_hash) {
           this.relation_id = relation_id;
           this.relation_name = relation_name;
           this.report_suite = report_suite;
           this.site_title = site_title;
           this.compatability_hash = compatability_hash;
    }


    /**
     * Gets the relation_id value for this Compatability.
     * 
     * @return relation_id
     */
    public int getRelation_id() {
        return relation_id;
    }


    /**
     * Sets the relation_id value for this Compatability.
     * 
     * @param relation_id
     */
    public void setRelation_id(int relation_id) {
        this.relation_id = relation_id;
    }


    /**
     * Gets the relation_name value for this Compatability.
     * 
     * @return relation_name
     */
    public java.lang.String getRelation_name() {
        return relation_name;
    }


    /**
     * Sets the relation_name value for this Compatability.
     * 
     * @param relation_name
     */
    public void setRelation_name(java.lang.String relation_name) {
        this.relation_name = relation_name;
    }


    /**
     * Gets the report_suite value for this Compatability.
     * 
     * @return report_suite
     */
    public java.lang.String getReport_suite() {
        return report_suite;
    }


    /**
     * Sets the report_suite value for this Compatability.
     * 
     * @param report_suite
     */
    public void setReport_suite(java.lang.String report_suite) {
        this.report_suite = report_suite;
    }


    /**
     * Gets the site_title value for this Compatability.
     * 
     * @return site_title
     */
    public java.lang.String getSite_title() {
        return site_title;
    }


    /**
     * Sets the site_title value for this Compatability.
     * 
     * @param site_title
     */
    public void setSite_title(java.lang.String site_title) {
        this.site_title = site_title;
    }


    /**
     * Gets the compatability_hash value for this Compatability.
     * 
     * @return compatability_hash
     */
    public long getCompatability_hash() {
        return compatability_hash;
    }


    /**
     * Sets the compatability_hash value for this Compatability.
     * 
     * @param compatability_hash
     */
    public void setCompatability_hash(long compatability_hash) {
        this.compatability_hash = compatability_hash;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Compatability)) return false;
        Compatability other = (Compatability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.relation_id == other.getRelation_id() &&
            ((this.relation_name==null && other.getRelation_name()==null) || 
             (this.relation_name!=null &&
              this.relation_name.equals(other.getRelation_name()))) &&
            ((this.report_suite==null && other.getReport_suite()==null) || 
             (this.report_suite!=null &&
              this.report_suite.equals(other.getReport_suite()))) &&
            ((this.site_title==null && other.getSite_title()==null) || 
             (this.site_title!=null &&
              this.site_title.equals(other.getSite_title()))) &&
            this.compatability_hash == other.getCompatability_hash();
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
        _hashCode += getRelation_id();
        if (getRelation_name() != null) {
            _hashCode += getRelation_name().hashCode();
        }
        if (getReport_suite() != null) {
            _hashCode += getReport_suite().hashCode();
        }
        if (getSite_title() != null) {
            _hashCode += getSite_title().hashCode();
        }
        _hashCode += new Long(getCompatability_hash()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Compatability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "compatability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_suite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_suite"));
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
        elemField.setFieldName("compatability_hash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compatability_hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
