/**
 * Mchannel_rule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Mchannel_rule  implements java.io.Serializable {
    private int rule_id;

    private com.omniture.www.Hit_attribute hit_attribute;

    private com.omniture.www.Ruleset_operator_type operator;

    private java.lang.String[] matches;

    public Mchannel_rule() {
    }

    public Mchannel_rule(
           int rule_id,
           com.omniture.www.Hit_attribute hit_attribute,
           com.omniture.www.Ruleset_operator_type operator,
           java.lang.String[] matches) {
           this.rule_id = rule_id;
           this.hit_attribute = hit_attribute;
           this.operator = operator;
           this.matches = matches;
    }


    /**
     * Gets the rule_id value for this Mchannel_rule.
     * 
     * @return rule_id
     */
    public int getRule_id() {
        return rule_id;
    }


    /**
     * Sets the rule_id value for this Mchannel_rule.
     * 
     * @param rule_id
     */
    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }


    /**
     * Gets the hit_attribute value for this Mchannel_rule.
     * 
     * @return hit_attribute
     */
    public com.omniture.www.Hit_attribute getHit_attribute() {
        return hit_attribute;
    }


    /**
     * Sets the hit_attribute value for this Mchannel_rule.
     * 
     * @param hit_attribute
     */
    public void setHit_attribute(com.omniture.www.Hit_attribute hit_attribute) {
        this.hit_attribute = hit_attribute;
    }


    /**
     * Gets the operator value for this Mchannel_rule.
     * 
     * @return operator
     */
    public com.omniture.www.Ruleset_operator_type getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Mchannel_rule.
     * 
     * @param operator
     */
    public void setOperator(com.omniture.www.Ruleset_operator_type operator) {
        this.operator = operator;
    }


    /**
     * Gets the matches value for this Mchannel_rule.
     * 
     * @return matches
     */
    public java.lang.String[] getMatches() {
        return matches;
    }


    /**
     * Sets the matches value for this Mchannel_rule.
     * 
     * @param matches
     */
    public void setMatches(java.lang.String[] matches) {
        this.matches = matches;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mchannel_rule)) return false;
        Mchannel_rule other = (Mchannel_rule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.rule_id == other.getRule_id() &&
            ((this.hit_attribute==null && other.getHit_attribute()==null) || 
             (this.hit_attribute!=null &&
              this.hit_attribute.equals(other.getHit_attribute()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.matches==null && other.getMatches()==null) || 
             (this.matches!=null &&
              java.util.Arrays.equals(this.matches, other.getMatches())));
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
        _hashCode += getRule_id();
        if (getHit_attribute() != null) {
            _hashCode += getHit_attribute().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getMatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatches(), i);
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
        new org.apache.axis.description.TypeDesc(Mchannel_rule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit_attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hit_attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hit_attribute"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ruleset_operator_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matches");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matches"));
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
