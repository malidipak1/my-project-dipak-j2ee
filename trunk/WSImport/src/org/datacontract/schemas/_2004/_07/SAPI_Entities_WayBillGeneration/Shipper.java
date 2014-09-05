/**
 * Shipper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class Shipper  implements java.io.Serializable {
    private java.lang.String customerAddress1;
    private java.lang.String customerAddress2;
    private java.lang.String customerAddress3;
    private java.lang.String customerCode;
    private java.lang.String customerEmailID;
    private java.lang.String customerMobile;
    private java.lang.String customerName;
    private java.lang.String customerPincode;
    private java.lang.String customerTelephone;
    private java.lang.Boolean isToPayCustomer;
    private java.lang.String originArea;
    private java.lang.String sender;
    private java.lang.String vendorCode;

    public Shipper() {
    }

    public java.lang.String getCustomerAddress1() {
        return customerAddress1;
    }

    public void setCustomerAddress1(java.lang.String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public java.lang.String getCustomerAddress2() {
        return customerAddress2;
    }

    public void setCustomerAddress2(java.lang.String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public java.lang.String getCustomerAddress3() {
        return customerAddress3;
    }

    public void setCustomerAddress3(java.lang.String customerAddress3) {
        this.customerAddress3 = customerAddress3;
    }

    public java.lang.String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }

    public java.lang.String getCustomerEmailID() {
        return customerEmailID;
    }

    public void setCustomerEmailID(java.lang.String customerEmailID) {
        this.customerEmailID = customerEmailID;
    }

    public java.lang.String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(java.lang.String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public java.lang.String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }

    public java.lang.String getCustomerPincode() {
        return customerPincode;
    }

    public void setCustomerPincode(java.lang.String customerPincode) {
        this.customerPincode = customerPincode;
    }

    public java.lang.String getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(java.lang.String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public java.lang.Boolean getIsToPayCustomer() {
        return isToPayCustomer;
    }

    public void setIsToPayCustomer(java.lang.Boolean isToPayCustomer) {
        this.isToPayCustomer = isToPayCustomer;
    }

    public java.lang.String getOriginArea() {
        return originArea;
    }

    public void setOriginArea(java.lang.String originArea) {
        this.originArea = originArea;
    }

    public java.lang.String getSender() {
        return sender;
    }

    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }

    public java.lang.String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(java.lang.String vendorCode) {
        this.vendorCode = vendorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Shipper)) return false;
        Shipper other = (Shipper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerAddress1==null && other.getCustomerAddress1()==null) || 
             (this.customerAddress1!=null &&
              this.customerAddress1.equals(other.getCustomerAddress1()))) &&
            ((this.customerAddress2==null && other.getCustomerAddress2()==null) || 
             (this.customerAddress2!=null &&
              this.customerAddress2.equals(other.getCustomerAddress2()))) &&
            ((this.customerAddress3==null && other.getCustomerAddress3()==null) || 
             (this.customerAddress3!=null &&
              this.customerAddress3.equals(other.getCustomerAddress3()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.customerEmailID==null && other.getCustomerEmailID()==null) || 
             (this.customerEmailID!=null &&
              this.customerEmailID.equals(other.getCustomerEmailID()))) &&
            ((this.customerMobile==null && other.getCustomerMobile()==null) || 
             (this.customerMobile!=null &&
              this.customerMobile.equals(other.getCustomerMobile()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerPincode==null && other.getCustomerPincode()==null) || 
             (this.customerPincode!=null &&
              this.customerPincode.equals(other.getCustomerPincode()))) &&
            ((this.customerTelephone==null && other.getCustomerTelephone()==null) || 
             (this.customerTelephone!=null &&
              this.customerTelephone.equals(other.getCustomerTelephone()))) &&
            ((this.isToPayCustomer==null && other.getIsToPayCustomer()==null) || 
             (this.isToPayCustomer!=null &&
              this.isToPayCustomer.equals(other.getIsToPayCustomer()))) &&
            ((this.originArea==null && other.getOriginArea()==null) || 
             (this.originArea!=null &&
              this.originArea.equals(other.getOriginArea()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              this.vendorCode.equals(other.getVendorCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomerAddress1() != null) {
            _hashCode += getCustomerAddress1().hashCode();
        }
        if (getCustomerAddress2() != null) {
            _hashCode += getCustomerAddress2().hashCode();
        }
        if (getCustomerAddress3() != null) {
            _hashCode += getCustomerAddress3().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getCustomerEmailID() != null) {
            _hashCode += getCustomerEmailID().hashCode();
        }
        if (getCustomerMobile() != null) {
            _hashCode += getCustomerMobile().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerPincode() != null) {
            _hashCode += getCustomerPincode().hashCode();
        }
        if (getCustomerTelephone() != null) {
            _hashCode += getCustomerTelephone().hashCode();
        }
        if (getIsToPayCustomer() != null) {
            _hashCode += getIsToPayCustomer().hashCode();
        }
        if (getOriginArea() != null) {
            _hashCode += getOriginArea().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getVendorCode() != null) {
            _hashCode += getVendorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Shipper.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Shipper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEmailID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerEmailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPincode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerPincode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CustomerTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isToPayCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "IsToPayCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "OriginArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "VendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
