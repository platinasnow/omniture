/**
 * DsFileStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class DsFileStruct  implements java.io.Serializable {
    private java.lang.String dataSourceID;

    private java.lang.String dataSourceName;

    private com.omniture.www.DataSourceFileInfo[] dsFileInfo;

    public DsFileStruct() {
    }

    public DsFileStruct(
           java.lang.String dataSourceID,
           java.lang.String dataSourceName,
           com.omniture.www.DataSourceFileInfo[] dsFileInfo) {
           this.dataSourceID = dataSourceID;
           this.dataSourceName = dataSourceName;
           this.dsFileInfo = dsFileInfo;
    }


    /**
     * Gets the dataSourceID value for this DsFileStruct.
     * 
     * @return dataSourceID
     */
    public java.lang.String getDataSourceID() {
        return dataSourceID;
    }


    /**
     * Sets the dataSourceID value for this DsFileStruct.
     * 
     * @param dataSourceID
     */
    public void setDataSourceID(java.lang.String dataSourceID) {
        this.dataSourceID = dataSourceID;
    }


    /**
     * Gets the dataSourceName value for this DsFileStruct.
     * 
     * @return dataSourceName
     */
    public java.lang.String getDataSourceName() {
        return dataSourceName;
    }


    /**
     * Sets the dataSourceName value for this DsFileStruct.
     * 
     * @param dataSourceName
     */
    public void setDataSourceName(java.lang.String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


    /**
     * Gets the dsFileInfo value for this DsFileStruct.
     * 
     * @return dsFileInfo
     */
    public com.omniture.www.DataSourceFileInfo[] getDsFileInfo() {
        return dsFileInfo;
    }


    /**
     * Sets the dsFileInfo value for this DsFileStruct.
     * 
     * @param dsFileInfo
     */
    public void setDsFileInfo(com.omniture.www.DataSourceFileInfo[] dsFileInfo) {
        this.dsFileInfo = dsFileInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DsFileStruct)) return false;
        DsFileStruct other = (DsFileStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataSourceID==null && other.getDataSourceID()==null) || 
             (this.dataSourceID!=null &&
              this.dataSourceID.equals(other.getDataSourceID()))) &&
            ((this.dataSourceName==null && other.getDataSourceName()==null) || 
             (this.dataSourceName!=null &&
              this.dataSourceName.equals(other.getDataSourceName()))) &&
            ((this.dsFileInfo==null && other.getDsFileInfo()==null) || 
             (this.dsFileInfo!=null &&
              java.util.Arrays.equals(this.dsFileInfo, other.getDsFileInfo())));
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
        if (getDataSourceID() != null) {
            _hashCode += getDataSourceID().hashCode();
        }
        if (getDataSourceName() != null) {
            _hashCode += getDataSourceName().hashCode();
        }
        if (getDsFileInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsFileInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsFileInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DsFileStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "dsFileStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsFileInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dsFileInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFileInfo"));
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
