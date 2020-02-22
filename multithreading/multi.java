package multithreading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class multi extends Thread {
	public void run()
	{
		
		try {
			FileReader	f = new FileReader("/C:/Users/my/Documents/source.txt");
			ArrayList<Character> al=new ArrayList<Character>();
			FileWriter fr=new FileWriter("/C:/Users/my/Documents/target1.txt");
			int num=1;
			int ch;
	
			while((ch=f.read())!=-1)
			{
				System.out.print((char)ch);
		        fr.write((char)ch);
				if(num%10==0)
				{
					System.out.println("10 charcters copied");
					sleep(5000);
				}
	             num++;
			}
	
		fr.flush();
		
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
	public static void main(String args[]) throws IOException
	{
		multi thread1=new multi();
		thread1.start();

			}


}
