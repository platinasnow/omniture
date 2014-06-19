/**
 * Saved_filter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Saved_filter  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String dateFrom;

    private java.lang.String dateTo;

    private boolean isShared;

    private boolean isOwner;

    private com.omniture.www.ReportDefinitionElement[] element;

    private java.lang.String rsid;

    public Saved_filter() {
    }

    public Saved_filter(
           int id,
           java.lang.String name,
           java.lang.String type,
           java.lang.String dateFrom,
           java.lang.String dateTo,
           boolean isShared,
           boolean isOwner,
           com.omniture.www.ReportDefinitionElement[] element,
           java.lang.String rsid) {
           this.id = id;
           this.name = name;
           this.type = type;
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.isShared = isShared;
           this.isOwner = isOwner;
           this.element = element;
           this.rsid = rsid;
    }


    /**
     * Gets the id value for this Saved_filter.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Saved_filter.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Saved_filter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Saved_filter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this Saved_filter.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Saved_filter.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the dateFrom value for this Saved_filter.
     * 
     * @return dateFrom
     */
    public java.lang.String getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this Saved_filter.
     * 
     * @param dateFrom
     */
    public void setDateFrom(java.lang.String dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this Saved_filter.
     * 
     * @return dateTo
     */
    public java.lang.String getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this Saved_filter.
     * 
     * @param dateTo
     */
    public void setDateTo(java.lang.String dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the isShared value for this Saved_filter.
     * 
     * @return isShared
     */
    public boolean isIsShared() {
        return isShared;
    }


    /**
     * Sets the isShared value for this Saved_filter.
     * 
     * @param isShared
     */
    public void setIsShared(boolean isShared) {
        this.isShared = isShared;
    }


    /**
     * Gets the isOwner value for this Saved_filter.
     * 
     * @return isOwner
     */
    public boolean isIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this Saved_filter.
     * 
     * @param isOwner
     */
    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * Gets the element value for this Saved_filter.
     * 
     * @return element
     */
    public com.omniture.www.ReportDefinitionElement[] getElement() {
        return element;
    }


    /**
     * Sets the element value for this Saved_filter.
     * 
     * @param element
     */
    public void setElement(com.omniture.www.ReportDefinitionElement[] element) {
        this.element = element;
    }


    /**
     * Gets the rsid value for this Saved_filter.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Saved_filter.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Saved_filter)) return false;
        Saved_filter other = (Saved_filter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            this.isShared == other.isIsShared() &&
            this.isOwner == other.isIsOwner() &&
            ((this.element==null && other.getElement()==null) || 
             (this.element!=null &&
              java.util.Arrays.equals(this.element, other.getElement()))) &&
            ((this.rsid==null && other.getRsid()==null) || 
             (this.rsid!=null &&
              this.rsid.equals(other.getRsid())));
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
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        _hashCode += (isIsShared() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsOwner() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsid() != null) {
            _hashCode += getRsid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Saved_filter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShared");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isShared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element");
        elemField.setXmlName(new javax.xml.namespace.QName("", "element"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElement"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid"));
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
