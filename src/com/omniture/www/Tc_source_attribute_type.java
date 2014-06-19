/**
 * Tc_source_attribute_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Tc_source_attribute_type implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Tc_source_attribute_type(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Campaign = "Campaign";
    public static final java.lang.String _Evar = "Evar";
    public static final java.lang.String _ReferringDomain = "ReferringDomain";
    public static final java.lang.String _ReferringURL = "ReferringURL";
    public static final java.lang.String _ReferringQSParam = "ReferringQSParam";
    public static final java.lang.String _Page = "Page";
    public static final java.lang.String _PageURL = "PageURL";
    public static final java.lang.String _PageQSParam = "PageQSParam";
    public static final java.lang.String _SearchEngine = "SearchEngine";
    public static final java.lang.String _SearchKeywords = "SearchKeywords";
    public static final java.lang.String _SearchTrackingCode = "SearchTrackingCode";
    public static final java.lang.String _SearchCenter = "SearchCenter";
    public static final java.lang.String _ReferringRootDomain = "ReferringRootDomain";
    public static final java.lang.String _ReferringDomainAndPath = "ReferringDomainAndPath";
    public static final java.lang.String _PageDomain = "PageDomain";
    public static final java.lang.String _PageRootDomain = "PageRootDomain";
    public static final java.lang.String _PageDomainAndPath = "PageDomainAndPath";
    public static final Tc_source_attribute_type Campaign = new Tc_source_attribute_type(_Campaign);
    public static final Tc_source_attribute_type Evar = new Tc_source_attribute_type(_Evar);
    public static final Tc_source_attribute_type ReferringDomain = new Tc_source_attribute_type(_ReferringDomain);
    public static final Tc_source_attribute_type ReferringURL = new Tc_source_attribute_type(_ReferringURL);
    public static final Tc_source_attribute_type ReferringQSParam = new Tc_source_attribute_type(_ReferringQSParam);
    public static final Tc_source_attribute_type Page = new Tc_source_attribute_type(_Page);
    public static final Tc_source_attribute_type PageURL = new Tc_source_attribute_type(_PageURL);
    public static final Tc_source_attribute_type PageQSParam = new Tc_source_attribute_type(_PageQSParam);
    public static final Tc_source_attribute_type SearchEngine = new Tc_source_attribute_type(_SearchEngine);
    public static final Tc_source_attribute_type SearchKeywords = new Tc_source_attribute_type(_SearchKeywords);
    public static final Tc_source_attribute_type SearchTrackingCode = new Tc_source_attribute_type(_SearchTrackingCode);
    public static final Tc_source_attribute_type SearchCenter = new Tc_source_attribute_type(_SearchCenter);
    public static final Tc_source_attribute_type ReferringRootDomain = new Tc_source_attribute_type(_ReferringRootDomain);
    public static final Tc_source_attribute_type ReferringDomainAndPath = new Tc_source_attribute_type(_ReferringDomainAndPath);
    public static final Tc_source_attribute_type PageDomain = new Tc_source_attribute_type(_PageDomain);
    public static final Tc_source_attribute_type PageRootDomain = new Tc_source_attribute_type(_PageRootDomain);
    public static final Tc_source_attribute_type PageDomainAndPath = new Tc_source_attribute_type(_PageDomainAndPath);
    public java.lang.String getValue() { return _value_;}
    public static Tc_source_attribute_type fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Tc_source_attribute_type enumeration = (Tc_source_attribute_type)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Tc_source_attribute_type fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Tc_source_attribute_type.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "tc_source_attribute_type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
