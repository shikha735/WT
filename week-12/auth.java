import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class auth extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String username=req.getParameter("uname");
		String password=req.getParameter("pwd");
		
		Cookie ck[]=req.getCookies();
		if(ck!=null)
		{
			boolean flag=false;
			for(int i=0;i<ck.length;i=i+1)
			{
				
				if((username.equals(ck[i].getName()))&&(password.equals(ck[i].getValue())))
				{
					
				
						flag=true;
						break;
					
				}
			}
			if(flag==true)
				out.println("valid user");
			else
				out.println("Invalid user");
		}
		else
			out.println("No cookies Found");
	}
}