import java.sql.*;
import java.io.*;
public class instable
{
	static final String JDBC_Driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="system";
	static final String pass="manager";
	public static void main(String[] args) 
	{
		Connection c;
		PreparedStatement ps;
		try
		{
			Class.forName(JDBC_Driver);
			System.out.println("Connecting to database");
			c=DriverManager.getConnection(DB_URL,user,pass);
			System.out.println("Connected");
			ps=c.prepareStatement("insert into stu_details values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			do
			{
				System.out.println("enter sid:");
				int id=Integer.parseInt(br.readLine());
				System.out.println("enter sname:");
				String stuname=br.readLine();
				System.out.println("enter phone number:");
				int ph=Integer.parseInt(br.readLine());
				ps.setInt(1,id);
				ps.setString(2,stuname);
				ps.setInt(3,ph);
				int i=ps.executeUpdate();
				System.out.println("continue(y/n)");
				String s=br.readLine();
				if(s.startsWith("n"))
				{
					break;
				}
			}while(true);
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
