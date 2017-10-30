<html>
<body>
<jsp:useBean id="u1" class="beans.reg_bean" scope="request"/>
<h1>DETAILS INSERTED</h1>
<jsp:getProperty name="u1" property="user"/>
<jsp:getProperty name="u1" property="pas"/>
<jsp:getProperty name="u1" property="em"/>
<jsp:getProperty name="u1" property="phone"/>
</body>
</html>