<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.novel.iptv.util.DateTimeUtils"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemDetail"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.OrderInfo"%>
<%@page import="com.novel.iptv.util.BusiUtils"%>

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
	<head><link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" /></head>

	<body>
		<div class="body">
			<a href="javascript:window.history.go(-1);">
				<img style="left: 402px; top: 480px; position: absolute;" src="<%=path%>/images/buy_buck.png">
			</a>
			<img style="left: 10px; top: 58px; position: absolute;" src="<%=path%>/images/phone.png" />
			<div style="left: 425px; top: 9px; position: absolute; width: 79px; height: 20px; z-index: 1;">
			</div>
			<div style="left: 534px; top: 9px; position: absolute; width: 69px; height: 20px; z-index: 1;">
			</div>
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<b style="left: 176px; top: 110px; position: absolute; width: 373px; height: 26px; color: #F63; font-size: 24px">订单详细信息</b>
			<b style="left: 79px; top: 136px; position: absolute; width: 373px; height: 26px; color: #FFF; font-size: 24px">订购时间:<%=DateTimeUtils.formatDate(DateTimeUtils.parseDate(detvo.getSubmitDate(), DateTimeUtils.PATTERN_DEFAULT),DateTimeUtils.PATTERN_3)%></b>
			<b style="left: 79px; top: 168px; position: absolute; width: 254px; height: 26px; color: #FFF; font-size: 24px">联系电话:<%=detvo.getMobile() %></b>
			<div style="left: 78px; top: 207px; position: absolute;">
				<table width="483">
					<tr>
						<th height="25px" width="180px">商品名称</th>
						<th>单价</th>
						<th>数量</th>
						<th>合计</th>
						<th>操作</th>
					</tr>
					<%  int i;
						OrderItemDetail orderitem = new OrderItemDetail();
						Double totalprice=null,totalCount=null;
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
						<td><%=title %></td>
						<td><%=orderitem.getPrice() %></td>
						<td><%=orderitem.getBuyNum() %></td>
						<td><%=totalprice %></td>
						<td><%=str %></td>
					</tr>
					<% }  %>
				</table>
			</div>
			<div style="left: 423px; top: 449px; position: absolute; width: 159px; height: 24px">
				<b style="color: #F63; font-size: 24px">总额:<%=totalCount %></b>
			</div>
     <%  if(currentpage == 1){ %>
			<img style="left: 150px; top: 480px; position: absolute;" src="<%=path%>/images/buy_up.png"/>
	 <% } else { %>		
	   <a href="<%=path%>/userOrder.do?method=orderSearch_detail&pageno=<%=currentpage - 1%>&orderid=<%=detvo.getOrderId() %>">
	   		<img style="left: 150px; top: 480px; position: absolute;" src="<%=path%>/images/buy_up.png"/>
	   </a>
	 <% }  %>
			<div style="left: 250px; top: 480px; position: absolute; z-index: 1">
				<b style="color: #FFF; font-size: 30px"><%=currentpage%>/<%=totalpage%></b>
			</div>
	<% if(currentpage == totalpage){  %>	
			<img style="left: 300px; top: 480px; position: absolute;" src="<%=path%>/images/buy_down.png"/>
	<% } else { %>		
	   		<a href="<%=path%>/userOrder.do?method=orderSearch_detail&pageno=<%=currentpage + 1%>&orderid=<%=detvo.getOrderId() %>">
	   			<img style="left: 300px; top: 480px; position: absolute;" src="<%=path%>/images/buy_down.png"/>
			</a>
	<% } %>
		</div>
		<table width="483">
			<tr><tr><td><br></td></tr></tr>
		</table>
	</body>
</html>