/**
 * Group_data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Group_data  implements java.io.Serializable {
    private com.omniture.www.Simple_report_suite[] rsid_list;

    private com.omniture.www.Simple_report_suite[] available_rsid_list;

    private java.lang.String[] user_list;

    private java.lang.String[] available_user_list;

    private com.omniture.www.Permission_group group;

    private com.omniture.www.Report_categories report_category_access;

    private com.omniture.www.Group_report_list group_report_list;

    private com.omniture.www.Group_category[] group_category_access;

    private com.omniture.www.Group_sub_category[] group_sub_category_access;

    public Group_data() {
    }

    public Group_data(
           com.omniture.www.Simple_report_suite[] rsid_list,
           com.omniture.www.Simple_report_suite[] available_rsid_list,
           java.lang.String[] user_list,
           java.lang.String[] available_user_list,
           com.omniture.www.Permission_group group,
           com.omniture.www.Report_categories report_category_access,
           com.omniture.www.Group_report_list group_report_list,
           com.omniture.www.Group_category[] group_category_access,
           com.omniture.www.Group_sub_category[] group_sub_category_access) {
           this.rsid_list = rsid_list;
           this.available_rsid_list = available_rsid_list;
           this.user_list = user_list;
           this.available_user_list = available_user_list;
           this.group = group;
           this.report_category_access = report_category_access;
           this.group_report_list = group_report_list;
           this.group_category_access = group_category_access;
           this.group_sub_category_access = group_sub_category_access;
    }


    /**
     * Gets the rsid_list value for this Group_data.
     * 
     * @return rsid_list
     */
    public com.omniture.www.Simple_report_suite[] getRsid_list() {
        return rsid_list;
    }


    /**
     * Sets the rsid_list value for this Group_data.
     * 
     * @param rsid_list
     */
    public void setRsid_list(com.omniture.www.Simple_report_suite[] rsid_list) {
        this.rsid_list = rsid_list;
    }


    /**
     * Gets the available_rsid_list value for this Group_data.
     * 
     * @return available_rsid_list
     */
    public com.omniture.www.Simple_report_suite[] getAvailable_rsid_list() {
        return available_rsid_list;
    }


    /**
     * Sets the available_rsid_list value for this Group_data.
     * 
     * @param available_rsid_list
     */
    public void setAvailable_rsid_list(com.omniture.www.Simple_report_suite[] available_rsid_list) {
        this.available_rsid_list = available_rsid_list;
    }


    /**
     * Gets the user_list value for this Group_data.
     * 
     * @return user_list
     */
    public java.lang.String[] getUser_list() {
        return user_list;
    }


    /**
     * Sets the user_list value for this Group_data.
     * 
     * @param user_list
     */
    public void setUser_list(java.lang.String[] user_list) {
        this.user_list = user_list;
    }


    /**
     * Gets the available_user_list value for this Group_data.
     * 
     * @return available_user_list
     */
    public java.lang.String[] getAvailable_user_list() {
        return available_user_list;
    }


    /**
     * Sets the available_user_list value for this Group_data.
     * 
     * @param available_user_list
     */
    public void setAvailable_user_list(java.lang.String[] available_user_list) {
        this.available_user_list = available_user_list;
    }


    /**
     * Gets the group value for this Group_data.
     * 
     * @return group
     */
    public com.omniture.www.Permission_group getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Group_data.
     * 
     * @param group
     */
    public void setGroup(com.omniture.www.Permission_group group) {
        this.group = group;
    }


    /**
     * Gets the report_category_access value for this Group_data.
     * 
     * @return report_category_access
     */
    public com.omniture.www.Report_categories getReport_category_access() {
        return report_category_access;
    }


    /**
     * Sets the report_category_access value for this Group_data.
     * 
     * @param report_category_access
     */
    public void setReport_category_access(com.omniture.www.Report_categories report_category_access) {
        this.report_category_access = report_category_access;
    }


    /**
     * Gets the group_report_list value for this Group_data.
     * 
     * @return group_report_list
     */
    public com.omniture.www.Group_report_list getGroup_report_list() {
        return group_report_list;
    }


    /**
     * Sets the group_report_list value for this Group_data.
     * 
     * @param group_report_list
     */
    public void setGroup_report_list(com.omniture.www.Group_report_list group_report_list) {
        this.group_report_list = group_report_list;
    }


    /**
     * Gets the group_category_access value for this Group_data.
     * 
     * @return group_category_access
     */
    public com.omniture.www.Group_category[] getGroup_category_access() {
        return group_category_access;
    }


    /**
     * Sets the group_category_access value for this Group_data.
     * 
     * @param group_category_access
     */
    public void setGroup_category_access(com.omniture.www.Group_category[] group_category_access) {
        this.group_category_access = group_category_access;
    }


    /**
     * Gets the group_sub_category_access value for this Group_data.
     * 
     * @return group_sub_category_access
     */
    public com.omniture.www.Group_sub_category[] getGroup_sub_category_access() {
        return group_sub_category_access;
    }


    /**
     * Sets the group_sub_category_access value for this Group_data.
     * 
     * @param group_sub_category_access
     */
    public void setGroup_sub_category_access(com.omniture.www.Group_sub_category[] group_sub_category_access) {
        this.group_sub_category_access = group_sub_category_access;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Group_data)) return false;
        Group_data other = (Group_data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsid_list==null && other.getRsid_list()==null) || 
             (this.rsid_list!=null &&
              java.util.Arrays.equals(this.rsid_list, other.getRsid_list()))) &&
            ((this.available_rsid_list==null && other.getAvailable_rsid_list()==null) || 
             (this.available_rsid_list!=null &&
              java.util.Arrays.equals(this.available_rsid_list, other.getAvailable_rsid_list()))) &&
            ((this.user_list==null && other.getUser_list()==null) || 
             (this.user_list!=null &&
              java.util.Arrays.equals(this.user_list, other.getUser_list()))) &&
            ((this.available_user_list==null && other.getAvailable_user_list()==null) || 
             (this.available_user_list!=null &&
              java.util.Arrays.equals(this.available_user_list, other.getAvailable_user_list()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.report_category_access==null && other.getReport_category_access()==null) || 
             (this.report_category_access!=null &&
              this.report_category_access.equals(other.getReport_category_access()))) &&
            ((this.group_report_list==null && other.getGroup_report_list()==null) || 
             (this.group_report_list!=null &&
              this.group_report_list.equals(other.getGroup_report_list()))) &&
            ((this.group_category_access==null && other.getGroup_category_access()==null) || 
             (this.group_category_access!=null &&
              java.util.Arrays.equals(this.group_category_access, other.getGroup_category_access()))) &&
            ((this.group_sub_category_access==null && other.getGroup_sub_category_access()==null) || 
             (this.group_sub_category_access!=null &&
              java.util.Arrays.equals(this.group_sub_category_access, other.getGroup_sub_category_access())));
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
        if (getRsid_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsid_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsid_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailable_rsid_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_rsid_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_rsid_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUser_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUser_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUser_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailable_user_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_user_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_user_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getReport_category_access() != null) {
            _hashCode += getReport_category_access().hashCode();
        }
        if (getGroup_report_list() != null) {
            _hashCode += getGroup_report_list().hashCode();
        }
        if (getGroup_category_access() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup_category_access());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup_category_access(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup_sub_category_access() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup_sub_category_access());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup_sub_category_access(), i);
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
        new org.apache.axis.description.TypeDesc(Group_data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "group_data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suite"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_rsid_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_rsid_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suite"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_user_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_user_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_category_access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_category_access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_categories"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_report_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_report_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "group_report_list"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_category_access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_category_access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "group_category"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_sub_category_access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_sub_category_access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "group_sub_category"));
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
