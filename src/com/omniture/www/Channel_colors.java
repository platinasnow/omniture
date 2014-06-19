/**
 * Channel_colors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Channel_colors implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Channel_colors(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "0F59A9";
    public static final java.lang.String _value2 = "E07804";
    public static final java.lang.String _value3 = "609D09";
    public static final java.lang.String _value4 = "D12112";
    public static final java.lang.String _value5 = "813AA7";
    public static final java.lang.String _value6 = "056F73";
    public static final java.lang.String _value7 = "EDBD0C";
    public static final java.lang.String _value8 = "B9256F";
    public static final java.lang.String _value9 = "2F2D9D";
    public static final java.lang.String _value10 = "9F4F1A";
    public static final java.lang.String _value11 = "507609";
    public static final java.lang.String _value12 = "922D3D";
    public static final java.lang.String _value13 = "592993";
    public static final java.lang.String _value14 = "695153";
    public static final java.lang.String _value15 = "C1893E";
    public static final java.lang.String _value16 = "4A86F8";
    public static final java.lang.String _value17 = "FF954E";
    public static final java.lang.String _value18 = "4ADC60";
    public static final java.lang.String _value19 = "A667E9";
    public static final java.lang.String _value20 = "14AD85";
    public static final java.lang.String _value21 = "FFF186";
    public static final java.lang.String _value22 = "F9A9F9";
    public static final java.lang.String _value23 = "222143";
    public static final java.lang.String _value24 = "393020";
    public static final java.lang.String _value25 = "19371C";
    public static final java.lang.String _value26 = "500012";
    public static final java.lang.String _value27 = "808284";
    public static final Channel_colors value1 = new Channel_colors(_value1);
    public static final Channel_colors value2 = new Channel_colors(_value2);
    public static final Channel_colors value3 = new Channel_colors(_value3);
    public static final Channel_colors value4 = new Channel_colors(_value4);
    public static final Channel_colors value5 = new Channel_colors(_value5);
    public static final Channel_colors value6 = new Channel_colors(_value6);
    public static final Channel_colors value7 = new Channel_colors(_value7);
    public static final Channel_colors value8 = new Channel_colors(_value8);
    public static final Channel_colors value9 = new Channel_colors(_value9);
    public static final Channel_colors value10 = new Channel_colors(_value10);
    public static final Channel_colors value11 = new Channel_colors(_value11);
    public static final Channel_colors value12 = new Channel_colors(_value12);
    public static final Channel_colors value13 = new Channel_colors(_value13);
    public static final Channel_colors value14 = new Channel_colors(_value14);
    public static final Channel_colors value15 = new Channel_colors(_value15);
    public static final Channel_colors value16 = new Channel_colors(_value16);
    public static final Channel_colors value17 = new Channel_colors(_value17);
    public static final Channel_colors value18 = new Channel_colors(_value18);
    public static final Channel_colors value19 = new Channel_colors(_value19);
    public static final Channel_colors value20 = new Channel_colors(_value20);
    public static final Channel_colors value21 = new Channel_colors(_value21);
    public static final Channel_colors value22 = new Channel_colors(_value22);
    public static final Channel_colors value23 = new Channel_colors(_value23);
    public static final Channel_colors value24 = new Channel_colors(_value24);
    public static final Channel_colors value25 = new Channel_colors(_value25);
    public static final Channel_colors value26 = new Channel_colors(_value26);
    public static final Channel_colors value27 = new Channel_colors(_value27);
    public java.lang.String getValue() { return _value_;}
    public static Channel_colors fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Channel_colors enumeration = (Channel_colors)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Channel_colors fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Channel_colors.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "channel_colors"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
