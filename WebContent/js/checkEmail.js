      var xmlHttp;
    function cheeckName(obj) {
		      var name=obj.value;
		      xmlHttp=new XMLHttpRequest();
		      console.log('失去焦点');
		      var url="CheckNameServlet?names=" + name;
		  
		      xmlHttp.open("POST",url);
		      
		      xmlHttp.onreadystatechange = processResult;
		      
		      xmlHttp.send();
	}
    //根据 
    function processResult() {
    	console.log('1231');
		    if(xmlHttp.readyState==4 && xmlHttp.status==200){
		    	console.log('9999');
		    	/* var x=xmlHttp.resposeText;
		    	var jsonStr=eval("("+x+")");
		    	document.getElementById('msg').innerHTML=jsonStr.code+":"+jsonStr.msg; */
		    	var x=xmlHttp.responseText;
		    	console.log(x);
		    	document.getElementById('msg').innerHTML=x;
		    }
		    
	}