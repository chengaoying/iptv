<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.novel.iptv.model.hibernate.Tb_merchandise_image"%>
<%@page import="com.novel.iptv.model.hibernate.Tb_merchandise_info"%>
<%  String path = request.getContextPath();	
	List info =(List)request.getAttribute("info");
	List img =(List)request.getAttribute("img");
		Object size =session.getAttribute("page");
	Tb_merchandise_info m_info = new Tb_merchandise_info();
	int p =1;
	if((Integer)request.getAttribute("page")!=null)
		p=(Integer)request.getAttribute("page");
	String t_img =(String)request.getAttribute("img_tit");
%>
<html>
<head><title>商品购买</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/style/css.css" />
	<script src="<%=path%>/style/js.js" type="text/javascript"></script>
</head>
<script type="text/javascript">
function submit(id) {
	var form =document.getElementById("thisForm");
	form.action="<%=path%>/userCart.do?method=addCart&productCode="+id+"&pageNo=1";
	form.submit();
}

Box.PAGEUP="<%=path%>/header.do?method=headFind&id_three=<%=m_info.getSort_id()%>&id_two=<%=session.getAttribute("tit_two").toString() %>&name=<%=session.getAttribute("one") %>&page=<%=p-1 %>";
Box.PAGEDOWN="<%=path%>/header.do?method=headFind&id_three=<%=m_info.getSort_id()%>&id_two=<%=session.getAttribute("tit_two").toString() %>&name=<%=session.getAttribute("one") %>&page=<%=p+1 %>";	

</script>
<body onload="init('d')">
	<div class="body">
		
		<jsp:include page="../head.jsp"></jsp:include>
		<img style="left: 10px; top: 58px; position: absolute;" src="${ctx}/images/phone.png" />
		<% if(t_img!=null){%>
			<img style="left: 23px; top: 81px; position: absolute; src="<%=t_img %>" />
		<%}if(info!=null) {%>
			<table style="left: 10px; top: 148px; position: absolute;" cellspacing=0; cellpadding=0;>
			<%for(int i=0;i<info.size();i++){
				m_info = (Tb_merchandise_info)info.get(i);
				String image_path="";
				if(i<img.size()){
					 image_path =(String)img.get(i);
				}
				if(i%3==0){%>	
				<tr><td><%}else{ %><td><%} %>
				
					<table style=" width: 180px; height: 164px; float: left;" cellspacing=0; cellpadding=0;>
						<tr>
							<td style="width: 75px; height: 101px;">
									<img src="images/<%=image_path %>" width="77" height="102"/>
							</td>
							<td style="height:55px;">
								<div><b style="color: #FFF; font-size: 14px;"><%=m_info.getName() %></b></div>
		  					</td>
						</tr>
						
						<tr>
							<td style="vertical-align:middle; text-align: center;">
								<A id="d" href="${ctx}/detail.do?method=detail&id=<%=m_info.getCode() %>"><img src="${ctx}/images/xq.png"></a>
								<%--<div style="display:none">
								<input name="num" type="hidden" value="1">
								<input name="name" type="text" value="<%=m_info.getName() %>">
								<input name="price" type="hidden" value="<%=m_info.getPrice()%>"></div>
								<input name="num2" type="hidden"" value="-1">--%>
							
							</td>
								<td>
								<div style="height:20px;text-align: center;"><b style="color: #FFF; font-size: 14px; ">原价：<%=m_info.getConsult_price() %></b></div>
								
								<div style="height:20px;text-align: center;"><b style="color: #ff6600; font-size: 16px;">现价：<%=m_info.getPrice()%></b></div>
							</td>
						</tr>
					</table>
					
				 <%if(i%3==2||i==info.size()){ %>
					 </td>
				</tr><% }else{%></td><%}}%>
			</table>
		<%} if(session.getAttribute("tit_two")!=null&&session.getAttribute("one")!=null&&size!=null){ 
				if(p!=1){ %>
		<a href="<%=path%>/header.do?method=headFind&id_three=<%=m_info.getSort_id()%>&id_two=<%=session.getAttribute("tit_two").toString() %>&name=<%=session.getAttribute("one") %>&page=<%=p-1 %>">
		<img style="left: 119px; top: 478px; position: absolute;" src="${ctx}/images/pageup.png" /></a>
		<%}else{ %>
		<a href="#"><img style="left: 119px; top: 478px; position: absolute;" src="${ctx}/images/pageup.png" /></a>
		<%} %>
		<div style="left: 210px; top: 484px; position: absolute; width: 130px; height: 30px;font-size:18px;color:white;">	<%=p%>/<%=size%></div>
		<%if(p!=(Integer)size){ %>
		<a href="<%=path%>/header.do?method=headFind&id_three=<%=m_info.getSort_id()%>&id_two=<%=session.getAttribute("tit_two").toString() %>&name=<%=session.getAttribute("one") %>&page=<%=p+1 %>">
		<img style="left: 282px; top: 478px; position: absolute;" src="${ctx}/images/pagedown.png" /></a>
		<%}else{ %>
		<a href="#"><img style="left: 282px; top: 478px; position: absolute;" src="${ctx}/images/pagedown.png" /></a>
		<%} %>
		<a href="javascript:history.go(-1)"><img style="left: 369px; top: 478px; position: absolute;" src="${ctx}/images/back.png" /> </a>
		<a href="<%=path%>/userCart.do?method=selectCartItem&pageNo=1"><img style="left: 449px; top: 478px; position: absolute;" src="${ctx}/images/Settlement.png"/></a>
		<%} %>
	</div>
</body>
</html>
