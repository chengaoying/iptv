<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<link rel="stylesheet" type="text/css" href="${ctx}/style/css.css" />
<script src="${ctx}/myjs/group/g_list.js" type="text/javascript"></script>
<script src="${ctx}/myjs/DateUtil.js" type="text/javascript"></script>
</head>
<body>
<#list resvo as rush>
<div style="left:0px;top:0px; position:absolute;background-image: url('${ctx}/images/bg.jpg'); width: 640px; height: 530px;">
<#include "MenuItems.ftl">
<div style="left:17px;top:89px; position:absolute;background-image: url('${ctx}/images/g_bg.png'); width: 610px; height: 290px;">
    <#list rush.getMdPicList() as pic>
		<#if pic_index==0>
			<img src="${ctx}/images/${pic.merchandisePic[0..pic.merchandisePic?index_of('.')-1]}${picsize}${pic.merchandisePic[pic.merchandisePic?index_of('.')..pic.merchandisePic?length-1]}" style=" left:5px; top:3px; position:absolute; width: 245px; height: 282px;">
		</#if>
	</#list>
        <#if rush.mdDesc?index_of("@") != -1>
        	<div id="ru_content1" style=" left:276px; top:14px; position:absolute; width: 319px; height: 230px;">
        		<b style="color:#FFF;">${rush.mdDesc[0..(rush.mdDesc?index_of("@")-1)]}</b>
        	</div>
        	<div id="ru_content3" style="display:none; left:276px; top:14px; position:absolute; width: 319px; height: 230px;">
	        	<b style="color:#FFF;">${rush.mdDesc[(rush.mdDesc?index_of("@")+1)..(rush.mdDesc?length)-1]}</b>
        	</div>
        <#else> 
        	<div id="ru_content1" style=" left:276px; top:14px; position:absolute; width: 319px; height: 230px;">
        		<b style="color:#FFF;">${rush.mdDesc}</b>
        	</div>
        	<div id="ru_content3" style="display:none; left:276px; top:14px; position:absolute; width: 319px; height: 230px;">
	        	<b style="color:#FFF;"></b>
        	</div>
        </#if>
        <#list merdestail as mer>
        <div id="ru_content2" style="display:none; left:276px; top:14px; position:absolute; width: 319px; height: 230px; ">
        	<b style="color:#FFF;">${mer.shortDesc}</b>
        </div>
        </#list>
        
        <a href="javascript:nextpage(-1);"><img src="${ctx}/images/group_up.png" style=" left:345px; top:250px; position:absolute; width: 76px; height: 32px;"></a>
        <a href="javascript:nextpage(1);"><img src="${ctx}/images/group_down.png" style=" left:425px; top:250px; position:absolute; width: 76px; height: 32px;"></a>
</div>
     <div  style="left:17px;top:385px; position:absolute;background-image: url('${ctx}/images/g_bg2.png'); width: 607px; height: 99px;">
     <div style="left:10px;top:5px; position:absolute;width: 375px; height: 88px;">
     <b style="color:#FF0; font-size:40px">￥${rush.rushbuyPrice}</b>
     <div style="left:150px;top:10px; position:absolute; background-image:url(${ctx}/images/zhe_03.png); width:60px; height:28px;">
     	<b style="color:#FF0; font-size:20px;left:6px;top:3px; position:absolute ">${rush.rushbuyPrice/rush.consultPrice*10}</b></div>
     <div style="width:230px;">
     	<b style="color:#FFF">原价: ￥${rush.consultPrice} 最低团购人数${rush.lowestPersonCount}人已有${rush.havePersonCount}人购买,团购成功! </b>
     </div>
     <div style="width:135px; left:240px; top:45px; position:absolute;"><b style="color:#FFF">剩余时间: </b><br>
     <b id="TimeCounter" style="color:#FF0"></b>
     		<script type="text/javascript">
				target[target.length]= getDate('${rush.endTime}','yyyyMMddHHmmss').getTime();
       			time_id[time_id.length]="TimeCounter";
			</script>
     </div>
     </div>
     <form id="form1" method="post" action="${ctx}/group.do?method=buypush">
	     <div style="left:413px;top:10px; position:absolute;width: 190px; height: 79px;"><b style="color:#FFF">请输入手机号:</b><br>
		     <input id="phone" name="phone" type="text" size="11" />
		     <input name="merCode" type="hidden" value="${rush.merchandiseCode}"/>
		     <input name="haveNum" type="hidden" value="${rush.haveBuyNum}"/>
		     <input name="buyNum" type="hidden" value="${rush.buyNumLimit}"/>
		     <a href="javascript:butSubmit();"><img src="${ctx}/images/qg.png"/></a>
		     <a href="javascript:chear();"><img src="${ctx}/images/group_inp.png"/></a>
	     </div>
     </form>
     </div> 
 </#list>
 <a href="${ctx}/${temp}glist.html"><img src="${ctx}/images/back.png" style="left:300px;top:491px; position:absolute;"></a>
 </div>
 <div id="div2" style="display:none; width: 200px; height: 24px; left: 50px;  top:500px; position:absolute; color:yellow; font-size: 18px;">手机号码不能为空!</div>
 <div id="div3" style="display:none; width: 200px; height: 24px; left: 50px;  top:500px; position:absolute; color:yellow; font-size: 18px;">请输入正确的手机号码!</div>
</body>
</html>
<script type="text/javascript">
function chear(){
	document.getElementById('phone').value='';
}
function butSubmit() {
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

var page=1;
function nextpage(vdiv){
	if(vdiv>0){
		page++;
		if(page>3)
		  page=3;
		
	}else {
		page--;
		if(page<1)
			page=1;
	}
	if(page==1){
		document.getElementById('ru_content1').style.display='block';
		document.getElementById('ru_content2').style.display='none';
		document.getElementById('ru_content3').style.display='none';
	}else if(page==2){
		document.getElementById('ru_content1').style.display='none';
		document.getElementById('ru_content2').style.display='block';
		document.getElementById('ru_content3').style.display='none';
	}else {
		document.getElementById('ru_content1').style.display='none';
		document.getElementById('ru_content2').style.display='none';
		document.getElementById('ru_content3').style.display='block';
	}
}
</script>
