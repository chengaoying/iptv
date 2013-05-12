/**
 * OrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.ws;

public class OrderServiceLocator extends org.apache.axis.client.Service implements cn.com.do1.ebusiness.exinterface.ws.OrderService {

    public OrderServiceLocator() {
    }


    public OrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OrderServiceHttpSoap11Endpoint
    private java.lang.String OrderServiceHttpSoap11Endpoint_address = "http://123.196.117.57:8080/tvshop/services/OrderService.OrderServiceHttpSoap11Endpoint/";

    public java.lang.String getOrderServiceHttpSoap11EndpointAddress() {
        return OrderServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderServiceHttpSoap11EndpointWSDDServiceName = "OrderServiceHttpSoap11Endpoint";

    public java.lang.String getOrderServiceHttpSoap11EndpointWSDDServiceName() {
        return OrderServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setOrderServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        OrderServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType getOrderServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OrderServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrderServiceHttpSoap11Endpoint(endpoint);
    }

    public cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType getOrderServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.do1.ebusiness.exinterface.ws.OrderServiceSoap11BindingStub _stub = new cn.com.do1.ebusiness.exinterface.ws.OrderServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getOrderServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        OrderServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.do1.ebusiness.exinterface.ws.OrderServiceSoap11BindingStub _stub = new cn.com.do1.ebusiness.exinterface.ws.OrderServiceSoap11BindingStub(new java.net.URL(OrderServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getOrderServiceHttpSoap11EndpointWSDDServiceName());
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
        if ("OrderServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getOrderServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "OrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "OrderServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OrderServiceHttpSoap11Endpoint".equals(portName)) {
            setOrderServiceHttpSoap11EndpointEndpointAddress(address);
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
