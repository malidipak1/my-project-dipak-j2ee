/**
 * WayBillGenerationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.tempuri;

public class WayBillGenerationLocator extends org.apache.axis.client.Service implements org.tempuri.WayBillGeneration {

    // Use to get a proxy class for WSHttpBinding_IWayBillGeneration
    private final java.lang.String WSHttpBinding_IWayBillGeneration_address = "http://netconnect.bluedart.com/Ver1.2/ShippingAPI/waybill/WaybillGeneration.svc";

    public java.lang.String getWSHttpBinding_IWayBillGenerationAddress() {
        return WSHttpBinding_IWayBillGeneration_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSHttpBinding_IWayBillGenerationWSDDServiceName = "WSHttpBinding_IWayBillGeneration";

    public java.lang.String getWSHttpBinding_IWayBillGenerationWSDDServiceName() {
        return WSHttpBinding_IWayBillGenerationWSDDServiceName;
    }

    public void setWSHttpBinding_IWayBillGenerationWSDDServiceName(java.lang.String name) {
        WSHttpBinding_IWayBillGenerationWSDDServiceName = name;
    }

    public org.tempuri.IWayBillGeneration getWSHttpBinding_IWayBillGeneration() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSHttpBinding_IWayBillGeneration_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSHttpBinding_IWayBillGeneration(endpoint);
    }

    public org.tempuri.IWayBillGeneration getWSHttpBinding_IWayBillGeneration(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WSHttpBinding_IWayBillGenerationStub _stub = new org.tempuri.WSHttpBinding_IWayBillGenerationStub(portAddress, this);
            _stub.setPortName(getWSHttpBinding_IWayBillGenerationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }


    // Use to get a proxy class for BasicHttpBinding_IWayBillGeneration
    private final java.lang.String BasicHttpBinding_IWayBillGeneration_address = "http://netconnect.bluedart.com/Ver1.2/ShippingAPI/waybill/WaybillGeneration.svc/Basic";

    public java.lang.String getBasicHttpBinding_IWayBillGenerationAddress() {
        return BasicHttpBinding_IWayBillGeneration_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IWayBillGenerationWSDDServiceName = "BasicHttpBinding_IWayBillGeneration";

    public java.lang.String getBasicHttpBinding_IWayBillGenerationWSDDServiceName() {
        return BasicHttpBinding_IWayBillGenerationWSDDServiceName;
    }

    public void setBasicHttpBinding_IWayBillGenerationWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IWayBillGenerationWSDDServiceName = name;
    }

    public org.tempuri.IWayBillGeneration getBasicHttpBinding_IWayBillGeneration() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IWayBillGeneration_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IWayBillGeneration(endpoint);
    }

    public org.tempuri.IWayBillGeneration getBasicHttpBinding_IWayBillGeneration(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IWayBillGenerationStub _stub = new org.tempuri.BasicHttpBinding_IWayBillGenerationStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IWayBillGenerationWSDDServiceName());
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
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IWayBillGeneration.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WSHttpBinding_IWayBillGenerationStub _stub = new org.tempuri.WSHttpBinding_IWayBillGenerationStub(new java.net.URL(WSHttpBinding_IWayBillGeneration_address), this);
                _stub.setPortName(getWSHttpBinding_IWayBillGenerationWSDDServiceName());
                return _stub;
            }
            if (org.tempuri.IWayBillGeneration.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IWayBillGenerationStub _stub = new org.tempuri.BasicHttpBinding_IWayBillGenerationStub(new java.net.URL(BasicHttpBinding_IWayBillGeneration_address), this);
                _stub.setPortName(getBasicHttpBinding_IWayBillGenerationWSDDServiceName());
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
        String inputPortName = portName.getLocalPart();
        if ("WSHttpBinding_IWayBillGeneration".equals(inputPortName)) {
            return getWSHttpBinding_IWayBillGeneration();
        }
        else if ("BasicHttpBinding_IWayBillGeneration".equals(inputPortName)) {
            return getBasicHttpBinding_IWayBillGeneration();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WayBillGeneration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("WSHttpBinding_IWayBillGeneration"));
            ports.add(new javax.xml.namespace.QName("BasicHttpBinding_IWayBillGeneration"));
        }
        return ports.iterator();
    }

}
