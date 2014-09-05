/**
 * Service_1_0_Port.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public interface Service_1_0_Port extends java.rmi.Remote {
    public net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse createShipments(net.aramex.ws.ShippingAPI.v1._ShipmentCreationRequest parameters) throws java.rmi.RemoteException;
    public net.aramex.ws.ShippingAPI.v1._LabelPrintingResponse printLabel(net.aramex.ws.ShippingAPI.v1._LabelPrintingRequest parameters) throws java.rmi.RemoteException;
    public net.aramex.ws.ShippingAPI.v1._PickupCreationResponse createPickup(net.aramex.ws.ShippingAPI.v1._PickupCreationRequest parameters) throws java.rmi.RemoteException;
    public net.aramex.ws.ShippingAPI.v1._PickupCancelationResponse cancelPickup(net.aramex.ws.ShippingAPI.v1._PickupCancelationRequest parameters) throws java.rmi.RemoteException;
}
