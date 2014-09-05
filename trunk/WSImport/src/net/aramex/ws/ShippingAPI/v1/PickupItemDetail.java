/**
 * PickupItemDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class PickupItemDetail  implements java.io.Serializable {
    private java.lang.String productGroup;
    private java.lang.String productType;
    private int numberOfShipments;
    private java.lang.String packageType;
    private java.lang.String payment;
    private net.aramex.ws.ShippingAPI.v1.Weight shipmentWeight;
    private net.aramex.ws.ShippingAPI.v1.Volume shipmentVolume;
    private int numberOfPieces;
    private net.aramex.ws.ShippingAPI.v1.Money cashAmount;
    private net.aramex.ws.ShippingAPI.v1.Money extraCharges;
    private net.aramex.ws.ShippingAPI.v1.Dimensions shipmentDimensions;
    private java.lang.String comments;

    public PickupItemDetail() {
    }

    public java.lang.String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(java.lang.String productGroup) {
        this.productGroup = productGroup;
    }

    public java.lang.String getProductType() {
        return productType;
    }

    public void setProductType(java.lang.String productType) {
        this.productType = productType;
    }

    public int getNumberOfShipments() {
        return numberOfShipments;
    }

    public void setNumberOfShipments(int numberOfShipments) {
        this.numberOfShipments = numberOfShipments;
    }

    public java.lang.String getPackageType() {
        return packageType;
    }

    public void setPackageType(java.lang.String packageType) {
        this.packageType = packageType;
    }

    public java.lang.String getPayment() {
        return payment;
    }

    public void setPayment(java.lang.String payment) {
        this.payment = payment;
    }

    public net.aramex.ws.ShippingAPI.v1.Weight getShipmentWeight() {
        return shipmentWeight;
    }

    public void setShipmentWeight(net.aramex.ws.ShippingAPI.v1.Weight shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }

    public net.aramex.ws.ShippingAPI.v1.Volume getShipmentVolume() {
        return shipmentVolume;
    }

    public void setShipmentVolume(net.aramex.ws.ShippingAPI.v1.Volume shipmentVolume) {
        this.shipmentVolume = shipmentVolume;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(net.aramex.ws.ShippingAPI.v1.Money cashAmount) {
        this.cashAmount = cashAmount;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getExtraCharges() {
        return extraCharges;
    }

    public void setExtraCharges(net.aramex.ws.ShippingAPI.v1.Money extraCharges) {
        this.extraCharges = extraCharges;
    }

    public net.aramex.ws.ShippingAPI.v1.Dimensions getShipmentDimensions() {
        return shipmentDimensions;
    }

    public void setShipmentDimensions(net.aramex.ws.ShippingAPI.v1.Dimensions shipmentDimensions) {
        this.shipmentDimensions = shipmentDimensions;
    }

    public java.lang.String getComments() {
        return comments;
    }

    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupItemDetail)) return false;
        PickupItemDetail other = (PickupItemDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              this.productGroup.equals(other.getProductGroup()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            this.numberOfShipments == other.getNumberOfShipments() &&
            ((this.packageType==null && other.getPackageType()==null) || 
             (this.packageType!=null &&
              this.packageType.equals(other.getPackageType()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.shipmentWeight==null && other.getShipmentWeight()==null) || 
             (this.shipmentWeight!=null &&
              this.shipmentWeight.equals(other.getShipmentWeight()))) &&
            ((this.shipmentVolume==null && other.getShipmentVolume()==null) || 
             (this.shipmentVolume!=null &&
              this.shipmentVolume.equals(other.getShipmentVolume()))) &&
            this.numberOfPieces == other.getNumberOfPieces() &&
            ((this.cashAmount==null && other.getCashAmount()==null) || 
             (this.cashAmount!=null &&
              this.cashAmount.equals(other.getCashAmount()))) &&
            ((this.extraCharges==null && other.getExtraCharges()==null) || 
             (this.extraCharges!=null &&
              this.extraCharges.equals(other.getExtraCharges()))) &&
            ((this.shipmentDimensions==null && other.getShipmentDimensions()==null) || 
             (this.shipmentDimensions!=null &&
              this.shipmentDimensions.equals(other.getShipmentDimensions()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getProductGroup() != null) {
            _hashCode += getProductGroup().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        _hashCode += getNumberOfShipments();
        if (getPackageType() != null) {
            _hashCode += getPackageType().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getShipmentWeight() != null) {
            _hashCode += getShipmentWeight().hashCode();
        }
        if (getShipmentVolume() != null) {
            _hashCode += getShipmentVolume().hashCode();
        }
        _hashCode += getNumberOfPieces();
        if (getCashAmount() != null) {
            _hashCode += getCashAmount().hashCode();
        }
        if (getExtraCharges() != null) {
            _hashCode += getExtraCharges().hashCode();
        }
        if (getShipmentDimensions() != null) {
            _hashCode += getShipmentDimensions().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupItemDetail.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupItemDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProductGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfShipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "NumberOfShipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PackageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Weight"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Volume"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPieces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "NumberOfPieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "CashAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ExtraCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Dimensions"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
