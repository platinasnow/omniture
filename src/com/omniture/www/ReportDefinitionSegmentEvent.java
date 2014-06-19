/**
 * ReportDefinitionSegmentEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportDefinitionSegmentEvent  implements java.io.Serializable {
    private java.lang.String id;

    private com.omniture.www.ReportDefinitionSegmentEvent[] conditions;

    public ReportDefinitionSegmentEvent() {
    }

    public ReportDefinitionSegmentEvent(
           java.lang.String id,
           com.omniture.www.ReportDefinitionSegmentEvent[] conditions) {
           this.id = id;
           this.conditions = conditions;
    }


    /**
     * Gets the id value for this ReportDefinitionSegmentEvent.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ReportDefinitionSegmentEvent.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the conditions value for this ReportDefinitionSegmentEvent.
     * 
     * @return conditions
     */
    public com.omniture.www.ReportDefinitionSegmentEvent[] getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this ReportDefinitionSegmentEvent.
     * 
     * @param conditions
     */
    public void setConditions(com.omniture.www.ReportDefinitionSegmentEvent[] conditions) {
        this.conditions = conditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionSegmentEvent)) return false;
        ReportDefinitionSegmentEvent other = (ReportDefinitionSegmentEvent) obj;
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
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              java.util.Arrays.equals(this.conditions, other.getConditions())));
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
        if (getConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionSegmentEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentEvent"));
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
