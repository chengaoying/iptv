<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  String path = request.getContextPath();
	String uri = request.getHeader("Referer");
%>
<html>
	<head><link rel="stylesheet" type="text/css" href="style/css.css" /></head>

<script type="text/javascript">
function submit() {
   this.form1.submit();
}
</script>
	<body>
		<div class="body">
			<jsp:include page="../common/MenuItem.jsp"></jsp:include>
			<B style="left: 49px; top: 95px; position: absolute; font-size: 20px; color: #FC0">商品名称:趣味真皮系列拼接手提包</B>
			<B style="left: 49px; top: 132px; position: absolute; font-size: 20px; color: #F33">商城价:259.00</B>
			<B style="left: 258px; top: 132px; position: absolute; font-size: 20px; color: #FFF">原价: 279</B>
			<img style="left: 40px; top: 167px; position: absolute;" src="<%=path%>/images/bagxiangqin.png" />
			<div style="left: 281px; top: 164px; position: absolute; width: 300px; height: 295">
				<B style="color: #FFF">产品说明</B>
			</div>
			<div style=" background-image:url(<%=path%>/images/ibuy.png);left:158px; top:482px; position:absolute; width:104px; height:30px">
				<form action="<%=path%>/userCart.do?method=addCart&productCode=49700068&pageNo=1" name="form1" method="post">
				<input name="num" type="text" value="1" style="width: 30px; height: 20px; left: 65px; top: 4px; position: absolute;"/>
				<input type="hidden" name="num2" value="-1"/>
			    <input type="hidden" name="name" value="1321"/>
			    <input type="hidden" name="price" value="12.23"/>
			</form>
			</div>
			<a href="javascript:submit();">
				<img style="left: 276px; top: 482px; position: absolute;" src="<%=path%>/images/buy.png"/>
			</a>
			<a href="javascript:window.history.go(-1);">
				<img style="left: 356px; top: 482px; position: absolute;" src="<%=path%>/images/back.png"/>
			</a>
			<a href="<%=path%>/userCart.do?method=selectCartItem&pageNo=1">
				<img style="left: 440px; top: 482px; position: absolute;" src="<%=path%>/images/Settlement.png"/>
			</a>
		</div>
	</body>
</html>