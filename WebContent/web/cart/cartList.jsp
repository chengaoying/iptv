<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*, com.novel.iptv.model.hibernate.CartItem"%>
<%@page import="com.novel.iptv.util.BusiUtils"%>
<%@page import="com.novel.iptv.action.cart.mobileSerach"%>
<%@ include file="../common/Taglibs.jsp"%>
<%  String path = request.getContextPath(); 
    int currentPage = Integer.parseInt(((Integer) request.getAttribute("pageNo")).toString());
	int totalPage = Integer.parseInt(((Integer) request.getAttribute("totalPage")).toString());
	List cartItems = (List) request.getAttribute("cartItems");
	String s = request.getAttribute("cardNo").toString();
	System.out.println(s);
	String mobile = mobileSerach.serach(s);
	if(mobile == null ){
		mobile = "";
	}
	System.out.println("mobile:"+mobile);
%>
<html>
<head> 
	<link rel="stylesheet" type="text/css" href="${ctx}/style/css.css" />
	<script src="${ctx}/style/js.js" type="text/javascript"></script>
</head>
<script type="text/javascript">
function submit() {
   var a = document.getElementById("phone").value ;
   if("" == a || null == a){
     document.getElementById("div2").style.display = "block";
     document.getElementById("div3").style.display = "none";
     return;
   } else if(11 != a.length) {
    	   document.getElementById("div2").style.display = "none";
    	   document.getElementById("div3").style.display = "block";
       return;
   }
  this.form1.submit();

}

function reset(){
	document.getElementById("phone").value="";
}

function cartCheck(){
	var codelist = document.getElementById("codeid").value.split(",");
	var numcount = document.getElementById("numcount").value.split(",");
	var totlecount = 0.0;
	for(var i=0;i<codelist.length;i++){
		var price = document.getElementById("price"+i).innerHTML;
		var num = document.getElementById("num"+i).value;
		var value = document.getElementById("price"+i).innerHTML * document.getElementById("num"+i).value;
		alert(value);
		document.getElementById("totle"+i).innerHTML = value;
		totlecount += parseFloat(value);
		numcount[i] = document.getElementById("num"+i).value;
		document.getElementById("numcount").value = numcount;
		document.getElementById("totlecount").innerHTML = totlecount;
	}
	
}

</script>
	<body>
	<form action="${ctx}/userCart.do?method=makeOrder" method="post" id="form1">
		<div class="body">
			<a href="javascript:window.history.go(-1);">
			<img id="img_buck" style="left: 402px; top: 395px; position: absolute;" src="<%=path %>/images/buy_buck.png"> </a>
			<br>
			<img style="left: 10px; top: 58px; position: absolute;" src="${ctx}/images/phone.png" />
			<jsp:include page="../head.jsp"></jsp:include> 
			
			<div style="left: 10px; top: 93px; position: absolute;">
				<table>
					<tr>
						<th height="25px" width="360px" >商品名称</th>
						<th>单价(元)</th>
						<th style="text-align: center">数量</th>
						<th>合计(元)</th>
						<th style="text-align: center">操作</th>
					</tr>

					<%
					Double[] tprice = new Double[totalPage];
					Double totalPrice = 0.0;
					CartItem item=new CartItem();
					String codeid = "",numcount = "";
					String title = null;
					for (int i = 0; i < cartItems.size(); i++) {
						item = (CartItem) cartItems.get(i);
						codeid += item.getCartItemId().trim()+",";
						numcount += item.getCartItemNum()+",";
						//单项总价
						Double itemPrice = BusiUtils.formatDouble(item.getCartItemNum()* item.getCartItemPrice());
						//购物车物品总价
						totalPrice  +=  itemPrice  ;
						if(item.getCartItemName().length()>16) 
							title = item.getCartItemName().substring(0,13);
						else
						 title = item.getCartItemName();
					%>
					<tr>
						<td height="25px" width="210px"><b><%=title%></b></td>
						<td><b id="price<%=i %>"><%=item.getCartItemPrice()%></b></td>
						<td>
							<input name="num<%=i %>" onblur="cartCheck()"  type="text" style="width:45px;" value="<%=item.getCartItemNum()%>" size="4" maxlength="4"/>
							<div style="display:none"><input name="pageNo" type="hidden" value="<%=currentPage%>"/></div>
						</td>
						<td><b id="totle<%=i %>"><%=itemPrice%></b></td>
						<td>
							<a href="<%=path %>/userCart.do?method=deletCartItem&pageNo=<%=currentPage%>&cartItemCode=<%=item.getCartItemId()%>">
								<img src="<%=path %>/images/delete.png"> </a>
						</td>
					</tr>
					<%} %>
					<input id="codeid" name="codeid" type="hidden" value="<%=codeid %>"/>
					<input id="numcount" name="numcount" type="hidden" value="<%=numcount %>"/>
				</table>
			</div>
			<div style="left: 450px; top: 366px; color: #F63; font-size: 24px; position: absolute; width: 159px; height: 24px">
				总额:<b id="totlecount"  style="color: #F63; font-size: 24px"><%=totalPrice%></b>
			</div>
			<%if(currentPage == 1){  %>
		      <a href="#"><img style="left: 159px; top: 395px; position: absolute;" src="<%=path %>/images/buy_up.png"></a> 
			<%} else { %>	
			  	<a href="<%=path %>/userCart.do?method=selectCartItem&pageNo=<%=currentPage - 1%>"><img
					style="left: 159px; top: 395px; position: absolute;"
					src="<%=path %>/images/buy_up.png"> </a>
			<%} %>
			<div style="left: 255px; top: 395px; position: absolute; z-index: 1">
				<b style="color: #FFF; font-size: 30px"><%=currentPage%>/<%=totalPage%></b>
			</div>
			<%  if(currentPage == totalPage){  %>
			<a href="#"><img style="left: 303px; top: 395px; position: absolute;" src="<%=path %>/images/buy_down.png"></a>
			<% } else {   %>
		    <a href="<%=path %>/userCart.do?method=selectCartItem&pageNo=<%=currentPage + 1%>">
		      <img style="left: 303px; top: 395px; position: absolute;" src="<%=path %>/images/buy_down.png"> </a>
			<% }  %>				
			
			<div style="left: 25px; top: 444px; position: absolute; width: 426px; height: 24px">
				<b style="color: #F93; font-size: 14px">请输入您的号码,客服人员会与你进行订单确认</b>
			</div>
			<img style="left: 23px; top: 474px; position: absolute;" src="${ctx}/images/telephone.png">
			<input id="phone" name="phone" value="<%=mobile %>" style="width: 221px; height: 24px; left: 47px; top: 474px; position: absolute;"/>
			<div id="div2" style="display:none; width: 200px; height: 24px; left: 50px;  top:500px; position:absolute; color:yellow; font-size: 18px;"><B>手机号码不能为空!</B></div>
			<div id="div3" style="display:none; width: 200px; height: 24px; left: 50px;  top:500px; position:absolute; color:yellow; font-size: 18px;"><B>请输入正确的手机号码!</B></div>		
			<a href="javascript:submit();">
			 <img style="left: 269px; top: 474px; position: absolute;" src="<%=path %>/images/submit.png">
			</a>
			<a href="javascript:reset();"><img src="<%=path %>/images/re.png" style="left: 349px; top: 474px; width: 75px; height: 26px; position: absolute;"></a>
 			<%-- <input type="reset" name="reset" value=" " style="left: 349px; top: 474px; width: 75px; height: 26px; border: 0px; position: absolute; background: url(<%=path %>/images/re.png);" />--%>
       </div>
     </form>
	</body>
</html>