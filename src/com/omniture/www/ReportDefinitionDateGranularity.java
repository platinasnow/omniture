/**
 * ReportDefinitionDateGranularity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionDateGranularity implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportDefinitionDateGranularity(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _hour = "hour";
    public static final java.lang.String _day = "day";
    public static final java.lang.String _week = "week";
    public static final java.lang.String _month = "month";
    public static final java.lang.String _quarter = "quarter";
    public static final java.lang.String _year = "year";
    public static final ReportDefinitionDateGranularity hour = new ReportDefinitionDateGranularity(_hour);
    public static final ReportDefinitionDateGranularity day = new ReportDefinitionDateGranularity(_day);
    public static final ReportDefinitionDateGranularity week = new ReportDefinitionDateGranularity(_week);
    public static final ReportDefinitionDateGranularity month = new ReportDefinitionDateGranularity(_month);
    public static final ReportDefinitionDateGranularity quarter = new ReportDefinitionDateGranularity(_quarter);
    public static final ReportDefinitionDateGranularity year = new ReportDefinitionDateGranularity(_year);
    public java.lang.String getValue() { return _value_;}
    public static ReportDefinitionDateGranularity fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportDefinitionDateGranularity enumeration = (ReportDefinitionDateGranularity)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportDefinitionDateGranularity fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionDateGranularity.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionDateGranularity"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
