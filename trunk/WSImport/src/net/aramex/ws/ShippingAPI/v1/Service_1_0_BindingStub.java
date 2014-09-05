/**
 * Service_1_0_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class Service_1_0_BindingStub extends org.apache.axis.client.Stub implements net.aramex.ws.ShippingAPI.v1.Service_1_0_Port {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateShipments");
        oper.addParameter(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentCreationRequest"), new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">ShipmentCreationRequest"), net.aramex.ws.ShippingAPI.v1._ShipmentCreationRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">ShipmentCreationResponse"));
        oper.setReturnClass(net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentCreationResponse"));
        //oper.setStyle(org.apache.axis.enum.Style.DOCUMENT);
        //oper.setUse(org.apache.axis.enum.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PrintLabel");
        oper.addParameter(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "LabelPrintingRequest"), new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">LabelPrintingRequest"), net.aramex.ws.ShippingAPI.v1._LabelPrintingRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">LabelPrintingResponse"));
        oper.setReturnClass(net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "LabelPrintingResponse"));
        //oper.setStyle(org.apache.axis.enum.Style.DOCUMENT);
        //oper.setUse(org.apache.axis.enum.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePickup");
        oper.addParameter(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupCreationRequest"), new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCreationRequest"), net.aramex.ws.ShippingAPI.v1._PickupCreationRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCreationResponse"));
        oper.setReturnClass(net.aramex.ws.ShippingAPI.v1._PickupCreationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupCreationResponse"));
        //oper.setStyle(org.apache.axis.enum.Style.DOCUMENT);
        //oper.setUse(org.apache.axis.enum.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelPickup");
        oper.addParameter(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupCancelationRequest"), new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCancelationRequest"), net.aramex.ws.ShippingAPI.v1._PickupCancelationRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCancelationResponse"));
        oper.setReturnClass(net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupCancelationResponse"));
        //oper.setStyle(org.apache.axis.enum.Style.DOCUMENT);
        //oper.setUse(org.apache.axis.enum.Use.LITERAL);
        _operations[3] = oper;

    }

    public Service_1_0_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Service_1_0_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Service_1_0_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Weight");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfNotification");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ArrayOfNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProcessedShipment");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ProcessedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCancelationRequest");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._PickupCancelationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Party");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">ShipmentCreationRequest");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._ShipmentCreationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Transaction");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Transaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCreationResponse");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._PickupCreationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Volume");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupItemDetail");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.PickupItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProcessedPickup");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ProcessedPickup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "LabelInfo");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.LabelInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentDetails");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ShipmentDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentItem");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ShipmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">LabelPrintingResponse");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCreationRequest");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._PickupCreationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Notification");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">ShipmentCreationResponse");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Shipment");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Shipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
            cachedSerQNames.add(qName);
            cls = com.microsoft.schemas._2003._10.Serialization.Guid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Pickup");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Pickup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Dimensions");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Address");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfShipmentItem");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ArrayOfShipmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ClientInfo");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ClientInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCancelationResponse");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfAttachment");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ArrayOfAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfProcessedShipment");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ArrayOfProcessedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfPickupItemDetail");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ArrayOfPickupItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">LabelPrintingRequest");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1._LabelPrintingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentLabel");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ShipmentLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Attachment");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Contact");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfShipment");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.ArrayOfShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money");
            cachedSerQNames.add(qName);
            cls = net.aramex.ws.ShippingAPI.v1.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    private org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call =
                    (org.apache.axis.client.Call) super.service.createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (this.firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                        java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                        _call.registerTypeMapping(cls, qName, sf, df, false);
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", t);
        }
    }

   
	public net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse createShipments(net.aramex.ws.ShippingAPI.v1._ShipmentCreationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = this.createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.aramex.net/ShippingAPI/v1/Service_1_0/CreateShipments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateShipments"));

        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            this.extractAttachments(_call);
            try {
                return (net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse.class);
            }
        }
    }

    
	public net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse printLabel(net.aramex.ws.ShippingAPI.v1._LabelPrintingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = this.createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.aramex.net/ShippingAPI/v1/Service_1_0/PrintLabel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PrintLabel"));

        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            this.extractAttachments(_call);
            try {
                return (net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse.class);
            }
        }
    }

    
	public net.aramex.ws.ShippingAPI.v1._PickupCreationResponse createPickup(net.aramex.ws.ShippingAPI.v1._PickupCreationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = this.createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.aramex.net/ShippingAPI/v1/Service_1_0/CreatePickup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePickup"));

        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            this.extractAttachments(_call);
            try {
                return (net.aramex.ws.ShippingAPI.v1._PickupCreationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.aramex.ws.ShippingAPI.v1._PickupCreationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.aramex.ws.ShippingAPI.v1._PickupCreationResponse.class);
            }
        }
    }

    
	public net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse cancelPickup(net.aramex.ws.ShippingAPI.v1._PickupCancelationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = this.createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.aramex.net/ShippingAPI/v1/Service_1_0/CancelPickup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CancelPickup"));

        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            this.extractAttachments(_call);
            try {
                return (net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse.class);
            }
        }
    }

}
