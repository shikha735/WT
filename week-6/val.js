function validate()
{
	var n=reg.nm.value;
	var p=reg.pwd.value;
	var e=reg.eid.value;
	var phno=reg.contact.value;
	var ad=reg.add.value;
	if(n==""||n==null)
		alert("Enter name");
	else if(!nval(n))
		alert("Enter valid name");
	else if(p==""||p==null)
		alert("Enter password");
	else if(!pval(p))
		alert("Enter valid password");
	else if(e==""||e==null)
		alert("Enter email id");
	else if(!eval(e))
		alert("Enter valid email id");
	else if(phno==""||phno==null)
		alert("Enter phone number");
	else if(!phnoval(phno))
		alert("Enter valid phone number");
	else if((reg.gender[0].checked==false)&&(reg.gender[1].checked==false))
		alert("Select gender");
	else if(reg.dob_day.value=="-")
		alert("Select DOB day");
	else if(reg.dob_month.value=="-")
		alert("Select DOB month");
	else if(reg.dob_year.value=="-")
		alert("Select DOB year");
	else if((reg.langs[0].checked==false)&&(reg.langs[1].checked==false)&&(reg.langs[2].checked==false)&&(reg.langs[3].checked==false))
		alert("Select Languages");
	else if((ad=="")||(ad==null))
		alert("Enter Address");
}
function nval(n)
{
	var npat=/^[a-zA-Z]{6,15}$/;
	return npat.test(n);
}
function pval(p)
{
	var ppat=/^[a-zA-Z0-9]{6,15}$/;
	return ppat.test(p);
}
function eval(e)
{
	var epat=/^[a-zA-Z0-9_.]+@([a-zA-Z0-9]+.)+[a-zA-Z]{2,4}$/;
	return epat.test(e);
}
function phnoval(phno)
{
	var phpat=/^[0-9]{10}$/;
	return phpat.test(phno);
}


