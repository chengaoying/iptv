package cn.com.do1.ebusiness.exinterface.ws;

public class PromotionServicePortTypeProxy implements cn.com.do1.ebusiness.exinterface.ws.PromotionServicePortType {
  private String _endpoint = null;
  private cn.com.do1.ebusiness.exinterface.ws.PromotionServicePortType promotionServicePortType = null;
  
  public PromotionServicePortTypeProxy() {
    _initPromotionServicePortTypeProxy();
  }
  
  public PromotionServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPromotionServicePortTypeProxy();
  }
  
  private void _initPromotionServicePortTypeProxy() {
    try {
      promotionServicePortType = (new cn.com.do1.ebusiness.exinterface.ws.PromotionServiceLocator()).getPromotionServiceHttpSoap11Endpoint();
      if (promotionServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)promotionServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)promotionServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (promotionServicePortType != null)
      ((javax.xml.rpc.Stub)promotionServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.do1.ebusiness.exinterface.ws.PromotionServicePortType getPromotionServicePortType() {
    if (promotionServicePortType == null)
      _initPromotionServicePortTypeProxy();
    return promotionServicePortType;
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MdDiscountQueryResponseVO mdDiscountQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MdDiscountQueryRequestVO requestVO) throws java.rmi.RemoteException{
    if (promotionServicePortType == null)
      _initPromotionServicePortTypeProxy();
    return promotionServicePortType.mdDiscountQuery(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyDetailQueryResponseVO rushBuyDetailQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryDetailRequestVO requestVO) throws java.rmi.RemoteException{
    if (promotionServicePortType == null)
      _initPromotionServicePortTypeProxy();
    return promotionServicePortType.rushBuyDetailQuery(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MerchandiseDiscountQueryResponseVO queryMerchandiseDiscount(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MerchandiseDiscountQueryRequestVO requestVO) throws java.rmi.RemoteException{
    if (promotionServicePortType == null)
      _initPromotionServicePortTypeProxy();
    return promotionServicePortType.queryMerchandiseDiscount(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO rushBuyQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.RushBuyQueryRequestVO requestVO) throws java.rmi.RemoteException{
    if (promotionServicePortType == null)
      _initPromotionServicePortTypeProxy();
    return promotionServicePortType.rushBuyQuery(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MerchandiseDiscountDetailResponseVO detailMerchandiseDiscount(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MerchandiseDiscountDetailRequestVO requestVO) throws java.rmi.RemoteException{
    if (promotionServicePortType == null)
      _initPromotionServicePortTypeProxy();
    return promotionServicePortType.detailMerchandiseDiscount(requestVO);
  }
  
  
}