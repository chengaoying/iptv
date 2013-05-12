<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.novel.iptv.model.hibernate.Operator,com.novel.iptv.action.SessionListener" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(session.getAttribute("operatorMessage")!=null){
	Operator operator = (Operator)session.getAttribute("operatorMessage");
	SessionListener.deleteUserName(session,operator.getLoginName());
	session.removeAttribute("operatorMessage");
}
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

<body onload="document.getElementById('userName').focus()">
<div class="login">
 <div class="top"></div>
 <div class="middle">
 <form id="loginForm" name="loginForm" method="post" action="<%=path%>/login.do?method=loginIn">
   <table width="561" height="383" cellpadding="0" cellspacing="0">
     <tr>
       <td><table width="100%" cellspacing="0" cellpadding="0">
         <tr>
           <td width="55%" height="35">&nbsp;</td>
           <td width="9%" height="35">用户名：</td>
           <td width="36%" height="35">
             <label>
             <input type="text" id="userName" name="userName" style="width:130px" />
             </label>
           </td>
         </tr>
         <tr>
           <td height="35">&nbsp;</td>
           <td height="35">密&nbsp;&nbsp;码：</td>
           <td height="35">
             <label>
             <input type="password" id="passWord" name="passWord" style="width:130px" />
             </label>
           </td>
         </tr>
       </table>
         
         <table width="100%" cellspacing="0" cellpadding="0">
           <tr>
             <td width="55%">&nbsp;</td>
             <td width="20%"><input type="submit" name="Submit" id="submit_btn" /></td>
             <td width="25%"><input type="reset" name="reset" id="reset_btn" /></td>
           </tr>
         </table>

         <table width="100%" cellspacing="0" cellpadding="0">
           <tr>
             <td width="55%">&nbsp;</td>
             <td colspan="2" align="left" style="color:#FF0000" id ="font01">${errorMes}</td>
           </tr>
         </table>
         </td>
     </tr>
   </table>
   </form>
 </div>
 <div class="bottom"></div>
</div>
</body>
</html>