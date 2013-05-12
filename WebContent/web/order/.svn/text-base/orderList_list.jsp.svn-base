<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.novel.iptv.util.DateTimeUtils"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.OrderInfo"%>	
<%
	String path = request.getContextPath();
	String uri = request.getHeader("Referer");
	QueryOrderResponseVO resvo2 = (QueryOrderResponseVO) request.getAttribute("resvo2");
	String year = (String) request.getAttribute("year");
	String month = (String) request.getAttribute("month");
	String day = (String) request.getAttribute("day");
	OrderInfo[] orderinfo = resvo2.getOrderList();
	int currentpage = Integer.parseInt(((Integer) request.getAttribute("pageno")).toString());
	int totalsize = resvo2.getTotalSize();
	int currentsize = resvo2.getCurrentSize();
	int totalpage = (totalsize % 8 == 0) ? (totalsize / 8) : ((totalsize / 8) + 1);
	if (currentpage <= 1) {
		currentpage = 1;
	} else if (currentpage >= totalpage) {
		currentpage = totalpage;
	}
%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" /></head>
	<script src="<%=path%>/style/js.js" type="text/javascript"></script>
	<body>
		<div class="body">
			<img style="left: 10px; top: 58px; position: absolute;" src="<%=path%>/images/phone.png" />
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<b style="left: 230px; top: 109px; position: absolute; width: 290px; height: 26px; color: #F63; font-size: 23px">订单记录查询</b>
			<div style="left: 89px; top: 155px; position: absolute;">
				<table width="483">
					<tr>
						<th height="25px" width="244px">
							<b style="font-size: 24px">订单日期</b>
						</th>
						<th height="25px" width="161px">
							<b style="font-size: 24px">详细电话</b>
						</th>
						<th height="25px"></th>
					</tr> 
					<%  for (int i = 0; i < orderinfo.length; i++) {
							OrderInfo info = orderinfo[i]; 	
					%>
					<tr>
						<td ><%=DateTimeUtils.formatDate(DateTimeUtils.parseDate(info.getSubmitDate(), DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3)   %></td>
						<td ><%=info.getMobile()%></td>
						<td><a id="sel" href="<%=path%>/userOrder.do?method=orderSearch_detail&pageno=1&orderid=<%=info.getOrderId()%>">
								<img src="<%=path%>/images/1_03.gif"/> </a>
						</td>
					</tr>
					<% } %>
				</table>
			</div>
			<div style="left: 229px; top: 489px; position: absolute; width: 309px; height: 24px">
				<b style="color: #F63; font-size: 20px">详情请拨打电话: 4008-985-985</b>
			</div>
			<% if (currentpage == 1) { %>
			<img style="left: 214px; top: 440px; position: absolute;" src="<%=path%>/images/buy_up.png"/> 
			<%} else {%>	
			<a href="<%=path%>/userOrder.do?method=orderSearch_list&pageno=<%=currentpage - 1%>&year=<%=year %>&month=<%=month %>&day=<%=day %>">
			 	<img style="left: 214px; top: 440px; position: absolute;" src="<%=path%>/images/buy_up.png"/> </a>	
			<%} %>
			<div style="left: 315px; top: 440px; position: absolute; z-index: 1">
				<b style="color: #FFF; font-size: 30px"><%=currentpage%>/<%=totalpage%></b>
			</div>
			<% if (currentpage == totalpage) { %>
			<img style="left: 358px; top: 440px; position: absolute;" src="<%=path%>/images/buy_down.png"/> 
			<%} else { %>
			 <a href="<%=path%>/userOrder.do?method=orderSearch_list&pageno=<%=currentpage + 1%>&year=<%=year %>&month=<%=month %>&day=<%=day %>">
			 	<img style="left: 358px; top: 440px; position: absolute;" src="<%=path%>/images/buy_down.png"/> </a>
			<%} %>		
			<a href="javascript:window.history.go(-1);">
				<img style="left: 456px; top: 440px; position: absolute;" src="<%=path%>/images/buy_buck.png"/> </a>
		</div>
	</body>
</html>