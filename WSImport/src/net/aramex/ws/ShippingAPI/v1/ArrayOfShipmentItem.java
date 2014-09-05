/**
 * ArrayOfShipmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class ArrayOfShipmentItem  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.ShipmentItem[] shipmentItem;

    public ArrayOfShipmentItem() {
    	this.shipmentItem = new ShipmentItem[2];
    }

    public net.aramex.ws.ShippingAPI.v1.ShipmentItem[] getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(net.aramex.ws.ShippingAPI.v1.ShipmentItem[] shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public net.aramex.ws.ShippingAPI.v1.ShipmentItem getShipmentItem(int i) {
        return shipmentItem[i];
    }

    public void setShipmentItem(int i, net.aramex.ws.ShippingAPI.v1.ShipmentItem value) {
   	// System.out.println("obj : " + shipmentItem + " i :" + i+ "val: " +value) ;
        this.shipmentItem[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfShipmentItem)) return false;
        ArrayOfShipmentItem other = (ArrayOfShipmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            (((shipmentItem==null) && (other.getShipmentItem()==null)) || 
             ((shipmentItem!=null) &&
              java.util.Arrays.equals(shipmentItem, other.getShipmentItem())));
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
        if (getShipmentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentItem(), i);
                if ((obj != null) &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfShipmentItem.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfShipmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ShipmentItem"));
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
