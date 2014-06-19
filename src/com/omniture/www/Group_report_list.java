/**
 * Group_report_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Group_report_list  implements java.io.Serializable {
    private int[] paths;

    private int[] traffic;

    private int[] ecommerce;

    private int[] tools;

    private int[] tnt;

    private int[] survey;

    private int[] sem;

    public Group_report_list() {
    }

    public Group_report_list(
           int[] paths,
           int[] traffic,
           int[] ecommerce,
           int[] tools,
           int[] tnt,
           int[] survey,
           int[] sem) {
           this.paths = paths;
           this.traffic = traffic;
           this.ecommerce = ecommerce;
           this.tools = tools;
           this.tnt = tnt;
           this.survey = survey;
           this.sem = sem;
    }


    /**
     * Gets the paths value for this Group_report_list.
     * 
     * @return paths
     */
    public int[] getPaths() {
        return paths;
    }


    /**
     * Sets the paths value for this Group_report_list.
     * 
     * @param paths
     */
    public void setPaths(int[] paths) {
        this.paths = paths;
    }


    /**
     * Gets the traffic value for this Group_report_list.
     * 
     * @return traffic
     */
    public int[] getTraffic() {
        return traffic;
    }


    /**
     * Sets the traffic value for this Group_report_list.
     * 
     * @param traffic
     */
    public void setTraffic(int[] traffic) {
        this.traffic = traffic;
    }


    /**
     * Gets the ecommerce value for this Group_report_list.
     * 
     * @return ecommerce
     */
    public int[] getEcommerce() {
        return ecommerce;
    }


    /**
     * Sets the ecommerce value for this Group_report_list.
     * 
     * @param ecommerce
     */
    public void setEcommerce(int[] ecommerce) {
        this.ecommerce = ecommerce;
    }


    /**
     * Gets the tools value for this Group_report_list.
     * 
     * @return tools
     */
    public int[] getTools() {
        return tools;
    }


    /**
     * Sets the tools value for this Group_report_list.
     * 
     * @param tools
     */
    public void setTools(int[] tools) {
        this.tools = tools;
    }


    /**
     * Gets the tnt value for this Group_report_list.
     * 
     * @return tnt
     */
    public int[] getTnt() {
        return tnt;
    }


    /**
     * Sets the tnt value for this Group_report_list.
     * 
     * @param tnt
     */
    public void setTnt(int[] tnt) {
        this.tnt = tnt;
    }


    /**
     * Gets the survey value for this Group_report_list.
     * 
     * @return survey
     */
    public int[] getSurvey() {
        return survey;
    }


    /**
     * Sets the survey value for this Group_report_list.
     * 
     * @param survey
     */
    public void setSurvey(int[] survey) {
        this.survey = survey;
    }


    /**
     * Gets the sem value for this Group_report_list.
     * 
     * @return sem
     */
    public int[] getSem() {
        return sem;
    }


    /**
     * Sets the sem value for this Group_report_list.
     * 
     * @param sem
     */
    public void setSem(int[] sem) {
        this.sem = sem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Group_report_list)) return false;
        Group_report_list other = (Group_report_list) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paths==null && other.getPaths()==null) || 
             (this.paths!=null &&
              java.util.Arrays.equals(this.paths, other.getPaths()))) &&
            ((this.traffic==null && other.getTraffic()==null) || 
             (this.traffic!=null &&
              java.util.Arrays.equals(this.traffic, other.getTraffic()))) &&
            ((this.ecommerce==null && other.getEcommerce()==null) || 
             (this.ecommerce!=null &&
              java.util.Arrays.equals(this.ecommerce, other.getEcommerce()))) &&
            ((this.tools==null && other.getTools()==null) || 
             (this.tools!=null &&
              java.util.Arrays.equals(this.tools, other.getTools()))) &&
            ((this.tnt==null && other.getTnt()==null) || 
             (this.tnt!=null &&
              java.util.Arrays.equals(this.tnt, other.getTnt()))) &&
            ((this.survey==null && other.getSurvey()==null) || 
             (this.survey!=null &&
              java.util.Arrays.equals(this.survey, other.getSurvey()))) &&
            ((this.sem==null && other.getSem()==null) || 
             (this.sem!=null &&
              java.util.Arrays.equals(this.sem, other.getSem())));
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
        if (getPaths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTraffic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTraffic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTraffic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEcommerce() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEcommerce());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEcommerce(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTools() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTools());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTools(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTnt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTnt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTnt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurvey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurvey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurvey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSem(), i);
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
        new org.apache.axis.description.TypeDesc(Group_report_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "group_report_list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecommerce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecommerce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tools");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tools"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("survey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "survey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sem"));
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
