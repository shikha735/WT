package beans;
import java.sql.*;
public class reg_bean
{
	private String user,pas,em;
	private int phone;
	private Boolean data;
	public void setUser(String u)
	{
		user=u;
	}
	public void setPas(String p)
	{
		pas=p;
	}
	public void setEm(String e)
	{
		em=e;
	}
	public void setPhone(int ph)
	{
		phone=ph;
	}
	public String getUser()
	{
		return user;
	}
	public String getPas()
	{
		return pas;
	}
	public String getEm()
	{
		return em;
	}
	public int getPhone()
	{
		return phone;
	}
	public Boolean getData()
	{
		return data;
	}
	public void setData(Boolean d)
	{
		Connection c;
		PreparedStatement ps;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Connecting to database");
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			//System.out.println("Connected");
			ps=c.prepareStatement("insert into register values(?,?,?,?)");
				ps.setString(1,user);
				ps.setString(2,pas);
				ps.setString(3,em);
				ps.setInt(4,phone);
				int i=ps.executeUpdate();
				if(i>0)
					data=true;
				else
					data=false;
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