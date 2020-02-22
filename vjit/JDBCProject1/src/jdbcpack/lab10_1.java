package jdbcpack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class lab10_1 {
public static void main(String a[]) throws IOException
{
	Properties p=new Properties();
	FileReader f=new FileReader("C:/eclipse_mars2/JDBCProject1/src/jdbcpack/PersonProp.properties");
	p.load(f);
	System.out.println(p);
	System.out.println(p.getProperty("name"));
}
}
