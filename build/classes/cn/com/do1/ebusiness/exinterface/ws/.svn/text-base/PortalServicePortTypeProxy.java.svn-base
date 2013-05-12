package cn.com.do1.ebusiness.exinterface.ws;

public class PortalServicePortTypeProxy implements cn.com.do1.ebusiness.exinterface.ws.PortalServicePortType {
  private String _endpoint = null;
  private cn.com.do1.ebusiness.exinterface.ws.PortalServicePortType portalServicePortType = null;
  
  public PortalServicePortTypeProxy() {
    _initPortalServicePortTypeProxy();
  }
  
  public PortalServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPortalServicePortTypeProxy();
  }
  
  private void _initPortalServicePortTypeProxy() {
    try {
      portalServicePortType = (new cn.com.do1.ebusiness.exinterface.ws.PortalServiceLocator()).getPortalServiceHttpSoap11Endpoint();
      if (portalServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)portalServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)portalServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (portalServicePortType != null)
      ((javax.xml.rpc.Stub)portalServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.do1.ebusiness.exinterface.ws.PortalServicePortType getPortalServicePortType() {
    if (portalServicePortType == null)
      _initPortalServicePortTypeProxy();
    return portalServicePortType;
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryADResponseVO queryAD(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryADRequestVO requestVO) throws java.rmi.RemoteException{
    if (portalServicePortType == null)
      _initPortalServicePortTypeProxy();
    return portalServicePortType.queryAD(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryContentResponseVO queryContent(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryContentRequestVO requestVO) throws java.rmi.RemoteException{
    if (portalServicePortType == null)
      _initPortalServicePortTypeProxy();
    return portalServicePortType.queryContent(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.RecommendMerchandiseResponseVO recommendMerchandise(cn.com.do1.ebusiness.exinterface.vo.request.xsd.RecommendMerchandiseRequestVO requestVO) throws java.rmi.RemoteException{
    if (portalServicePortType == null)
      _initPortalServicePortTypeProxy();
    return portalServicePortType.recommendMerchandise(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailContentResponseVO detailContent(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailContentRequestVO requestVO) throws java.rmi.RemoteException{
    if (portalServicePortType == null)
      _initPortalServicePortTypeProxy();
    return portalServicePortType.detailContent(requestVO);
  }
  
  
}