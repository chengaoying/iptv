//购物车价格记总
function cartCheck(){
	var codelist = document.getElementById("codeid").value.split(",");
	var numcount = document.getElementById("numcount").value.split(",");
	var totlecount = 0;
	for(var i=0;i<codelist.length;i++){
		var price = document.getElementById("price"+i).innerHTML;
		var num = document.getElementById("num"+i).value;
		var value = document.getElementById("price"+i).innerHTML * document.getElementById("num"+i).value;
		document.getElementById("totle"+i).innerHTML = value;
		totlecount += value;
		numcount[i] = document.getElementById("num"+i).value;
		document.getElementById("numcount").value = numcount;
		document.getElementById("totlecount").innerHTML = praseFloat(totlecount);
		alert(parseFloat(totlecount));
	}
	
}
//单击确定键 还原默认值为1
