<html>
<body>
<jsp:useBean id="u1" class="beans.reg_bean" scope="request"/>
<jsp:setProperty name="u1" property="user" param="nm"/>
<jsp:setProperty name="u1" property="pas" param="pwd"/>
<jsp:setProperty name="u1" property="em" param="eid"/>
<jsp:setProperty name="u1" property="phone" param="contact"/>
<jsp:setProperty name="u1" property="data" value="false"/>
<% 
if(u1.getData())
	{ 
%>
<jsp:forward page="user_view.jsp"/>
<% 
}
else
   {
	out.println("failed");
   }
%>

</body>
</html>