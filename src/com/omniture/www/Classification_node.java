/**
 * Classification_node.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Classification_node  implements java.io.Serializable {
    private java.lang.String rel_id;

    private int userid;

    private int div_num;

    private java.lang.String div_name;

    private int parent_div_num;

    private int campaign_view_flag;

    private int type;

    private int order;

    private com.omniture.www.Classification_node[] child_nodes;

    public Classification_node() {
    }

    public Classification_node(
           java.lang.String rel_id,
           int userid,
           int div_num,
           java.lang.String div_name,
           int parent_div_num,
           int campaign_view_flag,
           int type,
           int order,
           com.omniture.www.Classification_node[] child_nodes) {
           this.rel_id = rel_id;
           this.userid = userid;
           this.div_num = div_num;
           this.div_name = div_name;
           this.parent_div_num = parent_div_num;
           this.campaign_view_flag = campaign_view_flag;
           this.type = type;
           this.order = order;
           this.child_nodes = child_nodes;
    }


    /**
     * Gets the rel_id value for this Classification_node.
     * 
     * @return rel_id
     */
    public java.lang.String getRel_id() {
        return rel_id;
    }


    /**
     * Sets the rel_id value for this Classification_node.
     * 
     * @param rel_id
     */
    public void setRel_id(java.lang.String rel_id) {
        this.rel_id = rel_id;
    }


    /**
     * Gets the userid value for this Classification_node.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this Classification_node.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }


    /**
     * Gets the div_num value for this Classification_node.
     * 
     * @return div_num
     */
    public int getDiv_num() {
        return div_num;
    }


    /**
     * Sets the div_num value for this Classification_node.
     * 
     * @param div_num
     */
    public void setDiv_num(int div_num) {
        this.div_num = div_num;
    }


    /**
     * Gets the div_name value for this Classification_node.
     * 
     * @return div_name
     */
    public java.lang.String getDiv_name() {
        return div_name;
    }


    /**
     * Sets the div_name value for this Classification_node.
     * 
     * @param div_name
     */
    public void setDiv_name(java.lang.String div_name) {
        this.div_name = div_name;
    }


    /**
     * Gets the parent_div_num value for this Classification_node.
     * 
     * @return parent_div_num
     */
    public int getParent_div_num() {
        return parent_div_num;
    }


    /**
     * Sets the parent_div_num value for this Classification_node.
     * 
     * @param parent_div_num
     */
    public void setParent_div_num(int parent_div_num) {
        this.parent_div_num = parent_div_num;
    }


    /**
     * Gets the campaign_view_flag value for this Classification_node.
     * 
     * @return campaign_view_flag
     */
    public int getCampaign_view_flag() {
        return campaign_view_flag;
    }


    /**
     * Sets the campaign_view_flag value for this Classification_node.
     * 
     * @param campaign_view_flag
     */
    public void setCampaign_view_flag(int campaign_view_flag) {
        this.campaign_view_flag = campaign_view_flag;
    }


    /**
     * Gets the type value for this Classification_node.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this Classification_node.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the order value for this Classification_node.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this Classification_node.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * Gets the child_nodes value for this Classification_node.
     * 
     * @return child_nodes
     */
    public com.omniture.www.Classification_node[] getChild_nodes() {
        return child_nodes;
    }


    /**
     * Sets the child_nodes value for this Classification_node.
     * 
     * @param child_nodes
     */
    public void setChild_nodes(com.omniture.www.Classification_node[] child_nodes) {
        this.child_nodes = child_nodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Classification_node)) return false;
        Classification_node other = (Classification_node) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rel_id==null && other.getRel_id()==null) || 
             (this.rel_id!=null &&
              this.rel_id.equals(other.getRel_id()))) &&
            this.userid == other.getUserid() &&
            this.div_num == other.getDiv_num() &&
            ((this.div_name==null && other.getDiv_name()==null) || 
             (this.div_name!=null &&
              this.div_name.equals(other.getDiv_name()))) &&
            this.parent_div_num == other.getParent_div_num() &&
            this.campaign_view_flag == other.getCampaign_view_flag() &&
            this.type == other.getType() &&
            this.order == other.getOrder() &&
            ((this.child_nodes==null && other.getChild_nodes()==null) || 
             (this.child_nodes!=null &&
              java.util.Arrays.equals(this.child_nodes, other.getChild_nodes())));
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
        if (getRel_id() != null) {
            _hashCode += getRel_id().hashCode();
        }
        _hashCode += getUserid();
        _hashCode += getDiv_num();
        if (getDiv_name() != null) {
            _hashCode += getDiv_name().hashCode();
        }
        _hashCode += getParent_div_num();
        _hashCode += getCampaign_view_flag();
        _hashCode += getType();
        _hashCode += getOrder();
        if (getChild_nodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChild_nodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChild_nodes(), i);
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
        new org.apache.axis.description.TypeDesc(Classification_node.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "classification_node"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rel_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("div_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "div_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("div_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "div_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_div_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_div_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign_view_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaign_view_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "child_nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "classification_node"));
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
