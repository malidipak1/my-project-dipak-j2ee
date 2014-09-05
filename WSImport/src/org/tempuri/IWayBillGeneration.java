/**
 * IWayBillGeneration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.tempuri;

public interface IWayBillGeneration extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse generateWayBill(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest request, org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile profile) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationResponse importData(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationRequest request, org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile profile) throws java.rmi.RemoteException;
}
