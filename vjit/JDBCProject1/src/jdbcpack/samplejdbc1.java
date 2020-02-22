package jdbcpack;
import java.sql.*;
public class samplejdbc1
{
public static void main(String[] args)
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");

Statement stmt = con.createStatement();

String sql = "select * from memo";

ResultSet rs = stmt.executeQuery(sql);

System.out.println("memo Details:");
System.out.println("==========================================");

while(rs.next())
{
int sl_no = rs.getInt(1);
String  subject_code = rs.getString(2);
String  subject_title = rs.getString(3);
int total_marks = rs.getInt(4);
String  result = rs.getString(5);
int credits = rs.getInt(6);
String grade = rs.getString(7);

System.out.println(sl_no+"\t"+subject_code+"\t"+subject_title+"\t\t\t\t"+total_marks+"\t"+result+"\t"+credits+"\t"+grade);
}
stmt.close();
rs.close();
con.close();
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}

