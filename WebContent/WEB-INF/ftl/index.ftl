<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title></title>
	<link rel="stylesheet" type="text/css" href="${ctx}/style/css.css" />
	<script src="${ctx}/style/js.js" type="text/javascript"></script>
  </head>
  
  <script language="javascript">
// 响应onkeypress事件
window.document.onkeypress = function( keyEvent ) 
{
		keyEvent = keyEvent ? keyEvent : window.event;
		var keyvalue = keyEvent.which ? keyEvent.which : keyEvent.keyCode;

		// 处理“返回键”
		if ( keyvalue == 0x0008 )
		{
			//关闭窗口视频
			stop();

			// 页面跳转
		}
}

		// 用于页面跳转时关闭视频播放窗口
function stop()
		{
			window.frames["if_smallscreen"].stop();
		}
</script>
  
  
  <body onload="init('img_id')">
  	<div class="index">
	<img style="left:10px;top:58px; position:absolute;" src="${ctx}/images/phone.png"/>
	
<#include "MenuItems.ftl">
        
        <div id="smallvod" style="left:17px;top:85px; position:absolute; width:489px; height: 365px;">

        <script language="javascript">

                var epgdomain = Authentication.CTCGetConfig( "EPGDomain" );

                var last = epgdomain.lastIndexOf("/");

                var host = epgdomain.substr( 0, last );

                   document.write( "<iframe name=\"if_smallscreen\" width=\"489\" height=\"365\" src=\"" );

                   document.write( host );

                   document.write( "/MediaService/SmallScreen?ContentID=00000000000000010020110711000002&"+"Left=17&Top=85&Width=489&Height=365&CycleFlag=1\" " );

                   document.write( " frameborder=\"no\" scrolling=\"no\"></iframe>" );
         </script>

</div>

  		<#list resAD as ad1>
  		   <#list ad1.getAdvertList() as adlist1>
	  				<div style="left:521px;top:${11+((adlist1_index+1)*73)}px; position:absolute; width: 105px; height: 68px;">
	  					<a id="img_id" href="${ctx}/${adlist1.link}"><img src="${ctx}/images/${adlist1.pic}" width: 105px; height: 68px;/></a>
	  				</div>
  		   </#list>
  		</#list>
  		<#list resMall as ad2>
  		   <#list ad2.getAdvertList() as adlist2>
	  		   <a href="${ctx}/${adlist2.link}">
	  		   	<img style="left:${9+(adlist2_index*105)}px;top:465px; position:absolute; width:86px; height: 24px;" src="${ctx}/images/${adlist2.pic}"/>
	  		   </a>
  		   </#list>
  		</#list>
  		<b style="left:10px;top:500px; position:absolute;color:white; vertical-align:top">最新活动: </b>
  		<div style="left:8px;top:500px; position:absolute; width: 625px; height: 28px;"><marquee style="width: 525px; height: 28px; margin-left:80px" ><b style="color:white;"></b></marquee>
	  </div>
	</div>
  </body>
</html>
