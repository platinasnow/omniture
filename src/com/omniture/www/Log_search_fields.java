/**
 * Log_search_fields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Log_search_fields implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Log_search_fields(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _rs_id = "rs_id";
    public static final java.lang.String _data_string = "data_string";
    public static final java.lang.String _log_type = "log_type";
    public static final java.lang.String _log_sub_type = "log_sub_type";
    public static final java.lang.String _ip_address = "ip_address";
    public static final java.lang.String _login = "login";
    public static final Log_search_fields rs_id = new Log_search_fields(_rs_id);
    public static final Log_search_fields data_string = new Log_search_fields(_data_string);
    public static final Log_search_fields log_type = new Log_search_fields(_log_type);
    public static final Log_search_fields log_sub_type = new Log_search_fields(_log_sub_type);
    public static final Log_search_fields ip_address = new Log_search_fields(_ip_address);
    public static final Log_search_fields login = new Log_search_fields(_login);
    public java.lang.String getValue() { return _value_;}
    public static Log_search_fields fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Log_search_fields enumeration = (Log_search_fields)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Log_search_fields fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Log_search_fields.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_search_fields"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
