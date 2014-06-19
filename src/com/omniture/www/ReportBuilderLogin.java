/**
 * ReportBuilderLogin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ReportBuilderLogin  implements java.io.Serializable {
    private java.lang.String email;

    private java.lang.String version;

    private int maxScheduledTasks;

    private boolean isAdmin;

    private com.omniture.www.Report_suite_settings[] reportSuites;

    public ReportBuilderLogin() {
    }

    public ReportBuilderLogin(
           java.lang.String email,
           java.lang.String version,
           int maxScheduledTasks,
           boolean isAdmin,
           com.omniture.www.Report_suite_settings[] reportSuites) {
           this.email = email;
           this.version = version;
           this.maxScheduledTasks = maxScheduledTasks;
           this.isAdmin = isAdmin;
           this.reportSuites = reportSuites;
    }


    /**
     * Gets the email value for this ReportBuilderLogin.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ReportBuilderLogin.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the version value for this ReportBuilderLogin.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ReportBuilderLogin.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the maxScheduledTasks value for this ReportBuilderLogin.
     * 
     * @return maxScheduledTasks
     */
    public int getMaxScheduledTasks() {
        return maxScheduledTasks;
    }


    /**
     * Sets the maxScheduledTasks value for this ReportBuilderLogin.
     * 
     * @param maxScheduledTasks
     */
    public void setMaxScheduledTasks(int maxScheduledTasks) {
        this.maxScheduledTasks = maxScheduledTasks;
    }


    /**
     * Gets the isAdmin value for this ReportBuilderLogin.
     * 
     * @return isAdmin
     */
    public boolean isIsAdmin() {
        return isAdmin;
    }


    /**
     * Sets the isAdmin value for this ReportBuilderLogin.
     * 
     * @param isAdmin
     */
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Gets the reportSuites value for this ReportBuilderLogin.
     * 
     * @return reportSuites
     */
    public com.omniture.www.Report_suite_settings[] getReportSuites() {
        return reportSuites;
    }


    /**
     * Sets the reportSuites value for this ReportBuilderLogin.
     * 
     * @param reportSuites
     */
    public void setReportSuites(com.omniture.www.Report_suite_settings[] reportSuites) {
        this.reportSuites = reportSuites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportBuilderLogin)) return false;
        ReportBuilderLogin other = (ReportBuilderLogin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            this.maxScheduledTasks == other.getMaxScheduledTasks() &&
            this.isAdmin == other.isIsAdmin() &&
            ((this.reportSuites==null && other.getReportSuites()==null) || 
             (this.reportSuites!=null &&
              java.util.Arrays.equals(this.reportSuites, other.getReportSuites())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        _hashCode += getMaxScheduledTasks();
        _hashCode += (isIsAdmin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReportSuites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportSuites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportSuites(), i);
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
        new org.apache.axis.description.TypeDesc(ReportBuilderLogin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportBuilderLogin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxScheduledTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxScheduledTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportSuites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportSuites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_settings"));
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
