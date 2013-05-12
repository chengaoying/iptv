<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*,com.novel.iptv.model.hibernate.CartItem"%>
<%
	String path = request.getContextPath();
	String uri = request.getHeader("Referer");
%>
<html>
	<head><link rel="stylesheet" type="text/css" href="style/css.css" /></head>
<style>
th {
	color: #F96;
	text-align: left;
}
td {
	color: #FFF;
}
.count {
	width: 44px;
	height: 21px;
}
</style>
	<body>
		<div class="body">
			<a href="<%=path %>"><img style="left: 402px; top: 395px; position: absolute;" src="<%=path%>/images/buy_buck.png"> </a>
			<img style="left: 10px; top: 58px; position: absolute;" src="<%=path%>/images/phone.png" />
			<div style="left: 425px; top: 9px; position: absolute; width: 69px; height: 20px; z-index: 1;">
				
			</div>
			<div style="left: 534px; top: 9px; position: absolute; width: 69px; height: 20px; z-index: 1;">
				
			</div>
			<jsp:include page="../head.jsp"></jsp:include> 
			<div style="left: 36px; top: 93px; position: absolute;">
				<table width="576">
					<tr>
						<th height="25px" width="185px">商品名称</th>
						<th>单价(元)</th>
						<th>数量</th>
						<th>合计(元)</th>
						<th>操作</th>
					</tr>
					<tr><td>您的购物车中没有商品!</td></tr>
				</table>
			</div>
			<div style="left: 450px; top: 356px; position: absolute; width: 159px; height: 24px">
				<b style="color: #F63; font-size: 24px"></b>
			</div>
			<a href="#"><img style="left: 159px; top: 395px; position: absolute;" src="<%=path%>/images/buy_up.png"> </a>
			<div style="left: 255px; top: 395px; position: absolute; z-index: 1">
				<b style="color: #FFF; font-size: 30px"></b>
			</div>
			<a href="#"><img style="left: 303px; top: 395px; position: absolute;" src="<%=path%>/images/buy_down.png"> </a>
			
			<div style="left: 25px; top: 444px; position: absolute; width: 426px; height: 24px">
				<b style="color: #F93; font-size: 14px">请输入您的号码,客服人员会与你进行订单确认</b>
			</div>
			<img style="left: 23px; top: 474px; position: absolute;" src="<%=path%>/images/telephone.png">
			<input id="phone" style="width: 221px; height: 28px; left: 47px; top: 474px; position: absolute;">
			<img style="left: 269px; top: 474px; position: absolute;" src="<%=path%>/images/submit.png">
			<img style="left: 349px; top: 474px; position: absolute;" src="<%=path%>/images/re.png">
		</div>
	</body>
</html>