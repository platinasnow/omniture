/**
 * ReportDefinitionSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionSegment  implements java.io.Serializable {
    private com.omniture.www.ReportDefinitionSegmentType type;

    private java.lang.Boolean invert;

    private com.omniture.www.BooleanOperatorType operator;

    private com.omniture.www.ReportDefinitionSegmentConditions conditions;

    private com.omniture.www.ReportDefinitionSegment[] segments;

    private com.omniture.www.ReportDefinitionSegmentEvent[] events;

    public ReportDefinitionSegment() {
    }

    public ReportDefinitionSegment(
           com.omniture.www.ReportDefinitionSegmentType type,
           java.lang.Boolean invert,
           com.omniture.www.BooleanOperatorType operator,
           com.omniture.www.ReportDefinitionSegmentConditions conditions,
           com.omniture.www.ReportDefinitionSegment[] segments,
           com.omniture.www.ReportDefinitionSegmentEvent[] events) {
           this.type = type;
           this.invert = invert;
           this.operator = operator;
           this.conditions = conditions;
           this.segments = segments;
           this.events = events;
    }


    /**
     * Gets the type value for this ReportDefinitionSegment.
     * 
     * @return type
     */
    public com.omniture.www.ReportDefinitionSegmentType getType() {
        return type;
    }


    /**
     * Sets the type value for this ReportDefinitionSegment.
     * 
     * @param type
     */
    public void setType(com.omniture.www.ReportDefinitionSegmentType type) {
        this.type = type;
    }


    /**
     * Gets the invert value for this ReportDefinitionSegment.
     * 
     * @return invert
     */
    public java.lang.Boolean getInvert() {
        return invert;
    }


    /**
     * Sets the invert value for this ReportDefinitionSegment.
     * 
     * @param invert
     */
    public void setInvert(java.lang.Boolean invert) {
        this.invert = invert;
    }


    /**
     * Gets the operator value for this ReportDefinitionSegment.
     * 
     * @return operator
     */
    public com.omniture.www.BooleanOperatorType getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ReportDefinitionSegment.
     * 
     * @param operator
     */
    public void setOperator(com.omniture.www.BooleanOperatorType operator) {
        this.operator = operator;
    }


    /**
     * Gets the conditions value for this ReportDefinitionSegment.
     * 
     * @return conditions
     */
    public com.omniture.www.ReportDefinitionSegmentConditions getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this ReportDefinitionSegment.
     * 
     * @param conditions
     */
    public void setConditions(com.omniture.www.ReportDefinitionSegmentConditions conditions) {
        this.conditions = conditions;
    }


    /**
     * Gets the segments value for this ReportDefinitionSegment.
     * 
     * @return segments
     */
    public com.omniture.www.ReportDefinitionSegment[] getSegments() {
        return segments;
    }


    /**
     * Sets the segments value for this ReportDefinitionSegment.
     * 
     * @param segments
     */
    public void setSegments(com.omniture.www.ReportDefinitionSegment[] segments) {
        this.segments = segments;
    }


    /**
     * Gets the events value for this ReportDefinitionSegment.
     * 
     * @return events
     */
    public com.omniture.www.ReportDefinitionSegmentEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this ReportDefinitionSegment.
     * 
     * @param events
     */
    public void setEvents(com.omniture.www.ReportDefinitionSegmentEvent[] events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionSegment)) return false;
        ReportDefinitionSegment other = (ReportDefinitionSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.invert==null && other.getInvert()==null) || 
             (this.invert!=null &&
              this.invert.equals(other.getInvert()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              this.conditions.equals(other.getConditions()))) &&
            ((this.segments==null && other.getSegments()==null) || 
             (this.segments!=null &&
              java.util.Arrays.equals(this.segments, other.getSegments()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getInvert() != null) {
            _hashCode += getInvert().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getConditions() != null) {
            _hashCode += getConditions().hashCode();
        }
        if (getSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "booleanOperatorType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentConditions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentEvent"));
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
