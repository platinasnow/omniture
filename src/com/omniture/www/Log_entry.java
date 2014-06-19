/**
 * Log_entry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Log_entry  implements java.io.Serializable {
    private java.lang.String login;

    private java.lang.String data_string;

    private java.lang.String company;

    private java.util.Calendar log_date;

    private java.lang.String rsid;

    private java.lang.String log_type;

    private java.lang.String log_sub_type;

    private int log_id;

    public Log_entry() {
    }

    public Log_entry(
           java.lang.String login,
           java.lang.String data_string,
           java.lang.String company,
           java.util.Calendar log_date,
           java.lang.String rsid,
           java.lang.String log_type,
           java.lang.String log_sub_type,
           int log_id) {
           this.login = login;
           this.data_string = data_string;
           this.company = company;
           this.log_date = log_date;
           this.rsid = rsid;
           this.log_type = log_type;
           this.log_sub_type = log_sub_type;
           this.log_id = log_id;
    }


    /**
     * Gets the login value for this Log_entry.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Log_entry.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the data_string value for this Log_entry.
     * 
     * @return data_string
     */
    public java.lang.String getData_string() {
        return data_string;
    }


    /**
     * Sets the data_string value for this Log_entry.
     * 
     * @param data_string
     */
    public void setData_string(java.lang.String data_string) {
        this.data_string = data_string;
    }


    /**
     * Gets the company value for this Log_entry.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Log_entry.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the log_date value for this Log_entry.
     * 
     * @return log_date
     */
    public java.util.Calendar getLog_date() {
        return log_date;
    }


    /**
     * Sets the log_date value for this Log_entry.
     * 
     * @param log_date
     */
    public void setLog_date(java.util.Calendar log_date) {
        this.log_date = log_date;
    }


    /**
     * Gets the rsid value for this Log_entry.
     * 
     * @return rsid
     */
    public java.lang.String getRsid() {
        return rsid;
    }


    /**
     * Sets the rsid value for this Log_entry.
     * 
     * @param rsid
     */
    public void setRsid(java.lang.String rsid) {
        this.rsid = rsid;
    }


    /**
     * Gets the log_type value for this Log_entry.
     * 
     * @return log_type
     */
    public java.lang.String getLog_type() {
        return log_type;
    }


    /**
     * Sets the log_type value for this Log_entry.
     * 
     * @param log_type
     */
    public void setLog_type(java.lang.String log_type) {
        this.log_type = log_type;
    }


    /**
     * Gets the log_sub_type value for this Log_entry.
     * 
     * @return log_sub_type
     */
    public java.lang.String getLog_sub_type() {
        return log_sub_type;
    }


    /**
     * Sets the log_sub_type value for this Log_entry.
     * 
     * @param log_sub_type
     */
    public void setLog_sub_type(java.lang.String log_sub_type) {
        this.log_sub_type = log_sub_type;
    }


    /**
     * Gets the log_id value for this Log_entry.
     * 
     * @return log_id
     */
    public int getLog_id() {
        return log_id;
    }


    /**
     * Sets the log_id value for this Log_entry.
     * 
     * @param log_id
     */
    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Log_entry)) return false;
        Log_entry other = (Log_entry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.data_string==null && other.getData_string()==null) || 
             (this.data_string!=null &&
              this.data_string.equals(other.getData_string()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.log_date==null && other.getLog_date()==null) || 
             (this.log_date!=null &&
              this.log_date.equals(other.getLog_date()))) &&
            ((this.rsid==null && other.getRsid()==null) || 
             (this.rsid!=null &&
              this.rsid.equals(other.getRsid()))) &&
            ((this.log_type==null && other.getLog_type()==null) || 
             (this.log_type!=null &&
              this.log_type.equals(other.getLog_type()))) &&
            ((this.log_sub_type==null && other.getLog_sub_type()==null) || 
             (this.log_sub_type!=null &&
              this.log_sub_type.equals(other.getLog_sub_type()))) &&
            this.log_id == other.getLog_id();
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getData_string() != null) {
            _hashCode += getData_string().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getLog_date() != null) {
            _hashCode += getLog_date().hashCode();
        }
        if (getRsid() != null) {
            _hashCode += getRsid().hashCode();
        }
        if (getLog_type() != null) {
            _hashCode += getLog_type().hashCode();
        }
        if (getLog_sub_type() != null) {
            _hashCode += getLog_sub_type().hashCode();
        }
        _hashCode += getLog_id();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Log_entry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_entry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "log_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "log_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log_sub_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "log_sub_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "log_id"));
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
