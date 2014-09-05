/**
 * _PickupCreationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class _PickupCreationRequest  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.ClientInfo clientInfo;
    private net.aramex.ws.ShippingAPI.v1.Transaction transaction;
    private net.aramex.ws.ShippingAPI.v1.Pickup pickup;
    private net.aramex.ws.ShippingAPI.v1.LabelInfo labelInfo;

    public _PickupCreationRequest() {
    }

    public net.aramex.ws.ShippingAPI.v1.ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(net.aramex.ws.ShippingAPI.v1.ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public net.aramex.ws.ShippingAPI.v1.Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(net.aramex.ws.ShippingAPI.v1.Transaction transaction) {
        this.transaction = transaction;
    }

    public net.aramex.ws.ShippingAPI.v1.Pickup getPickup() {
        return pickup;
    }

    public void setPickup(net.aramex.ws.ShippingAPI.v1.Pickup pickup) {
        this.pickup = pickup;
    }

    public net.aramex.ws.ShippingAPI.v1.LabelInfo getLabelInfo() {
        return labelInfo;
    }

    public void setLabelInfo(net.aramex.ws.ShippingAPI.v1.LabelInfo labelInfo) {
        this.labelInfo = labelInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _PickupCreationRequest)) return false;
        _PickupCreationRequest other = (_PickupCreationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientInfo==null && other.getClientInfo()==null) || 
             (this.clientInfo!=null &&
              this.clientInfo.equals(other.getClientInfo()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.pickup==null && other.getPickup()==null) || 
             (this.pickup!=null &&
              this.pickup.equals(other.getPickup()))) &&
            ((this.labelInfo==null && other.getLabelInfo()==null) || 
             (this.labelInfo!=null &&
              this.labelInfo.equals(other.getLabelInfo())));
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
        if (getClientInfo() != null) {
            _hashCode += getClientInfo().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getPickup() != null) {
            _hashCode += getPickup().hashCode();
        }
        if (getLabelInfo() != null) {
            _hashCode += getLabelInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_PickupCreationRequest.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">PickupCreationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ClientInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ClientInfo"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Transaction"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Pickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Pickup"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "LabelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "LabelInfo"));
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
