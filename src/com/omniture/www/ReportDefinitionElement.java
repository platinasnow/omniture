/**
 * ReportDefinitionElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionElement  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String classification;

    private java.lang.Integer top;

    private java.lang.Integer startingWith;

    private com.omniture.www.ReportDefinitionSearch search;

    private java.lang.String[] selected;

    private com.omniture.www.ReportDefinitionExpanded expanded;

    public ReportDefinitionElement() {
    }

    public ReportDefinitionElement(
           java.lang.String id,
           java.lang.String classification,
           java.lang.Integer top,
           java.lang.Integer startingWith,
           com.omniture.www.ReportDefinitionSearch search,
           java.lang.String[] selected,
           com.omniture.www.ReportDefinitionExpanded expanded) {
           this.id = id;
           this.classification = classification;
           this.top = top;
           this.startingWith = startingWith;
           this.search = search;
           this.selected = selected;
           this.expanded = expanded;
    }


    /**
     * Gets the id value for this ReportDefinitionElement.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ReportDefinitionElement.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the classification value for this ReportDefinitionElement.
     * 
     * @return classification
     */
    public java.lang.String getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this ReportDefinitionElement.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String classification) {
        this.classification = classification;
    }


    /**
     * Gets the top value for this ReportDefinitionElement.
     * 
     * @return top
     */
    public java.lang.Integer getTop() {
        return top;
    }


    /**
     * Sets the top value for this ReportDefinitionElement.
     * 
     * @param top
     */
    public void setTop(java.lang.Integer top) {
        this.top = top;
    }


    /**
     * Gets the startingWith value for this ReportDefinitionElement.
     * 
     * @return startingWith
     */
    public java.lang.Integer getStartingWith() {
        return startingWith;
    }


    /**
     * Sets the startingWith value for this ReportDefinitionElement.
     * 
     * @param startingWith
     */
    public void setStartingWith(java.lang.Integer startingWith) {
        this.startingWith = startingWith;
    }


    /**
     * Gets the search value for this ReportDefinitionElement.
     * 
     * @return search
     */
    public com.omniture.www.ReportDefinitionSearch getSearch() {
        return search;
    }


    /**
     * Sets the search value for this ReportDefinitionElement.
     * 
     * @param search
     */
    public void setSearch(com.omniture.www.ReportDefinitionSearch search) {
        this.search = search;
    }


    /**
     * Gets the selected value for this ReportDefinitionElement.
     * 
     * @return selected
     */
    public java.lang.String[] getSelected() {
        return selected;
    }


    /**
     * Sets the selected value for this ReportDefinitionElement.
     * 
     * @param selected
     */
    public void setSelected(java.lang.String[] selected) {
        this.selected = selected;
    }


    /**
     * Gets the expanded value for this ReportDefinitionElement.
     * 
     * @return expanded
     */
    public com.omniture.www.ReportDefinitionExpanded getExpanded() {
        return expanded;
    }


    /**
     * Sets the expanded value for this ReportDefinitionElement.
     * 
     * @param expanded
     */
    public void setExpanded(com.omniture.www.ReportDefinitionExpanded expanded) {
        this.expanded = expanded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionElement)) return false;
        ReportDefinitionElement other = (ReportDefinitionElement) obj;
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
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.top==null && other.getTop()==null) || 
             (this.top!=null &&
              this.top.equals(other.getTop()))) &&
            ((this.startingWith==null && other.getStartingWith()==null) || 
             (this.startingWith!=null &&
              this.startingWith.equals(other.getStartingWith()))) &&
            ((this.search==null && other.getSearch()==null) || 
             (this.search!=null &&
              this.search.equals(other.getSearch()))) &&
            ((this.selected==null && other.getSelected()==null) || 
             (this.selected!=null &&
              java.util.Arrays.equals(this.selected, other.getSelected()))) &&
            ((this.expanded==null && other.getExpanded()==null) || 
             (this.expanded!=null &&
              this.expanded.equals(other.getExpanded())));
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
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getTop() != null) {
            _hashCode += getTop().hashCode();
        }
        if (getStartingWith() != null) {
            _hashCode += getStartingWith().hashCode();
        }
        if (getSearch() != null) {
            _hashCode += getSearch().hashCode();
        }
        if (getSelected() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelected());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelected(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpanded() != null) {
            _hashCode += getExpanded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDefinitionElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("", "top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingWith");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startingWith"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearch"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expanded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expanded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionExpanded"));
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
