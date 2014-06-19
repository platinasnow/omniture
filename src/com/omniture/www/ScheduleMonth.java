/**
 * ScheduleMonth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleMonth implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleMonth(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _January = "January";
    public static final java.lang.String _February = "February";
    public static final java.lang.String _March = "March";
    public static final java.lang.String _April = "April";
    public static final java.lang.String _May = "May";
    public static final java.lang.String _June = "June";
    public static final java.lang.String _July = "July";
    public static final java.lang.String _August = "August";
    public static final java.lang.String _September = "September";
    public static final java.lang.String _October = "October";
    public static final java.lang.String _November = "November";
    public static final java.lang.String _December = "December";
    public static final ScheduleMonth None = new ScheduleMonth(_None);
    public static final ScheduleMonth January = new ScheduleMonth(_January);
    public static final ScheduleMonth February = new ScheduleMonth(_February);
    public static final ScheduleMonth March = new ScheduleMonth(_March);
    public static final ScheduleMonth April = new ScheduleMonth(_April);
    public static final ScheduleMonth May = new ScheduleMonth(_May);
    public static final ScheduleMonth June = new ScheduleMonth(_June);
    public static final ScheduleMonth July = new ScheduleMonth(_July);
    public static final ScheduleMonth August = new ScheduleMonth(_August);
    public static final ScheduleMonth September = new ScheduleMonth(_September);
    public static final ScheduleMonth October = new ScheduleMonth(_October);
    public static final ScheduleMonth November = new ScheduleMonth(_November);
    public static final ScheduleMonth December = new ScheduleMonth(_December);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleMonth fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleMonth enumeration = (ScheduleMonth)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleMonth fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleMonth.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleMonth"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
