/**
 * ScheduleFileFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleFileFormat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleFileFormat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Excel2007 = "Excel2007";
    public static final java.lang.String _Excel2003 = "Excel2003";
    public static final java.lang.String _Mht = "Mht";
    public static final java.lang.String _Xml = "Xml";
    public static final java.lang.String _Txt = "Txt";
    public static final java.lang.String _Csv = "Csv";
    public static final java.lang.String _Pdf = "Pdf";
    public static final java.lang.String _Mobile = "Mobile";
    public static final java.lang.String _Html = "Html";
    public static final java.lang.String _Word = "Word";
    public static final ScheduleFileFormat Excel2007 = new ScheduleFileFormat(_Excel2007);
    public static final ScheduleFileFormat Excel2003 = new ScheduleFileFormat(_Excel2003);
    public static final ScheduleFileFormat Mht = new ScheduleFileFormat(_Mht);
    public static final ScheduleFileFormat Xml = new ScheduleFileFormat(_Xml);
    public static final ScheduleFileFormat Txt = new ScheduleFileFormat(_Txt);
    public static final ScheduleFileFormat Csv = new ScheduleFileFormat(_Csv);
    public static final ScheduleFileFormat Pdf = new ScheduleFileFormat(_Pdf);
    public static final ScheduleFileFormat Mobile = new ScheduleFileFormat(_Mobile);
    public static final ScheduleFileFormat Html = new ScheduleFileFormat(_Html);
    public static final ScheduleFileFormat Word = new ScheduleFileFormat(_Word);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleFileFormat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleFileFormat enumeration = (ScheduleFileFormat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleFileFormat fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleFileFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleFileFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
