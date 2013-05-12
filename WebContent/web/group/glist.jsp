<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.xsd.RushbuyInfo"%>
<%@page import="cn.com.do1.ebusiness.exinterface.vo.response.xsd.RushBuyQueryResponseVO"%>
<%@page import="java.util.*"%>
<%@ include file="../common/Taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${ctx}/style/css.css" />
<script src="${ctx}/myjs/group/g_list.js" type="text/javascript"></script>
<script src="${ctx}/myjs/DateUtil.js" type="text/javascript"></script>
<title>团购列表</title>
<%
		RushBuyQueryResponseVO  res= (RushBuyQueryResponseVO)request.getAttribute("rush");
		int totle1 = res.getTotalSize() % res.getCurrentSize(); //总页数
		int page1 = Integer.parseInt(request.getAttribute("page").toString());   //当前页
%>
<script>
function gethref(a){
	var vpage = <%=page1 %>;
	if(vpage==1){
		if(a>0){
			window.location.href="${ctx}/group.do?method=querylist&page="+(a+vpage);
		}else{
			window.location.href="${ctx}/group.do?method=querylist&page="+vpage;
		}	
	}else if(vpage>1){
		window.location.href="${ctx}/group.do?method=querylist&page="+(vpage-1);
	}
}
</script>
</head>
<body>
<div class="body">
	<jsp:include page="../common/MenuItem.jsp"></jsp:include>
	<img style="left:10px;top:58px; position:absolute;" src="${ctx}/images/phone.png"/>
	<div style="left:126px;top:62px; position:absolute; width:504px; height:32px; background-image:url(${ctx}/images/title2.png)">
		<div style="left:15px;top:2px; position:absolute; width:95px; height:28px; background-image:url(${ctx}/images/choose.png);text-align:center">团购</div>
	</div>
	<div style="left:18px; top:112px; position:absolute;">
<%  int left=0,top=0;
	if(res.getRushbuyList(0)!=null){
	    for(int i=0;i<res.getRushbuyList().length;i++) {
	    	RushbuyInfo rus=res.getRushbuyList()[i];
	 		if(i==0) {
	 			left=0;top=0;
	 		}else if(i==1) {
	 			left=310;top=0;
	 		}else if(i==2) {
	 			left=0;top=188;
	 		}else {
	 			left=310;top=188;
	 		}
	 		String img = rus.getMdPicList(0).getMerchandisePic();
%>		
	      <div style="left:<%=left%>px; top:<%=top%>px; position:absolute;">
	 		    <div style="background-image:url(${ctx}/images/gb_group.gif); width:297px; height:176px">
	 		    	<% if(rus.getMdPicList()[0]!=null){%>	
	 		    	<!--<a href="${ctx}/${temp}<%=rus.getId()%>.html">
	 		    	  <img style="left:5px; top:5px;position:absolute;" src="${ctx}/images/<%=img.substring(0,img.indexOf("."))%>${picsize}<%=img.substring(img.indexOf("."),img.length())%>"/>
	 		    	</a>-->
	 		    	<%}%>
	 		    	<a href="${ctx}/${temp}<%=rus.getId()%>.html">
	 		    	  <img style="left:5px; top:5px;position:absolute;" src="${ctx}/images/<%=rus.getImage()%>"/>
	 		    	</a>
	 		    	<div style=" width:130px; left:160px; top:10px; position:absolute;"> 
						<%  String title=null;  
							if(rus.getMerchandiseName().length()>16) 
								title = rus.getMerchandiseName().substring(0,15);
							else
								title = rus.getMerchandiseName();
						%>
						<%=title %>
					</div>
					<div style=" width:134px; height:42px; left:160px; top:51px; position:absolute; background-image:url(${ctx}/images/title.gif)">
						<b style="left:50px; top:6px;position:absolute; font-size:20px; color:#FF0">￥<%=rus.getRushbuyPrice() %></b>
					</div>
					<div style=" width:130px; height:79px;left:160px; top:93px;position:absolute; background-image:url(${ctx}/images/time.gif)">
						<b style="left:0px; top:20px;position:absolute;text-decoration:line-through"><%=rus.getConsultPrice() %></b>
						<b style="left:65px; top:20px;position:absolute;text-decoration:line-through"><%=rus.getPrice() %></b>
						<b id="TimeCounter_<%=i %>" style="width:130px;left:6px; top:62px;position:absolute;"></b>
						<script type="text/javascript">
							target[target.length]= getDate('<%=rus.getEndTime() %>','yyyyMMddHHmmss').getTime();
       			 			time_id[time_id.length]="TimeCounter_<%=i %>";
						</script>
					</div>
			    </div>
		  </div>
	<% }} %>
	</div>
	<%if(page1==1){ %>
		<img style="left:251px; top:485px; position:absolute;" src="${ctx}/images/pageup.png"/>
		<a href="javascript:gethref(1)"><img style="left:325px; top:485px; position:absolute;" src="${ctx}/images/pagedown.png"/></a>
	<%} else if(page1 < totle1){ %>
		<a href="javascript:gethref(-1)" ><img style="left:251px; top:485px; position:absolute;" src="${ctx}/images/pageup.png"/></a>
		<img style="left:325px; top:485px; position:absolute;" src="${ctx}/images/pagedown.png"/>
	<%} else { %>
		<a href="javascript:gethref(-1)" ><img style="left:251px; top:485px; position:absolute;" src="${ctx}/images/pageup.png"/></a>
		<img style="left:325px; top:485px; position:absolute;" src="${ctx}/images/pagedown.png"/>
	<%}%>
</div>
</body>
</html>