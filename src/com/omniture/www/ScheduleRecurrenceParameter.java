/**
 * ScheduleRecurrenceParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ScheduleRecurrenceParameter  implements java.io.Serializable {
    private com.omniture.www.ScheduleFrequency frequency;

    private com.omniture.www.ScheduleDayOfWeek dayOfWeek;

    private int dayOfMonth;

    private int runHour;

    private int recurrence;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private com.omniture.www.ScheduleSequence sequence;

    private com.omniture.www.ScheduleCancelType cancelType;

    private int cancelOccurence;

    private com.omniture.www.ScheduleMonth month;

    private java.lang.String timezoneOffset;

    public ScheduleRecurrenceParameter() {
    }

    public ScheduleRecurrenceParameter(
           com.omniture.www.ScheduleFrequency frequency,
           com.omniture.www.ScheduleDayOfWeek dayOfWeek,
           int dayOfMonth,
           int runHour,
           int recurrence,
           java.lang.String startDate,
           java.lang.String endDate,
           com.omniture.www.ScheduleSequence sequence,
           com.omniture.www.ScheduleCancelType cancelType,
           int cancelOccurence,
           com.omniture.www.ScheduleMonth month,
           java.lang.String timezoneOffset) {
           this.frequency = frequency;
           this.dayOfWeek = dayOfWeek;
           this.dayOfMonth = dayOfMonth;
           this.runHour = runHour;
           this.recurrence = recurrence;
           this.startDate = startDate;
           this.endDate = endDate;
           this.sequence = sequence;
           this.cancelType = cancelType;
           this.cancelOccurence = cancelOccurence;
           this.month = month;
           this.timezoneOffset = timezoneOffset;
    }


    /**
     * Gets the frequency value for this ScheduleRecurrenceParameter.
     * 
     * @return frequency
     */
    public com.omniture.www.ScheduleFrequency getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this ScheduleRecurrenceParameter.
     * 
     * @param frequency
     */
    public void setFrequency(com.omniture.www.ScheduleFrequency frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the dayOfWeek value for this ScheduleRecurrenceParameter.
     * 
     * @return dayOfWeek
     */
    public com.omniture.www.ScheduleDayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this ScheduleRecurrenceParameter.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(com.omniture.www.ScheduleDayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the dayOfMonth value for this ScheduleRecurrenceParameter.
     * 
     * @return dayOfMonth
     */
    public int getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this ScheduleRecurrenceParameter.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the runHour value for this ScheduleRecurrenceParameter.
     * 
     * @return runHour
     */
    public int getRunHour() {
        return runHour;
    }


    /**
     * Sets the runHour value for this ScheduleRecurrenceParameter.
     * 
     * @param runHour
     */
    public void setRunHour(int runHour) {
        this.runHour = runHour;
    }


    /**
     * Gets the recurrence value for this ScheduleRecurrenceParameter.
     * 
     * @return recurrence
     */
    public int getRecurrence() {
        return recurrence;
    }


    /**
     * Sets the recurrence value for this ScheduleRecurrenceParameter.
     * 
     * @param recurrence
     */
    public void setRecurrence(int recurrence) {
        this.recurrence = recurrence;
    }


    /**
     * Gets the startDate value for this ScheduleRecurrenceParameter.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ScheduleRecurrenceParameter.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ScheduleRecurrenceParameter.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ScheduleRecurrenceParameter.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the sequence value for this ScheduleRecurrenceParameter.
     * 
     * @return sequence
     */
    public com.omniture.www.ScheduleSequence getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ScheduleRecurrenceParameter.
     * 
     * @param sequence
     */
    public void setSequence(com.omniture.www.ScheduleSequence sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the cancelType value for this ScheduleRecurrenceParameter.
     * 
     * @return cancelType
     */
    public com.omniture.www.ScheduleCancelType getCancelType() {
        return cancelType;
    }


    /**
     * Sets the cancelType value for this ScheduleRecurrenceParameter.
     * 
     * @param cancelType
     */
    public void setCancelType(com.omniture.www.ScheduleCancelType cancelType) {
        this.cancelType = cancelType;
    }


    /**
     * Gets the cancelOccurence value for this ScheduleRecurrenceParameter.
     * 
     * @return cancelOccurence
     */
    public int getCancelOccurence() {
        return cancelOccurence;
    }


    /**
     * Sets the cancelOccurence value for this ScheduleRecurrenceParameter.
     * 
     * @param cancelOccurence
     */
    public void setCancelOccurence(int cancelOccurence) {
        this.cancelOccurence = cancelOccurence;
    }


    /**
     * Gets the month value for this ScheduleRecurrenceParameter.
     * 
     * @return month
     */
    public com.omniture.www.ScheduleMonth getMonth() {
        return month;
    }


    /**
     * Sets the month value for this ScheduleRecurrenceParameter.
     * 
     * @param month
     */
    public void setMonth(com.omniture.www.ScheduleMonth month) {
        this.month = month;
    }


    /**
     * Gets the timezoneOffset value for this ScheduleRecurrenceParameter.
     * 
     * @return timezoneOffset
     */
    public java.lang.String getTimezoneOffset() {
        return timezoneOffset;
    }


    /**
     * Sets the timezoneOffset value for this ScheduleRecurrenceParameter.
     * 
     * @param timezoneOffset
     */
    public void setTimezoneOffset(java.lang.String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleRecurrenceParameter)) return false;
        ScheduleRecurrenceParameter other = (ScheduleRecurrenceParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            this.dayOfMonth == other.getDayOfMonth() &&
            this.runHour == other.getRunHour() &&
            this.recurrence == other.getRecurrence() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.cancelType==null && other.getCancelType()==null) || 
             (this.cancelType!=null &&
              this.cancelType.equals(other.getCancelType()))) &&
            this.cancelOccurence == other.getCancelOccurence() &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.timezoneOffset==null && other.getTimezoneOffset()==null) || 
             (this.timezoneOffset!=null &&
              this.timezoneOffset.equals(other.getTimezoneOffset())));
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
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        _hashCode += getDayOfMonth();
        _hashCode += getRunHour();
        _hashCode += getRecurrence();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getCancelType() != null) {
            _hashCode += getCancelType().hashCode();
        }
        _hashCode += getCancelOccurence();
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getTimezoneOffset() != null) {
            _hashCode += getTimezoneOffset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleRecurrenceParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleRecurrenceParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleFrequency"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleDayOfWeek"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runHour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleSequence"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleCancelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelOccurence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelOccurence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleMonth"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezoneOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezoneOffset"));
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
