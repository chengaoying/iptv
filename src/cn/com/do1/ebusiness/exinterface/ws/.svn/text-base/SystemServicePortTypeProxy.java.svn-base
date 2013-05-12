package cn.com.do1.ebusiness.exinterface.ws;

public class SystemServicePortTypeProxy implements cn.com.do1.ebusiness.exinterface.ws.SystemServicePortType {
  private String _endpoint = null;
  private cn.com.do1.ebusiness.exinterface.ws.SystemServicePortType systemServicePortType = null;
  
  public SystemServicePortTypeProxy() {
    _initSystemServicePortTypeProxy();
  }
  
  public SystemServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSystemServicePortTypeProxy();
  }
  
  private void _initSystemServicePortTypeProxy() {
    try {
      systemServicePortType = (new cn.com.do1.ebusiness.exinterface.ws.SystemServiceLocator()).getSystemServiceHttpSoap11Endpoint();
      if (systemServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)systemServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)systemServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (systemServicePortType != null)
      ((javax.xml.rpc.Stub)systemServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.do1.ebusiness.exinterface.ws.SystemServicePortType getSystemServicePortType() {
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType;
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MemberListQueryResponseVO memberListQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MemberListQueryRequestVO requestVO) throws java.rmi.RemoteException{
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType.memberListQuery(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MemberAddResponseVO memberAdd(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MemberAddRequestVO requestVO) throws java.rmi.RemoteException{
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType.memberAdd(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MemberDelResponseVO memberDel(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MemberDelRequestVO requestVO) throws java.rmi.RemoteException{
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType.memberDel(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DataSynchronizedResponseVO detailContent(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DataSynchronizedRequestVO requestVO) throws java.rmi.RemoteException{
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType.detailContent(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MemberDetailQueryResponseVO memberDetailQuery(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MemberDetailQueryRequestVO requestVO) throws java.rmi.RemoteException{
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType.memberDetailQuery(requestVO);
  }
  
  public cn.com.do1.ebusiness.exinterface.vo.response.xsd.MemberModifyResponseVO memberModify(cn.com.do1.ebusiness.exinterface.vo.request.xsd.MemberModifyRequestVO requestVO) throws java.rmi.RemoteException{
    if (systemServicePortType == null)
      _initSystemServicePortTypeProxy();
    return systemServicePortType.memberModify(requestVO);
  }
  
  
}