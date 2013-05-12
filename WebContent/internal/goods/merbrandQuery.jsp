<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"> 
<META HTTP-EQUIV="Expires" CONTENT="0">
<title>Insert title here</title>
<%
	String path=request.getContextPath();
    Object  operatorMessage = session.getAttribute("operatorMessage");
	Object returnMes = request.getAttribute("returnMes");
%>
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
	function updateMerbrand(code){
		document.form1.action='<%=path%>'+'/merbrand.do?method=gotoUpdate&bid='+code;
		document.form1.submit();
	}
	function deleteMerbrand(code){
		if(confirm('确定删除:确认后将会删除本品牌信息?\n\n此操作无法恢复!')){
			document.form1.action='<%=path%>'+'/merbrand.do?method=delMerbrand&bid='+code;
			document.form1.submit();
		}
	}
</script>
</head>
<body>
${merbrandQuery}
</body>
</html>