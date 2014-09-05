/**
 * Shipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class Shipment  implements java.io.Serializable {
    private java.lang.String reference1;
    private java.lang.String reference2;
    private java.lang.String reference3;
    private net.aramex.ws.ShippingAPI.v1.Party shipper;
    private net.aramex.ws.ShippingAPI.v1.Party consignee;
    private net.aramex.ws.ShippingAPI.v1.Party thirdParty;
    private java.util.Calendar shippingDateTime;
    private java.util.Calendar dueDate;
    private java.lang.String comments;
    private java.lang.String pickupLocation;
    private java.lang.String operationsInstructions;
    private java.lang.String accountingInstrcutions;
    private net.aramex.ws.ShippingAPI.v1.ShipmentDetails details;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfAttachment attachments;
    private java.lang.String foreignHAWB;
    private java.lang.Integer transportType_x0020_;
    private java.lang.String pickupGUID;

    public Shipment() {
    }

    public java.lang.String getReference1() {
        return reference1;
    }

    public void setReference1(java.lang.String reference1) {
        this.reference1 = reference1;
    }

    public java.lang.String getReference2() {
        return reference2;
    }

    public void setReference2(java.lang.String reference2) {
        this.reference2 = reference2;
    }

    public java.lang.String getReference3() {
        return reference3;
    }

    public void setReference3(java.lang.String reference3) {
        this.reference3 = reference3;
    }

    public net.aramex.ws.ShippingAPI.v1.Party getShipper() {
        return shipper;
    }

    public void setShipper(net.aramex.ws.ShippingAPI.v1.Party shipper) {
        this.shipper = shipper;
    }

    public net.aramex.ws.ShippingAPI.v1.Party getConsignee() {
        return consignee;
    }

    public void setConsignee(net.aramex.ws.ShippingAPI.v1.Party consignee) {
        this.consignee = consignee;
    }

    public net.aramex.ws.ShippingAPI.v1.Party getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(net.aramex.ws.ShippingAPI.v1.Party thirdParty) {
        this.thirdParty = thirdParty;
    }

    public java.util.Calendar getShippingDateTime() {
        return shippingDateTime;
    }

    public void setShippingDateTime(java.util.Calendar shippingDateTime) {
        this.shippingDateTime = shippingDateTime;
    }

    public java.util.Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public java.lang.String getComments() {
        return comments;
    }

    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    public java.lang.String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(java.lang.String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public java.lang.String getOperationsInstructions() {
        return operationsInstructions;
    }

    public void setOperationsInstructions(java.lang.String operationsInstructions) {
        this.operationsInstructions = operationsInstructions;
    }

    public java.lang.String getAccountingInstrcutions() {
        return accountingInstrcutions;
    }

    public void setAccountingInstrcutions(java.lang.String accountingInstrcutions) {
        this.accountingInstrcutions = accountingInstrcutions;
    }

    public net.aramex.ws.ShippingAPI.v1.ShipmentDetails getDetails() {
        return details;
    }

    public void setDetails(net.aramex.ws.ShippingAPI.v1.ShipmentDetails details) {
        this.details = details;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfAttachment getAttachments() {
        return attachments;
    }

    public void setAttachments(net.aramex.ws.ShippingAPI.v1.ArrayOfAttachment attachments) {
        this.attachments = attachments;
    }

    public java.lang.String getForeignHAWB() {
        return foreignHAWB;
    }

    public void setForeignHAWB(java.lang.String foreignHAWB) {
        this.foreignHAWB = foreignHAWB;
    }

    public java.lang.Integer getTransportType_x0020_() {
        return transportType_x0020_;
    }

    public void setTransportType_x0020_(java.lang.Integer transportType_x0020_) {
        this.transportType_x0020_ = transportType_x0020_;
    }

    public java.lang.String getPickupGUID() {
        return pickupGUID;
    }

    public void setPickupGUID(java.lang.String pickupGUID) {
        this.pickupGUID = pickupGUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Shipment)) return false;
        Shipment other = (Shipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reference1==null && other.getReference1()==null) || 
             (this.reference1!=null &&
              this.reference1.equals(other.getReference1()))) &&
            ((this.reference2==null && other.getReference2()==null) || 
             (this.reference2!=null &&
              this.reference2.equals(other.getReference2()))) &&
            ((this.reference3==null && other.getReference3()==null) || 
             (this.reference3!=null &&
              this.reference3.equals(other.getReference3()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.thirdParty==null && other.getThirdParty()==null) || 
             (this.thirdParty!=null &&
              this.thirdParty.equals(other.getThirdParty()))) &&
            ((this.shippingDateTime==null && other.getShippingDateTime()==null) || 
             (this.shippingDateTime!=null &&
              this.shippingDateTime.equals(other.getShippingDateTime()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.pickupLocation==null && other.getPickupLocation()==null) || 
             (this.pickupLocation!=null &&
              this.pickupLocation.equals(other.getPickupLocation()))) &&
            ((this.operationsInstructions==null && other.getOperationsInstructions()==null) || 
             (this.operationsInstructions!=null &&
              this.operationsInstructions.equals(other.getOperationsInstructions()))) &&
            ((this.accountingInstrcutions==null && other.getAccountingInstrcutions()==null) || 
             (this.accountingInstrcutions!=null &&
              this.accountingInstrcutions.equals(other.getAccountingInstrcutions()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.foreignHAWB==null && other.getForeignHAWB()==null) || 
             (this.foreignHAWB!=null &&
              this.foreignHAWB.equals(other.getForeignHAWB()))) &&
            ((this.transportType_x0020_==null && other.getTransportType_x0020_()==null) || 
             (this.transportType_x0020_!=null &&
              this.transportType_x0020_.equals(other.getTransportType_x0020_()))) &&
            ((this.pickupGUID==null && other.getPickupGUID()==null) || 
             (this.pickupGUID!=null &&
              this.pickupGUID.equals(other.getPickupGUID())));
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
        if (getReference1() != null) {
            _hashCode += getReference1().hashCode();
        }
        if (getReference2() != null) {
            _hashCode += getReference2().hashCode();
        }
        if (getReference3() != null) {
            _hashCode += getReference3().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getConsignee() != null) {
            _hashCode += getConsignee().hashCode();
        }
        if (getThirdParty() != null) {
            _hashCode += getThirdParty().hashCode();
        }
        if (getShippingDateTime() != null) {
            _hashCode += getShippingDateTime().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getPickupLocation() != null) {
            _hashCode += getPickupLocation().hashCode();
        }
        if (getOperationsInstructions() != null) {
            _hashCode += getOperationsInstructions().hashCode();
        }
        if (getAccountingInstrcutions() != null) {
            _hashCode += getAccountingInstrcutions().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getForeignHAWB() != null) {
            _hashCode += getForeignHAWB().hashCode();
        }
        if (getTransportType_x0020_() != null) {
            _hashCode += getTransportType_x0020_().hashCode();
        }
        if (getPickupGUID() != null) {
            _hashCode += getPickupGUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Shipment.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Shipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Reference1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Reference2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Reference3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Party"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Party"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ThirdParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Party"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShippingDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationsInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "OperationsInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingInstrcutions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "AccountingInstrcutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentDetails"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfAttachment"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignHAWB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ForeignHAWB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportType_x0020_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "TransportType_x0020_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupGUID"));
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
