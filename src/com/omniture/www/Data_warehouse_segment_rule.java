/**
 * Data_warehouse_segment_rule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Data_warehouse_segment_rule  implements java.io.Serializable {
    private java.lang.String operator;

    private java.lang.String item;

    private java.lang.String value;

    private int event;

    public Data_warehouse_segment_rule() {
    }

    public Data_warehouse_segment_rule(
           java.lang.String operator,
           java.lang.String item,
           java.lang.String value,
           int event) {
           this.operator = operator;
           this.item = item;
           this.value = value;
           this.event = event;
    }


    /**
     * Gets the operator value for this Data_warehouse_segment_rule.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Data_warehouse_segment_rule.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the item value for this Data_warehouse_segment_rule.
     * 
     * @return item
     */
    public java.lang.String getItem() {
        return item;
    }


    /**
     * Sets the item value for this Data_warehouse_segment_rule.
     * 
     * @param item
     */
    public void setItem(java.lang.String item) {
        this.item = item;
    }


    /**
     * Gets the value value for this Data_warehouse_segment_rule.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Data_warehouse_segment_rule.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the event value for this Data_warehouse_segment_rule.
     * 
     * @return event
     */
    public int getEvent() {
        return event;
    }


    /**
     * Sets the event value for this Data_warehouse_segment_rule.
     * 
     * @param event
     */
    public void setEvent(int event) {
        this.event = event;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data_warehouse_segment_rule)) return false;
        Data_warehouse_segment_rule other = (Data_warehouse_segment_rule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            this.event == other.getEvent();
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        _hashCode += getEvent();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Data_warehouse_segment_rule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_rule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
