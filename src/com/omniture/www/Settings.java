/**
 * Settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Settings  implements java.io.Serializable {
    private int ecommerce_level;

    private java.lang.String discover_enabled;

    private com.omniture.www.Metric[] available_metrics;

    private com.omniture.www.Element[] available_elements;

    private java.lang.String[] mobile_breakdowns;

    private com.omniture.www.Evar[] evars;

    private com.omniture.www.Correlation[] correlations;

    private com.omniture.www.Event[] events;

    private com.omniture.www.Traffic_var[] traffic_vars;

    private com.omniture.www.Classification[] classifications;

    private com.omniture.www.Hierarchy[] hierarchies;

    private com.omniture.www.Time_zone[] time_zone;

    private com.omniture.www.Custom_calendar[] custom_calendar;

    private com.omniture.www.Video_tracking video_tracking;

    public Settings() {
    }

    public Settings(
           int ecommerce_level,
           java.lang.String discover_enabled,
           com.omniture.www.Metric[] available_metrics,
           com.omniture.www.Element[] available_elements,
           java.lang.String[] mobile_breakdowns,
           com.omniture.www.Evar[] evars,
           com.omniture.www.Correlation[] correlations,
           com.omniture.www.Event[] events,
           com.omniture.www.Traffic_var[] traffic_vars,
           com.omniture.www.Classification[] classifications,
           com.omniture.www.Hierarchy[] hierarchies,
           com.omniture.www.Time_zone[] time_zone,
           com.omniture.www.Custom_calendar[] custom_calendar,
           com.omniture.www.Video_tracking video_tracking) {
           this.ecommerce_level = ecommerce_level;
           this.discover_enabled = discover_enabled;
           this.available_metrics = available_metrics;
           this.available_elements = available_elements;
           this.mobile_breakdowns = mobile_breakdowns;
           this.evars = evars;
           this.correlations = correlations;
           this.events = events;
           this.traffic_vars = traffic_vars;
           this.classifications = classifications;
           this.hierarchies = hierarchies;
           this.time_zone = time_zone;
           this.custom_calendar = custom_calendar;
           this.video_tracking = video_tracking;
    }


    /**
     * Gets the ecommerce_level value for this Settings.
     * 
     * @return ecommerce_level
     */
    public int getEcommerce_level() {
        return ecommerce_level;
    }


    /**
     * Sets the ecommerce_level value for this Settings.
     * 
     * @param ecommerce_level
     */
    public void setEcommerce_level(int ecommerce_level) {
        this.ecommerce_level = ecommerce_level;
    }


    /**
     * Gets the discover_enabled value for this Settings.
     * 
     * @return discover_enabled
     */
    public java.lang.String getDiscover_enabled() {
        return discover_enabled;
    }


    /**
     * Sets the discover_enabled value for this Settings.
     * 
     * @param discover_enabled
     */
    public void setDiscover_enabled(java.lang.String discover_enabled) {
        this.discover_enabled = discover_enabled;
    }


    /**
     * Gets the available_metrics value for this Settings.
     * 
     * @return available_metrics
     */
    public com.omniture.www.Metric[] getAvailable_metrics() {
        return available_metrics;
    }


    /**
     * Sets the available_metrics value for this Settings.
     * 
     * @param available_metrics
     */
    public void setAvailable_metrics(com.omniture.www.Metric[] available_metrics) {
        this.available_metrics = available_metrics;
    }


    /**
     * Gets the available_elements value for this Settings.
     * 
     * @return available_elements
     */
    public com.omniture.www.Element[] getAvailable_elements() {
        return available_elements;
    }


    /**
     * Sets the available_elements value for this Settings.
     * 
     * @param available_elements
     */
    public void setAvailable_elements(com.omniture.www.Element[] available_elements) {
        this.available_elements = available_elements;
    }


    /**
     * Gets the mobile_breakdowns value for this Settings.
     * 
     * @return mobile_breakdowns
     */
    public java.lang.String[] getMobile_breakdowns() {
        return mobile_breakdowns;
    }


    /**
     * Sets the mobile_breakdowns value for this Settings.
     * 
     * @param mobile_breakdowns
     */
    public void setMobile_breakdowns(java.lang.String[] mobile_breakdowns) {
        this.mobile_breakdowns = mobile_breakdowns;
    }


    /**
     * Gets the evars value for this Settings.
     * 
     * @return evars
     */
    public com.omniture.www.Evar[] getEvars() {
        return evars;
    }


    /**
     * Sets the evars value for this Settings.
     * 
     * @param evars
     */
    public void setEvars(com.omniture.www.Evar[] evars) {
        this.evars = evars;
    }


    /**
     * Gets the correlations value for this Settings.
     * 
     * @return correlations
     */
    public com.omniture.www.Correlation[] getCorrelations() {
        return correlations;
    }


    /**
     * Sets the correlations value for this Settings.
     * 
     * @param correlations
     */
    public void setCorrelations(com.omniture.www.Correlation[] correlations) {
        this.correlations = correlations;
    }


    /**
     * Gets the events value for this Settings.
     * 
     * @return events
     */
    public com.omniture.www.Event[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Settings.
     * 
     * @param events
     */
    public void setEvents(com.omniture.www.Event[] events) {
        this.events = events;
    }


    /**
     * Gets the traffic_vars value for this Settings.
     * 
     * @return traffic_vars
     */
    public com.omniture.www.Traffic_var[] getTraffic_vars() {
        return traffic_vars;
    }


    /**
     * Sets the traffic_vars value for this Settings.
     * 
     * @param traffic_vars
     */
    public void setTraffic_vars(com.omniture.www.Traffic_var[] traffic_vars) {
        this.traffic_vars = traffic_vars;
    }


    /**
     * Gets the classifications value for this Settings.
     * 
     * @return classifications
     */
    public com.omniture.www.Classification[] getClassifications() {
        return classifications;
    }


    /**
     * Sets the classifications value for this Settings.
     * 
     * @param classifications
     */
    public void setClassifications(com.omniture.www.Classification[] classifications) {
        this.classifications = classifications;
    }


    /**
     * Gets the hierarchies value for this Settings.
     * 
     * @return hierarchies
     */
    public com.omniture.www.Hierarchy[] getHierarchies() {
        return hierarchies;
    }


    /**
     * Sets the hierarchies value for this Settings.
     * 
     * @param hierarchies
     */
    public void setHierarchies(com.omniture.www.Hierarchy[] hierarchies) {
        this.hierarchies = hierarchies;
    }


    /**
     * Gets the time_zone value for this Settings.
     * 
     * @return time_zone
     */
    public com.omniture.www.Time_zone[] getTime_zone() {
        return time_zone;
    }


    /**
     * Sets the time_zone value for this Settings.
     * 
     * @param time_zone
     */
    public void setTime_zone(com.omniture.www.Time_zone[] time_zone) {
        this.time_zone = time_zone;
    }


    /**
     * Gets the custom_calendar value for this Settings.
     * 
     * @return custom_calendar
     */
    public com.omniture.www.Custom_calendar[] getCustom_calendar() {
        return custom_calendar;
    }


    /**
     * Sets the custom_calendar value for this Settings.
     * 
     * @param custom_calendar
     */
    public void setCustom_calendar(com.omniture.www.Custom_calendar[] custom_calendar) {
        this.custom_calendar = custom_calendar;
    }


    /**
     * Gets the video_tracking value for this Settings.
     * 
     * @return video_tracking
     */
    public com.omniture.www.Video_tracking getVideo_tracking() {
        return video_tracking;
    }


    /**
     * Sets the video_tracking value for this Settings.
     * 
     * @param video_tracking
     */
    public void setVideo_tracking(com.omniture.www.Video_tracking video_tracking) {
        this.video_tracking = video_tracking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Settings)) return false;
        Settings other = (Settings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ecommerce_level == other.getEcommerce_level() &&
            ((this.discover_enabled==null && other.getDiscover_enabled()==null) || 
             (this.discover_enabled!=null &&
              this.discover_enabled.equals(other.getDiscover_enabled()))) &&
            ((this.available_metrics==null && other.getAvailable_metrics()==null) || 
             (this.available_metrics!=null &&
              java.util.Arrays.equals(this.available_metrics, other.getAvailable_metrics()))) &&
            ((this.available_elements==null && other.getAvailable_elements()==null) || 
             (this.available_elements!=null &&
              java.util.Arrays.equals(this.available_elements, other.getAvailable_elements()))) &&
            ((this.mobile_breakdowns==null && other.getMobile_breakdowns()==null) || 
             (this.mobile_breakdowns!=null &&
              java.util.Arrays.equals(this.mobile_breakdowns, other.getMobile_breakdowns()))) &&
            ((this.evars==null && other.getEvars()==null) || 
             (this.evars!=null &&
              java.util.Arrays.equals(this.evars, other.getEvars()))) &&
            ((this.correlations==null && other.getCorrelations()==null) || 
             (this.correlations!=null &&
              java.util.Arrays.equals(this.correlations, other.getCorrelations()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.traffic_vars==null && other.getTraffic_vars()==null) || 
             (this.traffic_vars!=null &&
              java.util.Arrays.equals(this.traffic_vars, other.getTraffic_vars()))) &&
            ((this.classifications==null && other.getClassifications()==null) || 
             (this.classifications!=null &&
              java.util.Arrays.equals(this.classifications, other.getClassifications()))) &&
            ((this.hierarchies==null && other.getHierarchies()==null) || 
             (this.hierarchies!=null &&
              java.util.Arrays.equals(this.hierarchies, other.getHierarchies()))) &&
            ((this.time_zone==null && other.getTime_zone()==null) || 
             (this.time_zone!=null &&
              java.util.Arrays.equals(this.time_zone, other.getTime_zone()))) &&
            ((this.custom_calendar==null && other.getCustom_calendar()==null) || 
             (this.custom_calendar!=null &&
              java.util.Arrays.equals(this.custom_calendar, other.getCustom_calendar()))) &&
            ((this.video_tracking==null && other.getVideo_tracking()==null) || 
             (this.video_tracking!=null &&
              this.video_tracking.equals(other.getVideo_tracking())));
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
        _hashCode += getEcommerce_level();
        if (getDiscover_enabled() != null) {
            _hashCode += getDiscover_enabled().hashCode();
        }
        if (getAvailable_metrics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_metrics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_metrics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailable_elements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_elements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_elements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobile_breakdowns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobile_breakdowns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobile_breakdowns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvars(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrelations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTraffic_vars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTraffic_vars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTraffic_vars(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHierarchies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTime_zone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTime_zone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTime_zone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustom_calendar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustom_calendar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustom_calendar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVideo_tracking() != null) {
            _hashCode += getVideo_tracking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "settings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecommerce_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecommerce_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discover_enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discover_enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_metrics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_metrics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "metric"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_elements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "element"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile_breakdowns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile_breakdowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "evar"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correlations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "correlation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "event"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffic_vars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffic_vars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "traffic_var"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classifications");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "classification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hierarchies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "time_zone"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom_calendar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custom_calendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendar"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("video_tracking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "video_tracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "video_tracking"));
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
