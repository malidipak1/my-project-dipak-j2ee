/**
 * ArrayOfWayBillGenerationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class ArrayOfWayBillGenerationResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse[] wayBillGenerationResponse;

    public ArrayOfWayBillGenerationResponse() {
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse[] getWayBillGenerationResponse() {
        return wayBillGenerationResponse;
    }

    public void setWayBillGenerationResponse(org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse[] wayBillGenerationResponse) {
        this.wayBillGenerationResponse = wayBillGenerationResponse;
    }

    public org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse getWayBillGenerationResponse(int i) {
        return wayBillGenerationResponse[i];
    }

    public void setWayBillGenerationResponse(int i, org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration.WayBillGenerationResponse value) {
        this.wayBillGenerationResponse[i] = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfWayBillGenerationResponse)) return false;
        ArrayOfWayBillGenerationResponse other = (ArrayOfWayBillGenerationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wayBillGenerationResponse==null && other.getWayBillGenerationResponse()==null) || 
             (this.wayBillGenerationResponse!=null &&
              java.util.Arrays.equals(this.wayBillGenerationResponse, other.getWayBillGenerationResponse())));
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
        if (getWayBillGenerationResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWayBillGenerationResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWayBillGenerationResponse(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfWayBillGenerationResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "ArrayOfWayBillGenerationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wayBillGenerationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "WayBillGenerationResponse"));
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
