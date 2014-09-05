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
import org.tempuri.WSHttpBinding_IWayBillGenerationStub;
import org.tempuri.BasicHttpBinding_IWayBillGenerationStub;
import org.tempuri.WayBillGenerationLocator;
import org.tempuri.IWayBillGeneration;

public class BDClient {

	public static void main(String []arg) {
		String licenceKey = "209846b3692f63395ce800235950c56d";//"eb008c3065e35ebba35955f5a15eba19";
		String loginID = "BOM03102";
		String versionno = "1.3";//"1.3f"
		
		Shipper shipper = new Shipper();
		shipper.setCustomerName("Mangesh Kadam - Cellular Ltd."); // M
		shipper.setCustomerAddress1("416, daulat Bhavan"); // M
		shipper.setCustomerAddress2("");
		shipper.setCustomerAddress3("");
		shipper.setCustomerCode("113072"); // M - 6 digit, Customer Code  Pre = 113072 / COD- 290102
		shipper.setCustomerPincode("400002");//M
		shipper.setIsToPayCustomer(new Boolean(false)); // M - ToPay Customer or not
		shipper.setOriginArea("BOM"); // M - 3 digit, Customer Area code  - city code - get from prashant
		//shipper.setSender(sender);
		//shipper.setVendorCode(vendorCode);
		//shipper.setCustomerEmailID(customerEmailID);
		shipper.setCustomerMobile("9769803048");
		//shipper.setCustomerTelephone(customerTelephone);
		
		Consignee consignee = new Consignee();
		consignee.setConsigneeName("bipinkumar bipinkumar"); // M
		consignee.setConsigneeAddress1("Thuruthiyil puthen purayil "); // M
		consignee.setConsigneeAddress2(" adress goes here to");
		consignee.setConsigneeAddress3(" make it of more character");
		consignee.setConsigneePincode("689101");
		//consignee.setConsigneeAttention(consigneeAttention);
		consignee.setConsigneeMobile("919745051273");
		//consignee.setConsigneeTelephone(consigneeTelephone);

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
		services.setActualWeight(new Double(1.00)); // M - Shipment Actual Weight
		services.setCreditReferenceNo("WE045612"); //M - shld be unique
		services.setPickupDate(Calendar.getInstance()); //M
		services.setPickupTime("2000"); //M --- 1400
		services.setPieceCount(new Integer(1)); // M
		services.setProductCode("A"); //E //M AC AP air, EC EP surface prepraid 
		services.setProductType(ProductType.Dutiables); //M ProductType.Docs, ProductType.Dutiables
		//services.setSpecialInstruction(specialInstruction);
		services.setSubProductCode("P");//P- C-
		services.setCollectableAmount(new Double(0.0));
		services.setCommodity(null);
		services.setDeclaredValue(new Double(151.0));
		services.setDimensions(arrObjDim);
		services.setInvoiceNo("0986");
		//services.setPackType(packType);
		
		WayBillGenerationRequest objReq = new WayBillGenerationRequest();
		objReq.setConsignee(consignee);
		objReq.setShipper(shipper);
		objReq.setServices(services);
		
		UserProfile objProfile = new UserProfile();
		objProfile.setApi_type("S");
		//objProfile.setArea(area);
		//objProfile.setCustomercode(customercode);
		//objProfile.setIsAdmin(isAdmin);
		objProfile.setLicenceKey(licenceKey);
		objProfile.setLoginID(loginID);
		//objProfile.setPassword(password);
		objProfile.setVersion(versionno);
		
		WayBillGenerationResponse objResp = null;
		
		try {
			
			WayBillGenerationLocator helloService = new WayBillGenerationLocator(); 
			IWayBillGeneration hello = helloService.getBasicHttpBinding_IWayBillGeneration();
			objResp = hello.generateWayBill(objReq, objProfile);	
		} catch (AxisFault e) {
			System.out.println("Error is here...");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!objResp.getIsError().booleanValue()) {
			System.out.println("AWB: " + objResp.getAWBNo());
			System.out.println("content: " + objResp.getAWBPrintContent());
			//objResp.getDestinationArea() / objResp.getDestinationLocation();
		} else {
			ArrayOfWayBillGenerationStatus objArrRespStatus = objResp.getStatus();
			WayBillGenerationStatus objRespStatus =  objArrRespStatus.getWayBillGenerationStatus(0);
			System.out.println("Status code: " + objRespStatus.getStatusCode() + " Status:" + objRespStatus.getStatusInformation());
		}
		
	}
}
