/**
 * ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SAPI_Entities_Enums_AWBGeneration;

public class ProductType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Docs = "Docs";
    public static final java.lang.String _Dutiables = "Dutiables";
    public static final ProductType Docs = new ProductType(_Docs);
    public static final ProductType Dutiables = new ProductType(_Dutiables);
    public java.lang.String getValue() { return _value_;}
    public static ProductType fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        ProductType enum_ = (ProductType)
            _table_.get(value);
        if (enum_==null) throw new java.lang.IllegalStateException();
        return enum_;
    }
    public static ProductType fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
