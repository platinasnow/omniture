/**
 * DeliveryParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class DeliveryParameters  implements java.io.Serializable {
    private java.lang.String emailTo;

    private java.lang.String emailFrom;

    private java.lang.String[] publishingList;

    private java.lang.String emailSubject;

    private java.lang.String emailNotes;

    private java.lang.String ftpHost;

    private java.lang.String ftpUser;

    private java.lang.String ftpPassword;

    private java.lang.String ftpPort;

    private java.lang.String ftpPath;

    private com.omniture.www.ReportDefinitionLocale locale;

    private com.omniture.www.ScheduleFileFormat fileFormat;

    private com.omniture.www.ScheduleDeliveryType deliveryType;

    private boolean isCompressed;

    public DeliveryParameters() {
    }

    public DeliveryParameters(
           java.lang.String emailTo,
           java.lang.String emailFrom,
           java.lang.String[] publishingList,
           java.lang.String emailSubject,
           java.lang.String emailNotes,
           java.lang.String ftpHost,
           java.lang.String ftpUser,
           java.lang.String ftpPassword,
           java.lang.String ftpPort,
           java.lang.String ftpPath,
           com.omniture.www.ReportDefinitionLocale locale,
           com.omniture.www.ScheduleFileFormat fileFormat,
           com.omniture.www.ScheduleDeliveryType deliveryType,
           boolean isCompressed) {
           this.emailTo = emailTo;
           this.emailFrom = emailFrom;
           this.publishingList = publishingList;
           this.emailSubject = emailSubject;
           this.emailNotes = emailNotes;
           this.ftpHost = ftpHost;
           this.ftpUser = ftpUser;
           this.ftpPassword = ftpPassword;
           this.ftpPort = ftpPort;
           this.ftpPath = ftpPath;
           this.locale = locale;
           this.fileFormat = fileFormat;
           this.deliveryType = deliveryType;
           this.isCompressed = isCompressed;
    }


    /**
     * Gets the emailTo value for this DeliveryParameters.
     * 
     * @return emailTo
     */
    public java.lang.String getEmailTo() {
        return emailTo;
    }


    /**
     * Sets the emailTo value for this DeliveryParameters.
     * 
     * @param emailTo
     */
    public void setEmailTo(java.lang.String emailTo) {
        this.emailTo = emailTo;
    }


    /**
     * Gets the emailFrom value for this DeliveryParameters.
     * 
     * @return emailFrom
     */
    public java.lang.String getEmailFrom() {
        return emailFrom;
    }


    /**
     * Sets the emailFrom value for this DeliveryParameters.
     * 
     * @param emailFrom
     */
    public void setEmailFrom(java.lang.String emailFrom) {
        this.emailFrom = emailFrom;
    }


    /**
     * Gets the publishingList value for this DeliveryParameters.
     * 
     * @return publishingList
     */
    public java.lang.String[] getPublishingList() {
        return publishingList;
    }


    /**
     * Sets the publishingList value for this DeliveryParameters.
     * 
     * @param publishingList
     */
    public void setPublishingList(java.lang.String[] publishingList) {
        this.publishingList = publishingList;
    }


    /**
     * Gets the emailSubject value for this DeliveryParameters.
     * 
     * @return emailSubject
     */
    public java.lang.String getEmailSubject() {
        return emailSubject;
    }


    /**
     * Sets the emailSubject value for this DeliveryParameters.
     * 
     * @param emailSubject
     */
    public void setEmailSubject(java.lang.String emailSubject) {
        this.emailSubject = emailSubject;
    }


    /**
     * Gets the emailNotes value for this DeliveryParameters.
     * 
     * @return emailNotes
     */
    public java.lang.String getEmailNotes() {
        return emailNotes;
    }


    /**
     * Sets the emailNotes value for this DeliveryParameters.
     * 
     * @param emailNotes
     */
    public void setEmailNotes(java.lang.String emailNotes) {
        this.emailNotes = emailNotes;
    }


    /**
     * Gets the ftpHost value for this DeliveryParameters.
     * 
     * @return ftpHost
     */
    public java.lang.String getFtpHost() {
        return ftpHost;
    }


    /**
     * Sets the ftpHost value for this DeliveryParameters.
     * 
     * @param ftpHost
     */
    public void setFtpHost(java.lang.String ftpHost) {
        this.ftpHost = ftpHost;
    }


    /**
     * Gets the ftpUser value for this DeliveryParameters.
     * 
     * @return ftpUser
     */
    public java.lang.String getFtpUser() {
        return ftpUser;
    }


    /**
     * Sets the ftpUser value for this DeliveryParameters.
     * 
     * @param ftpUser
     */
    public void setFtpUser(java.lang.String ftpUser) {
        this.ftpUser = ftpUser;
    }


    /**
     * Gets the ftpPassword value for this DeliveryParameters.
     * 
     * @return ftpPassword
     */
    public java.lang.String getFtpPassword() {
        return ftpPassword;
    }


    /**
     * Sets the ftpPassword value for this DeliveryParameters.
     * 
     * @param ftpPassword
     */
    public void setFtpPassword(java.lang.String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }


    /**
     * Gets the ftpPort value for this DeliveryParameters.
     * 
     * @return ftpPort
     */
    public java.lang.String getFtpPort() {
        return ftpPort;
    }


    /**
     * Sets the ftpPort value for this DeliveryParameters.
     * 
     * @param ftpPort
     */
    public void setFtpPort(java.lang.String ftpPort) {
        this.ftpPort = ftpPort;
    }


    /**
     * Gets the ftpPath value for this DeliveryParameters.
     * 
     * @return ftpPath
     */
    public java.lang.String getFtpPath() {
        return ftpPath;
    }


    /**
     * Sets the ftpPath value for this DeliveryParameters.
     * 
     * @param ftpPath
     */
    public void setFtpPath(java.lang.String ftpPath) {
        this.ftpPath = ftpPath;
    }


    /**
     * Gets the locale value for this DeliveryParameters.
     * 
     * @return locale
     */
    public com.omniture.www.ReportDefinitionLocale getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this DeliveryParameters.
     * 
     * @param locale
     */
    public void setLocale(com.omniture.www.ReportDefinitionLocale locale) {
        this.locale = locale;
    }


    /**
     * Gets the fileFormat value for this DeliveryParameters.
     * 
     * @return fileFormat
     */
    public com.omniture.www.ScheduleFileFormat getFileFormat() {
        return fileFormat;
    }


    /**
     * Sets the fileFormat value for this DeliveryParameters.
     * 
     * @param fileFormat
     */
    public void setFileFormat(com.omniture.www.ScheduleFileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }


    /**
     * Gets the deliveryType value for this DeliveryParameters.
     * 
     * @return deliveryType
     */
    public com.omniture.www.ScheduleDeliveryType getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this DeliveryParameters.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(com.omniture.www.ScheduleDeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the isCompressed value for this DeliveryParameters.
     * 
     * @return isCompressed
     */
    public boolean isIsCompressed() {
        return isCompressed;
    }


    /**
     * Sets the isCompressed value for this DeliveryParameters.
     * 
     * @param isCompressed
     */
    public void setIsCompressed(boolean isCompressed) {
        this.isCompressed = isCompressed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryParameters)) return false;
        DeliveryParameters other = (DeliveryParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailTo==null && other.getEmailTo()==null) || 
             (this.emailTo!=null &&
              this.emailTo.equals(other.getEmailTo()))) &&
            ((this.emailFrom==null && other.getEmailFrom()==null) || 
             (this.emailFrom!=null &&
              this.emailFrom.equals(other.getEmailFrom()))) &&
            ((this.publishingList==null && other.getPublishingList()==null) || 
             (this.publishingList!=null &&
              java.util.Arrays.equals(this.publishingList, other.getPublishingList()))) &&
            ((this.emailSubject==null && other.getEmailSubject()==null) || 
             (this.emailSubject!=null &&
              this.emailSubject.equals(other.getEmailSubject()))) &&
            ((this.emailNotes==null && other.getEmailNotes()==null) || 
             (this.emailNotes!=null &&
              this.emailNotes.equals(other.getEmailNotes()))) &&
            ((this.ftpHost==null && other.getFtpHost()==null) || 
             (this.ftpHost!=null &&
              this.ftpHost.equals(other.getFtpHost()))) &&
            ((this.ftpUser==null && other.getFtpUser()==null) || 
             (this.ftpUser!=null &&
              this.ftpUser.equals(other.getFtpUser()))) &&
            ((this.ftpPassword==null && other.getFtpPassword()==null) || 
             (this.ftpPassword!=null &&
              this.ftpPassword.equals(other.getFtpPassword()))) &&
            ((this.ftpPort==null && other.getFtpPort()==null) || 
             (this.ftpPort!=null &&
              this.ftpPort.equals(other.getFtpPort()))) &&
            ((this.ftpPath==null && other.getFtpPath()==null) || 
             (this.ftpPath!=null &&
              this.ftpPath.equals(other.getFtpPath()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.fileFormat==null && other.getFileFormat()==null) || 
             (this.fileFormat!=null &&
              this.fileFormat.equals(other.getFileFormat()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            this.isCompressed == other.isIsCompressed();
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
        if (getEmailTo() != null) {
            _hashCode += getEmailTo().hashCode();
        }
        if (getEmailFrom() != null) {
            _hashCode += getEmailFrom().hashCode();
        }
        if (getPublishingList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublishingList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublishingList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailSubject() != null) {
            _hashCode += getEmailSubject().hashCode();
        }
        if (getEmailNotes() != null) {
            _hashCode += getEmailNotes().hashCode();
        }
        if (getFtpHost() != null) {
            _hashCode += getFtpHost().hashCode();
        }
        if (getFtpUser() != null) {
            _hashCode += getFtpUser().hashCode();
        }
        if (getFtpPassword() != null) {
            _hashCode += getFtpPassword().hashCode();
        }
        if (getFtpPort() != null) {
            _hashCode += getFtpPort().hashCode();
        }
        if (getFtpPath() != null) {
            _hashCode += getFtpPath().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getFileFormat() != null) {
            _hashCode += getFileFormat().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        _hashCode += (isIsCompressed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "deliveryParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publishingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpUser"));
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
        elemField.setFieldName("ftpPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpPort"));
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
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionLocale"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleFileFormat"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleDeliveryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompressed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCompressed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
