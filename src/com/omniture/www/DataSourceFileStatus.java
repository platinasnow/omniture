/**
 * DataSourceFileStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class DataSourceFileStatus  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String startDate;

    private java.lang.String finishDate;

    private int fileSizeBytes;

    private int fileRows;

    private java.lang.String[] errors;

    private java.lang.String[] warnings;

    private java.lang.String receivedDate;

    private java.lang.String status;

    public DataSourceFileStatus() {
    }

    public DataSourceFileStatus(
           java.lang.String fileName,
           java.lang.String startDate,
           java.lang.String finishDate,
           int fileSizeBytes,
           int fileRows,
           java.lang.String[] errors,
           java.lang.String[] warnings,
           java.lang.String receivedDate,
           java.lang.String status) {
           this.fileName = fileName;
           this.startDate = startDate;
           this.finishDate = finishDate;
           this.fileSizeBytes = fileSizeBytes;
           this.fileRows = fileRows;
           this.errors = errors;
           this.warnings = warnings;
           this.receivedDate = receivedDate;
           this.status = status;
    }


    /**
     * Gets the fileName value for this DataSourceFileStatus.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this DataSourceFileStatus.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the startDate value for this DataSourceFileStatus.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DataSourceFileStatus.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the finishDate value for this DataSourceFileStatus.
     * 
     * @return finishDate
     */
    public java.lang.String getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this DataSourceFileStatus.
     * 
     * @param finishDate
     */
    public void setFinishDate(java.lang.String finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the fileSizeBytes value for this DataSourceFileStatus.
     * 
     * @return fileSizeBytes
     */
    public int getFileSizeBytes() {
        return fileSizeBytes;
    }


    /**
     * Sets the fileSizeBytes value for this DataSourceFileStatus.
     * 
     * @param fileSizeBytes
     */
    public void setFileSizeBytes(int fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }


    /**
     * Gets the fileRows value for this DataSourceFileStatus.
     * 
     * @return fileRows
     */
    public int getFileRows() {
        return fileRows;
    }


    /**
     * Sets the fileRows value for this DataSourceFileStatus.
     * 
     * @param fileRows
     */
    public void setFileRows(int fileRows) {
        this.fileRows = fileRows;
    }


    /**
     * Gets the errors value for this DataSourceFileStatus.
     * 
     * @return errors
     */
    public java.lang.String[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this DataSourceFileStatus.
     * 
     * @param errors
     */
    public void setErrors(java.lang.String[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the warnings value for this DataSourceFileStatus.
     * 
     * @return warnings
     */
    public java.lang.String[] getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this DataSourceFileStatus.
     * 
     * @param warnings
     */
    public void setWarnings(java.lang.String[] warnings) {
        this.warnings = warnings;
    }


    /**
     * Gets the receivedDate value for this DataSourceFileStatus.
     * 
     * @return receivedDate
     */
    public java.lang.String getReceivedDate() {
        return receivedDate;
    }


    /**
     * Sets the receivedDate value for this DataSourceFileStatus.
     * 
     * @param receivedDate
     */
    public void setReceivedDate(java.lang.String receivedDate) {
        this.receivedDate = receivedDate;
    }


    /**
     * Gets the status value for this DataSourceFileStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DataSourceFileStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSourceFileStatus)) return false;
        DataSourceFileStatus other = (DataSourceFileStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            this.fileSizeBytes == other.getFileSizeBytes() &&
            this.fileRows == other.getFileRows() &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.warnings==null && other.getWarnings()==null) || 
             (this.warnings!=null &&
              java.util.Arrays.equals(this.warnings, other.getWarnings()))) &&
            ((this.receivedDate==null && other.getReceivedDate()==null) || 
             (this.receivedDate!=null &&
              this.receivedDate.equals(other.getReceivedDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        _hashCode += getFileSizeBytes();
        _hashCode += getFileRows();
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarnings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceivedDate() != null) {
            _hashCode += getReceivedDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSourceFileStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFileStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSizeBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSizeBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
