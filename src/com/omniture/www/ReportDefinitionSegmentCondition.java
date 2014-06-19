/**
 * ReportDefinitionSegmentCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionSegmentCondition  implements java.io.Serializable {
    private com.omniture.www.ComparisonOperatorType operator;

    private java.lang.Boolean invert;

    private com.omniture.www.ReportDefinitionElement element;

    private java.lang.String[] values;

    public ReportDefinitionSegmentCondition() {
    }

    public ReportDefinitionSegmentCondition(
           com.omniture.www.ComparisonOperatorType operator,
           java.lang.Boolean invert,
           com.omniture.www.ReportDefinitionElement element,
           java.lang.String[] values) {
           this.operator = operator;
           this.invert = invert;
           this.element = element;
           this.values = values;
    }


    /**
     * Gets the operator value for this ReportDefinitionSegmentCondition.
     * 
     * @return operator
     */
    public com.omniture.www.ComparisonOperatorType getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ReportDefinitionSegmentCondition.
     * 
     * @param operator
     */
    public void setOperator(com.omniture.www.ComparisonOperatorType operator) {
        this.operator = operator;
    }


    /**
     * Gets the invert value for this ReportDefinitionSegmentCondition.
     * 
     * @return invert
     */
    public java.lang.Boolean getInvert() {
        return invert;
    }


    /**
     * Sets the invert value for this ReportDefinitionSegmentCondition.
     * 
     * @param invert
     */
    public void setInvert(java.lang.Boolean invert) {
        this.invert = invert;
    }


    /**
     * Gets the element value for this ReportDefinitionSegmentCondition.
     * 
     * @return element
     */
    public com.omniture.www.ReportDefinitionElement getElement() {
        return element;
    }


    /**
     * Sets the element value for this ReportDefinitionSegmentCondition.
     * 
     * @param element
     */
    public void setElement(com.omniture.www.ReportDefinitionElement element) {
        this.element = element;
    }


    /**
     * Gets the values value for this ReportDefinitionSegmentCondition.
     * 
     * @return values
     */
    public java.lang.String[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this ReportDefinitionSegmentCondition.
     * 
     * @param values
     */
    public void setValues(java.lang.String[] values) {
        this.values = values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionSegmentCondition)) return false;
        ReportDefinitionSegmentCondition other = (ReportDefinitionSegmentCondition) obj;
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
            ((this.invert==null && other.getInvert()==null) || 
             (this.invert!=null &&
              this.invert.equals(other.getInvert()))) &&
            ((this.element==null && other.getElement()==null) || 
             (this.element!=null &&
              this.element.equals(other.getElement()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getInvert() != null) {
            _hashCode += getInvert().hashCode();
        }
        if (getElement() != null) {
            _hashCode += getElement().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionSegmentCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "comparisonOperatorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element");
        elemField.setXmlName(new javax.xml.namespace.QName("", "element"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElement"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("", "values"));
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
