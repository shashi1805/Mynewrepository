package jdbcpack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class lab10_11 {
	public static void main(String ags[]) throws IOException
	{
		Properties p=new Properties();
		FileWriter f=new FileWriter("C:/eclipse_mars2/JDBCProject1/src/jdbcpack/PersonProp.properties");
		p.setProperty("name1", "bharath");
		p.setProperty("name2", "naveen");
		p.store(f, null);
	}

}
