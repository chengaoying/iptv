<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Object  operatorMessage = session.getAttribute("operatorMessage");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"> 
<META HTTP-EQUIV="Expires" CONTENT="0">
<title>商城管理系统</title>
<script>
	var operatorMessage = '<%=operatorMessage%>';
	if(operatorMessage=='null'){
		window.parent.location.href='<%=path%>/internal/login.jsp';
	}
	 window.onbeforeunload = function()   
    {     
       	window.parent.location.href="<%=path%>/login.do?method=closeBrowse";
    }
	 
</script>
</head>
<frameset rows="80,*,40" cols="*" framespacing="0" frameborder="no" border="0" bordercolor="#e9f4fa" >
  <frame src="<%=path%>/internal/header.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset rows="*" cols="190,*" framespacing="0" frameborder="yes" border="0" bordercolor="#e9f4fa">
    <frame src="<%=path%>/internal/leftNavigate.jsp" name="leftFrame" scrolling="no" noresize="noresize" id="leftFrame" title="leftFrame" />
    <frame src="<%=path%>/internal/center.jsp" name="mainFrame" id="mainFrame" title="mainFrame" />
  </frameset>
  <frame src="<%=path%>/internal/foot.jsp" name="footFrame" scrolling="No" noresize="noresize" id="footFrame" title="footFrame" />
  <frame>
</frameset>
<noframes><body>
</body>
</noframes></html>