/**
 * ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.microsoft.schemas._2003._10.Serialization.Arrays;

public class ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY  implements java.io.Serializable {
    private com.microsoft.schemas._2003._10.Serialization.Arrays.ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY[] keyValueOfstringArrayOfTrackingResultmFAkxlpY;

    public ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY() {
    }

    public com.microsoft.schemas._2003._10.Serialization.Arrays.ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY[] getKeyValueOfstringArrayOfTrackingResultmFAkxlpY() {
        return keyValueOfstringArrayOfTrackingResultmFAkxlpY;
    }

    public void setKeyValueOfstringArrayOfTrackingResultmFAkxlpY(com.microsoft.schemas._2003._10.Serialization.Arrays.ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY[] keyValueOfstringArrayOfTrackingResultmFAkxlpY) {
        this.keyValueOfstringArrayOfTrackingResultmFAkxlpY = keyValueOfstringArrayOfTrackingResultmFAkxlpY;
    }

    public com.microsoft.schemas._2003._10.Serialization.Arrays.ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY getKeyValueOfstringArrayOfTrackingResultmFAkxlpY(int i) {
        return keyValueOfstringArrayOfTrackingResultmFAkxlpY[i];
    }

    public void setKeyValueOfstringArrayOfTrackingResultmFAkxlpY(int i, com.microsoft.schemas._2003._10.Serialization.Arrays.ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY_KeyValueOfstringArrayOfTrackingResultmFAkxlpY value) {
        this.keyValueOfstringArrayOfTrackingResultmFAkxlpY[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY)) return false;
        ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY other = (ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyValueOfstringArrayOfTrackingResultmFAkxlpY==null && other.getKeyValueOfstringArrayOfTrackingResultmFAkxlpY()==null) || 
             (this.keyValueOfstringArrayOfTrackingResultmFAkxlpY!=null &&
              java.util.Arrays.equals(this.keyValueOfstringArrayOfTrackingResultmFAkxlpY, other.getKeyValueOfstringArrayOfTrackingResultmFAkxlpY())));
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
        if (getKeyValueOfstringArrayOfTrackingResultmFAkxlpY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyValueOfstringArrayOfTrackingResultmFAkxlpY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyValueOfstringArrayOfTrackingResultmFAkxlpY(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValueOfstringArrayOfTrackingResultmFAkxlpY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfstringArrayOfTrackingResultmFAkxlpY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringArrayOfTrackingResultmFAkxlpY>KeyValueOfstringArrayOfTrackingResultmFAkxlpY"));
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
