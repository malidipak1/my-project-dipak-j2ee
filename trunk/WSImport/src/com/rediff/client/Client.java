package com.rediff.client;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Calendar;

import net.aramex.ws.ShippingAPI.v1.Address;
import net.aramex.ws.ShippingAPI.v1.ArrayOfAttachment;
import net.aramex.ws.ShippingAPI.v1.ArrayOfProcessedShipment;
import net.aramex.ws.ShippingAPI.v1.ArrayOfShipment;
import net.aramex.ws.ShippingAPI.v1.ArrayOfShipmentItem;
import net.aramex.ws.ShippingAPI.v1.Attachment;
import net.aramex.ws.ShippingAPI.v1.ClientInfo;
import net.aramex.ws.ShippingAPI.v1.Contact;
import net.aramex.ws.ShippingAPI.v1.Dimensions;
import net.aramex.ws.ShippingAPI.v1.LabelInfo;
import net.aramex.ws.ShippingAPI.v1.Money;
import net.aramex.ws.ShippingAPI.v1.Party;
import net.aramex.ws.ShippingAPI.v1.ProcessedShipment;
import net.aramex.ws.ShippingAPI.v1.Service_1_0_BindingStub;
import net.aramex.ws.ShippingAPI.v1.Service_1_0_Port;
import net.aramex.ws.ShippingAPI.v1.Service_1_0_Service;
import net.aramex.ws.ShippingAPI.v1.Service_1_0_ServiceLocator;
import net.aramex.ws.ShippingAPI.v1.Shipment;
import net.aramex.ws.ShippingAPI.v1.ShipmentDetails;
import net.aramex.ws.ShippingAPI.v1.ShipmentItem;
import net.aramex.ws.ShippingAPI.v1.Transaction;
import net.aramex.ws.ShippingAPI.v1.Weight;
import net.aramex.ws.ShippingAPI.v1._ShipmentCreationRequest;
import net.aramex.ws.ShippingAPI.v1._ShipmentCreationResponse;

public class Client {

