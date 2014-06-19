/**
 * ScheduleFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "None";
    public static final java.lang.String _value2 = "Run Once";
    public static final java.lang.String _value3 = "Hourly";
    public static final java.lang.String _value4 = "Daily By Days";
    public static final java.lang.String _value5 = "Daily weekdays";
    public static final java.lang.String _value6 = "Weekly";
    public static final java.lang.String _value7 = "Monthly by DOM";
    public static final java.lang.String _value8 = "Monthly by week";
    public static final java.lang.String _value9 = "Yearly by DOM";
    public static final java.lang.String _value10 = "Yearly by Week";
    public static final ScheduleFrequency value1 = new ScheduleFrequency(_value1);
    public static final ScheduleFrequency value2 = new ScheduleFrequency(_value2);
    public static final ScheduleFrequency value3 = new ScheduleFrequency(_value3);
    public static final ScheduleFrequency value4 = new ScheduleFrequency(_value4);
    public static final ScheduleFrequency value5 = new ScheduleFrequency(_value5);
    public static final ScheduleFrequency value6 = new ScheduleFrequency(_value6);
    public static final ScheduleFrequency value7 = new ScheduleFrequency(_value7);
    public static final ScheduleFrequency value8 = new ScheduleFrequency(_value8);
    public static final ScheduleFrequency value9 = new ScheduleFrequency(_value9);
    public static final ScheduleFrequency value10 = new ScheduleFrequency(_value10);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleFrequency enumeration = (ScheduleFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleFrequency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
