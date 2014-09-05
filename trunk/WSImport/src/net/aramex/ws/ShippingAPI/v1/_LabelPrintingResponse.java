/**
 * _LabelPrintingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class _LabelPrintingResponse  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.Transaction transaction;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfNotification notifications;
    private java.lang.Boolean hasErrors;
    private java.lang.String shipmentNumber;
    private net.aramex.ws.ShippingAPI.v1.ShipmentLabel shipmentLabel;

    public _LabelPrintingResponse() {
    }

    public net.aramex.ws.ShippingAPI.v1.Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(net.aramex.ws.ShippingAPI.v1.Transaction transaction) {
        this.transaction = transaction;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfNotification getNotifications() {
        return notifications;
    }

    public void setNotifications(net.aramex.ws.ShippingAPI.v1.ArrayOfNotification notifications) {
        this.notifications = notifications;
    }

    public java.lang.Boolean getHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(java.lang.Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public java.lang.String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(java.lang.String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public net.aramex.ws.ShippingAPI.v1.ShipmentLabel getShipmentLabel() {
        return shipmentLabel;
    }

    public void setShipmentLabel(net.aramex.ws.ShippingAPI.v1.ShipmentLabel shipmentLabel) {
        this.shipmentLabel = shipmentLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _LabelPrintingResponse)) return false;
        _LabelPrintingResponse other = (_LabelPrintingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              this.notifications.equals(other.getNotifications()))) &&
            ((this.hasErrors==null && other.getHasErrors()==null) || 
             (this.hasErrors!=null &&
              this.hasErrors.equals(other.getHasErrors()))) &&
            ((this.shipmentNumber==null && other.getShipmentNumber()==null) || 
             (this.shipmentNumber!=null &&
              this.shipmentNumber.equals(other.getShipmentNumber()))) &&
            ((this.shipmentLabel==null && other.getShipmentLabel()==null) || 
             (this.shipmentLabel!=null &&
              this.shipmentLabel.equals(other.getShipmentLabel())));
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
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getNotifications() != null) {
            _hashCode += getNotifications().hashCode();
        }
        if (getHasErrors() != null) {
            _hashCode += getHasErrors().hashCode();
        }
        if (getShipmentNumber() != null) {
            _hashCode += getShipmentNumber().hashCode();
        }
        if (getShipmentLabel() != null) {
            _hashCode += getShipmentLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_LabelPrintingResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", ">LabelPrintingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Transaction"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfNotification"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "HasErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentLabel"));
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
