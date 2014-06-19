/**
 * Code_archive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Code_archive  implements java.io.Serializable {
    private java.lang.String archive_name;

    private int archive_id;

    private java.lang.String archive_description;

    private java.util.Calendar modified_date;

    private com.omniture.www.Code_item[] code;

    public Code_archive() {
    }

    public Code_archive(
           java.lang.String archive_name,
           int archive_id,
           java.lang.String archive_description,
           java.util.Calendar modified_date,
           com.omniture.www.Code_item[] code) {
           this.archive_name = archive_name;
           this.archive_id = archive_id;
           this.archive_description = archive_description;
           this.modified_date = modified_date;
           this.code = code;
    }


    /**
     * Gets the archive_name value for this Code_archive.
     * 
     * @return archive_name
     */
    public java.lang.String getArchive_name() {
        return archive_name;
    }


    /**
     * Sets the archive_name value for this Code_archive.
     * 
     * @param archive_name
     */
    public void setArchive_name(java.lang.String archive_name) {
        this.archive_name = archive_name;
    }


    /**
     * Gets the archive_id value for this Code_archive.
     * 
     * @return archive_id
     */
    public int getArchive_id() {
        return archive_id;
    }


    /**
     * Sets the archive_id value for this Code_archive.
     * 
     * @param archive_id
     */
    public void setArchive_id(int archive_id) {
        this.archive_id = archive_id;
    }


    /**
     * Gets the archive_description value for this Code_archive.
     * 
     * @return archive_description
     */
    public java.lang.String getArchive_description() {
        return archive_description;
    }


    /**
     * Sets the archive_description value for this Code_archive.
     * 
     * @param archive_description
     */
    public void setArchive_description(java.lang.String archive_description) {
        this.archive_description = archive_description;
    }


    /**
     * Gets the modified_date value for this Code_archive.
     * 
     * @return modified_date
     */
    public java.util.Calendar getModified_date() {
        return modified_date;
    }


    /**
     * Sets the modified_date value for this Code_archive.
     * 
     * @param modified_date
     */
    public void setModified_date(java.util.Calendar modified_date) {
        this.modified_date = modified_date;
    }


    /**
     * Gets the code value for this Code_archive.
     * 
     * @return code
     */
    public com.omniture.www.Code_item[] getCode() {
        return code;
    }


    /**
     * Sets the code value for this Code_archive.
     * 
     * @param code
     */
    public void setCode(com.omniture.www.Code_item[] code) {
        this.code = code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Code_archive)) return false;
        Code_archive other = (Code_archive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archive_name==null && other.getArchive_name()==null) || 
             (this.archive_name!=null &&
              this.archive_name.equals(other.getArchive_name()))) &&
            this.archive_id == other.getArchive_id() &&
            ((this.archive_description==null && other.getArchive_description()==null) || 
             (this.archive_description!=null &&
              this.archive_description.equals(other.getArchive_description()))) &&
            ((this.modified_date==null && other.getModified_date()==null) || 
             (this.modified_date!=null &&
              this.modified_date.equals(other.getModified_date()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              java.util.Arrays.equals(this.code, other.getCode())));
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
        if (getArchive_name() != null) {
            _hashCode += getArchive_name().hashCode();
        }
        _hashCode += getArchive_id();
        if (getArchive_description() != null) {
            _hashCode += getArchive_description().hashCode();
        }
        if (getModified_date() != null) {
            _hashCode += getModified_date().hashCode();
        }
        if (getCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCode(), i);
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
        new org.apache.axis.description.TypeDesc(Code_archive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "code_archive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archive_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archive_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archive_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archive_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archive_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archive_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "code_item"));
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
