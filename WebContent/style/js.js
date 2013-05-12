function init(id){    
	  var ctrl=document.getElementById(id);    
	  ctrl.focus();    
	  }    


function cartCheck(){
	var codelist = document.getElementById("codeid").value.split(",");
	var numcount = document.getElementById("numcount").value.split(",");
	var totlecount = 0;
	for(var i=0;i<codelist.length;i++){
		var price = document.getElementById("price"+i).innerHTML;
		var num = document.getElementById("num"+i).value;
		var value = document.getElementById("price"+i).innerHTML * document.getElementById("num"+i).value;
		alert(value);
		document.getElementById("totle"+i).innerHTML = value;
		totlecount += value;
		numcount[i] = document.getElementById("num"+i).value;
		document.getElementById("numcount").value = numcount;
		document.getElementById("totlecount").innerHTML = praseFloat(totlecount);
	}
	
}
var Box = {
	    "PAGEUP": "",    //上页
	    "PAGEDOWN": "",    //下页
	    "BACK": "",    //返回
	    "ZERO": "",    //数字0
	    "ONE": "",    //数字1
	    "TWO": "",    //数字2
	    "THREE": "",    //数字3
	    "FOUR": "",    //数字4
	    "FIVE": "",    //数字5
	    "SIX": "",    //数字6
	    "SEVEN": "",    //数字7
	    "EIGHT": "",    //数字8
	    "NINE": "",   //数字9
	    "LEFT": "",    //左
	    "UP": "",     //上
	    "RIGHT": "",   //右
	    "DOWN": ""    //下
	}
	/*
	HW盒子按键Javascript脚本
	*/
	var HW = {
	    "ZERO": 0x0030, //数字0
	    "ONE": 49, //数字1
	    "TWO": 50, //数字2
	    "THREE": 51, //数字3
	    "FOUR": 52, //数字4
	    "FIVE": 53, //数字5
	    "SIX": 54, //数字6
	    "SEVEN": 55, //数字7
	    "EIGHT": 56, //数字8
	    "NINE": 57, //数字9
	    "PAGEUP": 33, //上页
	    "PAGEDOWN": 34, //下页
	    "BACK": 0x0008, //返回
	    "LEFT": 37, //左
	    "UP": 38, //上
	    "RIGHT": 39, //右
	    "DOWN": 40 //下
	}

	/*
	ZTE盒子按键Javascript脚本
	*/
	var ZTE = {
	    "ZERO": 48, //数字0
	    "ONE": 49, //数字1
	    "TWO": 50, //数字2
	    "THREE": 51, //数字3
	    "FOUR": 52, //数字4
	    "FIVE": 53, //数字5
	    "SIX": 54, //数字6
	    "SEVEN": 55, //数字7
	    "EIGHT": 56, //数字8
	    "NINE": 57, //数字9
	    "PAGEUP": 301, //上页
	    "PAGEDOWN": 302, //下页
	    "BACK": 126, //返回
	    "LEFT": 271, //左
	    "UP": 269, //上
	    "RIGHT": 272, //右
	    "DOWN": 270 //下
	}


	/*
	UT盒子按键Javascript脚本
	*/
	var UT = {
	    "ZERO": 48, //数字0
	    "ONE": 49, //数字1
	    "TWO": 50, //数字2
	    "THREE": 51, //数字3
	    "FOUR": 52, //数字4
	    "FIVE": 53, //数字5
	    "SIX": 54, //数字6
	    "SEVEN": 55, //数字7
	    "EIGHT": 56, //数字8
	    "NINE": 57, //数字9
	    "PAGEUP": 86, //上页
	    "PAGEDOWN": 85, //下页
	    "BACK": 8, //返回
	    "LEFT": 37, //左
	    "UP": 38, //上
	    "RIGHT": 39, //右
	    "DOWN": 40 //下
	}

	//Modified by gongjingyi at 2009/6/17
	//默认按0,back键返回
	//触发onkeypress事件
	document.onkeypress = KeyAction;

	//Modified by gongjingyi at 2009/1/6
	function getUrl(keyCode)//根据健值获取对应的url
	{
	    //查看hw对应键值
	    for (var item in HW) {
	        if (HW[item] == keyCode) {
	            return Box[item];
	        }
	    }

	    //查看zte对应键值
	    for (var item in ZTE) {
	        if (ZTE[item] == keyCode) {
	            return Box[item];
	        }
	    }

	    //查看ut对应键值
	    for (var item in UT) {
	        if (UT[item] == keyCode) {
	            return Box[item];
	        }
	    }

	    //如果没有对应键值，则返回undefined
	    return "undefined";
	}

	function KeyAction() {
	    var evt = evt ? evt : window.event;
	    var keyCode = evt.which ? evt.which : evt.keyCode;
	    var _url = getUrl(keyCode);
	    if (_url != "undefined" && _url != undefined)
	        gotoURL(_url);
	}

	function gotoURL(URL)//跳转
	{
	    if (URL.toLowerCase() != "back") {
	        if (URL != "") { window.location.href = URL; }
	    }
	    else {
	        history.go(-1);
	    }
	}