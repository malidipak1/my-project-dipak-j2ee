/**
 * Consignee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class Consignee  implements java.io.Serializable {
    private java.lang.String consigneeAddress1;
    private java.lang.String consigneeAddress2;
    private java.lang.String consigneeAddress3;
    private java.lang.String consigneeAttention;
    private java.lang.String consigneeMobile;
    private java.lang.String consigneeName;
    private java.lang.String consigneePincode;
    private java.lang.String consigneeTelephone;

    public Consignee() {
    }

    public java.lang.String getConsigneeAddress1() {
        return consigneeAddress1;
    }

    public void setConsigneeAddress1(java.lang.String consigneeAddress1) {
        this.consigneeAddress1 = consigneeAddress1;
    }

    public java.lang.String getConsigneeAddress2() {
        return consigneeAddress2;
    }

    public void setConsigneeAddress2(java.lang.String consigneeAddress2) {
        this.consigneeAddress2 = consigneeAddress2;
    }

    public java.lang.String getConsigneeAddress3() {
        return consigneeAddress3;
    }

    public void setConsigneeAddress3(java.lang.String consigneeAddress3) {
        this.consigneeAddress3 = consigneeAddress3;
    }

    public java.lang.String getConsigneeAttention() {
        return consigneeAttention;
    }

    public void setConsigneeAttention(java.lang.String consigneeAttention) {
        this.consigneeAttention = consigneeAttention;
    }

    public java.lang.String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(java.lang.String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public java.lang.String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(java.lang.String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public java.lang.String getConsigneePincode() {
        return consigneePincode;
    }

    public void setConsigneePincode(java.lang.String consigneePincode) {
        this.consigneePincode = consigneePincode;
    }

    public java.lang.String getConsigneeTelephone() {
        return consigneeTelephone;
    }

    public void setConsigneeTelephone(java.lang.String consigneeTelephone) {
        this.consigneeTelephone = consigneeTelephone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consignee)) return false;
        Consignee other = (Consignee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consigneeAddress1==null && other.getConsigneeAddress1()==null) || 
             (this.consigneeAddress1!=null &&
              this.consigneeAddress1.equals(other.getConsigneeAddress1()))) &&
            ((this.consigneeAddress2==null && other.getConsigneeAddress2()==null) || 
             (this.consigneeAddress2!=null &&
              this.consigneeAddress2.equals(other.getConsigneeAddress2()))) &&
            ((this.consigneeAddress3==null && other.getConsigneeAddress3()==null) || 
             (this.consigneeAddress3!=null &&
              this.consigneeAddress3.equals(other.getConsigneeAddress3()))) &&
            ((this.consigneeAttention==null && other.getConsigneeAttention()==null) || 
             (this.consigneeAttention!=null &&
              this.consigneeAttention.equals(other.getConsigneeAttention()))) &&
            ((this.consigneeMobile==null && other.getConsigneeMobile()==null) || 
             (this.consigneeMobile!=null &&
              this.consigneeMobile.equals(other.getConsigneeMobile()))) &&
            ((this.consigneeName==null && other.getConsigneeName()==null) || 
             (this.consigneeName!=null &&
              this.consigneeName.equals(other.getConsigneeName()))) &&
            ((this.consigneePincode==null && other.getConsigneePincode()==null) || 
             (this.consigneePincode!=null &&
              this.consigneePincode.equals(other.getConsigneePincode()))) &&
            ((this.consigneeTelephone==null && other.getConsigneeTelephone()==null) || 
             (this.consigneeTelephone!=null &&
              this.consigneeTelephone.equals(other.getConsigneeTelephone())));
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
        if (getConsigneeAddress1() != null) {
            _hashCode += getConsigneeAddress1().hashCode();
        }
        if (getConsigneeAddress2() != null) {
            _hashCode += getConsigneeAddress2().hashCode();
        }
        if (getConsigneeAddress3() != null) {
            _hashCode += getConsigneeAddress3().hashCode();
        }
        if (getConsigneeAttention() != null) {
            _hashCode += getConsigneeAttention().hashCode();
        }
        if (getConsigneeMobile() != null) {
            _hashCode += getConsigneeMobile().hashCode();
        }
        if (getConsigneeName() != null) {
            _hashCode += getConsigneeName().hashCode();
        }
        if (getConsigneePincode() != null) {
            _hashCode += getConsigneePincode().hashCode();
        }
        if (getConsigneeTelephone() != null) {
            _hashCode += getConsigneeTelephone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consignee.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Consignee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneePincode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneePincode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ConsigneeTelephone"));
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
