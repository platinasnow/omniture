/**
 * Ruleset_operator_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Ruleset_operator_type implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ruleset_operator_type(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Equals = "Equals";
    public static final java.lang.String _Contains = "Contains";
    public static final java.lang.String _NotContains = "NotContains";
    public static final java.lang.String _StartsWith = "StartsWith";
    public static final java.lang.String _NotStartsWith = "NotStartsWith";
    public static final java.lang.String _EndsWith = "EndsWith";
    public static final java.lang.String _NotEndsWith = "NotEndsWith";
    public static final java.lang.String _Exists = "Exists";
    public static final java.lang.String _NotExists = "NotExists";
    public static final java.lang.String _IsEmpty = "IsEmpty";
    public static final java.lang.String _IsNotEmpty = "IsNotEmpty";
    public static final Ruleset_operator_type Equals = new Ruleset_operator_type(_Equals);
    public static final Ruleset_operator_type Contains = new Ruleset_operator_type(_Contains);
    public static final Ruleset_operator_type NotContains = new Ruleset_operator_type(_NotContains);
    public static final Ruleset_operator_type StartsWith = new Ruleset_operator_type(_StartsWith);
    public static final Ruleset_operator_type NotStartsWith = new Ruleset_operator_type(_NotStartsWith);
    public static final Ruleset_operator_type EndsWith = new Ruleset_operator_type(_EndsWith);
    public static final Ruleset_operator_type NotEndsWith = new Ruleset_operator_type(_NotEndsWith);
    public static final Ruleset_operator_type Exists = new Ruleset_operator_type(_Exists);
    public static final Ruleset_operator_type NotExists = new Ruleset_operator_type(_NotExists);
    public static final Ruleset_operator_type IsEmpty = new Ruleset_operator_type(_IsEmpty);
    public static final Ruleset_operator_type IsNotEmpty = new Ruleset_operator_type(_IsNotEmpty);
    public java.lang.String getValue() { return _value_;}
    public static Ruleset_operator_type fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ruleset_operator_type enumeration = (Ruleset_operator_type)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ruleset_operator_type fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ruleset_operator_type.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ruleset_operator_type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
