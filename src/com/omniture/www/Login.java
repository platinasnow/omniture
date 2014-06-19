/**
 * Login.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class Login  implements java.io.Serializable {
    private com.omniture.www.Permission_group[] available_group_list;

    private com.omniture.www.Permission_group[] selected_group_list;

    private java.lang.String login;

    private java.lang.String first_name;

    private java.lang.String last_name;

    private java.lang.String title;

    private java.lang.String email;

    private java.lang.String phone_number;

    private int change_password;

    private int temp_login;

    private int admin;

    private java.util.Date temp_login_start;

    private java.util.Date temp_login_end;

    private int login_days_left;

    public Login() {
    }

    public Login(
           com.omniture.www.Permission_group[] available_group_list,
           com.omniture.www.Permission_group[] selected_group_list,
           java.lang.String login,
           java.lang.String first_name,
           java.lang.String last_name,
           java.lang.String title,
           java.lang.String email,
           java.lang.String phone_number,
           int change_password,
           int temp_login,
           int admin,
           java.util.Date temp_login_start,
           java.util.Date temp_login_end,
           int login_days_left) {
           this.available_group_list = available_group_list;
           this.selected_group_list = selected_group_list;
           this.login = login;
           this.first_name = first_name;
           this.last_name = last_name;
           this.title = title;
           this.email = email;
           this.phone_number = phone_number;
           this.change_password = change_password;
           this.temp_login = temp_login;
           this.admin = admin;
           this.temp_login_start = temp_login_start;
           this.temp_login_end = temp_login_end;
           this.login_days_left = login_days_left;
    }


    /**
     * Gets the available_group_list value for this Login.
     * 
     * @return available_group_list
     */
    public com.omniture.www.Permission_group[] getAvailable_group_list() {
        return available_group_list;
    }


    /**
     * Sets the available_group_list value for this Login.
     * 
     * @param available_group_list
     */
    public void setAvailable_group_list(com.omniture.www.Permission_group[] available_group_list) {
        this.available_group_list = available_group_list;
    }


    /**
     * Gets the selected_group_list value for this Login.
     * 
     * @return selected_group_list
     */
    public com.omniture.www.Permission_group[] getSelected_group_list() {
        return selected_group_list;
    }


    /**
     * Sets the selected_group_list value for this Login.
     * 
     * @param selected_group_list
     */
    public void setSelected_group_list(com.omniture.www.Permission_group[] selected_group_list) {
        this.selected_group_list = selected_group_list;
    }


    /**
     * Gets the login value for this Login.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Login.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the first_name value for this Login.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this Login.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the last_name value for this Login.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this Login.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the title value for this Login.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Login.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the email value for this Login.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Login.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the phone_number value for this Login.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this Login.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }


    /**
     * Gets the change_password value for this Login.
     * 
     * @return change_password
     */
    public int getChange_password() {
        return change_password;
    }


    /**
     * Sets the change_password value for this Login.
     * 
     * @param change_password
     */
    public void setChange_password(int change_password) {
        this.change_password = change_password;
    }


    /**
     * Gets the temp_login value for this Login.
     * 
     * @return temp_login
     */
    public int getTemp_login() {
        return temp_login;
    }


    /**
     * Sets the temp_login value for this Login.
     * 
     * @param temp_login
     */
    public void setTemp_login(int temp_login) {
        this.temp_login = temp_login;
    }


    /**
     * Gets the admin value for this Login.
     * 
     * @return admin
     */
    public int getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this Login.
     * 
     * @param admin
     */
    public void setAdmin(int admin) {
        this.admin = admin;
    }


    /**
     * Gets the temp_login_start value for this Login.
     * 
     * @return temp_login_start
     */
    public java.util.Date getTemp_login_start() {
        return temp_login_start;
    }


    /**
     * Sets the temp_login_start value for this Login.
     * 
     * @param temp_login_start
     */
    public void setTemp_login_start(java.util.Date temp_login_start) {
        this.temp_login_start = temp_login_start;
    }


    /**
     * Gets the temp_login_end value for this Login.
     * 
     * @return temp_login_end
     */
    public java.util.Date getTemp_login_end() {
        return temp_login_end;
    }


    /**
     * Sets the temp_login_end value for this Login.
     * 
     * @param temp_login_end
     */
    public void setTemp_login_end(java.util.Date temp_login_end) {
        this.temp_login_end = temp_login_end;
    }


    /**
     * Gets the login_days_left value for this Login.
     * 
     * @return login_days_left
     */
    public int getLogin_days_left() {
        return login_days_left;
    }


    /**
     * Sets the login_days_left value for this Login.
     * 
     * @param login_days_left
     */
    public void setLogin_days_left(int login_days_left) {
        this.login_days_left = login_days_left;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Login)) return false;
        Login other = (Login) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.available_group_list==null && other.getAvailable_group_list()==null) || 
             (this.available_group_list!=null &&
              java.util.Arrays.equals(this.available_group_list, other.getAvailable_group_list()))) &&
            ((this.selected_group_list==null && other.getSelected_group_list()==null) || 
             (this.selected_group_list!=null &&
              java.util.Arrays.equals(this.selected_group_list, other.getSelected_group_list()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number()))) &&
            this.change_password == other.getChange_password() &&
            this.temp_login == other.getTemp_login() &&
            this.admin == other.getAdmin() &&
            ((this.temp_login_start==null && other.getTemp_login_start()==null) || 
             (this.temp_login_start!=null &&
              this.temp_login_start.equals(other.getTemp_login_start()))) &&
            ((this.temp_login_end==null && other.getTemp_login_end()==null) || 
             (this.temp_login_end!=null &&
              this.temp_login_end.equals(other.getTemp_login_end()))) &&
            this.login_days_left == other.getLogin_days_left();
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
        if (getAvailable_group_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailable_group_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailable_group_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelected_group_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelected_group_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelected_group_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPhone_number() != null) {
            _hashCode += getPhone_number().hashCode();
        }
        _hashCode += getChange_password();
        _hashCode += getTemp_login();
        _hashCode += getAdmin();
        if (getTemp_login_start() != null) {
            _hashCode += getTemp_login_start().hashCode();
        }
        if (getTemp_login_end() != null) {
            _hashCode += getTemp_login_end().hashCode();
        }
        _hashCode += getLogin_days_left();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Login.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "login"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_group_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_group_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected_group_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selected_group_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
        elemField.setFieldName("phone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change_password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp_login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temp_login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp_login_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temp_login_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp_login_end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temp_login_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_days_left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login_days_left"));
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
