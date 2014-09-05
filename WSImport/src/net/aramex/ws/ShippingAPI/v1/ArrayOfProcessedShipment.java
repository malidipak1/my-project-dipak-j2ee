/**
 * ArrayOfProcessedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package net.aramex.ws.ShippingAPI.v1;

public class ArrayOfProcessedShipment  implements java.io.Serializable {
    private net.aramex.ws.ShippingAPI.v1.ProcessedShipment[] processedShipment;

    public ArrayOfProcessedShipment() {
    }

    public net.aramex.ws.ShippingAPI.v1.ProcessedShipment[] getProcessedShipment() {
        return processedShipment;
    }

    public void setProcessedShipment(net.aramex.ws.ShippingAPI.v1.ProcessedShipment[] processedShipment) {
        this.processedShipment = processedShipment;
    }

    public net.aramex.ws.ShippingAPI.v1.ProcessedShipment getProcessedShipment(int i) {
        return processedShipment[i];
    }

    public void setProcessedShipment(int i, net.aramex.ws.ShippingAPI.v1.ProcessedShipment value) {
        this.processedShipment[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProcessedShipment)) return false;
        ArrayOfProcessedShipment other = (ArrayOfProcessedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processedShipment==null && other.getProcessedShipment()==null) || 
             (this.processedShipment!=null &&
              java.util.Arrays.equals(this.processedShipment, other.getProcessedShipment())));
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
        if (getProcessedShipment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessedShipment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessedShipment(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProcessedShipment.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfProcessedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processedShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProcessedShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ProcessedShipment"));
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
