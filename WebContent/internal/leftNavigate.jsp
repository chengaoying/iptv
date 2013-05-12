<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.novel.iptv.model.hibernate.Operator" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Object operatorMessage = session.getAttribute("operatorMessage");
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
<script>
	var operatorMessage = '<%=operatorMessage%>';
	if(operatorMessage=='null'){
		window.parent.location.href='<%=path%>/internal/login.jsp';
	}
    function over(obj)
    {
    	obj.style.color = '';
    	obj.style.backgroundColor = '';
    }
    function out(obj)
    {
    	obj.style.color = '';
    	obj.style.backgroundColor = '';
    }
    function collapse(objid)
    {
    	var obj = document.getElementById(objid);
    	var objDisplay =obj.style.display;
    	collapseAll();
    	if(objDisplay=="none")
    		obj.style.display = ''; 
    	if(objDisplay=="")
    		obj.style.display = 'none'; 
    }
    function collapseAll()
    {
    	for (var i=1; i<8; i++)
    	{
    		var obj = document.getElementById('g_' + i.toString());
    		if (obj) obj.style.display = 'none';
    	}
    }
    function expandAll()
    {
    	for (var i=1; i<8; i++)
    	{
    		var obj = document.getElementById('g_' + i.toString());
    		if (obj) obj.style.display = '';
    	}
    }
</script>
</head>
<body onload="collapseAll()" >
<table width="187" cellspacing="3" cellpadding="0">
  <tr>
    <td align="center" valign="top"><img src="<%=path%>/images/main_menu01.gif" width="183" height="28"></td>
  </tr>
  <tr>
    <td align="left" class="menu_name" colspan="2">
	<div  class="name">用户名：<%=((Operator)operatorMessage).getNickname()%></div>
	</td>
  </tr>
  <tr>
    <td><table width="100%" cellspacing="0" cellpadding="0">
      <tr>
        <td align="right"><img src="<%=path%>/images/main_rep01.gif" width="43" height="18" style="cursor:pointer"  onclick="javascript:window.top.location='<%=path %>/index.jsp'" /></td>
        <td align="center"><a href="<%=path%>/internal\user\operatorUpdate.jsp" target="mainFrame"><img src="<%=path%>/images/main_rep02.gif" width="62" height="18" style="cursor:pointer" /></a>
      </tr>
    </table></td>
  </tr>
</table>

<table width="187" border="0" cellpadding="0" cellspacing="2">
  <tbody>
   <tr>
        <td><img src="<%=path%>/images/main_menu02.gif" width="183" height="28"></td>
      </tr>
 <%if(((Operator)operatorMessage).getIsSys()==1){ %>
  <tr>
    <td onClick="collapse('g_1')" onMouseOver="over(this)" 
      onmouseout="out(this)"><div class="menu_title">用户管理</div></td>
  </tr>
  <tr>
    <td id="g_1">
      <div class="menu_list">
      <table>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/internal/user/addOperator.jsp" target="mainFrame">新增用户</a></td>
      </tr>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/Operator.do?method=selectOperator" target="mainFrame">查询用户</a></td>
      </tr>
      </table>
	 </div></td></tr>   
  <tr> 
  <%} %>
    <td onClick="collapse('g_2')" onMouseOver="over(this)" 
      onmouseout="out(this)"><div class="menu_title">订单管理</div></td>
  </tr>
  <tr>
    <td id="g_2" >
      <div class="menu_list">
      <table>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/order.do?method=orderSearch" target="mainFrame">订单查询</a></td>
      </tr>
      </table>
     </div></td></tr> 
	<tr> 
    <td onClick="collapse('g_3')" onMouseOver="over(this)" 
      onmouseout="out(this)"><div class="menu_title">短信管理</div></td>
  </tr>
    <tr>
    <td id="g_3" >
       <div class="menu_list">
      <table>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/message.do?method=queryMessage" target="mainFrame">短信查询</a></td>
      </tr>
      </table>
     </div></td></tr> 
  <tr> 
    <td onClick="collapse('g_4')" onMouseOver="over(this)" 
      onmouseout="out(this)"><div class="menu_title">商品管理</div></td>
  </tr>
    <tr>
    <td id="g_4" >
        <div class="menu_list">
      <table>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/internal/goods/goodsImport.jsp" target="mainFrame">商品同步</a></td>
      </tr>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/goods.do?method=goodsSearch" target="mainFrame">商品查询</a></td>
      </tr>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/internal/goods/addMerbrand.jsp" target="mainFrame">新增品牌</a></td>
      </tr>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/merbrand.do?method=merbrandSearch" target="mainFrame">品牌查询</a></td>
      </tr>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/internal/goods/addMerchandiseSort.jsp" target="mainFrame">新增分类</a></td>
      </tr>
      <tr>
      <td style="margin:2px 0 2px 0; padding:5px 0 0 35px"><img src='<%=path%>/images/ico_01.gif'/><a href="<%=path%>/merchandiseSort.do?method=merchandiseSortSearch" target="mainFrame">分类查询</a></td>
      </tr>
      </table>
     </div></td></tr> 
  <tr>
    <td >&nbsp;</td>
  </tr>
  <td valign="middle" style="width:8px;background:url(<%=path%>/images/main_cen_bg.gif) repeat-x;"></td>
	</tbody></table>
</body>
</html>