function pagePrev(){ 
		var nowpage = Number(document.getElementById("nowPage").value);
		if(nowpage-1<=0)
			return false;
		document.getElementById("nowPage").value = (nowpage-1);
		document.form1.submit();
	} 
	
	function pageNext(){ 
		var nowpage = Number(document.getElementById("nowPage").value);
		//alert(typeof(nowpage));
		var totalPage = Number(document.getElementById("totalPage").value);
		if(nowpage+1>totalPage)
			return false;
		document.getElementById("nowPage").value = nowpage+1;
		document.form1.submit();
	}
	
	function pageFirst(){     
		document.getElementById("nowPage").value=1;
		document.form1.submit();
	}
	
	function pageLast(){     
		var nowpage = Number(document.getElementById("nowPage").value);
		var totalPage = Number(document.getElementById("totalPage").value);
		document.getElementById("nowPage").value = totalPage;
		document.form1.submit();
	}
	
	function goToPage(){  
		var nowpage = Number(document.getElementById("nowPage").value);
		var totalPage = Number(document.getElementById("totalPage").value);
		var goToPage = Number(document.getElementById("goTOPage").value);
		if(goToPage<=0)
			document.getElementById("nowPage").value=1;
		else if(goToPage>totalPage)
			document.getElementById("nowPage").value=totalPage;
		else
			document.getElementById("nowPage").value=goToPage;
		document.form1.submit();
	}
	
	function select(){
		document.getElementById("nowPage").value=1;
		document.getElementById("totalPage").value=-1;
		document.form1.submit();
	}
