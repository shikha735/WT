import java.sql.*;
import java.io.*;
public class modtable
{
	static final String JDBC_Driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="system";
	static final String pass="manager";
	public static void main(String[] args) 
	{
		Connection c;
		Statement s;
		ResultSet rs;
		try
		{
			int n;
			Class.forName(JDBC_Driver);
			System.out.println("Connecting to database");
			c=DriverManager.getConnection(DB_URL,user,pass);
			System.out.println("Connected");
			s=c.createStatement();
			System.out.println("Statement created");
			rs=s.executeQuery("select sname from stu_details");
			System.out.println("----------------------------");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			System.out.println("----------------------------");
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
