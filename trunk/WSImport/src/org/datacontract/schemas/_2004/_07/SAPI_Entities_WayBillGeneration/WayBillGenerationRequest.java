/**
 * WayBillGenerationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class WayBillGenerationRequest  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Consignee consignee;
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Services services;
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Shipper shipper;

    public WayBillGenerationRequest() {
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Consignee getConsignee() {
        return consignee;
    }

    public void setConsignee(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Consignee consignee) {
        this.consignee = consignee;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Services getServices() {
        return services;
    }

    public void setServices(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Services services) {
        this.services = services;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Shipper getShipper() {
        return shipper;
    }

    public void setShipper(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Shipper shipper) {
        this.shipper = shipper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WayBillGenerationRequest)) return false;
        WayBillGenerationRequest other = (WayBillGenerationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              this.services.equals(other.getServices()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper())));
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
        if (getConsignee() != null) {
            _hashCode += getConsignee().hashCode();
        }
        if (getServices() != null) {
            _hashCode += getServices().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WayBillGenerationRequest.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Consignee"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Services"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Shipper"));
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
