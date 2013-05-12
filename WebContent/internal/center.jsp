<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"> 
<META HTTP-EQUIV="Expires" CONTENT="0">
<title>电视商城管理系统</title>
<link href="<%=path%>/mycss/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <table width="100%" height="100%" cellpadding="0" cellspacing="0">
    <tr>
      <td height="25" background="<%=path%>/images/bg.gif" bgcolor="#FFFFFF"><img src="<%=path%>/images/welcome.gif" width="600" height="555" /></td>
    </tr>
    <tr>
      <td height="25" bgcolor="#FFFFFF">&nbsp;</td>
    </tr>
  </table>
</body>
</html>
