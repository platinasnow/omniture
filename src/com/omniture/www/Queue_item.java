/**
 * Queue_item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Queue_item  implements java.io.Serializable {
    private java.util.Calendar entry_date;

    private int item_id;

    private java.lang.String rsids;

    private java.lang.String description;

    private java.lang.String feature_name;

    private java.lang.String admin_user;

    public Queue_item() {
    }

    public Queue_item(
           java.util.Calendar entry_date,
           int item_id,
           java.lang.String rsids,
           java.lang.String description,
           java.lang.String feature_name,
           java.lang.String admin_user) {
           this.entry_date = entry_date;
           this.item_id = item_id;
           this.rsids = rsids;
           this.description = description;
           this.feature_name = feature_name;
           this.admin_user = admin_user;
    }


    /**
     * Gets the entry_date value for this Queue_item.
     * 
     * @return entry_date
     */
    public java.util.Calendar getEntry_date() {
        return entry_date;
    }


    /**
     * Sets the entry_date value for this Queue_item.
     * 
     * @param entry_date
     */
    public void setEntry_date(java.util.Calendar entry_date) {
        this.entry_date = entry_date;
    }


    /**
     * Gets the item_id value for this Queue_item.
     * 
     * @return item_id
     */
    public int getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this Queue_item.
     * 
     * @param item_id
     */
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the rsids value for this Queue_item.
     * 
     * @return rsids
     */
    public java.lang.String getRsids() {
        return rsids;
    }


    /**
     * Sets the rsids value for this Queue_item.
     * 
     * @param rsids
     */
    public void setRsids(java.lang.String rsids) {
        this.rsids = rsids;
    }


    /**
     * Gets the description value for this Queue_item.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Queue_item.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the feature_name value for this Queue_item.
     * 
     * @return feature_name
     */
    public java.lang.String getFeature_name() {
        return feature_name;
    }


    /**
     * Sets the feature_name value for this Queue_item.
     * 
     * @param feature_name
     */
    public void setFeature_name(java.lang.String feature_name) {
        this.feature_name = feature_name;
    }


    /**
     * Gets the admin_user value for this Queue_item.
     * 
     * @return admin_user
     */
    public java.lang.String getAdmin_user() {
        return admin_user;
    }


    /**
     * Sets the admin_user value for this Queue_item.
     * 
     * @param admin_user
     */
    public void setAdmin_user(java.lang.String admin_user) {
        this.admin_user = admin_user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Queue_item)) return false;
        Queue_item other = (Queue_item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entry_date==null && other.getEntry_date()==null) || 
             (this.entry_date!=null &&
              this.entry_date.equals(other.getEntry_date()))) &&
            this.item_id == other.getItem_id() &&
            ((this.rsids==null && other.getRsids()==null) || 
             (this.rsids!=null &&
              this.rsids.equals(other.getRsids()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.feature_name==null && other.getFeature_name()==null) || 
             (this.feature_name!=null &&
              this.feature_name.equals(other.getFeature_name()))) &&
            ((this.admin_user==null && other.getAdmin_user()==null) || 
             (this.admin_user!=null &&
              this.admin_user.equals(other.getAdmin_user())));
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
        if (getEntry_date() != null) {
            _hashCode += getEntry_date().hashCode();
        }
        _hashCode += getItem_id();
        if (getRsids() != null) {
            _hashCode += getRsids().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFeature_name() != null) {
            _hashCode += getFeature_name().hashCode();
        }
        if (getAdmin_user() != null) {
            _hashCode += getAdmin_user().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Queue_item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "queue_item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entry_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feature_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admin_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
