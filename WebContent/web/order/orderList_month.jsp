<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="cn.com.do1.ebusiness.exinterface.vo.xsd.OrderInfo"%>
<%@ page import="cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO"%>
<%@page import="com.novel.iptv.util.DateTimeUtils"%>
<%
	String path = request.getContextPath();
	String uri = request.getHeader("Referer");
	QueryOrderResponseVO resvo = (QueryOrderResponseVO) request.getAttribute("resvo");
	OrderInfo[] orderinfo = resvo.getOrderList();
	int currentpage = Integer.parseInt(((Integer) request.getAttribute("pageno")).toString());
	int totalsize = resvo.getTotalSize();
	int currentsize = resvo.getCurrentSize();
	int totalpage = (totalsize % 8 == 0) ? (totalsize / 8)	: ((totalsize / 8) + 1);
	if (currentpage <= 1) {
		currentpage = 1;
	} else if (currentpage >= totalpage) {
		currentpage = totalpage;
	}
%>
<html>
	<head><link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" /></head>
		<script src="<%=path%>/style/js.js" type="text/javascript"></script>
	<body onload="init('sel')">
		<div class="body">
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<b style="left: 177px; top: 109px; position: absolute; width: 350px; height: 26px; color: yellow; font-size: 26px">一个月的订单历史查询记录</b>
			<div style="left: 89px; top: 135px; position: absolute;">
				<table width="483">
					<tr>
						<th height="25px" width="244px"> <b style="font-size: 24px;color: yellow;">订单日期</b> </th>
						<th height="25px" width="161px"> <b style="font-size: 24px;color: yellow;">详细电话</b> </th>
						<th height="25px"></th>
					</tr>
					<%  int i;
						for (i = 0; i < orderinfo.length; i++) {
							OrderInfo info = orderinfo[i];
					%>
					<tr>
						<td style="font-size: 24px;"> <%=DateTimeUtils.formatDate(DateTimeUtils.parseDate(info.getSubmitDate(), DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3) %> </td>
						<td style="font-size: 24px;"> <%=info.getMobile()%> </td>
						<td> <a id="sel" href="<%=path%>/userOrder.do?method=orderSearch_detail&pageno=1&orderid=<%=info.getOrderId() %>">
								<img src="<%=path%>/images/1_03.gif"/> </a>
						</td>
					</tr>
					<% } %>
				</table> 
			</div>
			<div style="left: 229px; top: 489px; position: absolute; width: 309px; height: 24px">

				<b style="color: yellow; font-size: 22px">详情请拨打电话: 4008-985-985</b>

			</div>
			<% if (currentpage == 1) { %>
		    <img style="left: 214px; top: 440px; position: absolute;" src="<%=path%>/images/buy_up.png"/> 
			<%} else { %>
			<a href="<%=path%>/userOrder.do?method=orderSearch&currentPage=<%=currentpage - 1%>">
				<img style="left: 214px; top: 440px; position: absolute;" src="<%=path%>/images/buy_up.png"/> 
			</a>
			<%} %>		
			<div style="left: 315px; top: 440px; position: absolute; z-index: 1">
				<b style="color: #FFF; font-size: 30px"><%=currentpage%>/<%=totalpage%></b>
			</div>
			<% if (currentpage == totalpage) { %>
			<img style="left: 358px; top: 440px; position: absolute;" src="<%=path%>/images/buy_down.png"/>
			<%} else { %>
			<a href="<%=path%>/userOrder.do?method=orderSearch&currentPage=<%=currentpage + 1%>">
				<img style="left: 358px; top: 440px; position: absolute;"src="<%=path%>/images/buy_down.png"/> 
			</a>
			<%} %>		
			<a href="javascript:window.history.go(-1);">
				<img style="left: 456px; top: 440px; position: absolute;" src="<%=path%>/images/buy_buck.png"/> 
			</a>
		</div>
	</body>
</html>