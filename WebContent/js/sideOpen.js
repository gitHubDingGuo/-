 	window.onload=function(){
		 		var row3=document.getElementsByClassName('row3')[0];
		 		
		 		window.onscroll=function(){
		 			if(document.documentElement.scrollTop>row3.offsetTop-300){
		 				row3.style.transform="translateX(0)";
		 			}
		 		};
		 	};
		 	