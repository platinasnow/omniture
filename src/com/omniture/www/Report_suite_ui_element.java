/**
 * Report_suite_ui_element.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Report_suite_ui_element  implements java.io.Serializable {
    private java.lang.String rsid;

    private java.lang.String site_title;

    private com.omniture.www.Ui_element[] ui_visibility;

    public Report_suite_ui_element() {
    }

    public Report_suite_ui_element(
           java.lang.String rsid,
           java.lang.String site_title,
           com.omniture.www.Ui_element[] ui_visibility) {
           this.rsid = rsid;
           this.site_title = site_title;
           this.ui_visibility = ui_visibility;
    }


    /**
     * Gets the rsid value for this Report_suite_ui_element.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Report_suite_ui_element.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the site_title value for this Report_suite_ui_element.
     * 
     * @return site_title
     */
    public java.lang.String getSite_title() {
        return site_title;
    }


    /**
     * Sets the site_title value for this Report_suite_ui_element.
     * 
     * @param site_title
     */
    public void setSite_title(java.lang.String site_title) {
        this.site_title = site_title;
    }


    /**
     * Gets the ui_visibility value for this Report_suite_ui_element.
     * 
     * @return ui_visibility
     */
    public com.omniture.www.Ui_element[] getUi_visibility() {
        return ui_visibility;
    }


    /**
     * Sets the ui_visibility value for this Report_suite_ui_element.
     * 
     * @param ui_visibility
     */
    public void setUi_visibility(com.omniture.www.Ui_element[] ui_visibility) {
        this.ui_visibility = ui_visibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_suite_ui_element)) return false;
        Report_suite_ui_element other = (Report_suite_ui_element) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsid==null && other.getRsid()==null) || 
             (this.rsid!=null &&
              this.rsid.equals(other.getRsid()))) &&
            ((this.site_title==null && other.getSite_title()==null) || 
             (this.site_title!=null &&
              this.site_title.equals(other.getSite_title()))) &&
            ((this.ui_visibility==null && other.getUi_visibility()==null) || 
             (this.ui_visibility!=null &&
              java.util.Arrays.equals(this.ui_visibility, other.getUi_visibility())));
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
        if (getRsid() != null) {
            _hashCode += getRsid().hashCode();
        }
        if (getSite_title() != null) {
            _hashCode += getSite_title().hashCode();
        }
        if (getUi_visibility() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUi_visibility());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUi_visibility(), i);
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
        new org.apache.axis.description.TypeDesc(Report_suite_ui_element.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ui_element"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site_title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ui_visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ui_visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "ui_element"));
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
