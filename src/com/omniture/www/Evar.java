/**
 * Evar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Evar  implements java.io.Serializable {
    private int evar_num;

    private java.lang.String name;

    private com.omniture.www.Evar_alloc_type_enum alloc_type;

    private com.omniture.www.Evar_merch_alloc_type_enum merch_alloc_type;

    private java.lang.Integer linear_num_items;

    private com.omniture.www.Evar_type_enum type;

    private com.omniture.www.Evar_sub_type_enum sub_type;

    private com.omniture.www.Evar_exp_type_enum exp_type;

    private int exp_num_periods;

    private com.omniture.www.Evar_merch_syntax_type_enum merch_syntax_type;

    private int[] binding_events;

    private int in_queue;

    private int status;

    public Evar() {
    }

    public Evar(
           int evar_num,
           java.lang.String name,
           com.omniture.www.Evar_alloc_type_enum alloc_type,
           com.omniture.www.Evar_merch_alloc_type_enum merch_alloc_type,
           java.lang.Integer linear_num_items,
           com.omniture.www.Evar_type_enum type,
           com.omniture.www.Evar_sub_type_enum sub_type,
           com.omniture.www.Evar_exp_type_enum exp_type,
           int exp_num_periods,
           com.omniture.www.Evar_merch_syntax_type_enum merch_syntax_type,
           int[] binding_events,
           int in_queue,
           int status) {
           this.evar_num = evar_num;
           this.name = name;
           this.alloc_type = alloc_type;
           this.merch_alloc_type = merch_alloc_type;
           this.linear_num_items = linear_num_items;
           this.type = type;
           this.sub_type = sub_type;
           this.exp_type = exp_type;
           this.exp_num_periods = exp_num_periods;
           this.merch_syntax_type = merch_syntax_type;
           this.binding_events = binding_events;
           this.in_queue = in_queue;
           this.status = status;
    }


    /**
     * Gets the evar_num value for this Evar.
     * 
     * @return evar_num
     */
    public int getEvar_num() {
        return evar_num;
    }


    /**
     * Sets the evar_num value for this Evar.
     * 
     * @param evar_num
     */
    public void setEvar_num(int evar_num) {
        this.evar_num = evar_num;
    }


    /**
     * Gets the name value for this Evar.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Evar.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the alloc_type value for this Evar.
     * 
     * @return alloc_type
     */
    public com.omniture.www.Evar_alloc_type_enum getAlloc_type() {
        return alloc_type;
    }


    /**
     * Sets the alloc_type value for this Evar.
     * 
     * @param alloc_type
     */
    public void setAlloc_type(com.omniture.www.Evar_alloc_type_enum alloc_type) {
        this.alloc_type = alloc_type;
    }


    /**
     * Gets the merch_alloc_type value for this Evar.
     * 
     * @return merch_alloc_type
     */
    public com.omniture.www.Evar_merch_alloc_type_enum getMerch_alloc_type() {
        return merch_alloc_type;
    }


    /**
     * Sets the merch_alloc_type value for this Evar.
     * 
     * @param merch_alloc_type
     */
    public void setMerch_alloc_type(com.omniture.www.Evar_merch_alloc_type_enum merch_alloc_type) {
        this.merch_alloc_type = merch_alloc_type;
    }


    /**
     * Gets the linear_num_items value for this Evar.
     * 
     * @return linear_num_items
     */
    public java.lang.Integer getLinear_num_items() {
        return linear_num_items;
    }


    /**
     * Sets the linear_num_items value for this Evar.
     * 
     * @param linear_num_items
     */
    public void setLinear_num_items(java.lang.Integer linear_num_items) {
        this.linear_num_items = linear_num_items;
    }


    /**
     * Gets the type value for this Evar.
     * 
     * @return type
     */
    public com.omniture.www.Evar_type_enum getType() {
        return type;
    }


    /**
     * Sets the type value for this Evar.
     * 
     * @param type
     */
    public void setType(com.omniture.www.Evar_type_enum type) {
        this.type = type;
    }


    /**
     * Gets the sub_type value for this Evar.
     * 
     * @return sub_type
     */
    public com.omniture.www.Evar_sub_type_enum getSub_type() {
        return sub_type;
    }


    /**
     * Sets the sub_type value for this Evar.
     * 
     * @param sub_type
     */
    public void setSub_type(com.omniture.www.Evar_sub_type_enum sub_type) {
        this.sub_type = sub_type;
    }


    /**
     * Gets the exp_type value for this Evar.
     * 
     * @return exp_type
     */
    public com.omniture.www.Evar_exp_type_enum getExp_type() {
        return exp_type;
    }


    /**
     * Sets the exp_type value for this Evar.
     * 
     * @param exp_type
     */
    public void setExp_type(com.omniture.www.Evar_exp_type_enum exp_type) {
        this.exp_type = exp_type;
    }


    /**
     * Gets the exp_num_periods value for this Evar.
     * 
     * @return exp_num_periods
     */
    public int getExp_num_periods() {
        return exp_num_periods;
    }


    /**
     * Sets the exp_num_periods value for this Evar.
     * 
     * @param exp_num_periods
     */
    public void setExp_num_periods(int exp_num_periods) {
        this.exp_num_periods = exp_num_periods;
    }


    /**
     * Gets the merch_syntax_type value for this Evar.
     * 
     * @return merch_syntax_type
     */
    public com.omniture.www.Evar_merch_syntax_type_enum getMerch_syntax_type() {
        return merch_syntax_type;
    }


    /**
     * Sets the merch_syntax_type value for this Evar.
     * 
     * @param merch_syntax_type
     */
    public void setMerch_syntax_type(com.omniture.www.Evar_merch_syntax_type_enum merch_syntax_type) {
        this.merch_syntax_type = merch_syntax_type;
    }


    /**
     * Gets the binding_events value for this Evar.
     * 
     * @return binding_events
     */
    public int[] getBinding_events() {
        return binding_events;
    }


    /**
     * Sets the binding_events value for this Evar.
     * 
     * @param binding_events
     */
    public void setBinding_events(int[] binding_events) {
        this.binding_events = binding_events;
    }


    /**
     * Gets the in_queue value for this Evar.
     * 
     * @return in_queue
     */
    public int getIn_queue() {
        return in_queue;
    }


    /**
     * Sets the in_queue value for this Evar.
     * 
     * @param in_queue
     */
    public void setIn_queue(int in_queue) {
        this.in_queue = in_queue;
    }


    /**
     * Gets the status value for this Evar.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Evar.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evar)) return false;
        Evar other = (Evar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.evar_num == other.getEvar_num() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.alloc_type==null && other.getAlloc_type()==null) || 
             (this.alloc_type!=null &&
              this.alloc_type.equals(other.getAlloc_type()))) &&
            ((this.merch_alloc_type==null && other.getMerch_alloc_type()==null) || 
             (this.merch_alloc_type!=null &&
              this.merch_alloc_type.equals(other.getMerch_alloc_type()))) &&
            ((this.linear_num_items==null && other.getLinear_num_items()==null) || 
             (this.linear_num_items!=null &&
              this.linear_num_items.equals(other.getLinear_num_items()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.sub_type==null && other.getSub_type()==null) || 
             (this.sub_type!=null &&
              this.sub_type.equals(other.getSub_type()))) &&
            ((this.exp_type==null && other.getExp_type()==null) || 
             (this.exp_type!=null &&
              this.exp_type.equals(other.getExp_type()))) &&
            this.exp_num_periods == other.getExp_num_periods() &&
            ((this.merch_syntax_type==null && other.getMerch_syntax_type()==null) || 
             (this.merch_syntax_type!=null &&
              this.merch_syntax_type.equals(other.getMerch_syntax_type()))) &&
            ((this.binding_events==null && other.getBinding_events()==null) || 
             (this.binding_events!=null &&
              java.util.Arrays.equals(this.binding_events, other.getBinding_events()))) &&
            this.in_queue == other.getIn_queue() &&
            this.status == other.getStatus();
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
        _hashCode += getEvar_num();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAlloc_type() != null) {
            _hashCode += getAlloc_type().hashCode();
        }
        if (getMerch_alloc_type() != null) {
            _hashCode += getMerch_alloc_type().hashCode();
        }
        if (getLinear_num_items() != null) {
            _hashCode += getLinear_num_items().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSub_type() != null) {
            _hashCode += getSub_type().hashCode();
        }
        if (getExp_type() != null) {
            _hashCode += getExp_type().hashCode();
        }
        _hashCode += getExp_num_periods();
        if (getMerch_syntax_type() != null) {
            _hashCode += getMerch_syntax_type().hashCode();
        }
        if (getBinding_events() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinding_events());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinding_events(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getIn_queue();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Evar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evar_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evar_num"));
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
        elemField.setFieldName("alloc_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alloc_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar_alloc_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merch_alloc_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merch_alloc_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar_merch_alloc_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linear_num_items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linear_num_items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sub_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar_sub_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exp_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exp_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar_exp_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exp_num_periods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exp_num_periods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merch_syntax_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merch_syntax_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar_merch_syntax_type_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binding_events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binding_events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "in_queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
