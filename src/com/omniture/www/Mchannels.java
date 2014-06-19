/**
 * Mchannels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Mchannels  implements java.io.Serializable {
    private java.lang.String rsid;

    private com.omniture.www.Mchannel[] marketing_channels;

    public Mchannels() {
    }

    public Mchannels(
           java.lang.String rsid,
           com.omniture.www.Mchannel[] marketing_channels) {
           this.rsid = rsid;
           this.marketing_channels = marketing_channels;
    }


    /**
     * Gets the rsid value for this Mchannels.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Mchannels.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the marketing_channels value for this Mchannels.
     * 
     * @return marketing_channels
     */
    public com.omniture.www.Mchannel[] getMarketing_channels() {
        return marketing_channels;
    }


    /**
     * Sets the marketing_channels value for this Mchannels.
     * 
     * @param marketing_channels
     */
    public void setMarketing_channels(com.omniture.www.Mchannel[] marketing_channels) {
        this.marketing_channels = marketing_channels;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mchannels)) return false;
        Mchannels other = (Mchannels) obj;
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
            ((this.marketing_channels==null && other.getMarketing_channels()==null) || 
             (this.marketing_channels!=null &&
              java.util.Arrays.equals(this.marketing_channels, other.getMarketing_channels())));
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
        if (getMarketing_channels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketing_channels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketing_channels(), i);
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
        new org.apache.axis.description.TypeDesc(Mchannels.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannels"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing_channels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketing_channels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel"));
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
