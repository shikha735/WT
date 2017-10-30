import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class login_auth extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body><h1>Cookies!</h1>");
		Cookie us1=new Cookie("user1","u1");
		Cookie ps1=new Cookie("pass1","p1");
		Cookie us2=new Cookie("user2","u2");
		Cookie ps2=new Cookie("pass1","p2");
		Cookie us3=new Cookie("user3","u3");
		Cookie ps3=new Cookie("pass3","p3");
		Cookie us4=new Cookie("user4","u4");
		Cookie ps4=new Cookie("pass4","p4");
		res.addCookie(us1);
		res.addCookie(ps1);
		res.addCookie(us2);
		res.addCookie(ps2);
		res.addCookie(us3);
		res.addCookie(ps3);
		res.addCookie(us4);
		res.addCookie(ps4);
		out.println("created</body></html>");
		out.close();
	}
}
