/**
 * PromotionServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.ws;

public interface PromotionServicePortType extends java.rmi.Remote {
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MdDiscountQueryResponseVO mdDiscountQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MdDiscountQueryRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyDetailQueryResponseVO rushBuyDetailQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryDetailRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MerchandiseDiscountQueryResponseVO queryMerchandiseDiscount(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MerchandiseDiscountQueryRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO rushBuyQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryRequestVO requestVO) throws java.rmi.RemoteException;
    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MerchandiseDiscountDetailResponseVO detailMerchandiseDiscount(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MerchandiseDiscountDetailRequestVO requestVO) throws java.rmi.RemoteException;
}
