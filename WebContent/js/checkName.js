function message() {
	var x="<%=error%>";
	if(x!=null){
		alert(x);
		return false;
	}
	return true;
}