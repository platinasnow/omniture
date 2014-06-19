/**
 * Ds_weblog_formats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ds_weblog_formats implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ds_weblog_formats(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "NCSA Common (Apache default)";
    public static final java.lang.String _value2 = "NCSA Combined (Apache)";
    public static final java.lang.String _value3 = "W3C Extended (IIS 4.0 and later)";
    public static final java.lang.String _value4 = "Microsoft IIS Log (IIS 3 and earlier)";
    public static final Ds_weblog_formats value1 = new Ds_weblog_formats(_value1);
    public static final Ds_weblog_formats value2 = new Ds_weblog_formats(_value2);
    public static final Ds_weblog_formats value3 = new Ds_weblog_formats(_value3);
    public static final Ds_weblog_formats value4 = new Ds_weblog_formats(_value4);
    public java.lang.String getValue() { return _value_;}
    public static Ds_weblog_formats fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ds_weblog_formats enumeration = (Ds_weblog_formats)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ds_weblog_formats fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ds_weblog_formats.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_weblog_formats"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
