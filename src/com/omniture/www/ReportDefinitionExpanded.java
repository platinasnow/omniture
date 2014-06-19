/**
 * ReportDefinitionExpanded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionExpanded  implements java.io.Serializable {
    private int[] rows;

    private com.omniture.www.ReportDefinitionSearch search;

    private java.lang.String[] selected;

    public ReportDefinitionExpanded() {
    }

    public ReportDefinitionExpanded(
           int[] rows,
           com.omniture.www.ReportDefinitionSearch search,
           java.lang.String[] selected) {
           this.rows = rows;
           this.search = search;
           this.selected = selected;
    }


    /**
     * Gets the rows value for this ReportDefinitionExpanded.
     * 
     * @return rows
     */
    public int[] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this ReportDefinitionExpanded.
     * 
     * @param rows
     */
    public void setRows(int[] rows) {
        this.rows = rows;
    }


    /**
     * Gets the search value for this ReportDefinitionExpanded.
     * 
     * @return search
     */
    public com.omniture.www.ReportDefinitionSearch getSearch() {
        return search;
    }


    /**
     * Sets the search value for this ReportDefinitionExpanded.
     * 
     * @param search
     */
    public void setSearch(com.omniture.www.ReportDefinitionSearch search) {
        this.search = search;
    }


    /**
     * Gets the selected value for this ReportDefinitionExpanded.
     * 
     * @return selected
     */
    public java.lang.String[] getSelected() {
        return selected;
    }


    /**
     * Sets the selected value for this ReportDefinitionExpanded.
     * 
     * @param selected
     */
    public void setSelected(java.lang.String[] selected) {
        this.selected = selected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionExpanded)) return false;
        ReportDefinitionExpanded other = (ReportDefinitionExpanded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rows==null && other.getRows()==null) || 
             (this.rows!=null &&
              java.util.Arrays.equals(this.rows, other.getRows()))) &&
            ((this.search==null && other.getSearch()==null) || 
             (this.search!=null &&
              this.search.equals(other.getSearch()))) &&
            ((this.selected==null && other.getSelected()==null) || 
             (this.selected!=null &&
              java.util.Arrays.equals(this.selected, other.getSelected())));
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
        if (getRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDefinitionExpanded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionExpanded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rows"));
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
