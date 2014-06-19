/**
 * ReportDefinitionLocale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionLocale implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportDefinitionLocale(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _en_US = "en_US";
    public static final java.lang.String _de_DE = "de_DE";
    public static final java.lang.String _es_ES = "es_ES";
    public static final java.lang.String _fr_FR = "fr_FR";
    public static final java.lang.String _jp_JP = "jp_JP";
    public static final java.lang.String _ko_KR = "ko_KR";
    public static final java.lang.String _zh_CN = "zh_CN";
    public static final java.lang.String _zh_TW = "zh_TW";
    public static final ReportDefinitionLocale en_US = new ReportDefinitionLocale(_en_US);
    public static final ReportDefinitionLocale de_DE = new ReportDefinitionLocale(_de_DE);
    public static final ReportDefinitionLocale es_ES = new ReportDefinitionLocale(_es_ES);
    public static final ReportDefinitionLocale fr_FR = new ReportDefinitionLocale(_fr_FR);
    public static final ReportDefinitionLocale jp_JP = new ReportDefinitionLocale(_jp_JP);
    public static final ReportDefinitionLocale ko_KR = new ReportDefinitionLocale(_ko_KR);
    public static final ReportDefinitionLocale zh_CN = new ReportDefinitionLocale(_zh_CN);
    public static final ReportDefinitionLocale zh_TW = new ReportDefinitionLocale(_zh_TW);
    public java.lang.String getValue() { return _value_;}
    public static ReportDefinitionLocale fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportDefinitionLocale enumeration = (ReportDefinitionLocale)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportDefinitionLocale fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDefinitionLocale.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionLocale"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
