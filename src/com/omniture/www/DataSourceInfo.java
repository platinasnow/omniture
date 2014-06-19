/**
 * DataSourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class DataSourceInfo  implements java.io.Serializable {
    private java.lang.String dataSourceID;

    private java.lang.String type;

    private java.lang.String name;

    private java.lang.String email;

    private java.lang.String activatedDate;

    private java.lang.String ftpPath;

    private java.lang.String ftpLoginID;

    private java.lang.String ftpPassword;

    private int haltOnWarning;

    private int haltOnError;

    private int lockedByError;

    public DataSourceInfo() {
    }

    public DataSourceInfo(
           java.lang.String dataSourceID,
           java.lang.String type,
           java.lang.String name,
           java.lang.String email,
           java.lang.String activatedDate,
           java.lang.String ftpPath,
           java.lang.String ftpLoginID,
           java.lang.String ftpPassword,
           int haltOnWarning,
           int haltOnError,
           int lockedByError) {
           this.dataSourceID = dataSourceID;
           this.type = type;
           this.name = name;
           this.email = email;
           this.activatedDate = activatedDate;
           this.ftpPath = ftpPath;
           this.ftpLoginID = ftpLoginID;
           this.ftpPassword = ftpPassword;
           this.haltOnWarning = haltOnWarning;
           this.haltOnError = haltOnError;
           this.lockedByError = lockedByError;
    }


    /**
     * Gets the dataSourceID value for this DataSourceInfo.
     * 
     * @return dataSourceID
     */
    public java.lang.String getDataSourceID() {
        return dataSourceID;
    }


    /**
     * Sets the dataSourceID value for this DataSourceInfo.
     * 
     * @param dataSourceID
     */
    public void setDataSourceID(java.lang.String dataSourceID) {
        this.dataSourceID = dataSourceID;
    }


    /**
     * Gets the type value for this DataSourceInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DataSourceInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this DataSourceInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DataSourceInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the email value for this DataSourceInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this DataSourceInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the activatedDate value for this DataSourceInfo.
     * 
     * @return activatedDate
     */
    public java.lang.String getActivatedDate() {
        return activatedDate;
    }


    /**
     * Sets the activatedDate value for this DataSourceInfo.
     * 
     * @param activatedDate
     */
    public void setActivatedDate(java.lang.String activatedDate) {
        this.activatedDate = activatedDate;
    }


    /**
     * Gets the ftpPath value for this DataSourceInfo.
     * 
     * @return ftpPath
     */
    public java.lang.String getFtpPath() {
        return ftpPath;
    }


    /**
     * Sets the ftpPath value for this DataSourceInfo.
     * 
     * @param ftpPath
     */
    public void setFtpPath(java.lang.String ftpPath) {
        this.ftpPath = ftpPath;
    }


    /**
     * Gets the ftpLoginID value for this DataSourceInfo.
     * 
     * @return ftpLoginID
     */
    public java.lang.String getFtpLoginID() {
        return ftpLoginID;
    }


    /**
     * Sets the ftpLoginID value for this DataSourceInfo.
     * 
     * @param ftpLoginID
     */
    public void setFtpLoginID(java.lang.String ftpLoginID) {
        this.ftpLoginID = ftpLoginID;
    }


    /**
     * Gets the ftpPassword value for this DataSourceInfo.
     * 
     * @return ftpPassword
     */
    public java.lang.String getFtpPassword() {
        return ftpPassword;
    }


    /**
     * Sets the ftpPassword value for this DataSourceInfo.
     * 
     * @param ftpPassword
     */
    public void setFtpPassword(java.lang.String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }


    /**
     * Gets the haltOnWarning value for this DataSourceInfo.
     * 
     * @return haltOnWarning
     */
    public int getHaltOnWarning() {
        return haltOnWarning;
    }


    /**
     * Sets the haltOnWarning value for this DataSourceInfo.
     * 
     * @param haltOnWarning
     */
    public void setHaltOnWarning(int haltOnWarning) {
        this.haltOnWarning = haltOnWarning;
    }


    /**
     * Gets the haltOnError value for this DataSourceInfo.
     * 
     * @return haltOnError
     */
    public int getHaltOnError() {
        return haltOnError;
    }


    /**
     * Sets the haltOnError value for this DataSourceInfo.
     * 
     * @param haltOnError
     */
    public void setHaltOnError(int haltOnError) {
        this.haltOnError = haltOnError;
    }


    /**
     * Gets the lockedByError value for this DataSourceInfo.
     * 
     * @return lockedByError
     */
    public int getLockedByError() {
        return lockedByError;
    }


    /**
     * Sets the lockedByError value for this DataSourceInfo.
     * 
     * @param lockedByError
     */
    public void setLockedByError(int lockedByError) {
        this.lockedByError = lockedByError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSourceInfo)) return false;
        DataSourceInfo other = (DataSourceInfo) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.activatedDate==null && other.getActivatedDate()==null) || 
             (this.activatedDate!=null &&
              this.activatedDate.equals(other.getActivatedDate()))) &&
            ((this.ftpPath==null && other.getFtpPath()==null) || 
             (this.ftpPath!=null &&
              this.ftpPath.equals(other.getFtpPath()))) &&
            ((this.ftpLoginID==null && other.getFtpLoginID()==null) || 
             (this.ftpLoginID!=null &&
              this.ftpLoginID.equals(other.getFtpLoginID()))) &&
            ((this.ftpPassword==null && other.getFtpPassword()==null) || 
             (this.ftpPassword!=null &&
              this.ftpPassword.equals(other.getFtpPassword()))) &&
            this.haltOnWarning == other.getHaltOnWarning() &&
            this.haltOnError == other.getHaltOnError() &&
            this.lockedByError == other.getLockedByError();
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getActivatedDate() != null) {
            _hashCode += getActivatedDate().hashCode();
        }
        if (getFtpPath() != null) {
            _hashCode += getFtpPath().hashCode();
        }
        if (getFtpLoginID() != null) {
            _hashCode += getFtpLoginID().hashCode();
        }
        if (getFtpPassword() != null) {
            _hashCode += getFtpPassword().hashCode();
        }
        _hashCode += getHaltOnWarning();
        _hashCode += getHaltOnError();
        _hashCode += getLockedByError();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSourceID"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpLoginID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpLoginID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haltOnWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "haltOnWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haltOnError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "haltOnError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedByError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockedByError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
