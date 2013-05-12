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
<script language="JavaScript" type="text/javascript" src="<%=path %>/myjs/util.js"></script>
<script>
	var returnMes = '<%=returnMes%>';
	if(returnMes!='null'){
		alert(returnMes);
	}
	var operatorMessage = '<%=operatorMessage%>';
	if(operatorMessage=='null'){
		window.parent.location.href='<%=path%>/internal/login.jsp';
	}
	function verifyForm(){
		if(trim(document.form1.oldPassword.value)==''){
			alert("旧密码不能为空");
			document.form1.oldPassword.focus();
			return false;
		}
		if(trim(document.form1.newPassword.value)==''){
			alert("新密码不能为空");
			document.form1.newPassword.focus();
			return false;
		}
		if(document.form1.newPassword.value!=document.form1.confirmPassword.value){
			alert("确认密码与新密码不匹配");
			document.form1.confirmPassword.focus();
			return false;
		}
		document.form1.submit();
	}
</script>
</head>
<body>
<form action="<%=path %>/Operator.do?method=updateOperator" method="post" name="form1" id="form1">
 <div class="font01">
  <table width="100%" id="table_add">
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">旧密码:</td>
      <td width="22%" align="left"><input name="oldPassword" type="password" id="oldPassword" size="30" maxlength="12" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">新密码:</td>
      <td width="22%" align="left"><input name="newPassword" type="password" id="newPassword" size="30" maxlength="12" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*(小于12位)</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">确认密码:</td>
      <td width="22%" align="left"><input name="confirmPassword" type="password" id="confirmPassword" size="30" maxlength="12" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr>
      <td width="50%" align="right" colspan="2" ><input type="button" name="Submit" id="submit1_btn" onclick="verifyForm()"/></td>
      <td width="50%" align="left" colspan="2"><input type="reset" name="Submit2" id="reset1_btn" /></td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>