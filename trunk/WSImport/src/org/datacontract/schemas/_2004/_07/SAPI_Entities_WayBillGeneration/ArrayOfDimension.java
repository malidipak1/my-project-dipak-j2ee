/**
 * ArrayOfDimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class ArrayOfDimension  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension[] dimension;

    public ArrayOfDimension() {
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension[] getDimension() {
        return dimension;
    }

    public void setDimension(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension[] dimension) {
        this.dimension = dimension;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension getDimension(int i) {
        return dimension[i];
    }

    public void setDimension(int i, org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.Dimension value) {
        this.dimension[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDimension)) return false;
        ArrayOfDimension other = (ArrayOfDimension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dimension==null && other.getDimension()==null) || 
             (this.dimension!=null &&
              java.util.Arrays.equals(this.dimension, other.getDimension())));
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
        if (getDimension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimension());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimension(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDimension.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfDimension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "Dimension"));
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
