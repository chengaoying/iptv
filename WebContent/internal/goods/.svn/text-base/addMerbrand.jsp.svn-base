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
<script type="text/javascript" src="<%=path %>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=path %>/dwr/util.js"></script>
<script type="text/javascript" src="<%=path %>/dwr/interface/goodsDwr.js"></script>
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
		if(trim(document.form1.brandCode.value)==''){
			alert("商城商品品牌不能为空");
			document.form1.brandCode.focus();
			return false;
		}
		if(trim(document.form1.merbrandCode.value)==''){
			alert("商家品牌编号不能为空");
			document.form1.merbrandCode.focus();
			return false;
		}
		if(trim(document.form1.merchantCode.value)==''){
			alert("商家不能为空");
			document.form1.merchantCode.focus();
			return false;
		}
		document.form1.submit();
	}
	//从webservice获取商品品牌信息
	function findBrands(){
		goodsDwr.findMerbrands(function(rtData){
				if(rtData!=null && rtData!='' && rtData.length>0){
					DWRUtil.addOptions("brandCode", rtData, "brandId", "brandName");
				}
			});
	}
	//从webservice获取商家信息
	function findMerchants(){
		goodsDwr.findMerchants(1, function(rtData){
				if(rtData!=null && rtData!='' && rtData.length>0){
					DWRUtil.addOptions("merchantCode", rtData, "merchantCode", "merchantName");
				}
			});
	}
	function setSelName(tgname, curObj){
		$(tgname).value = DWRUtil.getText(curObj);
	}
	findBrands();
	findMerchants();
</script>
</head>
<body>
<form action="<%=path %>/merbrand.do?method=addMerbrand" method="post" name="form1" id="form1">
 <div class="font01">
  <table width="100%" id="table_add">
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">商城商品品牌:</td>
      <td width="22%" align="left">
      <select id="brandCode" name="brandCode" onchange="setSelName('brandName', this)" style="width:150px">
      	<option value="">--请选择--</option>
      </select>
      <input type="hidden" name="brandName" id="brandName" />
      </td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">商家品牌编号:</td>
      <td width="22%" align="left"><input name="merbrandCode" type="text" id="merbrandCode" size="30" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">商家品牌名称:</td>
      <td width="22%" align="left"><input name="merbrandName" type="text" id="merbrandName" size="30" /></td>
      <td width="10%" align="left"></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">商家:</td>
      <td width="22%" align="left">
      <select id="merchantCode" name="merchantCode" onchange="setSelName('merchantName', this)" style="width:150px">
      	<option value="">--请选择--</option>
      </select>
      <input type="hidden" name="merchantName" id="merchantName" />
	  </td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <!--tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">商家id:</td>
      <td width="22%" align="left"><input name="merchantCode" type="text" id="merchantCode" size="30" /></td>
      <td width="10%" align="left"><span style="color: #FF0000">*</span></td>
      <td width="30%">&nbsp;</td>
    </tr>
    <tr id='table01'>
      <td width="30%">&nbsp;</td>
      <td width="8%" align="left">商家名称:</td>
      <td width="22%" align="left"><input name="merchantName" type="text" id="merchantName" size="30" /></td>
      <td width="10%" align="left"></td>
      <td width="30%">&nbsp;</td>
    </tr-->
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