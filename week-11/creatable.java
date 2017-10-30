import java.sql.*;
import java.io.*;
public class creatable
{
	static final String JDBC_Driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="system";
	static final String pass="manager";
	public static void main(String[] args) 
	{
		Connection c;
		Statement s;
		try
		{
			int n;
			Class.forName(JDBC_Driver);
			System.out.println("Connecting to database");
			c=DriverManager.getConnection(DB_URL,user,pass);
			System.out.println("Connected");
			s=c.createStatement();
			System.out.println("Statement created");
			n=s.executeUpdate("create table stu_details(sid number(5),sname varchar2(20),phno number(10))");
			if(n==0)
			{
				System.out.println("Table created");
				c.commit();
			}
			s.close();
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
