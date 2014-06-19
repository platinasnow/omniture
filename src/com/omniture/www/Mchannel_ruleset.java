/**
 * Mchannel_ruleset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Mchannel_ruleset  implements java.io.Serializable {
    private int ruleset_id;

    private int channel_id;

    private com.omniture.www.Ruleset_junction_type junction;

    private com.omniture.www.Tc_source_attribute channel_value;

    private com.omniture.www.Mchannel_rule[] rules;

    public Mchannel_ruleset() {
    }

    public Mchannel_ruleset(
           int ruleset_id,
           int channel_id,
           com.omniture.www.Ruleset_junction_type junction,
           com.omniture.www.Tc_source_attribute channel_value,
           com.omniture.www.Mchannel_rule[] rules) {
           this.ruleset_id = ruleset_id;
           this.channel_id = channel_id;
           this.junction = junction;
           this.channel_value = channel_value;
           this.rules = rules;
    }


    /**
     * Gets the ruleset_id value for this Mchannel_ruleset.
     * 
     * @return ruleset_id
     */
    public int getRuleset_id() {
        return ruleset_id;
    }


    /**
     * Sets the ruleset_id value for this Mchannel_ruleset.
     * 
     * @param ruleset_id
     */
    public void setRuleset_id(int ruleset_id) {
        this.ruleset_id = ruleset_id;
    }


    /**
     * Gets the channel_id value for this Mchannel_ruleset.
     * 
     * @return channel_id
     */
    public int getChannel_id() {
        return channel_id;
    }


    /**
     * Sets the channel_id value for this Mchannel_ruleset.
     * 
     * @param channel_id
     */
    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }


    /**
     * Gets the junction value for this Mchannel_ruleset.
     * 
     * @return junction
     */
    public com.omniture.www.Ruleset_junction_type getJunction() {
        return junction;
    }


    /**
     * Sets the junction value for this Mchannel_ruleset.
     * 
     * @param junction
     */
    public void setJunction(com.omniture.www.Ruleset_junction_type junction) {
        this.junction = junction;
    }


    /**
     * Gets the channel_value value for this Mchannel_ruleset.
     * 
     * @return channel_value
     */
    public com.omniture.www.Tc_source_attribute getChannel_value() {
        return channel_value;
    }


    /**
     * Sets the channel_value value for this Mchannel_ruleset.
     * 
     * @param channel_value
     */
    public void setChannel_value(com.omniture.www.Tc_source_attribute channel_value) {
        this.channel_value = channel_value;
    }


    /**
     * Gets the rules value for this Mchannel_ruleset.
     * 
     * @return rules
     */
    public com.omniture.www.Mchannel_rule[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this Mchannel_ruleset.
     * 
     * @param rules
     */
    public void setRules(com.omniture.www.Mchannel_rule[] rules) {
        this.rules = rules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mchannel_ruleset)) return false;
        Mchannel_ruleset other = (Mchannel_ruleset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ruleset_id == other.getRuleset_id() &&
            this.channel_id == other.getChannel_id() &&
            ((this.junction==null && other.getJunction()==null) || 
             (this.junction!=null &&
              this.junction.equals(other.getJunction()))) &&
            ((this.channel_value==null && other.getChannel_value()==null) || 
             (this.channel_value!=null &&
              this.channel_value.equals(other.getChannel_value()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules())));
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
        _hashCode += getRuleset_id();
        _hashCode += getChannel_id();
        if (getJunction() != null) {
            _hashCode += getJunction().hashCode();
        }
        if (getChannel_value() != null) {
            _hashCode += getChannel_value().hashCode();
        }
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
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
        new org.apache.axis.description.TypeDesc(Mchannel_ruleset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_ruleset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleset_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleset_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("junction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "junction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ruleset_junction_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "tc_source_attribute"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rule"));
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
