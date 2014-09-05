/**
 * Service_1_0_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class Service_1_0_ServiceLocator extends org.apache.axis.client.Service implements net.aramex.ws.ShippingAPI.v1.Service_1_0_Service {

    // Use to get a proxy class for Service_1_0
    private final java.lang.String Service_1_0_address = "http://ws.aramex.net/shippingapi/shipping/service_1_0.svc";

    
	public java.lang.String getService_1_0Address() {
        return Service_1_0_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Service_1_0WSDDServiceName = "Service_1_0";

    public java.lang.String getService_1_0WSDDServiceName() {
        return Service_1_0WSDDServiceName;
    }

    public void setService_1_0WSDDServiceName(java.lang.String name) {
        Service_1_0WSDDServiceName = name;
    }

    
	public net.aramex.ws.ShippingAPI.v1.Service_1_0_Port getService_1_0() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Service_1_0_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return this.getService_1_0(endpoint);
    }

    
	public net.aramex.ws.ShippingAPI.v1.Service_1_0_Port getService_1_0(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.aramex.ws.ShippingAPI.v1.Service_1_0_BindingStub _stub = new net.aramex.ws.ShippingAPI.v1.Service_1_0_BindingStub(portAddress, this);
            _stub.setPortName(this.getService_1_0WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.aramex.ws.ShippingAPI.v1.Service_1_0_Port.class.isAssignableFrom(serviceEndpointInterface)) {
                net.aramex.ws.ShippingAPI.v1.Service_1_0_BindingStub _stub = new net.aramex.ws.ShippingAPI.v1.Service_1_0_BindingStub(new java.net.URL(Service_1_0_address), this);
                _stub.setPortName(this.getService_1_0WSDDServiceName());
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
            return this.getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("Service_1_0".equals(inputPortName)) {
            return this.getService_1_0();
        }
        else  {
            java.rmi.Remote _stub = this.getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    
	public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Service_1_0");
    }

    private java.util.HashSet ports = null;

    
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("Service_1_0"));
        }
        return ports.iterator();
    }

}