	public static void main(String[] arg) {
		Shipment shipment = new Shipment();
		
		Party shipper = new Party();
		shipper.setReference1("");
		shipper.setReference2("");
		shipper.setAccountNumber("36669982");
		
		Address partyAddress = new Address();
		partyAddress.setLine1("Mahalaxmi Industry");
		partyAddress.setLine2("Rediff India Ltd");
		partyAddress.setLine3("Mahim");
		partyAddress.setCity("Mumbai");
		partyAddress.setStateOrProvinceCode("MH");
		partyAddress.setPostCode("400016");
		partyAddress.setCountryCode("IN");
		
		shipper.setPartyAddress(partyAddress);
		
		Contact contact = new Contact();
		contact.setDepartment("IT");
		contact.setPersonName("Dipak"); // M
		contact.setTitle("MR");
		contact.setCompanyName("Rediff"); // M
		contact.setPhoneNumber1("02266666666"); //M
		contact.setPhoneNumber1Ext("");
		contact.setPhoneNumber2("");
		contact.setPhoneNumber2Ext("");
		contact.setFaxNumber("");
		contact.setCellPhone("8766554534"); //M
		contact.setEmailAddress("dipakm@rediff.co.in"); //M
		contact.setType("");
	
		shipper.setContact(contact);
		
		Party consignee = new Party();
		consignee.setReference1("");
		consignee.setReference2("");
		consignee.setAccountNumber("");
		
		Address partyAddressC = new Address();
		partyAddressC.setLine1("D-3/4-1");
		partyAddressC.setLine2("Society");
		partyAddressC.setLine3("");
		partyAddressC.setCity("Mumbai");
		partyAddressC.setStateOrProvinceCode("MH");
		partyAddressC.setPostCode("400093");
		partyAddressC.setCountryCode("IN");
		
		consignee.setPartyAddress(partyAddressC);
		
		Contact contactC = new Contact();
		contactC.setDepartment("test");
		contactC.setPersonName("Test User"); //M
		contactC.setTitle("MR");
		contactC.setCompanyName("Rediff");//M
		contactC.setPhoneNumber1("02266666666"); //M
		contactC.setPhoneNumber1Ext("");
		contactC.setPhoneNumber2("");
		contactC.setPhoneNumber2Ext("");
		contactC.setFaxNumber("");
		contactC.setCellPhone("9644222233"); //M
		contactC.setEmailAddress("test@gmail.com"); //M
		contactC.setType("");
	
		consignee.setContact(contactC);
		
		Party thirdParty = new Party();
		thirdParty.setReference1("");
		thirdParty.setReference2("");
		thirdParty.setAccountNumber("36669982"); //should be same as client info - AccNo
		
		Address partyAddress3 = new Address();
		partyAddress3.setLine1("Rediff.com India Ltd");
		partyAddress3.setLine2("Mahalaxmi Engg. Estate");
		partyAddress3.setLine3("Mahim");
		partyAddress3.setCity("Mumbai");
		partyAddress3.setStateOrProvinceCode("MH");
		partyAddress3.setPostCode("400001");
		partyAddress3.setCountryCode("IN");
		
		thirdParty.setPartyAddress(partyAddress3);
		
		Contact contact3 = new Contact();
		contact3.setDepartment("IT");
		contact3.setPersonName("Dipak Mali");
		contact3.setTitle("Mr");
		contact3.setCompanyName("Rediff India Ltd");
		contact3.setPhoneNumber1("912261820000");
		contact3.setPhoneNumber1Ext("");
		contact3.setPhoneNumber2("912261820000");
		contact3.setPhoneNumber2Ext("");
		contact3.setFaxNumber("");
		contact3.setCellPhone("912261820000");
		contact3.setEmailAddress("dipakm@rediff.co.in");
		contact3.setType("");
	
		thirdParty.setContact(contact3);
		
		ShipmentDetails details = new ShipmentDetails();
		
		Weight actualWeight = new Weight();
		actualWeight.setUnit("kg");
		actualWeight.setValue(1);
		
		Dimensions dimensions = new Dimensions();
		dimensions.setHeight(1);
		dimensions.setLength(1);
		dimensions.setUnit("cm");
		dimensions.setWidth(1);
		
		
		details.setDimensions(dimensions);
		details.setActualWeight(actualWeight);
		details.setChargeableWeight(actualWeight);
		details.setDescriptionOfGoods("Test Product"); //M
		details.setGoodsOriginCountry("IN");
		details.setNumberOfPieces(1);
		
		details.setProductGroup("DOM");
		details.setProductType("ONP"); // if ProductGroup=DOM Then { Prepaid => ONP & COD => CDA } else { PPX } only
		details.setPaymentOptions("");
		details.setPaymentType("3"); // if 3rd party
		
		Money objMoney = new Money();
		objMoney.setCurrencyCode("INR");
		objMoney.setValue(1); //Transaction Amt
		
		Money objCodMoney = new Money();
		objCodMoney.setCurrencyCode("INR"); 
		objCodMoney.setValue(0); //COD Amt
		
		details.setCashAdditionalAmount(objMoney);
		details.setCashAdditionalAmountDescription("");
		details.setCashOnDeliveryAmount(objCodMoney); //COD = 0 else PREAPAID PRICE
		details.setCollectAmount(objCodMoney); //COD = 0 else PREAPAID PRICE
		details.setCustomsValueAmount(objMoney);
		details.setInsuranceAmount(objMoney);
		details.setServices("FRDOM");// if { COD => CODS} else FRDOM
	
		
		ArrayOfShipmentItem items = new ArrayOfShipmentItem();
		ShipmentItem item = new ShipmentItem();  
		item.setComments("test");//M
		item.setQuantity(1);
		item.setPackageType("Parcel");
		item.setReference("");
		item.setWeight(actualWeight);
		items.setShipmentItem(0,item);
		details.setItems(items);
		
		shipment.setShipper(shipper);
		shipment.setConsignee(consignee);
		shipment.setThirdParty(thirdParty);
		shipment.setReference1("");
		shipment.setReference2("");
		shipment.setReference3("");
	
		shipment.setShippingDateTime(Calendar.getInstance());
		shipment.setDueDate(Calendar.getInstance());
		shipment.setPickupLocation("Reception");
		shipment.setComments("test");
		shipment.setAccountingInstrcutions("");
		shipment.setOperationsInstructions("");
		shipment.setDetails(details);
		
		Attachment objAtt = new Attachment();
		try {
			objAtt = new Attachment();
			objAtt.setFileExtension("txt");
			objAtt.setFileName("temp");
			objAtt.setFileContents("Test content".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		ArrayOfAttachment arrAttachment = new ArrayOfAttachment();
		arrAttachment.setAttachment(0, objAtt);
		
		shipment.setAttachments(arrAttachment);
		//shipment.setForeignHAWB("");
		shipment.setTransportType_x0020_(new Integer(1));
		shipment.setPickupGUID("");
		ArrayOfShipment  shipments= new ArrayOfShipment();
		shipments.setShipment(0, shipment);

		/*ClientInfo clientInfo = new ClientInfo();
		clientInfo.setAccountCountryCode("IN");
		clientInfo.setAccountEntity("BLR");
		clientInfo.setAccountNumber("BLR3238");
		clientInfo.setAccountPin("126643");
		clientInfo.setPassword("rediff@123");
		clientInfo.setUserName("dipakm@rediff.co.in");
		clientInfo.setVersion("v1.0");*/
		
		ClientInfo clientInfo = new ClientInfo();
		clientInfo.setAccountCountryCode("IN");
		clientInfo.setAccountEntity("BOM");
		clientInfo.setAccountNumber("36669982");
		clientInfo.setAccountPin("443543");
		clientInfo.setPassword("aramex@1234");
		clientInfo.setUserName("amoltated@gmail.com");
		clientInfo.setVersion("v1.0");
		
		LabelInfo labelInfo = new LabelInfo();
		labelInfo.setReportID(9729);
		labelInfo.setReportType("URL");
		
		Transaction transaction = new Transaction();
		transaction.setReference1("");
		transaction.setReference2("");
		transaction.setReference3("");
		transaction.setReference4("");
		transaction.setReference5("");
				
		_ShipmentCreationRequest req = new _ShipmentCreationRequest();
		req.setClientInfo(clientInfo);
		req.setLabelInfo(labelInfo);
		req.setShipments(shipments);
		req.setTransaction(transaction);
			
		try {
			 _ShipmentCreationResponse objResp = null;
			//Service_1_0_Service intfaceSer = new Service_1_0_Service();
            Service_1_0_ServiceLocator objSLoc = new Service_1_0_ServiceLocator();
            //String endPoint = objSLoc.getService_1_0Address();
			 
            //System.out.println()
            /*Service_1_0_BindingStub stub = new Service_1_0_BindingStub(new URL(endPoint), new org.apache.axis.client.Service());
            stub.setUsername("amoltated@gmail.com");
            stub.setPassword("aramex@1234");*/
            
            Service_1_0_Port objPort = objSLoc.getService_1_0();
            //objPort._setProperty(Call.WSDL_SERVICE, Boolean.TRUE);
            objResp = objPort.createShipments(req);
			
			if(objResp != null){ 
				Transaction txnObj = objResp.getTransaction();
				System.out.println("-->" + txnObj.getReference1() + "" + txnObj.getReference2());
				
				Boolean hasErr = objResp.getHasErrors();
				
				if(hasErr.booleanValue()) {
					System.out.println("Error:" + objResp.getShipments());
				} else {
					ArrayOfProcessedShipment arrProShipment = objResp.getShipments();
					ProcessedShipment objProShip = arrProShipment.getProcessedShipment(0);
					String awb = objProShip.getID();
					System.out.println("Awb: " + awb);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception...:");
			e.printStackTrace(System.out);			
		}
	}
}
