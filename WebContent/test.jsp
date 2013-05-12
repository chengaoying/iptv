<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test video</title>
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


<body>

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

</body>
</html>