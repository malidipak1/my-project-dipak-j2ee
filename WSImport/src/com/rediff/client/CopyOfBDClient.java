package com.rediff.client;

import java.net.URL;
import java.util.Calendar;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.datacontract.schemas._2004._07.SAPI_Entities_Admin.UserProfile;
import org.datacontract.schemas._2004._07.SAPI_Entities_Enums_AWBGeneration.ProductType;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfDimension;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationStatus;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Consignee;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Services;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Shipper;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse;
import org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationStatus;
import org.tempuri.BasicHttpBinding_IWayBillGenerationStub;
import org.tempuri.IWayBillGeneration;
import org.tempuri.WSHttpBinding_IWayBillGenerationStub;
import org.tempuri.WayBillGenerationLocator;

public class CopyOfBDClient {

	Shipper shipper = null; 
	Consignee consignee = null;
	Services services = null;
	
	String awbNo = "";
	int txnId = 0;
	int orderId = 0;
	int payType = 0;
	
	public CopyOfBDClient() {
		// TODO Auto-generated constructor stub
	}
	
	public CopyOfBDClient(int orderId, int txnId, int payType) {
		// TODO Auto-generated constructor stub
		setShippingDetail (orderId, txnId, payType);
	}
	
	public void setShippingDetail (int orderId, int txnId, int payType) {
		orderId = orderId;
		txnId = txnId;
		payType = payType;
	}
	
	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper() {
		Shipper shipper = new Shipper(); 
		shipper.setCustomerName("Jaspreet Sahani - Jaspreet  S Sahani"); // M - vendr name
		shipper.setCustomerAddress1("No.6, Parekh Mkj, 39 Jaganath Shankar Road, Opera House, Mumbai - 400004"); // M - vend addrs
		shipper.setCustomerAddress2(""); 
		shipper.setCustomerAddress3("");
		shipper.setCustomerCode("113072"); // M - 6 digit, Customer Code,  Prepaid = 113072 / COD- 290102
		shipper.setCustomerPincode("400004");//M - vend pincode
		shipper.setIsToPayCustomer(new Boolean(false)); // M - ToPay Customer or not 
		shipper.setOriginArea("BOM"); // M - 3 digit, Customer Area code - city code - get from prashant
		//shipper.setSender(sender);
		//shipper.setVendorCode(vendorCode);
		//shipper.setCustomerEmailID(customerEmailID);
		//shipper.setCustomerMobile(customerMobile);
		//shipper.setCustomerTelephone(customerTelephone);
		
		this.shipper = shipper;
	}

	public Consignee getConsignee() {
		return consignee;
	}

	public void setConsignee() {
		Consignee consignee = new Consignee();
		consignee.setConsigneeName("pabon kr doley"); // M
		consignee.setConsigneeAddress1(" C.D.Road, Ward No - 7, Near ICICI bank, null"); // M
		consignee.setConsigneeAddress2("");
		consignee.setConsigneeAddress3("");
		consignee.setConsigneePincode("787001");
		consignee.setConsigneeMobile("919706762523");
		//consignee.setConsigneeAttention(consigneeAttention);
		//consignee.setConsigneeTelephone(consigneeTelephone);
		this.consignee = consignee;
	}

	public Services getServices() {
		return services;
	}

	public void setServices() {
		Dimension objDim = new Dimension();
		objDim.setBreadth(new Double(1));
		objDim.setCount(new Integer(1));
		objDim.setHeight(new Double(1));
		objDim.setLength(new Double(1));
		
		Dimension [] arrDim = new Dimension[1];
		arrDim[0] = objDim;
		ArrayOfDimension arrObjDim = new ArrayOfDimension();
		arrObjDim.setDimension(arrDim);
		
		Services services = new Services();
		services.setActualWeight(new Double(0.5)); // M - Shipment Actual Weight
		services.setCreditReferenceNo("102876676"); //M - shld be unique - AWB GENEARATERD AGAINST this no --- STRFNBR
		services.setPickupDate(Calendar.getInstance()); //M
		services.setPickupTime("1700"); //M
		services.setPieceCount(new Integer(1)); // M
		services.setProductCode("A"); //M
		services.setProductType(ProductType.Dutiables); //M ProductType.Docs, ProductType.Dutiables
		services.setSubProductCode("P");//M   C- COD & P- PREPAID
		services.setCollectableAmount(new Double(0.00)); // COD AMt & in prepaid 0
		services.setDeclaredValue(new Double(3878.0)); // COD AMt
		services.setCommodity(null);
		services.setDimensions(arrObjDim);
		services.setInvoiceNo("102876676"); // TRX NO
		//services.setPackType(packType);
		//services.setSpecialInstruction(specialInstruction);
		this.services = services;
	}

	public String generateAWB () {
		
		WayBillGenerationRequest objReq = new WayBillGenerationRequest();
		objReq.setConsignee(consignee);
		objReq.setShipper(shipper);
		objReq.setServices(services);

		BDProfile objBDProfile = BDProfile.getBDProfile();
		UserProfile objProfile = new UserProfile();
		objProfile.setApi_type("S");
		objProfile.setLicenceKey(objBDProfile.licenceKey);
		objProfile.setLoginID(objBDProfile.loginID);
		objProfile.setVersion(objBDProfile.versionno);
		//objProfile.setArea(area);
		//objProfile.setCustomercode("290102");
		//objProfile.setIsAdmin(isAdmin);
		//objProfile.setPassword(password);
	
		WayBillGenerationResponse objResp = null;
		
		try {
			
			WayBillGenerationLocator objService = new WayBillGenerationLocator(); 
			 org.tempuri.IWayBillGeneration objWayGen = objService.getBasicHttpBinding_IWayBillGeneration();
			objResp = (WayBillGenerationResponse)objWayGen.generateWayBill(objReq, objProfile);
			
		} catch (AxisFault e) {
			System.out.println("Error is here...");
			e.printStackTrace(System.out);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		if(!objResp.getIsError().booleanValue()) {
			awbNo = objResp.getAWBNo();
			System.out.println("AWB: " + awbNo);
			System.out.println("getCCRCRDREF:" + objResp.getCCRCRDREF());
			System.out.println("getDestinationArea: " + objResp.getDestinationArea());
			System.out.println("getDestinationLocation: " + objResp.getDestinationLocation());
			System.out.println("content: " + objResp.getAWBPrintContent());
			System.out.println("getIsError: " + objResp.getIsError());
		} else {
			ArrayOfWayBillGenerationStatus objArrRespStatus = objResp.getStatus();
			WayBillGenerationStatus objRespStatus =  objArrRespStatus.getWayBillGenerationStatus(0);
			System.out.println("Status code: " + objRespStatus.getStatusCode() + " \nStatus:" + objRespStatus.getStatusInformation());
		}
		
		return awbNo;
	}
	
	public static void main(String []arg) {
		CopyOfBDClient objC = new CopyOfBDClient();
		objC.setShipper();
		objC.setConsignee();
		objC.setServices();
		objC.generateAWB();
	}
}
