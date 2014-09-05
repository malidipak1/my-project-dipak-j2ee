/**
 * ArrayOfWayBillGenerationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class ArrayOfWayBillGenerationRequest  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest[] wayBillGenerationRequest;

    public ArrayOfWayBillGenerationRequest() {
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest[] getWayBillGenerationRequest() {
        return wayBillGenerationRequest;
    }

    public void setWayBillGenerationRequest(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest[] wayBillGenerationRequest) {
        this.wayBillGenerationRequest = wayBillGenerationRequest;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest getWayBillGenerationRequest(int i) {
        return wayBillGenerationRequest[i];
    }

    public void setWayBillGenerationRequest(int i, org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationRequest value) {
        this.wayBillGenerationRequest[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfWayBillGenerationRequest)) return false;
        ArrayOfWayBillGenerationRequest other = (ArrayOfWayBillGenerationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wayBillGenerationRequest==null && other.getWayBillGenerationRequest()==null) || 
             (this.wayBillGenerationRequest!=null &&
              java.util.Arrays.equals(this.wayBillGenerationRequest, other.getWayBillGenerationRequest())));
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
        if (getWayBillGenerationRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWayBillGenerationRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWayBillGenerationRequest(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfWayBillGenerationRequest.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wayBillGenerationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationRequest"));
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
