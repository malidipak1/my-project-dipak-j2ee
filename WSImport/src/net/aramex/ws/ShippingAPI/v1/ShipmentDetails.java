/**
 * ShipmentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class ShipmentDetails  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.Dimensions dimensions;
    private net.aramex.ws.ShippingAPI.v1.Weight actualWeight;
    private net.aramex.ws.ShippingAPI.v1.Weight chargeableWeight;
    private java.lang.String descriptionOfGoods;
    private java.lang.String goodsOriginCountry;
    private int numberOfPieces;
    private java.lang.String productGroup;
    private java.lang.String productType;
    private java.lang.String paymentType;
    private java.lang.String paymentOptions;
    private net.aramex.ws.ShippingAPI.v1.Money customsValueAmount;
    private net.aramex.ws.ShippingAPI.v1.Money cashOnDeliveryAmount;
    private net.aramex.ws.ShippingAPI.v1.Money insuranceAmount;
    private net.aramex.ws.ShippingAPI.v1.Money cashAdditionalAmount;
    private java.lang.String cashAdditionalAmountDescription;
    private net.aramex.ws.ShippingAPI.v1.Money collectAmount;
    private java.lang.String services;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfShipmentItem items;

    public ShipmentDetails() {
    }

    public net.aramex.ws.ShippingAPI.v1.Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(net.aramex.ws.ShippingAPI.v1.Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public net.aramex.ws.ShippingAPI.v1.Weight getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(net.aramex.ws.ShippingAPI.v1.Weight actualWeight) {
        this.actualWeight = actualWeight;
    }

    public net.aramex.ws.ShippingAPI.v1.Weight getChargeableWeight() {
        return chargeableWeight;
    }

    public void setChargeableWeight(net.aramex.ws.ShippingAPI.v1.Weight chargeableWeight) {
        this.chargeableWeight = chargeableWeight;
    }

    public java.lang.String getDescriptionOfGoods() {
        return descriptionOfGoods;
    }

    public void setDescriptionOfGoods(java.lang.String descriptionOfGoods) {
        this.descriptionOfGoods = descriptionOfGoods;
    }

    public java.lang.String getGoodsOriginCountry() {
        return goodsOriginCountry;
    }

    public void setGoodsOriginCountry(java.lang.String goodsOriginCountry) {
        this.goodsOriginCountry = goodsOriginCountry;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
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

    public java.lang.String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }

    public java.lang.String getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(java.lang.String paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getCustomsValueAmount() {
        return customsValueAmount;
    }

    public void setCustomsValueAmount(net.aramex.ws.ShippingAPI.v1.Money customsValueAmount) {
        this.customsValueAmount = customsValueAmount;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getCashOnDeliveryAmount() {
        return cashOnDeliveryAmount;
    }

    public void setCashOnDeliveryAmount(net.aramex.ws.ShippingAPI.v1.Money cashOnDeliveryAmount) {
        this.cashOnDeliveryAmount = cashOnDeliveryAmount;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(net.aramex.ws.ShippingAPI.v1.Money insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getCashAdditionalAmount() {
        return cashAdditionalAmount;
    }

    public void setCashAdditionalAmount(net.aramex.ws.ShippingAPI.v1.Money cashAdditionalAmount) {
        this.cashAdditionalAmount = cashAdditionalAmount;
    }

    public java.lang.String getCashAdditionalAmountDescription() {
        return cashAdditionalAmountDescription;
    }

    public void setCashAdditionalAmountDescription(java.lang.String cashAdditionalAmountDescription) {
        this.cashAdditionalAmountDescription = cashAdditionalAmountDescription;
    }

    public net.aramex.ws.ShippingAPI.v1.Money getCollectAmount() {
        return collectAmount;
    }

    public void setCollectAmount(net.aramex.ws.ShippingAPI.v1.Money collectAmount) {
        this.collectAmount = collectAmount;
    }

    public java.lang.String getServices() {
        return services;
    }

    public void setServices(java.lang.String services) {
        this.services = services;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfShipmentItem getItems() {
        return items;
    }

    public void setItems(net.aramex.ws.ShippingAPI.v1.ArrayOfShipmentItem items) {
        this.items = items;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentDetails)) return false;
        ShipmentDetails other = (ShipmentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.actualWeight==null && other.getActualWeight()==null) || 
             (this.actualWeight!=null &&
              this.actualWeight.equals(other.getActualWeight()))) &&
            ((this.chargeableWeight==null && other.getChargeableWeight()==null) || 
             (this.chargeableWeight!=null &&
              this.chargeableWeight.equals(other.getChargeableWeight()))) &&
            ((this.descriptionOfGoods==null && other.getDescriptionOfGoods()==null) || 
             (this.descriptionOfGoods!=null &&
              this.descriptionOfGoods.equals(other.getDescriptionOfGoods()))) &&
            ((this.goodsOriginCountry==null && other.getGoodsOriginCountry()==null) || 
             (this.goodsOriginCountry!=null &&
              this.goodsOriginCountry.equals(other.getGoodsOriginCountry()))) &&
            this.numberOfPieces == other.getNumberOfPieces() &&
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              this.productGroup.equals(other.getProductGroup()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.paymentOptions==null && other.getPaymentOptions()==null) || 
             (this.paymentOptions!=null &&
              this.paymentOptions.equals(other.getPaymentOptions()))) &&
            ((this.customsValueAmount==null && other.getCustomsValueAmount()==null) || 
             (this.customsValueAmount!=null &&
              this.customsValueAmount.equals(other.getCustomsValueAmount()))) &&
            ((this.cashOnDeliveryAmount==null && other.getCashOnDeliveryAmount()==null) || 
             (this.cashOnDeliveryAmount!=null &&
              this.cashOnDeliveryAmount.equals(other.getCashOnDeliveryAmount()))) &&
            ((this.insuranceAmount==null && other.getInsuranceAmount()==null) || 
             (this.insuranceAmount!=null &&
              this.insuranceAmount.equals(other.getInsuranceAmount()))) &&
            ((this.cashAdditionalAmount==null && other.getCashAdditionalAmount()==null) || 
             (this.cashAdditionalAmount!=null &&
              this.cashAdditionalAmount.equals(other.getCashAdditionalAmount()))) &&
            ((this.cashAdditionalAmountDescription==null && other.getCashAdditionalAmountDescription()==null) || 
             (this.cashAdditionalAmountDescription!=null &&
              this.cashAdditionalAmountDescription.equals(other.getCashAdditionalAmountDescription()))) &&
            ((this.collectAmount==null && other.getCollectAmount()==null) || 
             (this.collectAmount!=null &&
              this.collectAmount.equals(other.getCollectAmount()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              this.services.equals(other.getServices()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              this.items.equals(other.getItems())));
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
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getActualWeight() != null) {
            _hashCode += getActualWeight().hashCode();
        }
        if (getChargeableWeight() != null) {
            _hashCode += getChargeableWeight().hashCode();
        }
        if (getDescriptionOfGoods() != null) {
            _hashCode += getDescriptionOfGoods().hashCode();
        }
        if (getGoodsOriginCountry() != null) {
            _hashCode += getGoodsOriginCountry().hashCode();
        }
        _hashCode += getNumberOfPieces();
        if (getProductGroup() != null) {
            _hashCode += getProductGroup().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPaymentOptions() != null) {
            _hashCode += getPaymentOptions().hashCode();
        }
        if (getCustomsValueAmount() != null) {
            _hashCode += getCustomsValueAmount().hashCode();
        }
        if (getCashOnDeliveryAmount() != null) {
            _hashCode += getCashOnDeliveryAmount().hashCode();
        }
        if (getInsuranceAmount() != null) {
            _hashCode += getInsuranceAmount().hashCode();
        }
        if (getCashAdditionalAmount() != null) {
            _hashCode += getCashAdditionalAmount().hashCode();
        }
        if (getCashAdditionalAmountDescription() != null) {
            _hashCode += getCashAdditionalAmountDescription().hashCode();
        }
        if (getCollectAmount() != null) {
            _hashCode += getCollectAmount().hashCode();
        }
        if (getServices() != null) {
            _hashCode += getServices().hashCode();
        }
        if (getItems() != null) {
            _hashCode += getItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentDetails.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Dimensions"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ActualWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Weight"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeableWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ChargeableWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Weight"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionOfGoods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "DescriptionOfGoods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsOriginCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "GoodsOriginCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPieces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "NumberOfPieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PaymentOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsValueAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "CustomsValueAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashOnDeliveryAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "CashOnDeliveryAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "InsuranceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAdditionalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "CashAdditionalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAdditionalAmountDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "CashAdditionalAmountDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "CollectAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Money"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfShipmentItem"));
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
