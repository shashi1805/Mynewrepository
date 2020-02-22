package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
					Statement s=con.createStatement();
					String sql="delete from details where id=320";
		            ResultSet rs=s.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
