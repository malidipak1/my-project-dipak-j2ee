/**
 * Party.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class Party  implements java.io.Serializable {
    private java.lang.String reference1;
    private java.lang.String reference2;
    private java.lang.String accountNumber;
    private net.aramex.ws.ShippingAPI.v1.Address partyAddress;
    private net.aramex.ws.ShippingAPI.v1.Contact contact;

    public Party() {
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

    public java.lang.String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public net.aramex.ws.ShippingAPI.v1.Address getPartyAddress() {
        return partyAddress;
    }

    public void setPartyAddress(net.aramex.ws.ShippingAPI.v1.Address partyAddress) {
        this.partyAddress = partyAddress;
    }

    public net.aramex.ws.ShippingAPI.v1.Contact getContact() {
        return contact;
    }

    public void setContact(net.aramex.ws.ShippingAPI.v1.Contact contact) {
        this.contact = contact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Party)) return false;
        Party other = (Party) obj;
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
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.partyAddress==null && other.getPartyAddress()==null) || 
             (this.partyAddress!=null &&
              this.partyAddress.equals(other.getPartyAddress()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getPartyAddress() != null) {
            _hashCode += getPartyAddress().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Party.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Party"));
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
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PartyAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Contact"));
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
