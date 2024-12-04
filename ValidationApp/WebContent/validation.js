function validate()
{
	var name=document.myForm.t1.value;
	var age=document.myForm.t2.value;
	document.myForm.vflag.value="yes";
	
	if(name=="")
	{
		alert("Name is mandatory");
		document.myForm.t1.focus();
		return false;
	}
	if(age=="")
	{
		alert("Age is mandatory");
		document.myForm.t2.focus();
		return false;
	}
	else
	{
		if(isNaN(age))
		{
			alert("Age must be numeric");
			document.myForm.t2.value="";
			document.myForm.t2.focus();
			return false;
		}
	}
	return true;
}