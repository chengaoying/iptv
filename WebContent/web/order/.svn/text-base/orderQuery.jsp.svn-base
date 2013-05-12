<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date" %>


<%
	String path = request.getContextPath();
	//String uri = request.getHeader("Referer");

	Calendar ca = Calendar.getInstance();
	ca.setTime(new java.util.Date());
	SimpleDateFormat simpledate = new SimpleDateFormat("yyyyMMdd");
	String date = simpledate.format(ca.getTime());
	System.out.println(date);
	int year = ca.get(Calendar.YEAR);
	int month = ca.get(Calendar.MONTH);
	int day = ca.get(Calendar.DAY_OF_MONTH);
%>
<html>
	<head><link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" /></head>

	<script type="text/javascript">
function check() {
	var year = document.getElementById("year").value;
	var month = document.getElementById("month").value;
	var day = document.getElementById("day").value;
	if (year == "" || year == null || month == "" || month == null || day == "" || day == null) {
		document.getElementById("display").style.display = "block";
		return;
	}
	var str = year +'-'+ month +'-' + day;
	var exp = /^((((19|20)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((19|20)\d{2})-(0?[469]|11)-(0?[1-9]|[12]\d|30))|(((19|20)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))-0?2-(0?[1-9]|[12]\d)))$/;
	var a = exp.test(str);
	if (!a) {
		document.getElementById("display").style.display = "block";
		return;
	}
	this.form1.submit();   
}
</script>
	<body>
		<div class="body">
		<a id="find" href="<%=path%>/userOrder.do?method=orderSearch&currentPage=1">
				<img style="top: 146px; left: 308px; position: absolute;" src="<%=path%>/images/find.gif"/></a>
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<div style="top: 154px; left: 20px; position: absolute; width: 280px;">
				<b style="font-size: 22px; color: #FFF;">1、查询一个月订单记录</b>
			</div>
			
			
			<div style="top: 238px; left: 20px; position: absolute; width: 450px;">
				<b style="font-size: 22px; color: #FFF;">2、根据您的订购日期，查询当天订购的信息</b>
			</div>
			<form id="form1" method="post" action="<%=path%>/userOrder.do?method=orderSearch_list&pageno=1">
				<div style="top: 278px; left: 55px; position: absolute; width: 370px;">
 					<b style="font-size: 22px; color: #FFF;">订购日期
	 					<input name="year" id="year" value="<%=year %>" type="text" style="width: 60px" size="4" maxlength="4" />年
						<input name="month" id="month" value="<%=month + 1 %>" type="text" style="width: 40px" size="2" maxlength="2"/>月
						<input name="day" id="day" value="<%=day %>" type="text" style="width: 40px" size="2" maxlength="2"/>日
					</b>
					<input type="hidden" name="value" value="value" />
				</div>
				<div id="display" style="top: 323px; left: 55px; position: absolute; width: 370px; color:yellow; font-size:21px; display: none;">
					<b>请输入正确的格式:例如2011-01-01</b>
				</div>
				<input type="reset" name="reset" value=" " style="left: 244px; top: 352px; width: 86px; height: 39px; border: 0px; position: absolute; background: url(<%=path%>/images/reinput.gif);" />
				<a href="javascript:check();"> 
					<img src="<%=path%>/images/find.gif"style="left: 350px; top: 352px; position: absolute;" /> 
				</a>
				<a href="javascript:window.history.go(-1);"> 
					<img style="left: 457px; top: 352px; position: absolute;" src="<%=path%>/images/buy_buck.png"/> 
				</a>
			</form>
			<b style="left: 230px; top: 403px; position: absolute; color: #F90; font-size: 18px">详情请拨打电话: 4008-985-985</b>
		</div>
	</body>
</html>