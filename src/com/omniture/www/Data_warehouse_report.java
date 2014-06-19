/**
 * Data_warehouse_report.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Data_warehouse_report  implements java.io.Serializable {
    private int start_row;

    private int end_row;

    private boolean finished;

    private java.lang.String[] headings;

    private java.lang.String[][] rows;

    public Data_warehouse_report() {
    }

    public Data_warehouse_report(
           int start_row,
           int end_row,
           boolean finished,
           java.lang.String[] headings,
           java.lang.String[][] rows) {
           this.start_row = start_row;
           this.end_row = end_row;
           this.finished = finished;
           this.headings = headings;
           this.rows = rows;
    }


    /**
     * Gets the start_row value for this Data_warehouse_report.
     * 
     * @return start_row
     */
    public int getStart_row() {
        return start_row;
    }


    /**
     * Sets the start_row value for this Data_warehouse_report.
     * 
     * @param start_row
     */
    public void setStart_row(int start_row) {
        this.start_row = start_row;
    }


    /**
     * Gets the end_row value for this Data_warehouse_report.
     * 
     * @return end_row
     */
    public int getEnd_row() {
        return end_row;
    }


    /**
     * Sets the end_row value for this Data_warehouse_report.
     * 
     * @param end_row
     */
    public void setEnd_row(int end_row) {
        this.end_row = end_row;
    }


    /**
     * Gets the finished value for this Data_warehouse_report.
     * 
     * @return finished
     */
    public boolean isFinished() {
        return finished;
    }


    /**
     * Sets the finished value for this Data_warehouse_report.
     * 
     * @param finished
     */
    public void setFinished(boolean finished) {
        this.finished = finished;
    }


    /**
     * Gets the headings value for this Data_warehouse_report.
     * 
     * @return headings
     */
    public java.lang.String[] getHeadings() {
        return headings;
    }


    /**
     * Sets the headings value for this Data_warehouse_report.
     * 
     * @param headings
     */
    public void setHeadings(java.lang.String[] headings) {
        this.headings = headings;
    }


    /**
     * Gets the rows value for this Data_warehouse_report.
     * 
     * @return rows
     */
    public java.lang.String[][] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this Data_warehouse_report.
     * 
     * @param rows
     */
    public void setRows(java.lang.String[][] rows) {
        this.rows = rows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data_warehouse_report)) return false;
        Data_warehouse_report other = (Data_warehouse_report) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.start_row == other.getStart_row() &&
            this.end_row == other.getEnd_row() &&
            this.finished == other.isFinished() &&
            ((this.headings==null && other.getHeadings()==null) || 
             (this.headings!=null &&
              java.util.Arrays.equals(this.headings, other.getHeadings()))) &&
            ((this.rows==null && other.getRows()==null) || 
             (this.rows!=null &&
              java.util.Arrays.equals(this.rows, other.getRows())));
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
        _hashCode += getStart_row();
        _hashCode += getEnd_row();
        _hashCode += (isFinished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHeadings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeadings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeadings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRows(), i);
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
        new org.apache.axis.description.TypeDesc(Data_warehouse_report.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_row");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_row"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_row");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_row"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finished");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report_row"));
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
