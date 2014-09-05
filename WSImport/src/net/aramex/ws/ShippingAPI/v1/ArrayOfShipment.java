/**
 * ArrayOfShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class ArrayOfShipment  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.Shipment[] shipment;

    public ArrayOfShipment() {
    	shipment = new Shipment[2];
    }

    public net.aramex.ws.ShippingAPI.v1.Shipment[] getShipment() {
        return shipment;
    }

    public void setShipment(net.aramex.ws.ShippingAPI.v1.Shipment[] shipment) {
        this.shipment = shipment;
    }

    public net.aramex.ws.ShippingAPI.v1.Shipment getShipment(int i) {
        return shipment[i];
    }

    public void setShipment(int i, net.aramex.ws.ShippingAPI.v1.Shipment value) {
    	//System.out.println("obj : " + shipment + " i :" + i+ "val: " +value) ;
        shipment[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfShipment)) return false;
        ArrayOfShipment other = (ArrayOfShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            (((shipment==null) && (other.getShipment()==null)) || 
             ((shipment!=null) &&
              java.util.Arrays.equals(shipment, other.getShipment())));
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
        if (this.getShipment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(this.getShipment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(this.getShipment(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfShipment.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Shipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "Shipment"));
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
