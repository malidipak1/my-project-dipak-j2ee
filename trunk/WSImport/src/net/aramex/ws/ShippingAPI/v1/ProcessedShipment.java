/**
 * ProcessedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class ProcessedShipment  implements java.io.Serializable {
    private java.lang.String ID;
    private java.lang.String reference1;
    private java.lang.String reference2;
    private java.lang.String reference3;
    private java.lang.String foreignHAWB;
    private boolean hasErrors;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfNotification notifications;
    private net.aramex.ws.ShippingAPI.v1.ShipmentLabel shipmentLabel;

    public ProcessedShipment() {
    }

    public java.lang.String getID() {
        return ID;
    }

    public void setID(java.lang.String ID) {
        this.ID = ID;
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

    public java.lang.String getForeignHAWB() {
        return foreignHAWB;
    }

    public void setForeignHAWB(java.lang.String foreignHAWB) {
        this.foreignHAWB = foreignHAWB;
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfNotification getNotifications() {
        return notifications;
    }

    public void setNotifications(net.aramex.ws.ShippingAPI.v1.ArrayOfNotification notifications) {
        this.notifications = notifications;
    }

    public net.aramex.ws.ShippingAPI.v1.ShipmentLabel getShipmentLabel() {
        return shipmentLabel;
    }

    public void setShipmentLabel(net.aramex.ws.ShippingAPI.v1.ShipmentLabel shipmentLabel) {
        this.shipmentLabel = shipmentLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessedShipment)) return false;
        ProcessedShipment other = (ProcessedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.reference1==null && other.getReference1()==null) || 
             (this.reference1!=null &&
              this.reference1.equals(other.getReference1()))) &&
            ((this.reference2==null && other.getReference2()==null) || 
             (this.reference2!=null &&
              this.reference2.equals(other.getReference2()))) &&
            ((this.reference3==null && other.getReference3()==null) || 
             (this.reference3!=null &&
              this.reference3.equals(other.getReference3()))) &&
            ((this.foreignHAWB==null && other.getForeignHAWB()==null) || 
             (this.foreignHAWB!=null &&
              this.foreignHAWB.equals(other.getForeignHAWB()))) &&
            this.hasErrors == other.isHasErrors() &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              this.notifications.equals(other.getNotifications()))) &&
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getReference1() != null) {
            _hashCode += getReference1().hashCode();
        }
        if (getReference2() != null) {
            _hashCode += getReference2().hashCode();
        }
        if (getReference3() != null) {
            _hashCode += getReference3().hashCode();
        }
        if (getForeignHAWB() != null) {
            _hashCode += getForeignHAWB().hashCode();
        }
        _hashCode += new Boolean(isHasErrors()).hashCode();
        if (getNotifications() != null) {
            _hashCode += getNotifications().hashCode();
        }
        if (getShipmentLabel() != null) {
            _hashCode += getShipmentLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessedShipment.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProcessedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Reference1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Reference2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Reference3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignHAWB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ForeignHAWB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "HasErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfNotification"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentLabel"));
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
