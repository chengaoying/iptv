<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<html>
<head>
<title></title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" />
</head>
<body>
<div class="body">
<img style="left:10px;top:58px; position:absolute;" src="<%=path%>/images/phone.png"/>
	
	<jsp:include page="/web/common/MenuItem.jsp"></jsp:include>
	<div style="left:150px;top:185px; position:absolute; width:289px; height:165px;">
	<b style="color:#fff;">卡号为：${userId }<br />
	${msg}</b>
	</div>
	<a href="<%=path%>/userCart.do?method=deletCart">
				<img style="left: 382px; top: 360px; position: absolute;" src="<%=path%>/images/buy_buck.png">
			</a>
	<div style="left: 150px; top: 409px; position: absolute; width: 349px; height: 24px">
				<b style="color:yellow; font-size:24px">详情请拨打电话:4008-985-985</b>
	</div>
</div>
</body>
</html>