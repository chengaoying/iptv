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
		if(trim(document.form1.userName.value)==''){
			alert("用户名不能为空");
			document.form1.userName.focus();
			return false;
		}
		if(trim(document.form1.loginName.value)==''){
			alert("登录名不能为空");
			document.form1.loginName.focus();
			return false;
		}
		if(trim(document.form1.password.value)==''){
			alert("密码不能为空");
			document.form1.password.focus();
			return false;
		}
		document.form1.submit();
	}
</script>
</head>
<body>
<form action="<%=path %>/Operator.do?method=addOperator" method="post" name="form1" id="form1">
 <div class="font01">
  <table width="100%" id="table_add">
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">用户名:</td>
      <td width="22%" align="left"><input name="userName" type="text" id="userName" size="30" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">登陆名:</td>
      <td width="22%" align="left"><input name="loginName" type="text" id="loginName" size="30" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">密码:</td>
      <td width="22%" align="left"><input name="password" type="password" id="password" size="30" maxlength="12" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*(小于12位)</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">是否管理员:</td>
      <td width="22%" align="left"><input type="radio" name="radiobutton" value="1" checked="checked" />是
          <input type="radio" name="radiobutton" value="0" />
          否</td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">备注:</td>
      <td width="22%" align="left"><textarea name="memo" cols="32" rows="4" id="memo"></textarea></td>
      <td width="10%" >&nbsp;</td>
      <td width="30%">&nbsp;</td>
    </tr>
	<tr id='table01'>
	  <td width="50%" align="right" colspan="2" ><input type="button" name="Submit" id="submit1_btn" onclick="verifyForm()"/></td>
      <td width="50%" align="left" colspan="2"><input type="reset" name="Submit2" id="reset1_btn" /></td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>