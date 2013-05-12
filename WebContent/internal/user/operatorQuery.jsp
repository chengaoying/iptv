<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Object returnMes = request.getAttribute("returnMes");
Object  operatorMessage = session.getAttribute("operatorMessage");
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
<script language="JavaScript" type="text/javascript" src="<%=path %>/myjs/trunPage.js"></script>
<script>
	var operatorMessage = '<%=operatorMessage%>';
	if(operatorMessage=='null'){
		window.parent.location.href='<%=path%>/internal/login.jsp';
	}
	var returnMes = '<%=returnMes%>';
	if(returnMes!='null'){
		alert(returnMes);
	}
	function deleteOper(code){
		if(confirm('确定删除:确认后将会删除本用户信息?\n\n此操作无法恢复!')){
			document.form1.action='<%=path%>'+'/Operator.do?method=delOperator&delid='+code;
			document.form1.submit();
		}
	}
	
	function updateOper(code){
		document.form1.action='<%=path%>'+'/Operator.do?method=gotoAltPage&uid='+code;
		document.form1.submit();
	}

</script>
</head>
<body>
${operatorQuery}
</body>
</html>