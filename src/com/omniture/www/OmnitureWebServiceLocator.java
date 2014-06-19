/**
 * OmnitureWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class OmnitureWebServiceLocator extends org.apache.axis.client.Service implements com.omniture.www.OmnitureWebService {

    public OmnitureWebServiceLocator() {
    }


    public OmnitureWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OmnitureWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OmnitureWebServicePort
    private java.lang.String OmnitureWebServicePort_address = "https://api.omniture.com/admin/1.3/";

    public java.lang.String getOmnitureWebServicePortAddress() {
        return OmnitureWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OmnitureWebServicePortWSDDServiceName = "OmnitureWebServicePort";

    public java.lang.String getOmnitureWebServicePortWSDDServiceName() {
        return OmnitureWebServicePortWSDDServiceName;
    }

    public void setOmnitureWebServicePortWSDDServiceName(java.lang.String name) {
        OmnitureWebServicePortWSDDServiceName = name;
    }

    public com.omniture.www.OmnitureWebServicePortType getOmnitureWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OmnitureWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOmnitureWebServicePort(endpoint);
    }

    public com.omniture.www.OmnitureWebServicePortType getOmnitureWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.omniture.www.OmnitureWebServiceBindingStub _stub = new com.omniture.www.OmnitureWebServiceBindingStub(portAddress, this);
            _stub.setPortName(getOmnitureWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOmnitureWebServicePortEndpointAddress(java.lang.String address) {
        OmnitureWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.omniture.www.OmnitureWebServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.omniture.www.OmnitureWebServiceBindingStub _stub = new com.omniture.www.OmnitureWebServiceBindingStub(new java.net.URL(OmnitureWebServicePort_address), this);
                _stub.setPortName(getOmnitureWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OmnitureWebServicePort".equals(inputPortName)) {
            return getOmnitureWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.omniture.com/", "OmnitureWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.omniture.com/", "OmnitureWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OmnitureWebServicePort".equals(portName)) {
            setOmnitureWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
