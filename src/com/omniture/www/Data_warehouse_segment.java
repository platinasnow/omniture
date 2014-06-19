/**
 * Data_warehouse_segment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Data_warehouse_segment  implements java.io.Serializable {
    private java.lang.String name;

    private com.omniture.www.Data_warehouse_segment_group group_include;

    private com.omniture.www.Data_warehouse_segment_group group_exclude;

    public Data_warehouse_segment() {
    }

    public Data_warehouse_segment(
           java.lang.String name,
           com.omniture.www.Data_warehouse_segment_group group_include,
           com.omniture.www.Data_warehouse_segment_group group_exclude) {
           this.name = name;
           this.group_include = group_include;
           this.group_exclude = group_exclude;
    }


    /**
     * Gets the name value for this Data_warehouse_segment.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Data_warehouse_segment.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the group_include value for this Data_warehouse_segment.
     * 
     * @return group_include
     */
    public com.omniture.www.Data_warehouse_segment_group getGroup_include() {
        return group_include;
    }


    /**
     * Sets the group_include value for this Data_warehouse_segment.
     * 
     * @param group_include
     */
    public void setGroup_include(com.omniture.www.Data_warehouse_segment_group group_include) {
        this.group_include = group_include;
    }


    /**
     * Gets the group_exclude value for this Data_warehouse_segment.
     * 
     * @return group_exclude
     */
    public com.omniture.www.Data_warehouse_segment_group getGroup_exclude() {
        return group_exclude;
    }


    /**
     * Sets the group_exclude value for this Data_warehouse_segment.
     * 
     * @param group_exclude
     */
    public void setGroup_exclude(com.omniture.www.Data_warehouse_segment_group group_exclude) {
        this.group_exclude = group_exclude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data_warehouse_segment)) return false;
        Data_warehouse_segment other = (Data_warehouse_segment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.group_include==null && other.getGroup_include()==null) || 
             (this.group_include!=null &&
              this.group_include.equals(other.getGroup_include()))) &&
            ((this.group_exclude==null && other.getGroup_exclude()==null) || 
             (this.group_exclude!=null &&
              this.group_exclude.equals(other.getGroup_exclude())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getGroup_include() != null) {
            _hashCode += getGroup_include().hashCode();
        }
        if (getGroup_exclude() != null) {
            _hashCode += getGroup_exclude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Data_warehouse_segment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_include");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_include"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_group"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_exclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_exclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_group"));
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
