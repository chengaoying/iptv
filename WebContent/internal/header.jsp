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
<table border="0" cellpadding="0" cellspacing="0" height="100%" width="100%" style="background:#EBF5FC;">
<tbody>
  <tr>
    <td height="96" colspan="3" valign="top" style="background:url(<%=path%>/images/topg2.gif) repeat-x; overflow:hidden;">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="<%=path%>/images/top_left.gif"></td>
    <td align="right"><img src="<%=path%>/images/top_right.gif"></td>
  </tr>
</table>
</body>
</html>
