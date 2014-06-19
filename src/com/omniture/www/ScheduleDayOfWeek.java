/**
 * ScheduleDayOfWeek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleDayOfWeek implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleDayOfWeek(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Sunday = "Sunday";
    public static final java.lang.String _Monday = "Monday";
    public static final java.lang.String _Tuesday = "Tuesday";
    public static final java.lang.String _Wednesday = "Wednesday";
    public static final java.lang.String _Thursday = "Thursday";
    public static final java.lang.String _Friday = "Friday";
    public static final java.lang.String _Saturday = "Saturday";
    public static final ScheduleDayOfWeek None = new ScheduleDayOfWeek(_None);
    public static final ScheduleDayOfWeek Sunday = new ScheduleDayOfWeek(_Sunday);
    public static final ScheduleDayOfWeek Monday = new ScheduleDayOfWeek(_Monday);
    public static final ScheduleDayOfWeek Tuesday = new ScheduleDayOfWeek(_Tuesday);
    public static final ScheduleDayOfWeek Wednesday = new ScheduleDayOfWeek(_Wednesday);
    public static final ScheduleDayOfWeek Thursday = new ScheduleDayOfWeek(_Thursday);
    public static final ScheduleDayOfWeek Friday = new ScheduleDayOfWeek(_Friday);
    public static final ScheduleDayOfWeek Saturday = new ScheduleDayOfWeek(_Saturday);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleDayOfWeek fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleDayOfWeek enumeration = (ScheduleDayOfWeek)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleDayOfWeek fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleDayOfWeek.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleDayOfWeek"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
