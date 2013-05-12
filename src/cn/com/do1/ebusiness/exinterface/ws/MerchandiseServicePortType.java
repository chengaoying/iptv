/**
 * MerchandiseServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.ws;

public interface MerchandiseServicePortType extends java.rmi.Remote {
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryMerchandiseSortResponseVO queryMerchandiseSort(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryMerchandiseSortRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryBrandResponseVO queryBrand(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryBrandRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailMerchandiseResponseVO detailMerchandise(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailMerchandiseRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryMerchandiseResponseVO queryMerchandise(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryMerchandiseRequestVO requestVO) throws java.rmi.RemoteException;
}
