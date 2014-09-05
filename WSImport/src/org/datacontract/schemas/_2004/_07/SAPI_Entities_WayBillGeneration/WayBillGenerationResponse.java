/**
 * WayBillGenerationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class WayBillGenerationResponse  implements java.io.Serializable {
    private java.lang.String AWBNo;
    private byte[] AWBPrintContent;
    private java.lang.String CCRCRDREF;
    private java.lang.String destinationArea;
    private java.lang.String destinationLocation;
    private java.lang.Boolean isError;
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationStatus status;

    public WayBillGenerationResponse() {
    }

    public java.lang.String getAWBNo() {
        return AWBNo;
    }

    public void setAWBNo(java.lang.String AWBNo) {
        this.AWBNo = AWBNo;
    }

    public byte[] getAWBPrintContent() {
        return AWBPrintContent;
    }

    public void setAWBPrintContent(byte[] AWBPrintContent) {
        this.AWBPrintContent = AWBPrintContent;
    }

    public java.lang.String getCCRCRDREF() {
        return CCRCRDREF;
    }

    public void setCCRCRDREF(java.lang.String CCRCRDREF) {
        this.CCRCRDREF = CCRCRDREF;
    }

    public java.lang.String getDestinationArea() {
        return destinationArea;
    }

    public void setDestinationArea(java.lang.String destinationArea) {
        this.destinationArea = destinationArea;
    }

    public java.lang.String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(java.lang.String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public java.lang.Boolean getIsError() {
        return isError;
    }

    public void setIsError(java.lang.Boolean isError) {
        this.isError = isError;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationStatus getStatus() {
        return status;
    }

    public void setStatus(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.ArrayOfWayBillGenerationStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WayBillGenerationResponse)) return false;
        WayBillGenerationResponse other = (WayBillGenerationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AWBNo==null && other.getAWBNo()==null) || 
             (this.AWBNo!=null &&
              this.AWBNo.equals(other.getAWBNo()))) &&
            ((this.AWBPrintContent==null && other.getAWBPrintContent()==null) || 
             (this.AWBPrintContent!=null &&
              java.util.Arrays.equals(this.AWBPrintContent, other.getAWBPrintContent()))) &&
            ((this.CCRCRDREF==null && other.getCCRCRDREF()==null) || 
             (this.CCRCRDREF!=null &&
              this.CCRCRDREF.equals(other.getCCRCRDREF()))) &&
            ((this.destinationArea==null && other.getDestinationArea()==null) || 
             (this.destinationArea!=null &&
              this.destinationArea.equals(other.getDestinationArea()))) &&
            ((this.destinationLocation==null && other.getDestinationLocation()==null) || 
             (this.destinationLocation!=null &&
              this.destinationLocation.equals(other.getDestinationLocation()))) &&
            ((this.isError==null && other.getIsError()==null) || 
             (this.isError!=null &&
              this.isError.equals(other.getIsError()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getAWBNo() != null) {
            _hashCode += getAWBNo().hashCode();
        }
        if (getAWBPrintContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAWBPrintContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAWBPrintContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCCRCRDREF() != null) {
            _hashCode += getCCRCRDREF().hashCode();
        }
        if (getDestinationArea() != null) {
            _hashCode += getDestinationArea().hashCode();
        }
        if (getDestinationLocation() != null) {
            _hashCode += getDestinationLocation().hashCode();
        }
        if (getIsError() != null) {
            _hashCode += getIsError().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WayBillGenerationResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AWBNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "AWBNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AWBPrintContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "AWBPrintContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCRCRDREF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CCRCRDREF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "DestinationArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "DestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "IsError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationStatus"));
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
