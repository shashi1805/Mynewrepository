package vjit;
import java.io.*;
import java.util.*;
public class lab8_1{

	public static void main(String[] args) {
		try
		{
		//	File f=new File("/D:/java capgemini/abc.txt");
			FileReader fr=new FileReader("/C:/Users/my/Documents/shashi.txt");
			ArrayList<Character> al=new ArrayList<Character>();
			FileWriter fw=new FileWriter("/C:/Users/my/Documents/shashi1.txt");
			int c;
			System.out.println(fr);
			while((c=fr.read())!=-1)
			{
				System.out.print((char)c);
			al.add((char)c);
			}
			Collections.reverse(al);
			
			
			for(int i: al)
			{
				//System.out.println((char)i);
				fw.write(i);
			}
		//System.out.println(al);
			fr.close();
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("no file "+e);
		}
	}

}
