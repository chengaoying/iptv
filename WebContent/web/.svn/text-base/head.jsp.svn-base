<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.novel.iptv.model.hibernate.Tb_sort"%>
<%@page import="com.novel.iptv.util.ConstConfig"%>
<%@ include file="common/Taglibs.jsp"%>
<%	String path=request.getContextPath();
	 	String one =null;
	 	List two = null;
	 	List three =null;
	 	//String[] menuItems = ConstConfig.menuItems.split(",");
	 	
	 	if(session!=null){
		 	one=(String)session.getAttribute("one");
		 	two =(List)session.getAttribute("two");
		 	three =(List)session.getAttribute("three");
		 }
	 	//String re_two=(String)request.getAttribute("re_two");
%>
<div style="left:425px;top:9px; position:absolute; width: 69px; height: 20px; z-index:1;"><a href="${ctx}/web/help/xinshou.jsp"><b style="color:#FFF">新手指引</b></a></div>
    	<div style="left:534px;top:9px; position:absolute; width: 69px; height: 20px; z-index:1;"><a href="<%=path%>/web/order/order.jsp"><b style="color:#FFF">我的账户</b></a></div>
<% if (one=="0"||one==null){   %>
	<div style="left:126px;top:21px; position:absolute; width: 494px; height: 35px;"><img id="title" src="${ctx}/images/0.png" />
<%}else if(request.getAttribute("isGo")==null) {%>
	<div style="left:126px;top:21px; position:absolute; width: 494px; height: 35px;"><img id="title" src="${ctx}/images/1.png" />
<% }else{ %>
	<div style="left:126px;top:21px; position:absolute; width: 494px; height: 35px;"><img id="title" src="${ctx}/images/<%=one%>.png" />
<%} %>
 	<a href="<%=path%>/index.html"><img src="${ctx}/images/empty.gif" style="left:0px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
 	<a href="<%=path%>/header.do?method=headFind&name=fashion"><img src="${ctx}/images/empty.gif" style="left:66px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
 	<a href="<%=path%>/header.do?method=headFind&name=momTochild"><img src="${ctx}/images/empty.gif" style="left:135px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
 	<a href="<%=path%>/header.do?method=headFind&name=oldman"><img src="${ctx}/images/empty.gif" style="left:214px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
 	<a href="<%=path%>/header.do?method=headFind&name=family"><img src="${ctx}/images/empty.gif" style="left:294px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
  	<a href="${ctx}/html/glist.html"><img src="${ctx}/images/empty.gif" style="left:374px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
   	<a href="<%=path%>/userCart.do?method=selectCartItem&pageNo=1"><img src="${ctx}/images/empty.gif" style="left:444px;top:8px; position:absolute; width:58px; height: 32px;" /></a>
 </div>

 <% 
if(two!=null&&one.length()>1&&request.getAttribute("isGo")!=null){
	 %>
		<div id="tit_son" style="left:126px;top:63px; position:absolute; background-image: url('${ctx}/images/son_title.png');width:504px; height:56px;">
			<%int x=5;
			for(int i=0;i<two.size();i++){ 
				
				if(i>5){break;}
					Tb_sort t_two =(Tb_sort)two.get(i);
					String name ="";					
					if(t_two.getName().length()>5)
						name=t_two.getName().substring(0,5);
					else
						name =t_two.getName();
					if(session.getAttribute("tit_two").toString().equals(t_two.getId())) {%>
						<div style="left:<%=x%>px;top:2px;background-image:url('${ctx}/images/choose.png'); position:absolute;width:95px; height:28px;">
							<a class="a_click"href="<%=path%>/header.do?method=headFind&id_two=<%=t_two.getId()%>&&name=<%=one%>"><b class="tit_font2"><%=name%>  </b></a>
						</div>
					<%}else{%>
						<div style="left:<%=x%>px;top:2px; position:absolute;width:95px; height:28px;">
							<a class="a_font" href="<%=path%>/header.do?method=headFind&id_two=<%=t_two.getId()%>&&name=<%=one%>"><b class="tit_font2"><%=name%></b></a>
						</div>	
			<% }x+=75;} %>
			
			<%
 
			if(three.size()>0){
				int y=5;
				for(int i=0;i<three.size();i++){
						if(i>5){break;}
						Tb_sort t_three =(Tb_sort)three.get(i); 
						String name ="";					
						if(t_three.getName().length()>5)
							name=t_three.getName().substring(0,5);
						else
							name =t_three.getName();%>
						<% if(session.getAttribute("tit_three").toString().equals(t_three.getId())){%>
							<div style="left:<%=y%>px;top:28px; position:absolute;width:95px; height:28px;">
									<a class="a_click" href="<%=path%>/header.do?method=headFind&id_three=<%=t_three.getId()%>&id_two=<%=session.getAttribute("tit_two").toString() %>&name=<%=one%>"><b class="tit_font2"><%=name%></b></a>
							</div>
							<%}else{ %>
							 <div style="left:<%=y%>px;top:28px; position:absolute;width:95px; height:28px;">
									<a class="a_font" href="<%=path%>/header.do?method=headFind&id_three=<%=t_three.getId()%>&id_two=<%=session.getAttribute("tit_two").toString() %>&name=<%=one%>"><b class="tit_font2"><%=name%></b></a>
							</div>
					<%}y+=75;}
				}else{ %>
				<div style="left:100px;top:200px;position:absolute;"><b style="color:yellow;">很抱歉，该类别下暂时还没有商品...</b></div>
				<%} %>
		</div>	
<%-- }if(one.equals("123456")){%>

		<div id="tit_son" style="left:126px;top:63px; position:absolute; display:block; background-image: url('images/title2.png');width:504px; height:32px;">
			<div style="left:5px;top:2px; position:absolute;background-image: url('images/choose.png'); width:95px; height:28px;">
				<b class="tit_font2">特惠</b> 	
			</div>	
	</div>--%>
<%} %>