/**
 * Copyright (C) 2014 KAIST RESL 
 *
 * This file is part of Oliot (oliot.org).

 * @author Jack Jaewook Byun, Ph.D student
 * Korea Advanced Institute of Science and Technology
 * Real-time Embedded System Laboratory(RESL)
 * bjw0829@kaist.ac.kr
 */

package org.oliot.epcis.service.capture;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.axis.message.MessageElement;
import org.apache.axis.types.URI;
import org.oliot.epcglobal.EPC;
import org.oliot.epcis.ActionType;
import org.oliot.epcis.AggregationEventExtension2Type;
import org.oliot.epcis.AggregationEventExtensionType;
import org.oliot.epcis.AggregationEventType;
import org.oliot.epcis.BusinessLocationType;
import org.oliot.epcis.BusinessTransactionType;
import org.oliot.epcis.EPCISEventExtensionType;
import org.oliot.epcis.EPCISEventType;
import org.oliot.epcis.ILMDType;
import org.oliot.epcis.ObjectEventExtension2Type;
import org.oliot.epcis.ObjectEventExtensionType;
import org.oliot.epcis.ObjectEventType;
import org.oliot.epcis.QuantityElementType;
import org.oliot.epcis.QuantityEventExtensionType;
import org.oliot.epcis.QuantityEventType;
import org.oliot.epcis.ReadPointType;
import org.oliot.epcis.SourceDestType;
import org.oliot.epcis.TransactionEventExtension2Type;
import org.oliot.epcis.TransactionEventExtensionType;
import org.oliot.epcis.TransactionEventType;
import org.oliot.epcis.TransformationEventExtensionType;
import org.oliot.epcis.TransformationEventType;


public class CaptureService implements CoreCaptureService {

	@SuppressWarnings("unused")
	@Override
	public void capture(EPCISEventType event) {
		Calendar eventTime = event.getEventTime();
		String eventTimeZoneOffset = event.getEventTimeZoneOffset();
		Calendar recordTime = new GregorianCalendar();
		Map<String, String> extensionMap = getEPCISExtension(event.getBaseExtension());	
	}

	@SuppressWarnings("unused")
	@Override
	public void capture(AggregationEventType event) {

		//EPCISEventType
		Calendar eventTime = event.getEventTime();
		String eventTimeZoneOffset = event.getEventTimeZoneOffset();
		Calendar recordTime = new GregorianCalendar();

		//AggregationEvent Specific
		String parentStr = getParentString(event.getParentID());
		String[] childEPCs = getEPCArray(event.getChildEPCs());
		QuantityElementType[] childQuantityElements = event.getChildQuantityList();
		String actionStr = getActionString(event.getAction());
		String bizStepStr = getBizStepString(event.getBizStep());
		String dispositionStr = getDispositionString(event.getDisposition());
		String readPointStr = getReadPointString(event.getReadPoint());
		String bizLocStr = getBizLocString(event.getBizLocation());
		String[] bizTranStrArr = getBizTranArray(event.getBizTransactionList());

		//AggregationEventExtension Specific
		AggregationEventExtensionType extension = event.getExtension();
		String[] sourceArr = getSourceDestinationArray(extension.getSourceList());
		String[] destinationArr = getSourceDestinationArray(extension.getDestinationList());
		Map<String, String> extensionMap = getAggregationExtension(extension.getExtension());
	}



	@SuppressWarnings("unused")
	@Override
	public void capture(ObjectEventType event) {

		//EPCISEventType
		Calendar eventTime = event.getEventTime();
		String eventTimeZoneOffset = event.getEventTimeZoneOffset();
		Calendar recordTime = new GregorianCalendar();

		//ObjectEventType Specific
		String actionStr = getActionString(event.getAction());
		String bizLocStr = getBizLocString(event.getBizLocation());
		String bizStepStr = getBizStepString(event.getBizStep());
		String[] bizTranStrArr = getBizTranArray(event.getBizTransactionList());
		String dispositionStr = getDispositionString(event.getDisposition());
		String[] epcArr = getEPCArray(event.getEpcList());
		String readPointStr = getReadPointString(event.getReadPoint());

		//ObjectEventExtensionType Specific
		ObjectEventExtensionType extension = event.getExtension();
		String[] sourceArr = getSourceDestinationArray(extension.getSourceList());
		String[] destinationArr = getSourceDestinationArray(extension.getDestinationList());
		Map<String, String> ilmdMap = getILMD(extension.getIlmd());
		QuantityElementType[] quantityElements = extension.getQuantityList();
		Map<String, String> extensionMap = getObjectExtension(extension.getExtension());		
	}

