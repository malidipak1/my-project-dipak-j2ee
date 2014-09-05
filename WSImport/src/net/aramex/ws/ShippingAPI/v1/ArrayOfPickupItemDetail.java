/**
 * ArrayOfPickupItemDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class ArrayOfPickupItemDetail  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.PickupItemDetail[] pickupItemDetail;

    public ArrayOfPickupItemDetail() {
    }

    public net.aramex.ws.ShippingAPI.v1.PickupItemDetail[] getPickupItemDetail() {
        return pickupItemDetail;
    }

    public void setPickupItemDetail(net.aramex.ws.ShippingAPI.v1.PickupItemDetail[] pickupItemDetail) {
        this.pickupItemDetail = pickupItemDetail;
    }

    public net.aramex.ws.ShippingAPI.v1.PickupItemDetail getPickupItemDetail(int i) {
        return pickupItemDetail[i];
    }

    public void setPickupItemDetail(int i, net.aramex.ws.ShippingAPI.v1.PickupItemDetail value) {
        this.pickupItemDetail[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPickupItemDetail)) return false;
        ArrayOfPickupItemDetail other = (ArrayOfPickupItemDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pickupItemDetail==null && other.getPickupItemDetail()==null) || 
             (this.pickupItemDetail!=null &&
              java.util.Arrays.equals(this.pickupItemDetail, other.getPickupItemDetail())));
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
        if (getPickupItemDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickupItemDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickupItemDetail(), i);
                if (obj != null &&
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
        new org.apache.axis.description.TypeDesc(ArrayOfPickupItemDetail.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfPickupItemDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupItemDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupItemDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "PickupItemDetail"));
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
