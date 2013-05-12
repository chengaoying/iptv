<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.novel.iptv.util.DateTimeUtils"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.MerchantShopCar"%>
<%
	String path = request.getContextPath();
	String uri = request.getHeader("Referer");
    int currentPage = Integer.parseInt(((Integer) request
		.getAttribute("pageNo")).toString());
	int totalPage = Integer.parseInt(((Integer) request
			.getAttribute("totalPage")).toString());
	String mobile = (String)request.getAttribute("mobile");
	MerchantShopCar[] cartList = (MerchantShopCar[]) request.getAttribute("cartList");
	String time = DateTimeUtils.formatDate(new Date(),DateTimeUtils.PATTERN_1);
%>
<html>
<head><link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" /></head>
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
			<a href="<%=path%>/userCart.do?method=deletCart">
				<img style="left: 402px; top: 480px; position: absolute;" src="<%=path%>/images/buy_buck.png">
			</a>
			<img style="left: 10px; top: 58px; position: absolute;" src="<%=path%>/images/phone.png" />
			<div style="left: 425px; top: 9px; position: absolute; width: 79px; height: 20px; z-index: 1;">
			</div>
			<div style="left: 534px; top: 9px; position: absolute; width: 69px; height: 20px; z-index: 1;">
			</div>
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<b style="left: 176px; top: 110px; position: absolute; width: 373px; height: 26px; color: #F63; font-size: 24px">订单详细信息</b>
			<b style="left: 79px; top: 136px; position: absolute; width: 373px; height: 26px; color: #FFF; font-size: 24px">订购时间:<%=time%></b>
			<b style="left: 79px; top: 168px; position: absolute; width: 254px; height: 26px; color: #FFF; font-size: 24px">联系电话:<%=mobile %></b>
			<div style="left: 78px; top: 207px; position: absolute;">
		<table width="483">
			<tr>
		    	<th height="25px" width="180px">商品名称</th>
		    	<th>单价(元)</th>
		    	<th>数量</th>
		    	<th>合计(元)</th>
		    	<th>操作</th>
		    </tr>
		    <%      MdShopCar[] mdcar = null;
		        	MdShopCar mdshop = null;
		        	Double totalPrice = 0.0;
		        	String title = null;
		        	for (int i = 0; i < cartList.length; i++) {
		        		MerchantShopCar merchant = (MerchantShopCar) cartList[i];
		        		mdcar = merchant.getMdList();
		        		for (int j = 0; j < mdcar.length; j++) {
		        			mdshop = mdcar[j];
							Double itemPrice = mdshop.getBuyNum() * mdshop.getPrice();//单项总价
							totalPrice += itemPrice;//购物车物品总价
							if(mdshop.getMerchandiseName().length()>16) 
								title = mdshop.getMerchandiseName().substring(0,13);
							else
							 title = mdshop.getMerchandiseName();
		    %>
		    <tr>
		    	<td ><%=title %></td>
		    	<td><%=mdshop.getPrice()%></td>
		    	<td><%=mdshop.getBuyNum()%></td>
		    	<td><%=itemPrice %></td><td> 备货 </td>
		    </tr>
		    <%  }  }  %>
		</table>
	</div>
	 <div style="left:423px;top:449px; position:absolute; width:159px; height:24px"><b style="color:#F63; font-size:24px">总额:<%=totalPrice %></b></div>
	      <% if(currentPage == 1){  %>
		   		<img style="left:150px;top:480px; position:absolute;" src="images/buy_up.png" />
		  <%  } else { %>
	            <a href="<%=path%>/userCart.do?method=makeOrder&pageNo=<%=currentPage - 1 %>">
	            <img style="left:150px;top:480px; position:absolute;" src="images/buy_up.png"/></a>
	      <%  }  %>
	     		<div style="left:255px;top:480px; position:absolute; z-index:1">
	     		<b style="color:#FFF; font-size:30px"><%=currentPage %>/<%=totalPage %></b></div>
	      <%  if(currentPage == totalPage){ %>
		   		<img style="left:300px;top:480px; position:absolute;" src="images/buy_down.png"/>
	      <% } else { %>
	     		<a href="<%=path%>/userCart.do?method=makeOrder&pageNo=<%=currentPage + 1 %>">
	     		<img style="left:300px;top:480px; position:absolute;" src="images/buy_down.png" /></a>
	     <%  }  %>
</div>
</body>
</html>