	@SuppressWarnings("unused")
	@Override
	public void capture(QuantityEventType event) {

		//EPCISEventType
		Calendar eventTime = event.getEventTime();
		String eventTimeZoneOffset = event.getEventTimeZoneOffset();
		Calendar recordTime = new GregorianCalendar();

		//QuantityEvent Specific
		String epcClassStr = getEPCClassString(event.getEpcClass());
		int quantity = event.getQuantity();
		String bizStepStr = getBizStepString(event.getBizStep());
		String dispositionStr = getDispositionString(event.getDisposition());
		String readPointStr = getReadPointString(event.getReadPoint());
		String bizLocStr = getBizLocString(event.getBizLocation());
		String[] bizTranStrArr = getBizTranArray(event.getBizTransactionList());

		//QuantityEventExtension Specific
		QuantityEventExtensionType extension = event.getExtension();
		Map<String, String> extensionMap = getQuantityExtension(extension);

	}

	@SuppressWarnings("unused")
	@Override
	public void capture(TransactionEventType event) {

		//EPCISEventType
		Calendar eventTime = event.getEventTime();
		String eventTimeZoneOffset = event.getEventTimeZoneOffset();
		Calendar recordTime = new GregorianCalendar();

		//TransactionEvent Specific
		String[] bizTranStrArr = getBizTranArray(event.getBizTransactionList());
		String parentStr = getParentString(event.getParentID());
		String[] epcArr = getEPCArray(event.getEpcList());
		QuantityElementType[] quantityElements =event.getQuantityElements();
		String actionStr = getActionString(event.getAction());
		String bizStepStr = getBizStepString(event.getBizStep());
		String dispositionStr = getDispositionString(event.getDisposition());
		String readPointStr = getReadPointString(event.getReadPoint());
		String bizLocStr = getBizLocString(event.getBizLocation());

		//TransactionEventExtension Specific
		TransactionEventExtensionType extension = event.getExtension();
		String[] sourceArr = getSourceDestinationArray(extension.getSourceList());
		String[] destinationArr = getSourceDestinationArray(extension.getDestinationList());
		Map<String, String> extensionMap = getTransactionExtension(extension.getExtension());

	}


	@SuppressWarnings("unused")
	@Override
	public void capture(TransformationEventType event) {

		//EPCISEventType
		Calendar eventTime = event.getEventTime();
		String eventTimeZoneOffset = event.getEventTimeZoneOffset();
		Calendar recordTime = new GregorianCalendar();

		String[] inputEPCArr = getEPCArray(event.getInputEPCList());
		QuantityElementType[] inputQuantityList = event.getInputQuantityList();
		String[] outputEPCArr = getEPCArray(event.getOutputEPCList());
		QuantityElementType[] outputQuantityList = event.getOutputQuantityList();
		String transformStr = getTransformationString(event.getTransformationID());
		String bizStepStr = getBizStepString(event.getBizStep());
		String dispositionStr = getDispositionString(event.getDisposition());
		String readPointStr = getReadPointString(event.getReadPoint());
		String bizLocStr = getBizLocString(event.getBizLocation());
		String[] bizTranStrArr = getBizTranArray(event.getBizTransactionList());

		//TransformationEventExtension Specific
		TransformationEventExtensionType extension = event.getExtension();
		String[] sourceArr = getSourceDestinationArray(extension.getSourceList());
		String[] destinationArr = getSourceDestinationArray(extension.getDestinationList());
		Map<String, String> ilmdMap = getILMD(extension.getIlmd());
		Map<String, String> extensionMap = getTransformationExtension(extension);
	}







