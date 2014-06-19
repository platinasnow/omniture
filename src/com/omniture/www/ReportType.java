/**
 * ReportType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _overtime = "overtime";
    public static final java.lang.String _trended = "trended";
    public static final java.lang.String _ranked = "ranked";
    public static final java.lang.String _discovertrended = "discovertrended";
    public static final java.lang.String _discoverovertime = "discoverovertime";
    public static final java.lang.String _discoverranked = "discoverranked";
    public static final ReportType overtime = new ReportType(_overtime);
    public static final ReportType trended = new ReportType(_trended);
    public static final ReportType ranked = new ReportType(_ranked);
    public static final ReportType discovertrended = new ReportType(_discovertrended);
    public static final ReportType discoverovertime = new ReportType(_discoverovertime);
    public static final ReportType discoverranked = new ReportType(_discoverranked);
    public java.lang.String getValue() { return _value_;}
    public static ReportType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportType enumeration = (ReportType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
