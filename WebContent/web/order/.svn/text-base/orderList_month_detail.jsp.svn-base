<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.novel.iptv.util.BusiUtils"%>
<%@page import="com.novel.iptv.util.DateTimeUtils"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.OrderInfo"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemDetail"%>
<%  String path = request.getContextPath();
	String uri = request.getHeader("Referer");
	DetailOrderResponseVO detvo = (DetailOrderResponseVO) request.getAttribute("detvo");
    int currentpage = Integer.parseInt(((Integer) request.getAttribute("pageno")).toString());
	OrderItemDetail[] orderitems = detvo.getOrderItemList();
	int totalsize = detvo.getTotalSize();
	int currentsize = detvo.getCurrentSize();
	int totalpage = (totalsize % 8 == 0) ? (totalsize / 8): ((totalsize / 8) + 1);
	if (currentpage <= 1) {
		currentpage = 1;
	} else if (currentpage >= totalpage) {
		currentpage = totalpage;
	}
%>

<html>
	<head>
	<link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" /></head>
	<body>
		<div class="body">
		<a id="buck" href="javascript:window.history.go(-1);">
				<img style="left: 402px; top: 480px; position: absolute;" src="<%=path%>/images/buy_buck.png"/>
			</a>
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<b style="left: 176px; top: 80px; position: absolute; width: 373px; height: 26px; color: yellow; font-size: 24px">一个月的订单历史记录查询</b>
			<b style="left: 15px; top: 110px; position: absolute; width: 373px; height: 26px; color: #FFF; font-size: 24px">订购时间:<%=DateTimeUtils.formatDate(DateTimeUtils.parseDate(detvo.getSubmitDate(), DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3) %></b>
			<b style="left: 15px; top: 136px; position: absolute; width: 254px; height: 26px; color: #FFF; font-size: 24px">联系电话:<%=detvo.getMobile() %></b>
			<div style="left: 10px; top: 159px; position: absolute;">
				<table >
					<tr>
						<th height="25px" width="360px;" style="font-size:24px;">商品名称</th>
						<th width="50px" style="font-size:24px;">单价</th>
						<th width="50px" style="font-size:24px;">数量</th>
						<th width="50px" style="font-size:24px;">合计</th>
						<th style="font-size:24px;">操作</th>
					</tr>
					<%  int i;
						OrderItemDetail orderitem;
						Double totalprice = null,totalCount = null;
						String title = null;
						for (i = 0; i < orderitems.length; i++) {
							 orderitem = orderitems[i];
							 totalprice = BusiUtils.formatDouble(orderitem.getBuyNum()*orderitem.getPrice());
							 totalCount = BusiUtils.formatDouble(detvo.getTotalAmount());
							 if(orderitem.getMerchandiseName().length()>16) 
									title = orderitem.getMerchandiseName().substring(0,13);
								else
								 title = orderitem.getMerchandiseName();
							 
							 int status = orderitem.getOrderItemStatus() ;
							 String str = null;
							 if(status == 0){
								 str = "正常";	
						     } else if(status == 1){
						    	 str = "已退费";
						     } else if(status == 2){
						    	 str = "缺货";
						     } else if(status == -1){
						    	 str = "取消";
						     }
					%>
					<tr>
						<td style="font-size:22px;"><%=title %></td>
						<td style="font-size:22px;"><%=orderitem.getPrice() %></td>
						<td style="font-size:22px; text-align: center;"><%=orderitem.getBuyNum() %></td>
						<td style="font-size:22px;"><%=totalprice %></td>
						<td style="font-size:22px;"><%=str %></td>
					</tr>
					<% } %>
				</table>
			</div>
			<div style="left: 423px; top: 449px; position: absolute; width: 159px; height: 24px">
				<b style="color: yellow; font-size: 24px">总额:<%=totalCount %></b>
			</div>
			<% if (currentpage == 1) { %>
			<img style="left: 150px; top: 480px; position: absolute;" src="<%=path%>/images/buy_up.png"/>
			<%} else { %>
			<a href="<%=path%>/userOrder.do?method=orderSearch_detail&pageno=<%=currentpage - 1%>&orderid=<%=detvo.getOrderId() %>">
				<img style="left: 150px; top: 480px; position: absolute;" src="<%=path%>/images/buy_up.png"/>
			</a>
			<% }%>
			<div style="left: 250px; top: 480px; position: absolute; z-index: 1">
				<b style="color: #FFF; font-size: 30px"><%=currentpage%>/<%=totalpage%></b>
			</div>
			<% if (currentpage == totalpage) { %>
			<img style="left: 300px; top: 480px; position: absolute;" src="<%=path%>/images/buy_down.png"/>
			<%} else { %>
			<a href="<%=path%>/userOrder.do?method=orderSearch_detail&pageno=<%=currentpage + 1%>&orderid=<%=detvo.getOrderId() %>">
			  	<img style="left: 300px; top: 480px; position: absolute;" src="<%=path%>/images/buy_down.png"/>
			</a>
			<%} %>
			
		</div>
		<table width="483"> <tr> <tr> <td> <br> </td> </tr> </tr> </table>
	</body>
</html>