	@SuppressWarnings("unchecked")
	public Map<String, String> getEPCISExtension(EPCISEventExtensionType extension)
	{
		MessageElement[] extensionElements = extension.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getAggregationExtension( AggregationEventExtension2Type extension) {
		MessageElement[] extensionElements = extension.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getObjectExtension(ObjectEventExtension2Type extension) {
		MessageElement[] extensionElements = extension.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getQuantityExtension( QuantityEventExtensionType extension) {
		MessageElement[] extensionElements = extension.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getTransactionExtension( 	TransactionEventExtension2Type extension) {
		MessageElement[] extensionElements = extension.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getTransformationExtension(	TransformationEventExtensionType extension) {
		MessageElement[] extensionElements = extension.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getILMD(ILMDType ilmd) {
		if( ilmd == null ) return null;
		MessageElement[] extensionElements = ilmd.get_any();
		Map<String, String> extensionMap = new HashMap<String, String>();
		for(int i = 0 ; i < extensionElements.length ; i ++ )
		{
			MessageElement extensionElement = extensionElements[i];
			Iterator<String> iter = extensionElement.getAllAttributes();
			while(iter.hasNext())
			{
				String key = iter.next();
				extensionMap.put(key, extensionElement.getAttribute(key));
			}
		}
		return extensionMap;
	}


	private String getActionString(ActionType action) {

		if(action == null) return null;

		String actionStr = action.getValue();
		return actionStr;
	}

	private String getBizLocString(BusinessLocationType bizLocation) {

		if( bizLocation == null) return null;
		URI bizLocURI = bizLocation.getId();
		if( bizLocURI == null ) return null;
		String bizLocStr = bizLocURI.toString();
		return bizLocStr;
	}

	private String getBizStepString(URI bizStep) {

		if( bizStep == null ) return null;
		String bizStepStr = bizStep.toString();
		return bizStepStr;
	}

	private String[] getBizTranArray( BusinessTransactionType[] bizTransactionList) {

		if( bizTransactionList == null ) return null;
		if( bizTransactionList.length == 0 ) return null;

		String[] bizTranStrArr = new String[bizTransactionList.length];
		for(int i = 0 ; i < bizTransactionList.length ; i++ )
		{
			BusinessTransactionType bizTranType = bizTransactionList[i];
			URI bizTranURI = bizTranType.getType();
			bizTranStrArr[i] = bizTranURI.toString();
		}
		return bizTranStrArr;
	}

	private String getDispositionString(URI disposition) {
		if( disposition == null ) return null;
		String dispositionStr = disposition.toString();
		return dispositionStr;
	}

	private String[] getEPCArray(EPC[] epcList) {
		if( epcList == null ) return null;
		if( epcList.length == 0 ) return null;
		String[] epcArr = new String[epcList.length];
		for(int i = 0 ; i < epcList.length ; i++ )
		{
			epcArr[i] = epcList[i].get_value();
		}
		return epcArr;
	}

	private String getReadPointString(ReadPointType readPoint) {
		if( readPoint == null ) return null;
		URI readPointURI = readPoint.getId();
		if( readPointURI == null ) return null;
		String readPointStr = readPointURI.toString();
		return readPointStr;
	}

	private String[] getSourceDestinationArray(SourceDestType[] sourceDestinationList) {
		if( sourceDestinationList == null ) return null;
		if( sourceDestinationList.length == 0 ) return null;
		String[] retArr = new String[sourceDestinationList.length];
		for( int i = 0 ; i < sourceDestinationList.length ; i++ )
		{
			SourceDestType sourceDest = sourceDestinationList[i];
			URI sourceDestURI = sourceDest.getType();
			retArr[i] = sourceDestURI.toString();
		}
		return retArr;
	}

	private String getEPCClassString(URI epcClass) {
		if( epcClass == null ) return null;
		String epcClassStr = epcClass.toString();
		return epcClassStr;
	}

	private String getParentString(URI parentID) {
		if( parentID == null ) return null;
		String parentStr = parentID.toString();
		return parentStr;
	}

	private String getTransformationString(URI transformationID) {
		if ( transformationID == null ) return null;
		String retStr = transformationID.toString();
		return retStr;
	}
}
