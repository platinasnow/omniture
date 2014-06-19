/**
 * Video_tracking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Video_tracking  implements java.io.Serializable {
    private java.lang.String enabled;

    private java.lang.String visits_tracked;

    private java.lang.String daily_visitors_tracked;

    private java.lang.String paths_tracked;

    private java.lang.String conversion_level;

    private java.lang.String segments_tracked;

    private java.lang.String segment_length;

    private java.lang.String allocate_success;

    private java.lang.String history_expiration;

    public Video_tracking() {
    }

    public Video_tracking(
           java.lang.String enabled,
           java.lang.String visits_tracked,
           java.lang.String daily_visitors_tracked,
           java.lang.String paths_tracked,
           java.lang.String conversion_level,
           java.lang.String segments_tracked,
           java.lang.String segment_length,
           java.lang.String allocate_success,
           java.lang.String history_expiration) {
           this.enabled = enabled;
           this.visits_tracked = visits_tracked;
           this.daily_visitors_tracked = daily_visitors_tracked;
           this.paths_tracked = paths_tracked;
           this.conversion_level = conversion_level;
           this.segments_tracked = segments_tracked;
           this.segment_length = segment_length;
           this.allocate_success = allocate_success;
           this.history_expiration = history_expiration;
    }


    /**
     * Gets the enabled value for this Video_tracking.
     * 
     * @return enabled
     */
    public java.lang.String getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this Video_tracking.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.String enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the visits_tracked value for this Video_tracking.
     * 
     * @return visits_tracked
     */
    public java.lang.String getVisits_tracked() {
        return visits_tracked;
    }


    /**
     * Sets the visits_tracked value for this Video_tracking.
     * 
     * @param visits_tracked
     */
    public void setVisits_tracked(java.lang.String visits_tracked) {
        this.visits_tracked = visits_tracked;
    }


    /**
     * Gets the daily_visitors_tracked value for this Video_tracking.
     * 
     * @return daily_visitors_tracked
     */
    public java.lang.String getDaily_visitors_tracked() {
        return daily_visitors_tracked;
    }


    /**
     * Sets the daily_visitors_tracked value for this Video_tracking.
     * 
     * @param daily_visitors_tracked
     */
    public void setDaily_visitors_tracked(java.lang.String daily_visitors_tracked) {
        this.daily_visitors_tracked = daily_visitors_tracked;
    }


    /**
     * Gets the paths_tracked value for this Video_tracking.
     * 
     * @return paths_tracked
     */
    public java.lang.String getPaths_tracked() {
        return paths_tracked;
    }


    /**
     * Sets the paths_tracked value for this Video_tracking.
     * 
     * @param paths_tracked
     */
    public void setPaths_tracked(java.lang.String paths_tracked) {
        this.paths_tracked = paths_tracked;
    }


    /**
     * Gets the conversion_level value for this Video_tracking.
     * 
     * @return conversion_level
     */
    public java.lang.String getConversion_level() {
        return conversion_level;
    }


    /**
     * Sets the conversion_level value for this Video_tracking.
     * 
     * @param conversion_level
     */
    public void setConversion_level(java.lang.String conversion_level) {
        this.conversion_level = conversion_level;
    }


    /**
     * Gets the segments_tracked value for this Video_tracking.
     * 
     * @return segments_tracked
     */
    public java.lang.String getSegments_tracked() {
        return segments_tracked;
    }


    /**
     * Sets the segments_tracked value for this Video_tracking.
     * 
     * @param segments_tracked
     */
    public void setSegments_tracked(java.lang.String segments_tracked) {
        this.segments_tracked = segments_tracked;
    }


    /**
     * Gets the segment_length value for this Video_tracking.
     * 
     * @return segment_length
     */
    public java.lang.String getSegment_length() {
        return segment_length;
    }


    /**
     * Sets the segment_length value for this Video_tracking.
     * 
     * @param segment_length
     */
    public void setSegment_length(java.lang.String segment_length) {
        this.segment_length = segment_length;
    }


    /**
     * Gets the allocate_success value for this Video_tracking.
     * 
     * @return allocate_success
     */
    public java.lang.String getAllocate_success() {
        return allocate_success;
    }


    /**
     * Sets the allocate_success value for this Video_tracking.
     * 
     * @param allocate_success
     */
    public void setAllocate_success(java.lang.String allocate_success) {
        this.allocate_success = allocate_success;
    }


    /**
     * Gets the history_expiration value for this Video_tracking.
     * 
     * @return history_expiration
     */
    public java.lang.String getHistory_expiration() {
        return history_expiration;
    }


    /**
     * Sets the history_expiration value for this Video_tracking.
     * 
     * @param history_expiration
     */
    public void setHistory_expiration(java.lang.String history_expiration) {
        this.history_expiration = history_expiration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Video_tracking)) return false;
        Video_tracking other = (Video_tracking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.visits_tracked==null && other.getVisits_tracked()==null) || 
             (this.visits_tracked!=null &&
              this.visits_tracked.equals(other.getVisits_tracked()))) &&
            ((this.daily_visitors_tracked==null && other.getDaily_visitors_tracked()==null) || 
             (this.daily_visitors_tracked!=null &&
              this.daily_visitors_tracked.equals(other.getDaily_visitors_tracked()))) &&
            ((this.paths_tracked==null && other.getPaths_tracked()==null) || 
             (this.paths_tracked!=null &&
              this.paths_tracked.equals(other.getPaths_tracked()))) &&
            ((this.conversion_level==null && other.getConversion_level()==null) || 
             (this.conversion_level!=null &&
              this.conversion_level.equals(other.getConversion_level()))) &&
            ((this.segments_tracked==null && other.getSegments_tracked()==null) || 
             (this.segments_tracked!=null &&
              this.segments_tracked.equals(other.getSegments_tracked()))) &&
            ((this.segment_length==null && other.getSegment_length()==null) || 
             (this.segment_length!=null &&
              this.segment_length.equals(other.getSegment_length()))) &&
            ((this.allocate_success==null && other.getAllocate_success()==null) || 
             (this.allocate_success!=null &&
              this.allocate_success.equals(other.getAllocate_success()))) &&
            ((this.history_expiration==null && other.getHistory_expiration()==null) || 
             (this.history_expiration!=null &&
              this.history_expiration.equals(other.getHistory_expiration())));
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getVisits_tracked() != null) {
            _hashCode += getVisits_tracked().hashCode();
        }
        if (getDaily_visitors_tracked() != null) {
            _hashCode += getDaily_visitors_tracked().hashCode();
        }
        if (getPaths_tracked() != null) {
            _hashCode += getPaths_tracked().hashCode();
        }
        if (getConversion_level() != null) {
            _hashCode += getConversion_level().hashCode();
        }
        if (getSegments_tracked() != null) {
            _hashCode += getSegments_tracked().hashCode();
        }
        if (getSegment_length() != null) {
            _hashCode += getSegment_length().hashCode();
        }
        if (getAllocate_success() != null) {
            _hashCode += getAllocate_success().hashCode();
        }
        if (getHistory_expiration() != null) {
            _hashCode += getHistory_expiration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Video_tracking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "video_tracking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visits_tracked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visits_tracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daily_visitors_tracked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daily_visitors_tracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paths_tracked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paths_tracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversion_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversion_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segments_tracked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segments_tracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment_length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segment_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocate_success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allocate_success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history_expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "history_expiration"));
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
