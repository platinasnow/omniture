/**
 * ReportDefinitionSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionSearch  implements java.io.Serializable {
    private com.omniture.www.ReportDefinitionSearchType type;

    private java.lang.String[] keywords;

    private com.omniture.www.ReportDefinitionSearch[] searches;

    public ReportDefinitionSearch() {
    }

    public ReportDefinitionSearch(
           com.omniture.www.ReportDefinitionSearchType type,
           java.lang.String[] keywords,
           com.omniture.www.ReportDefinitionSearch[] searches) {
           this.type = type;
           this.keywords = keywords;
           this.searches = searches;
    }


    /**
     * Gets the type value for this ReportDefinitionSearch.
     * 
     * @return type
     */
    public com.omniture.www.ReportDefinitionSearchType getType() {
        return type;
    }


    /**
     * Sets the type value for this ReportDefinitionSearch.
     * 
     * @param type
     */
    public void setType(com.omniture.www.ReportDefinitionSearchType type) {
        this.type = type;
    }


    /**
     * Gets the keywords value for this ReportDefinitionSearch.
     * 
     * @return keywords
     */
    public java.lang.String[] getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this ReportDefinitionSearch.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String[] keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the searches value for this ReportDefinitionSearch.
     * 
     * @return searches
     */
    public com.omniture.www.ReportDefinitionSearch[] getSearches() {
        return searches;
    }


    /**
     * Sets the searches value for this ReportDefinitionSearch.
     * 
     * @param searches
     */
    public void setSearches(com.omniture.www.ReportDefinitionSearch[] searches) {
        this.searches = searches;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionSearch)) return false;
        ReportDefinitionSearch other = (ReportDefinitionSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.searches==null && other.getSearches()==null) || 
             (this.searches!=null &&
              java.util.Arrays.equals(this.searches, other.getSearches())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearches(), i);
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearchType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searches");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearch"));
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
