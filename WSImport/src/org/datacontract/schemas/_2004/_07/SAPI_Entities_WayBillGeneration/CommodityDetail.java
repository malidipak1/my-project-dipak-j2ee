/**
 * CommodityDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_WayBillGeneration;

public class CommodityDetail  implements java.io.Serializable {
    private java.lang.String commodityDetail1;
    private java.lang.String commodityDetail2;
    private java.lang.String commodityDetail3;

    public CommodityDetail() {
    }

    public java.lang.String getCommodityDetail1() {
        return commodityDetail1;
    }

    public void setCommodityDetail1(java.lang.String commodityDetail1) {
        this.commodityDetail1 = commodityDetail1;
    }

    public java.lang.String getCommodityDetail2() {
        return commodityDetail2;
    }

    public void setCommodityDetail2(java.lang.String commodityDetail2) {
        this.commodityDetail2 = commodityDetail2;
    }

    public java.lang.String getCommodityDetail3() {
        return commodityDetail3;
    }

    public void setCommodityDetail3(java.lang.String commodityDetail3) {
        this.commodityDetail3 = commodityDetail3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommodityDetail)) return false;
        CommodityDetail other = (CommodityDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commodityDetail1==null && other.getCommodityDetail1()==null) || 
             (this.commodityDetail1!=null &&
              this.commodityDetail1.equals(other.getCommodityDetail1()))) &&
            ((this.commodityDetail2==null && other.getCommodityDetail2()==null) || 
             (this.commodityDetail2!=null &&
              this.commodityDetail2.equals(other.getCommodityDetail2()))) &&
            ((this.commodityDetail3==null && other.getCommodityDetail3()==null) || 
             (this.commodityDetail3!=null &&
              this.commodityDetail3.equals(other.getCommodityDetail3())));
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
        if (getCommodityDetail1() != null) {
            _hashCode += getCommodityDetail1().hashCode();
        }
        if (getCommodityDetail2() != null) {
            _hashCode += getCommodityDetail2().hashCode();
        }
        if (getCommodityDetail3() != null) {
            _hashCode += getCommodityDetail3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommodityDetail.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CommodityDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityDetail1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CommodityDetail1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityDetail2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CommodityDetail2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityDetail3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration", "CommodityDetail3"));
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
