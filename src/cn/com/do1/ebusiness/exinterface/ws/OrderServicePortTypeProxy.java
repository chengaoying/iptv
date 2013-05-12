package cn.com.do1.ebusiness.exinterface.ws;

public class OrderServicePortTypeProxy implements cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType {
  private String _endpoint = null;
  private cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType orderServicePortType = null;
  
  public OrderServicePortTypeProxy() {
    _initOrderServicePortTypeProxy();
  }
  
  public OrderServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initOrderServicePortTypeProxy();
  }
  
  private void _initOrderServicePortTypeProxy() {
    try {
      orderServicePortType = (new cn.com.do1.ebusiness.exinterface.ws.OrderServiceLocator()).getOrderServiceHttpSoap11Endpoint();
      if (orderServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)orderServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)orderServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (orderServicePortType != null)
      ((javax.xml.rpc.Stub)orderServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType getOrderServicePortType() {
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType;
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO detailOrder(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailOrderRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.detailOrder(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO shoppingCartOrder(cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartOrderRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.shoppingCartOrder(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO queryShoppingCart(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryShoppingCartRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.queryShoppingCart(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO queryOrder(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryOrderRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.queryOrder(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO directBuy(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DirectBuyRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.directBuy(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO addShoppingCarts(cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartsRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.addShoppingCarts(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO delShoppingCart(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DelShoppingCartRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.delShoppingCart(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO addShoppingCart(cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.addShoppingCart(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO addOrderForMerchant(cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddOrderForMerRequestVO requestVO) throws java.rmi.RemoteException{
    if (orderServicePortType == null)
      _initOrderServicePortTypeProxy();
    return orderServicePortType.addOrderForMerchant(requestVO);
  }
  
  
}