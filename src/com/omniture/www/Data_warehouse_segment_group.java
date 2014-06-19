/**
 * Data_warehouse_segment_group.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Data_warehouse_segment_group  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String name;

    private java.lang.String group_operator;

    private java.lang.String rule_operator;

    private com.omniture.www.Data_warehouse_segment_rule[] rule_list;

    private com.omniture.www.Data_warehouse_segment_group[] group_list;

    public Data_warehouse_segment_group() {
    }

    public Data_warehouse_segment_group(
           java.lang.String type,
           java.lang.String name,
           java.lang.String group_operator,
           java.lang.String rule_operator,
           com.omniture.www.Data_warehouse_segment_rule[] rule_list,
           com.omniture.www.Data_warehouse_segment_group[] group_list) {
           this.type = type;
           this.name = name;
           this.group_operator = group_operator;
           this.rule_operator = rule_operator;
           this.rule_list = rule_list;
           this.group_list = group_list;
    }


    /**
     * Gets the type value for this Data_warehouse_segment_group.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Data_warehouse_segment_group.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this Data_warehouse_segment_group.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Data_warehouse_segment_group.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the group_operator value for this Data_warehouse_segment_group.
     * 
     * @return group_operator
     */
    public java.lang.String getGroup_operator() {
        return group_operator;
    }


    /**
     * Sets the group_operator value for this Data_warehouse_segment_group.
     * 
     * @param group_operator
     */
    public void setGroup_operator(java.lang.String group_operator) {
        this.group_operator = group_operator;
    }


    /**
     * Gets the rule_operator value for this Data_warehouse_segment_group.
     * 
     * @return rule_operator
     */
    public java.lang.String getRule_operator() {
        return rule_operator;
    }


    /**
     * Sets the rule_operator value for this Data_warehouse_segment_group.
     * 
     * @param rule_operator
     */
    public void setRule_operator(java.lang.String rule_operator) {
        this.rule_operator = rule_operator;
    }


    /**
     * Gets the rule_list value for this Data_warehouse_segment_group.
     * 
     * @return rule_list
     */
    public com.omniture.www.Data_warehouse_segment_rule[] getRule_list() {
        return rule_list;
    }


    /**
     * Sets the rule_list value for this Data_warehouse_segment_group.
     * 
     * @param rule_list
     */
    public void setRule_list(com.omniture.www.Data_warehouse_segment_rule[] rule_list) {
        this.rule_list = rule_list;
    }


    /**
     * Gets the group_list value for this Data_warehouse_segment_group.
     * 
     * @return group_list
     */
    public com.omniture.www.Data_warehouse_segment_group[] getGroup_list() {
        return group_list;
    }


    /**
     * Sets the group_list value for this Data_warehouse_segment_group.
     * 
     * @param group_list
     */
    public void setGroup_list(com.omniture.www.Data_warehouse_segment_group[] group_list) {
        this.group_list = group_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data_warehouse_segment_group)) return false;
        Data_warehouse_segment_group other = (Data_warehouse_segment_group) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.group_operator==null && other.getGroup_operator()==null) || 
             (this.group_operator!=null &&
              this.group_operator.equals(other.getGroup_operator()))) &&
            ((this.rule_operator==null && other.getRule_operator()==null) || 
             (this.rule_operator!=null &&
              this.rule_operator.equals(other.getRule_operator()))) &&
            ((this.rule_list==null && other.getRule_list()==null) || 
             (this.rule_list!=null &&
              java.util.Arrays.equals(this.rule_list, other.getRule_list()))) &&
            ((this.group_list==null && other.getGroup_list()==null) || 
             (this.group_list!=null &&
              java.util.Arrays.equals(this.group_list, other.getGroup_list())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getGroup_operator() != null) {
            _hashCode += getGroup_operator().hashCode();
        }
        if (getRule_operator() != null) {
            _hashCode += getRule_operator().hashCode();
        }
        if (getRule_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup_list(), i);
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
        new org.apache.axis.description.TypeDesc(Data_warehouse_segment_group.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_group"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule_operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule_operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_rule"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_list"));
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
