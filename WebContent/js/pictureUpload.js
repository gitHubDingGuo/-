  function validate() {
		var headShot=document.getElementById('headShot');
		if(headShot.value==""){
			alert("请上传图像");
			headShot.focus();
			return false;
		}
		return true;
	}