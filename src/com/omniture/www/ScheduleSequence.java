/**
 * ScheduleSequence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleSequence implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleSequence(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _First = "First";
    public static final java.lang.String _Second = "Second";
    public static final java.lang.String _Third = "Third";
    public static final java.lang.String _Fourth = "Fourth";
    public static final java.lang.String _Last = "Last";
    public static final ScheduleSequence None = new ScheduleSequence(_None);
    public static final ScheduleSequence First = new ScheduleSequence(_First);
    public static final ScheduleSequence Second = new ScheduleSequence(_Second);
    public static final ScheduleSequence Third = new ScheduleSequence(_Third);
    public static final ScheduleSequence Fourth = new ScheduleSequence(_Fourth);
    public static final ScheduleSequence Last = new ScheduleSequence(_Last);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleSequence fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleSequence enumeration = (ScheduleSequence)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleSequence fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleSequence.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleSequence"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
