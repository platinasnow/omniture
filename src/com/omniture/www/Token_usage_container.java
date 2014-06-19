/**
 * Token_usage_container.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Token_usage_container  implements java.io.Serializable {
    private int allowed_tokens;

    private int used_tokens_total;

    private java.lang.String token_period;

    private java.lang.String status;

    private int overage_enabled;

    private com.omniture.www.User_token_usage[] token_usage;

    public Token_usage_container() {
    }

    public Token_usage_container(
           int allowed_tokens,
           int used_tokens_total,
           java.lang.String token_period,
           java.lang.String status,
           int overage_enabled,
           com.omniture.www.User_token_usage[] token_usage) {
           this.allowed_tokens = allowed_tokens;
           this.used_tokens_total = used_tokens_total;
           this.token_period = token_period;
           this.status = status;
           this.overage_enabled = overage_enabled;
           this.token_usage = token_usage;
    }


    /**
     * Gets the allowed_tokens value for this Token_usage_container.
     * 
     * @return allowed_tokens
     */
    public int getAllowed_tokens() {
        return allowed_tokens;
    }


    /**
     * Sets the allowed_tokens value for this Token_usage_container.
     * 
     * @param allowed_tokens
     */
    public void setAllowed_tokens(int allowed_tokens) {
        this.allowed_tokens = allowed_tokens;
    }


    /**
     * Gets the used_tokens_total value for this Token_usage_container.
     * 
     * @return used_tokens_total
     */
    public int getUsed_tokens_total() {
        return used_tokens_total;
    }


    /**
     * Sets the used_tokens_total value for this Token_usage_container.
     * 
     * @param used_tokens_total
     */
    public void setUsed_tokens_total(int used_tokens_total) {
        this.used_tokens_total = used_tokens_total;
    }


    /**
     * Gets the token_period value for this Token_usage_container.
     * 
     * @return token_period
     */
    public java.lang.String getToken_period() {
        return token_period;
    }


    /**
     * Sets the token_period value for this Token_usage_container.
     * 
     * @param token_period
     */
    public void setToken_period(java.lang.String token_period) {
        this.token_period = token_period;
    }


    /**
     * Gets the status value for this Token_usage_container.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Token_usage_container.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the overage_enabled value for this Token_usage_container.
     * 
     * @return overage_enabled
     */
    public int getOverage_enabled() {
        return overage_enabled;
    }


    /**
     * Sets the overage_enabled value for this Token_usage_container.
     * 
     * @param overage_enabled
     */
    public void setOverage_enabled(int overage_enabled) {
        this.overage_enabled = overage_enabled;
    }


    /**
     * Gets the token_usage value for this Token_usage_container.
     * 
     * @return token_usage
     */
    public com.omniture.www.User_token_usage[] getToken_usage() {
        return token_usage;
    }


    /**
     * Sets the token_usage value for this Token_usage_container.
     * 
     * @param token_usage
     */
    public void setToken_usage(com.omniture.www.User_token_usage[] token_usage) {
        this.token_usage = token_usage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Token_usage_container)) return false;
        Token_usage_container other = (Token_usage_container) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowed_tokens == other.getAllowed_tokens() &&
            this.used_tokens_total == other.getUsed_tokens_total() &&
            ((this.token_period==null && other.getToken_period()==null) || 
             (this.token_period!=null &&
              this.token_period.equals(other.getToken_period()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.overage_enabled == other.getOverage_enabled() &&
            ((this.token_usage==null && other.getToken_usage()==null) || 
             (this.token_usage!=null &&
              java.util.Arrays.equals(this.token_usage, other.getToken_usage())));
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
        _hashCode += getAllowed_tokens();
        _hashCode += getUsed_tokens_total();
        if (getToken_period() != null) {
            _hashCode += getToken_period().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getOverage_enabled();
        if (getToken_usage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToken_usage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToken_usage(), i);
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
        new org.apache.axis.description.TypeDesc(Token_usage_container.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "token_usage_container"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowed_tokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowed_tokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used_tokens_total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "used_tokens_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token_period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overage_enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overage_enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token_usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token_usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "user_token_usage"));
        elemField.setNillable(true);
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
