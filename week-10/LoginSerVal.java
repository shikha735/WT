import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginSerVal extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><head></head></html>");
		out.println("<body><h1>DETAILS</h1>");
		String username=req.getParameter("uname");
		String password=req.getParameter("pwd");
		out.println("USERNAME = "+username);
		out.println("PASSWORD = "+password);
		if((username.equals("admin"))&&(password.equals("admin")))
			out.println("Welcome");
		else
			out.println("Enter Valid details");
		out.close();
	}
}
