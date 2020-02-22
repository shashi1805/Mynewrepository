package jdbcpack;
import java.sql.*;


public class samplejdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","connect");
					Statement s=con.createStatement();
					String sql="select * from employee";
		            ResultSet rs=s.executeQuery(sql);
		            while(rs.next())
		            {
		            	int empid=rs.getInt(1);
		            	String empName=rs.getString(2);
		            	float empSal=rs.getFloat(3);
		            	Date empDoj=rs.getDate(4);
		            	System.out.println(empid+" "+empName+" "+empSal+" "+empDoj);
		            }
		            s.close();
		            rs.close();
		            con.close();
		}
		catch(Exception e)
		{
			System.out.println("error"+e.getMessage());
		}

	}

}
