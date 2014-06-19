/**
 * Hit_attribute_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Hit_attribute_type implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Hit_attribute_type(java.lang.String value) {
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
    public static final java.lang.String _IsPaidSearch = "IsPaidSearch";
    public static final java.lang.String _IsNaturalSearch = "IsNaturalSearch";
    public static final java.lang.String _SearchEngine = "SearchEngine";
    public static final java.lang.String _SearchKeywords = "SearchKeywords";
    public static final java.lang.String _SearchTrackingCode = "SearchTrackingCode";
    public static final java.lang.String _IsInternal = "IsInternal";
    public static final java.lang.String _IsFirstPageOfVisit = "IsFirstPageOfVisit";
    public static final java.lang.String _IsSearchCenter = "IsSearchCenter";
    public static final java.lang.String _ReferringRootDomain = "ReferringRootDomain";
    public static final java.lang.String _ReferringDomainAndPath = "ReferringDomainAndPath";
    public static final java.lang.String _PageDomain = "PageDomain";
    public static final java.lang.String _PageRootDomain = "PageRootDomain";
    public static final java.lang.String _PageDomainAndPath = "PageDomainAndPath";
    public static final java.lang.String _IsNotInternal = "IsNotInternal";
    public static final Hit_attribute_type Campaign = new Hit_attribute_type(_Campaign);
    public static final Hit_attribute_type Evar = new Hit_attribute_type(_Evar);
    public static final Hit_attribute_type ReferringDomain = new Hit_attribute_type(_ReferringDomain);
    public static final Hit_attribute_type ReferringURL = new Hit_attribute_type(_ReferringURL);
    public static final Hit_attribute_type ReferringQSParam = new Hit_attribute_type(_ReferringQSParam);
    public static final Hit_attribute_type Page = new Hit_attribute_type(_Page);
    public static final Hit_attribute_type PageURL = new Hit_attribute_type(_PageURL);
    public static final Hit_attribute_type PageQSParam = new Hit_attribute_type(_PageQSParam);
    public static final Hit_attribute_type IsPaidSearch = new Hit_attribute_type(_IsPaidSearch);
    public static final Hit_attribute_type IsNaturalSearch = new Hit_attribute_type(_IsNaturalSearch);
    public static final Hit_attribute_type SearchEngine = new Hit_attribute_type(_SearchEngine);
    public static final Hit_attribute_type SearchKeywords = new Hit_attribute_type(_SearchKeywords);
    public static final Hit_attribute_type SearchTrackingCode = new Hit_attribute_type(_SearchTrackingCode);
    public static final Hit_attribute_type IsInternal = new Hit_attribute_type(_IsInternal);
    public static final Hit_attribute_type IsFirstPageOfVisit = new Hit_attribute_type(_IsFirstPageOfVisit);
    public static final Hit_attribute_type IsSearchCenter = new Hit_attribute_type(_IsSearchCenter);
    public static final Hit_attribute_type ReferringRootDomain = new Hit_attribute_type(_ReferringRootDomain);
    public static final Hit_attribute_type ReferringDomainAndPath = new Hit_attribute_type(_ReferringDomainAndPath);
    public static final Hit_attribute_type PageDomain = new Hit_attribute_type(_PageDomain);
    public static final Hit_attribute_type PageRootDomain = new Hit_attribute_type(_PageRootDomain);
    public static final Hit_attribute_type PageDomainAndPath = new Hit_attribute_type(_PageDomainAndPath);
    public static final Hit_attribute_type IsNotInternal = new Hit_attribute_type(_IsNotInternal);
    public java.lang.String getValue() { return _value_;}
    public static Hit_attribute_type fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Hit_attribute_type enumeration = (Hit_attribute_type)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Hit_attribute_type fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Hit_attribute_type.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hit_attribute_type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
