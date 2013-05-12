package cn.com.do1.ebusiness.exinterface.ws;

public class MerchandiseServicePortTypeProxy implements cn.com.do1.ebusiness.exinterface.ws.MerchandiseServicePortType {
  private String _endpoint = null;
  private cn.com.do1.ebusiness.exinterface.ws.MerchandiseServicePortType merchandiseServicePortType = null;
  
  public MerchandiseServicePortTypeProxy() {
    _initMerchandiseServicePortTypeProxy();
  }
  
  public MerchandiseServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMerchandiseServicePortTypeProxy();
  }
  
  private void _initMerchandiseServicePortTypeProxy() {
    try {
      merchandiseServicePortType = (new cn.com.do1.ebusiness.exinterface.ws.MerchandiseServiceLocator()).getMerchandiseServiceHttpSoap11Endpoint();
      if (merchandiseServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)merchandiseServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)merchandiseServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (merchandiseServicePortType != null)
      ((javax.xml.rpc.Stub)merchandiseServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.do1.ebusiness.exinterface.ws.MerchandiseServicePortType getMerchandiseServicePortType() {
    if (merchandiseServicePortType == null)
      _initMerchandiseServicePortTypeProxy();
    return merchandiseServicePortType;
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryMerchandiseSortResponseVO queryMerchandiseSort(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryMerchandiseSortRequestVO requestVO) throws java.rmi.RemoteException{
    if (merchandiseServicePortType == null)
      _initMerchandiseServicePortTypeProxy();
    return merchandiseServicePortType.queryMerchandiseSort(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryBrandResponseVO queryBrand(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryBrandRequestVO requestVO) throws java.rmi.RemoteException{
    if (merchandiseServicePortType == null)
      _initMerchandiseServicePortTypeProxy();
    return merchandiseServicePortType.queryBrand(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailMerchandiseResponseVO detailMerchandise(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailMerchandiseRequestVO requestVO) throws java.rmi.RemoteException{
    if (merchandiseServicePortType == null)
      _initMerchandiseServicePortTypeProxy();
    return merchandiseServicePortType.detailMerchandise(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryMerchandiseResponseVO queryMerchandise(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryMerchandiseRequestVO requestVO) throws java.rmi.RemoteException{
    if (merchandiseServicePortType == null)
      _initMerchandiseServicePortTypeProxy();
    return merchandiseServicePortType.queryMerchandise(requestVO);
  }
  
  
}