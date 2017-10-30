<html>
<body>
	<%@ page import="java.sql.*"%>
	<%String uname=request.getParameter("nm");
	String pas=request.getParameter("pwd");
	String em=request.getParameter("eid");
	int phone=Integer.parseInt(request.getParameter("contact"));
	try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			PreparedStatement ps=c.prepareStatement("insert into register values(?,?,?,?)");
				ps.setString(1,uname);
				ps.setString(2,pas);
				ps.setString(3,em);
				ps.setInt(4,phone);
				int i=ps.executeUpdate();
			c.commit();
			out.println("registration success!");
			ps.close();
			c.close();
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}%>
</body>
</html>