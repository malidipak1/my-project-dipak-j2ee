/**
 * Pickup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class Pickup  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.Address pickupAddress;
    private net.aramex.ws.ShippingAPI.v1.Contact pickupContact;
    private java.lang.String pickupLocation;
    private java.util.Calendar pickupDate;
    private java.util.Calendar readyTime;
    private java.util.Calendar lastPickupTime;
    private java.util.Calendar closingTime;
    private java.lang.String comments;
    private java.lang.String reference1;
    private java.lang.String reference2;
    private java.lang.String vehicle;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfShipment shipments;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfPickupItemDetail pickupItems;
    private java.lang.String status;

    public Pickup() {
    }

    public net.aramex.ws.ShippingAPI.v1.Address getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(net.aramex.ws.ShippingAPI.v1.Address pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public net.aramex.ws.ShippingAPI.v1.Contact getPickupContact() {
        return pickupContact;
    }

    public void setPickupContact(net.aramex.ws.ShippingAPI.v1.Contact pickupContact) {
        this.pickupContact = pickupContact;
    }

    public java.lang.String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(java.lang.String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public java.util.Calendar getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(java.util.Calendar pickupDate) {
        this.pickupDate = pickupDate;
    }

    public java.util.Calendar getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(java.util.Calendar readyTime) {
        this.readyTime = readyTime;
    }

    public java.util.Calendar getLastPickupTime() {
        return lastPickupTime;
    }

    public void setLastPickupTime(java.util.Calendar lastPickupTime) {
        this.lastPickupTime = lastPickupTime;
    }

    public java.util.Calendar getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(java.util.Calendar closingTime) {
        this.closingTime = closingTime;
    }

    public java.lang.String getComments() {
        return comments;
    }

    public void setComments(java.lang.String comments) {
        this.comments = comments;
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

    public java.lang.String getVehicle() {
        return vehicle;
    }

    public void setVehicle(java.lang.String vehicle) {
        this.vehicle = vehicle;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfShipment getShipments() {
        return shipments;
    }

    public void setShipments(net.aramex.ws.ShippingAPI.v1.ArrayOfShipment shipments) {
        this.shipments = shipments;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfPickupItemDetail getPickupItems() {
        return pickupItems;
    }

    public void setPickupItems(net.aramex.ws.ShippingAPI.v1.ArrayOfPickupItemDetail pickupItems) {
        this.pickupItems = pickupItems;
    }

    public java.lang.String getStatus() {
        return status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pickup)) return false;
        Pickup other = (Pickup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pickupAddress==null && other.getPickupAddress()==null) || 
             (this.pickupAddress!=null &&
              this.pickupAddress.equals(other.getPickupAddress()))) &&
            ((this.pickupContact==null && other.getPickupContact()==null) || 
             (this.pickupContact!=null &&
              this.pickupContact.equals(other.getPickupContact()))) &&
            ((this.pickupLocation==null && other.getPickupLocation()==null) || 
             (this.pickupLocation!=null &&
              this.pickupLocation.equals(other.getPickupLocation()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.readyTime==null && other.getReadyTime()==null) || 
             (this.readyTime!=null &&
              this.readyTime.equals(other.getReadyTime()))) &&
            ((this.lastPickupTime==null && other.getLastPickupTime()==null) || 
             (this.lastPickupTime!=null &&
              this.lastPickupTime.equals(other.getLastPickupTime()))) &&
            ((this.closingTime==null && other.getClosingTime()==null) || 
             (this.closingTime!=null &&
              this.closingTime.equals(other.getClosingTime()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.reference1==null && other.getReference1()==null) || 
             (this.reference1!=null &&
              this.reference1.equals(other.getReference1()))) &&
            ((this.reference2==null && other.getReference2()==null) || 
             (this.reference2!=null &&
              this.reference2.equals(other.getReference2()))) &&
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.shipments==null && other.getShipments()==null) || 
             (this.shipments!=null &&
              this.shipments.equals(other.getShipments()))) &&
            ((this.pickupItems==null && other.getPickupItems()==null) || 
             (this.pickupItems!=null &&
              this.pickupItems.equals(other.getPickupItems()))) &&
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
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getPickupContact() != null) {
            _hashCode += getPickupContact().hashCode();
        }
        if (getPickupLocation() != null) {
            _hashCode += getPickupLocation().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getReadyTime() != null) {
            _hashCode += getReadyTime().hashCode();
        }
        if (getLastPickupTime() != null) {
            _hashCode += getLastPickupTime().hashCode();
        }
        if (getClosingTime() != null) {
            _hashCode += getClosingTime().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getReference1() != null) {
            _hashCode += getReference1().hashCode();
        }
        if (getReference2() != null) {
            _hashCode += getReference2().hashCode();
        }
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getShipments() != null) {
            _hashCode += getShipments().hashCode();
        }
        if (getPickupItems() != null) {
            _hashCode += getPickupItems().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pickup.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Pickup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Contact"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ReadyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPickupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "LastPickupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ClosingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Shipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfShipment"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfPickupItemDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Status"));
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
