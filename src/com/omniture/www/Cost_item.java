/**
 * Cost_item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Cost_item  implements java.io.Serializable {
    private java.lang.String id;

    private int cost_group;

    private java.lang.String name;

    private int channel_id;

    private java.util.Calendar start_date;

    private java.util.Calendar end_date;

    private java.lang.String type;

    private double amount;

    private java.lang.String metric;

    private java.lang.String apply_to_type;

    private int apply_to_level;

    private java.lang.String apply_to_value;

    private java.lang.String apply_to_value_string;

    public Cost_item() {
    }

    public Cost_item(
           java.lang.String id,
           int cost_group,
           java.lang.String name,
           int channel_id,
           java.util.Calendar start_date,
           java.util.Calendar end_date,
           java.lang.String type,
           double amount,
           java.lang.String metric,
           java.lang.String apply_to_type,
           int apply_to_level,
           java.lang.String apply_to_value,
           java.lang.String apply_to_value_string) {
           this.id = id;
           this.cost_group = cost_group;
           this.name = name;
           this.channel_id = channel_id;
           this.start_date = start_date;
           this.end_date = end_date;
           this.type = type;
           this.amount = amount;
           this.metric = metric;
           this.apply_to_type = apply_to_type;
           this.apply_to_level = apply_to_level;
           this.apply_to_value = apply_to_value;
           this.apply_to_value_string = apply_to_value_string;
    }


    /**
     * Gets the id value for this Cost_item.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Cost_item.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the cost_group value for this Cost_item.
     * 
     * @return cost_group
     */
    public int getCost_group() {
        return cost_group;
    }


    /**
     * Sets the cost_group value for this Cost_item.
     * 
     * @param cost_group
     */
    public void setCost_group(int cost_group) {
        this.cost_group = cost_group;
    }


    /**
     * Gets the name value for this Cost_item.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Cost_item.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the channel_id value for this Cost_item.
     * 
     * @return channel_id
     */
    public int getChannel_id() {
        return channel_id;
    }


    /**
     * Sets the channel_id value for this Cost_item.
     * 
     * @param channel_id
     */
    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }


    /**
     * Gets the start_date value for this Cost_item.
     * 
     * @return start_date
     */
    public java.util.Calendar getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this Cost_item.
     * 
     * @param start_date
     */
    public void setStart_date(java.util.Calendar start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this Cost_item.
     * 
     * @return end_date
     */
    public java.util.Calendar getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this Cost_item.
     * 
     * @param end_date
     */
    public void setEnd_date(java.util.Calendar end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the type value for this Cost_item.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Cost_item.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the amount value for this Cost_item.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Cost_item.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the metric value for this Cost_item.
     * 
     * @return metric
     */
    public java.lang.String getMetric() {
        return metric;
    }


    /**
     * Sets the metric value for this Cost_item.
     * 
     * @param metric
     */
    public void setMetric(java.lang.String metric) {
        this.metric = metric;
    }


    /**
     * Gets the apply_to_type value for this Cost_item.
     * 
     * @return apply_to_type
     */
    public java.lang.String getApply_to_type() {
        return apply_to_type;
    }


    /**
     * Sets the apply_to_type value for this Cost_item.
     * 
     * @param apply_to_type
     */
    public void setApply_to_type(java.lang.String apply_to_type) {
        this.apply_to_type = apply_to_type;
    }


    /**
     * Gets the apply_to_level value for this Cost_item.
     * 
     * @return apply_to_level
     */
    public int getApply_to_level() {
        return apply_to_level;
    }


    /**
     * Sets the apply_to_level value for this Cost_item.
     * 
     * @param apply_to_level
     */
    public void setApply_to_level(int apply_to_level) {
        this.apply_to_level = apply_to_level;
    }


    /**
     * Gets the apply_to_value value for this Cost_item.
     * 
     * @return apply_to_value
     */
    public java.lang.String getApply_to_value() {
        return apply_to_value;
    }


    /**
     * Sets the apply_to_value value for this Cost_item.
     * 
     * @param apply_to_value
     */
    public void setApply_to_value(java.lang.String apply_to_value) {
        this.apply_to_value = apply_to_value;
    }


    /**
     * Gets the apply_to_value_string value for this Cost_item.
     * 
     * @return apply_to_value_string
     */
    public java.lang.String getApply_to_value_string() {
        return apply_to_value_string;
    }


    /**
     * Sets the apply_to_value_string value for this Cost_item.
     * 
     * @param apply_to_value_string
     */
    public void setApply_to_value_string(java.lang.String apply_to_value_string) {
        this.apply_to_value_string = apply_to_value_string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cost_item)) return false;
        Cost_item other = (Cost_item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.cost_group == other.getCost_group() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.channel_id == other.getChannel_id() &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.amount == other.getAmount() &&
            ((this.metric==null && other.getMetric()==null) || 
             (this.metric!=null &&
              this.metric.equals(other.getMetric()))) &&
            ((this.apply_to_type==null && other.getApply_to_type()==null) || 
             (this.apply_to_type!=null &&
              this.apply_to_type.equals(other.getApply_to_type()))) &&
            this.apply_to_level == other.getApply_to_level() &&
            ((this.apply_to_value==null && other.getApply_to_value()==null) || 
             (this.apply_to_value!=null &&
              this.apply_to_value.equals(other.getApply_to_value()))) &&
            ((this.apply_to_value_string==null && other.getApply_to_value_string()==null) || 
             (this.apply_to_value_string!=null &&
              this.apply_to_value_string.equals(other.getApply_to_value_string())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getCost_group();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getChannel_id();
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        if (getMetric() != null) {
            _hashCode += getMetric().hashCode();
        }
        if (getApply_to_type() != null) {
            _hashCode += getApply_to_type().hashCode();
        }
        _hashCode += getApply_to_level();
        if (getApply_to_value() != null) {
            _hashCode += getApply_to_value().hashCode();
        }
        if (getApply_to_value_string() != null) {
            _hashCode += getApply_to_value_string().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cost_item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "cost_item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_group"));
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
        elemField.setFieldName("channel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_to_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apply_to_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_to_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apply_to_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_to_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apply_to_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_to_value_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apply_to_value_string"));
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
