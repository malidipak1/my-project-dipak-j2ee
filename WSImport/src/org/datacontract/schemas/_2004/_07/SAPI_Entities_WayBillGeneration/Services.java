/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class Services  implements java.io.Serializable {
    private java.lang.Double actualWeight;
    private java.lang.Double collectableAmount;
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.CommodityDetail commodity;
    private java.lang.String creditReferenceNo;
    private java.lang.Double declaredValue;
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfDimension dimensions;
    private java.lang.String invoiceNo;
    private java.lang.String packType;
    private java.util.Calendar pickupDate;
    private java.lang.String pickupTime;
    private java.lang.Integer pieceCount;
    private java.lang.String productCode;
    private org.datacontract.schemas._2004._07.SAPI_Entities_Enums_AWBGeneration.ProductType productType;
    private java.lang.String specialInstruction;
    private java.lang.String subProductCode;

    public Services() {
    }

    public java.lang.Double getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(java.lang.Double actualWeight) {
        this.actualWeight = actualWeight;
    }

    public java.lang.Double getCollectableAmount() {
        return collectableAmount;
    }

    public void setCollectableAmount(java.lang.Double collectableAmount) {
        this.collectableAmount = collectableAmount;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.CommodityDetail getCommodity() {
        return commodity;
    }

    public void setCommodity(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.CommodityDetail commodity) {
        this.commodity = commodity;
    }

    public java.lang.String getCreditReferenceNo() {
        return creditReferenceNo;
    }

    public void setCreditReferenceNo(java.lang.String creditReferenceNo) {
        this.creditReferenceNo = creditReferenceNo;
    }

    public java.lang.Double getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(java.lang.Double declaredValue) {
        this.declaredValue = declaredValue;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfDimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfDimension dimensions) {
        this.dimensions = dimensions;
    }

    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public java.lang.String getPackType() {
        return packType;
    }

    public void setPackType(java.lang.String packType) {
        this.packType = packType;
    }

    public java.util.Calendar getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(java.util.Calendar pickupDate) {
        this.pickupDate = pickupDate;
    }

    public java.lang.String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(java.lang.String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public java.lang.Integer getPieceCount() {
        return pieceCount;
    }

    public void setPieceCount(java.lang.Integer pieceCount) {
        this.pieceCount = pieceCount;
    }

    public java.lang.String getProductCode() {
        return productCode;
    }

    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_Enums_AWBGeneration.ProductType getProductType() {
        return productType;
    }

    public void setProductType(org.datacontract.schemas._2004._07.SAPI_Entities_Enums_AWBGeneration.ProductType productType) {
        this.productType = productType;
    }

    public java.lang.String getSpecialInstruction() {
        return specialInstruction;
    }

    public void setSpecialInstruction(java.lang.String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public java.lang.String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(java.lang.String subProductCode) {
        this.subProductCode = subProductCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Services)) return false;
        Services other = (Services) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualWeight==null && other.getActualWeight()==null) || 
             (this.actualWeight!=null &&
              this.actualWeight.equals(other.getActualWeight()))) &&
            ((this.collectableAmount==null && other.getCollectableAmount()==null) || 
             (this.collectableAmount!=null &&
              this.collectableAmount.equals(other.getCollectableAmount()))) &&
            ((this.commodity==null && other.getCommodity()==null) || 
             (this.commodity!=null &&
              this.commodity.equals(other.getCommodity()))) &&
            ((this.creditReferenceNo==null && other.getCreditReferenceNo()==null) || 
             (this.creditReferenceNo!=null &&
              this.creditReferenceNo.equals(other.getCreditReferenceNo()))) &&
            ((this.declaredValue==null && other.getDeclaredValue()==null) || 
             (this.declaredValue!=null &&
              this.declaredValue.equals(other.getDeclaredValue()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.packType==null && other.getPackType()==null) || 
             (this.packType!=null &&
              this.packType.equals(other.getPackType()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.pickupTime==null && other.getPickupTime()==null) || 
             (this.pickupTime!=null &&
              this.pickupTime.equals(other.getPickupTime()))) &&
            ((this.pieceCount==null && other.getPieceCount()==null) || 
             (this.pieceCount!=null &&
              this.pieceCount.equals(other.getPieceCount()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.specialInstruction==null && other.getSpecialInstruction()==null) || 
             (this.specialInstruction!=null &&
              this.specialInstruction.equals(other.getSpecialInstruction()))) &&
            ((this.subProductCode==null && other.getSubProductCode()==null) || 
             (this.subProductCode!=null &&
              this.subProductCode.equals(other.getSubProductCode())));
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
        if (getActualWeight() != null) {
            _hashCode += getActualWeight().hashCode();
        }
        if (getCollectableAmount() != null) {
            _hashCode += getCollectableAmount().hashCode();
        }
        if (getCommodity() != null) {
            _hashCode += getCommodity().hashCode();
        }
        if (getCreditReferenceNo() != null) {
            _hashCode += getCreditReferenceNo().hashCode();
        }
        if (getDeclaredValue() != null) {
            _hashCode += getDeclaredValue().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getPackType() != null) {
            _hashCode += getPackType().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getPickupTime() != null) {
            _hashCode += getPickupTime().hashCode();
        }
        if (getPieceCount() != null) {
            _hashCode += getPieceCount().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getSpecialInstruction() != null) {
            _hashCode += getSpecialInstruction().hashCode();
        }
        if (getSubProductCode() != null) {
            _hashCode += getSubProductCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Services.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Services"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ActualWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CollectableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Commodity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CommodityDetail"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditReferenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CreditReferenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declaredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "DeclaredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfDimension"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "InvoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "PackType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "PickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "PickupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "PieceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.Enums.AWBGeneration", "ProductType"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "SpecialInstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "SubProductCode"));
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
