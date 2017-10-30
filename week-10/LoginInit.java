import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginInit extends HttpServlet
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
		ServletConfig config=getServletConfig();
		String upar1=config.getInitParameter("u1");
		String upar2=config.getInitParameter("u2");
		String ppar1=config.getInitParameter("p1");
		String ppar2=config.getInitParameter("p2");
		if((username.equals(upar1))&&(password.equals(ppar1)))
			out.println("Welcome");
		else if((username.equals(upar2))&&(password.equals(ppar2)))
			out.println("Welcome");
		else
			out.println("Enter Valid details");
		out.close();
	}
}
