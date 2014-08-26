/**
 * Copyright (C) 2014 KAIST RESL 
 *
 * This file is part of Oliot (oliot.org).

 * @author Jack Jaewook Byun, Ph.D student
 * Korea Advanced Institute of Science and Technology
 * Real-time Embedded System Laboratory(RESL)
 * bjw0829@kaist.ac.kr
 */

/**
 * AggregationEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oliot.epcis;


/**
 * Aggregation Event captures an event that applies to objects that
 * 			have a physical association with one another.
 */

@SuppressWarnings("serial")
public class AggregationEventType  extends org.oliot.epcis.EPCISEventType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.types.URI parentID;

    private org.oliot.epcglobal.EPC[] childEPCs;

    private org.oliot.epcis.ActionType action;

    private org.apache.axis.types.URI bizStep;

    private org.apache.axis.types.URI disposition;

    private org.oliot.epcis.ReadPointType readPoint;

    private org.oliot.epcis.BusinessLocationType bizLocation;

    

	private org.oliot.epcis.BusinessTransactionType[] bizTransactionList;

    //WSDL doesn't reflect QuantityElements List
    private QuantityElementType[] childQuantityList;
    
    private org.oliot.epcis.AggregationEventExtensionType extension;

    private org.apache.axis.message.MessageElement [] _any;

    public AggregationEventType() {
    }

    public AggregationEventType(
           java.util.Calendar eventTime,
           java.util.Calendar recordTime,
           java.lang.String eventTimeZoneOffset,
           org.oliot.epcis.EPCISEventExtensionType baseExtension,
           org.apache.axis.types.URI parentID,
           org.oliot.epcglobal.EPC[] childEPCs,
           org.oliot.epcis.ActionType action,
           org.apache.axis.types.URI bizStep,
           org.apache.axis.types.URI disposition,
           org.oliot.epcis.ReadPointType readPoint,
           org.oliot.epcis.BusinessLocationType bizLocation,
           org.oliot.epcis.BusinessTransactionType[] bizTransactionList,
           org.oliot.epcis.AggregationEventExtensionType extension,
           org.apache.axis.message.MessageElement [] _any) {
        super(
            eventTime,
            recordTime,
            eventTimeZoneOffset,
            baseExtension);
        this.parentID = parentID;
        this.childEPCs = childEPCs;
        this.action = action;
        this.bizStep = bizStep;
        this.disposition = disposition;
        this.readPoint = readPoint;
        this.bizLocation = bizLocation;
        this.bizTransactionList = bizTransactionList;
        this.extension = extension;
        this._any = _any;
    }

    public QuantityElementType[] getChildQuantityList() {
		return childQuantityList;
	}

	public void setChildQuantityList(QuantityElementType[] childQuantityList) {
		this.childQuantityList = childQuantityList;
	}
    
    
    /**
     * Gets the parentID value for this AggregationEventType.
     * 
     * @return parentID
     */
    public org.apache.axis.types.URI getParentID() {
        return parentID;
    }


    /**
     * Sets the parentID value for this AggregationEventType.
     * 
     * @param parentID
     */
    public void setParentID(org.apache.axis.types.URI parentID) {
        this.parentID = parentID;
    }


    /**
     * Gets the childEPCs value for this AggregationEventType.
     * 
     * @return childEPCs
     */
    public org.oliot.epcglobal.EPC[] getChildEPCs() {
        return childEPCs;
    }


    /**
     * Sets the childEPCs value for this AggregationEventType.
     * 
     * @param childEPCs
     */
    public void setChildEPCs(org.oliot.epcglobal.EPC[] childEPCs) {
        this.childEPCs = childEPCs;
    }


    /**
     * Gets the action value for this AggregationEventType.
     * 
     * @return action
     */
    public org.oliot.epcis.ActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this AggregationEventType.
     * 
     * @param action
     */
    public void setAction(org.oliot.epcis.ActionType action) {
        this.action = action;
    }


    /**
     * Gets the bizStep value for this AggregationEventType.
     * 
     * @return bizStep
     */
    public org.apache.axis.types.URI getBizStep() {
        return bizStep;
    }


    /**
     * Sets the bizStep value for this AggregationEventType.
     * 
     * @param bizStep
     */
    public void setBizStep(org.apache.axis.types.URI bizStep) {
        this.bizStep = bizStep;
    }


    /**
     * Gets the disposition value for this AggregationEventType.
     * 
     * @return disposition
     */
    public org.apache.axis.types.URI getDisposition() {
        return disposition;
    }


    /**
     * Sets the disposition value for this AggregationEventType.
     * 
     * @param disposition
     */
    public void setDisposition(org.apache.axis.types.URI disposition) {
        this.disposition = disposition;
    }


    /**
     * Gets the readPoint value for this AggregationEventType.
     * 
     * @return readPoint
     */
    public org.oliot.epcis.ReadPointType getReadPoint() {
        return readPoint;
    }


    /**
     * Sets the readPoint value for this AggregationEventType.
     * 
     * @param readPoint
     */
    public void setReadPoint(org.oliot.epcis.ReadPointType readPoint) {
        this.readPoint = readPoint;
    }


    /**
     * Gets the bizLocation value for this AggregationEventType.
     * 
     * @return bizLocation
     */
    public org.oliot.epcis.BusinessLocationType getBizLocation() {
        return bizLocation;
    }


    /**
     * Sets the bizLocation value for this AggregationEventType.
     * 
     * @param bizLocation
     */
    public void setBizLocation(org.oliot.epcis.BusinessLocationType bizLocation) {
        this.bizLocation = bizLocation;
    }


    /**
     * Gets the bizTransactionList value for this AggregationEventType.
     * 
     * @return bizTransactionList
     */
    public org.oliot.epcis.BusinessTransactionType[] getBizTransactionList() {
        return bizTransactionList;
    }


    /**
     * Sets the bizTransactionList value for this AggregationEventType.
     * 
     * @param bizTransactionList
     */
    public void setBizTransactionList(org.oliot.epcis.BusinessTransactionType[] bizTransactionList) {
        this.bizTransactionList = bizTransactionList;
    }


    /**
     * Gets the extension value for this AggregationEventType.
     * 
     * @return extension
     */
    public org.oliot.epcis.AggregationEventExtensionType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this AggregationEventType.
     * 
     * @param extension
     */
    public void setExtension(org.oliot.epcis.AggregationEventExtensionType extension) {
        this.extension = extension;
    }


    /**
     * Gets the _any value for this AggregationEventType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AggregationEventType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AggregationEventType)) return false;
        AggregationEventType other = (AggregationEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentID==null && other.getParentID()==null) || 
             (this.parentID!=null &&
              this.parentID.equals(other.getParentID()))) &&
            ((this.childEPCs==null && other.getChildEPCs()==null) || 
             (this.childEPCs!=null &&
              java.util.Arrays.equals(this.childEPCs, other.getChildEPCs()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.bizStep==null && other.getBizStep()==null) || 
             (this.bizStep!=null &&
              this.bizStep.equals(other.getBizStep()))) &&
            ((this.disposition==null && other.getDisposition()==null) || 
             (this.disposition!=null &&
              this.disposition.equals(other.getDisposition()))) &&
            ((this.readPoint==null && other.getReadPoint()==null) || 
             (this.readPoint!=null &&
              this.readPoint.equals(other.getReadPoint()))) &&
            ((this.bizLocation==null && other.getBizLocation()==null) || 
             (this.bizLocation!=null &&
              this.bizLocation.equals(other.getBizLocation()))) &&
            ((this.bizTransactionList==null && other.getBizTransactionList()==null) || 
             (this.bizTransactionList!=null &&
              java.util.Arrays.equals(this.bizTransactionList, other.getBizTransactionList()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getParentID() != null) {
            _hashCode += getParentID().hashCode();
        }
        if (getChildEPCs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildEPCs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildEPCs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getBizStep() != null) {
            _hashCode += getBizStep().hashCode();
        }
        if (getDisposition() != null) {
            _hashCode += getDisposition().hashCode();
        }
        if (getReadPoint() != null) {
            _hashCode += getReadPoint().hashCode();
        }
        if (getBizLocation() != null) {
            _hashCode += getBizLocation().hashCode();
        }
        if (getBizTransactionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBizTransactionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBizTransactionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(AggregationEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("epcis.oliot.org", "AggregationEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childEPCs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childEPCs"));
        elemField.setXmlType(new javax.xml.namespace.QName("epcglobal.oliot.org", "EPC"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "epc"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("epcis.oliot.org", "ActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizStep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disposition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("epcis.oliot.org", "ReadPointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("epcis.oliot.org", "BusinessLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizTransactionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizTransactionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("epcis.oliot.org", "BusinessTransactionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "bizTransaction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("epcis.oliot.org", "AggregationEventExtensionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
    @SuppressWarnings("rawtypes")
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
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
