/**
 * BasicHttpBinding_IWayBillGenerationStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.tempuri;

public class BasicHttpBinding_IWayBillGenerationStub extends org.apache.axis.client.Stub implements org.tempuri.IWayBillGeneration {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GenerateWayBill");
        oper.addParameter(new javax.xml.namespace.QName("http://tempuri.org/", "Request"), new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationRequest"), org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("http://tempuri.org/", "Profile"), new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.Admin", "UserProfile"), org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationResponse"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GenerateWayBillResult"));
        //oper.setStyle(org.apache.axis.enum.Style.WRAPPED);
        //oper.setUse(org.apache.axis.enum.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ImportData");
        oper.addParameter(new javax.xml.namespace.QName("http://tempuri.org/", "Request"), new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationRequest"), org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationRequest.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("http://tempuri.org/", "Profile"), new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.Admin", "UserProfile"), org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationResponse"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ImportDataResult"));
        //oper.setStyle(org.apache.axis.enum.Style.WRAPPED);
        //oper.setUse(org.apache.axis.enum.Use.LITERAL);
        _operations[1] = oper;

    }

    public BasicHttpBinding_IWayBillGenerationStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IWayBillGenerationStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IWayBillGenerationStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationStatus");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.Admin", "UserProfile");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationResponse");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationResponse");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Shipper");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Shipper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Consignee");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Consignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Services");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Services.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Dimension");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CommodityDetail");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.CommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationStatus");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfDimension");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfDimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.Enums.AWBGeneration", "ProductType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SAPI_Entities_Enums_AWBGeneration.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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
                if (firstCall()) {
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

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse generateWayBill(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest request, org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile profile) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IWayBillGeneration/GenerateWayBill");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GenerateWayBill"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, profile});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse.class);
            }
        }
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse importData(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationRequest request, org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile profile) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IWayBillGeneration/ImportData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ImportData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, profile});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse.class);
            }
        }
    }

}
