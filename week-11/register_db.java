import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class register_db extends HttpServlet
{
	static final String JDBC_Driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="system";
	static final String pass="manager";
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		Connection c;
		PreparedStatement ps;
		String uname=req.getParameter("nm");
		String pas=req.getParameter("pwd");
		String em=req.getParameter("eid");
		int phone=Integer.parseInt(req.getParameter("contact"));
		try
		{
			Class.forName(JDBC_Driver);
			//System.out.println("Connecting to database");
			c=DriverManager.getConnection(DB_URL,user,pass);
			//System.out.println("Connected");
			ps=c.prepareStatement("insert into register values(?,?,?,?)");
				ps.setString(1,uname);
				ps.setString(2,pas);
				ps.setString(3,em);
				ps.setInt(4,phone);
				int i=ps.executeUpdate();
			c.commit();
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
		}
	}
}
