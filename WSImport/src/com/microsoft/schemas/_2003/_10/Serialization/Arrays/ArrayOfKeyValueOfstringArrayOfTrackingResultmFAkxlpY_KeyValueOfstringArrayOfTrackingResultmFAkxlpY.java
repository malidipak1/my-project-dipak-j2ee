/**
 * ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.microsoft.schemas._2003._10.Serialization.Arrays;

public class ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY  implements java.io.Serializable {
    private java.lang.String key;
    private net.aramex.ws.ShippingAPI.v1.ArrayOfTrackingResult value;

    public ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY() {
    }

    public java.lang.String getKey() {
        return key;
    }

    public void setKey(java.lang.String key) {
        this.key = key;
    }

    public net.aramex.ws.ShippingAPI.v1.ArrayOfTrackingResult getValue() {
        return value;
    }

    public void setValue(net.aramex.ws.ShippingAPI.v1.ArrayOfTrackingResult value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY)) return false;
        ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY other = (ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY>KeyValueOfstringArrayOfTrackingResultmFAkxlpY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.aramex.net/ShippingAPI/v1/", "ArrayOfTrackingResult"));
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
