
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<link rel="stylesheet" type="text/css" href="${ctx}/style/css.css" />
<script src="${ctx}/myjs/group/g_list.js" type="text/javascript"></script>
<script src="${ctx}/myjs/DateUtil.js" type="text/javascript"></script>
</head>
<body>
<div class="body">
<#include "MenuItems.ftl">
	<img style="left:10px;top:58px; position:absolute;" src="${ctx}/images/phone.png"/>
	<div style="left:126px;top:62px; position:absolute; width:504px; height:32px; background-image:url(${ctx}/images/title2.png)">
		<div style="left:15px;top:2px; position:absolute; width:95px; height:28px; background-image:url(${ctx}/images/choose.png);text-align:center">团购</div>
	</div>
	<div style="left:18px; top:112px; position:absolute;">
			<#list ruslist as merlist>
	 　　	<#assign mer = merlist>
			<#macro greet left,top>
				<div style="left:${left}px; top:${top}px; position:absolute;">
			</#macro>
			 <#if merlist_index==0>
			 	<@greet left=0 top=0/>
			 <#elseif merlist_index==1>
			 	<@greet left=310 top=0/>
			 <#elseif merlist_index==2>
				<@greet left=0 top=188/>
			 <#else> 
				<@greet left=310 top=188/>
			 </#if>
				<div style="background-image:url(${ctx}/images/gb_group.gif); width:297px; height:176px">
				  	<a href="${ctx}/${temp}${mer.id}.html">
					  	<img style="left:5px; top:5px;position:absolute;" src="${ctx}/images/${mer.image}"/>
					</a>
					<div style=" width:130px; left:160px; top:10px; position:absolute;"> 
						<#if mer.merchandiseName?length lt 16>   
							${mer.merchandiseName}
						<#else>
							${mer.merchandiseName[0..16]}
						</#if>
					</div>
					<div style=" width:134px; height:42px; left:160px; top:51px; position:absolute; background-image:url(${ctx}/images/title.gif)">
						<b style="left:50px; top:6px;position:absolute; font-size:20px; color:#FF0">￥${mer.rushbuyPrice}</b>
					</div>
					<div style=" width:130px; height:79px;left:160px; top:93px;position:absolute; background-image:url(${ctx}/images/time.gif)">
						<b style="left:0px; top:20px;position:absolute;text-decoration:line-through">${mer.consultPrice}</b>
						<b style="left:65px; top:20px;position:absolute;text-decoration:line-through">${mer.price}</b>
						<b id="TimeCounter_${merlist_index}" style="width:130px;left:6px; top:62px;position:absolute;"></b>
						<script type="text/javascript">
							target[target.length]= getDate('${mer.endTime}','yyyyMMddHHmmss').getTime();
       			 			time_id[time_id.length]="TimeCounter_${merlist_index}";
						</script>
					</div>
				</div>
			</div>
		</#list>
	</div>
			<img style="left:251px; top:485px; position:absolute;" src="${ctx}/images/pageup.png">
			<#if page==1>
				<img style="left:325px; top:485px; position:absolute;" src="${ctx}/images/pagedown.png">
			<#else>
				<a href="javascript:gethref()"><img style="left:325px; top:485px; position:absolute;" src="${ctx}/images/pagedown.png"></a>
			</#if>
</div>
</body>
</html>
<script>
function gethref(){
		window.location.href="${ctx}/group.do?method=querylist&page=${page}";
}
</script>