//比较活动时间，是否开始活动。
function equesDate(sDate,eDate,vName){ 
	var vDate = new Date().format('yyyyMMddhhmmss');
	if(vDate < sDate) {
	    document.getElementById(vName).innerHTML="开始时间为："+getDate(sDate,'yyyyMMddHHmmss').format('yyyy-MM-dd hh:mm:ss'); 
	}else if(vDate > sDate && vDate < eDate){
	    var longTime = getDate(eDate,'yyyyMMddHHmmss').getTime() - getDate(vDate,'yyyyMMddHHmmss').getTime();
	    target[target.length]=longTime;
	    time_id[time_id.length]=vName;
	}else if(vDate > eDate) {
	    document.getElementById(vName).innerHTML='结束';
	}
}

var target=[] 
var time_id=[] 
/*
  原理:每次和当前时间比较,得到天、小时、分、秒
*/
function show_date_time_0()
{ 
    setTimeout("show_date_time_0()", 1000); 
    for (var i=0,j=target.length;i<j;i++)
    { 
        today=new Date();          
        //计算目标时间与当前时间间隔(毫秒数)
        var timeold=target[i]-today.getTime(); //getTime 方法返回一个整数值，这个整数代表了从 1970 年 1 月 1 日开始计算到 Date 对象中的时间之间的毫秒数。
        //var timeold=target[i];
        //计算目标时间与当前时间的秒数
        var sectimeold=timeold/1000; 
        
        //计算目标时间与当前时间的秒数(整数)
        var secondsold=Math.floor(sectimeold);
        
        //计算一天的秒数 
        var msPerDay=24*60*60*1000; 
       
        //得到剩余天数
        var e_daysold=timeold/msPerDay; 
         //得到剩余天数(整数)
        var daysold=Math.floor(e_daysold); 
        
        //得到剩余天数以外的小时数
        var e_hrsold=(e_daysold-daysold)*24; 
         //得到剩余天数以外的小时数(整数)
        var hrsold=Math.floor(e_hrsold); 
        
        //得到尾剩余分数
        var e_minsold=(e_hrsold-hrsold)*60; 
        //得到尾剩余分数(整数)
        minsold=Math.floor((e_hrsold-hrsold)*60); 
        
        //得到尾剩余秒数(整数)
        seconds=Math.floor((e_minsold-minsold)*60); 
        if (daysold<0) 
        { 
            document.getElementById(time_id[i]).innerHTML='结束'; 
        } 
        else 
        { 
            //天数取三位,不足时前边补0
            if (daysold<10) { daysold="0"+daysold } 
            //天数取三位,不足时前边补0
            //if (daysold<100) { daysold="0"+daysold } 
            
            //小时取两位,不足补0
            if (hrsold<10) { hrsold="0"+hrsold } 
            //分数取两位,不足补0
            if (minsold<10) {minsold="0"+minsold} 
            //秒数取两位,不足补0
            if (seconds<10) {seconds="0"+seconds}
            //小于三天时,字体为红色
            if (daysold<3) { 
                document.getElementById(time_id[i]).innerHTML="<font color=red>"+daysold+"天"+hrsold+"小时"+minsold+"分"+"</font>"; 
            } 
            else 
            { 
                document.getElementById(time_id[i]).innerHTML=daysold+"天"+hrsold+"小时"+minsold+"分"; 
            } 
        }
         
    } 
}
setTimeout("show_date_time_0()", 100); 