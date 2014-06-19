/**
 * Segment_folder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Segment_folder  implements java.io.Serializable {
    private java.lang.String namespace;

    private java.lang.String folder_name;

    private com.omniture.www.Segment[] segments;

    public Segment_folder() {
    }

    public Segment_folder(
           java.lang.String namespace,
           java.lang.String folder_name,
           com.omniture.www.Segment[] segments) {
           this.namespace = namespace;
           this.folder_name = folder_name;
           this.segments = segments;
    }


    /**
     * Gets the namespace value for this Segment_folder.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this Segment_folder.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the folder_name value for this Segment_folder.
     * 
     * @return folder_name
     */
    public java.lang.String getFolder_name() {
        return folder_name;
    }


    /**
     * Sets the folder_name value for this Segment_folder.
     * 
     * @param folder_name
     */
    public void setFolder_name(java.lang.String folder_name) {
        this.folder_name = folder_name;
    }


    /**
     * Gets the segments value for this Segment_folder.
     * 
     * @return segments
     */
    public com.omniture.www.Segment[] getSegments() {
        return segments;
    }


    /**
     * Sets the segments value for this Segment_folder.
     * 
     * @param segments
     */
    public void setSegments(com.omniture.www.Segment[] segments) {
        this.segments = segments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Segment_folder)) return false;
        Segment_folder other = (Segment_folder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            ((this.folder_name==null && other.getFolder_name()==null) || 
             (this.folder_name!=null &&
              this.folder_name.equals(other.getFolder_name()))) &&
            ((this.segments==null && other.getSegments()==null) || 
             (this.segments!=null &&
              java.util.Arrays.equals(this.segments, other.getSegments())));
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
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        if (getFolder_name() != null) {
            _hashCode += getFolder_name().hashCode();
        }
        if (getSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Segment_folder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "segment_folder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folder_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "segment"));
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
