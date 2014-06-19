/**
 * Mchannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Mchannel  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private int status;

    private int sub_channel;

    private com.omniture.www.Channel_types type;

    private com.omniture.www.Channel_colors color;

    public Mchannel() {
    }

    public Mchannel(
           int id,
           java.lang.String name,
           int status,
           int sub_channel,
           com.omniture.www.Channel_types type,
           com.omniture.www.Channel_colors color) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.sub_channel = sub_channel;
           this.type = type;
           this.color = color;
    }


    /**
     * Gets the id value for this Mchannel.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Mchannel.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Mchannel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Mchannel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Mchannel.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Mchannel.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the sub_channel value for this Mchannel.
     * 
     * @return sub_channel
     */
    public int getSub_channel() {
        return sub_channel;
    }


    /**
     * Sets the sub_channel value for this Mchannel.
     * 
     * @param sub_channel
     */
    public void setSub_channel(int sub_channel) {
        this.sub_channel = sub_channel;
    }


    /**
     * Gets the type value for this Mchannel.
     * 
     * @return type
     */
    public com.omniture.www.Channel_types getType() {
        return type;
    }


    /**
     * Sets the type value for this Mchannel.
     * 
     * @param type
     */
    public void setType(com.omniture.www.Channel_types type) {
        this.type = type;
    }


    /**
     * Gets the color value for this Mchannel.
     * 
     * @return color
     */
    public com.omniture.www.Channel_colors getColor() {
        return color;
    }


    /**
     * Sets the color value for this Mchannel.
     * 
     * @param color
     */
    public void setColor(com.omniture.www.Channel_colors color) {
        this.color = color;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mchannel)) return false;
        Mchannel other = (Mchannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.status == other.getStatus() &&
            this.sub_channel == other.getSub_channel() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += getSub_channel();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mchannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sub_channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "channel_types"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "channel_colors"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
