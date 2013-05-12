<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%  String path = request.getContextPath();
	String value = (String) request.getAttribute("value");
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	if (value == "value") {
        if("" == year ||null == year || "" == month||null == month||"" == day||null == day){
            //out.println("日期不能为空,请填写完整!");
	       return;
        }else {
          request.setAttribute("year",year);
          request.setAttribute("month",month);
          request.setAttribute("day",day);
          response.sendRedirect("/iptv/userOrder.do?method=orderSearch_list&pageno=1");
        } 
	}
%>
<html>
	<head> <base href="<%=path%>"> <title>check</title> </head>
	
<body>
	<span id="delay" style="background:red">3</span>秒钟后跳转到上一页面<br>
		<script type="text/javascript">	
			var delay = 3;
			function goBack() {
				document.getElementById("delay").innerHTML=delay;
				delay --;
				if(delay == 0) 
					document.location.href='iptv/web/order/orderQuery.jsp';
				else 
					setTimeout(goBack, 1000);
			}
			goBack();
			window.location.reload();
		</script>
	</body>
</html>
