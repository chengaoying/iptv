<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.novel.iptv.model.hibernate.Tb_merchandise_info"%>
<% String path=request.getContextPath();
	String images =(String)request.getAttribute("img");
	Tb_merchandise_info mer =(Tb_merchandise_info)request.getAttribute("mer");
	String m="";
	if(mer.getShort_desc().length()>250){
		m = mer.getShort_desc().substring(0,250);
	}else{
		m = mer.getShort_desc();
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>详情</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" />
	<script src="<%=path%>/style/js.js" type="text/javascript"></script>
<script type="text/javascript">
function submit() {
	this.form1.submit();
}

function change(tag){
		tag.value = 1;
	
}
</script>
</head>
<body onload="init('num')">
	<div class="body">
	
		<jsp:include page="../head.jsp"></jsp:include>
		<img style="left:10px;top:58px; position:absolute;" src="<%=path%>/images/phone.png"/>
		<B style="left:49px;top:95px; position:absolute;font-size:20px; color:#FC0">商品名称:<%=mer.getName() %></B>
		<B style="left:49px;top:132px; position:absolute;font-size:20px; color: #ff6600">商城价: <%=mer.getPrice()%></B>
		<B style="left:258px;top:132px; position:absolute;font-size:20px; color:#FFF">原价: <%=mer.getConsult_price()%></B>
		<img style="left:40px; top:167px; position:absolute;" src="<%=path%>/images/<%=images%>" />
		<div style="left:281px; top:164px; position:absolute; width:300px; height:295">
			<B style="color:#FFF">产品说明<br><%=m %></B>
		</div>
		<div style=" background-image:url(<%=path%>/images/ibuy.png);left:158px; top:482px; position:absolute; width:104px; height:30px"> 
			<form action="<%=path%>/userCart.do?method=addCart&productCode=<%=mer.getCode() %>&pageNo=1" name="form1" method="post"  >
				
				<input  id="num" name="num" type="text" value="1" style="width:30px; height:20px;left:65px; top:4px; position:absolute; "size="4" maxlength="4"/>
				<div style="display:none">
				<input name="name" type="hidden"" value="<%=mer.getName() %>">
				<input name="price" type="hidden"" value="<%=mer.getPrice()%>">
				<!--<input name="num2" type="hidden"" value="-1">-->
				</div>
			</form>
		</div>
		<a href="javascript:submit();"><img style="left:276px; top:482px; position:absolute;" src="<%=path%>/images/buy.png"/></a>
		<a href="javascript:history.go(-1)"><img style="left:356px; top:482px; position:absolute;" src="<%=path%>/images/back.png"/></a>
		<a href="<%=path%>/userCart.do?method=selectCartItem&pageNo=1"><img style="left:440px; top:482px; position:absolute;" src="<%=path%>/images/Settlement.png"/></a>
	</div>
</body>
</html>