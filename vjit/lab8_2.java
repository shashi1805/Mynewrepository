package vjit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab8_2 {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		//File t= new File("/C:/Users/my/Documents/numbers.txt");
		
		Scanner s=new Scanner(new File("/C:/Users/my/Documents/numbers.txt"));
		String ss=s.nextLine();
		//System.out.println("s is"+ss);
		
		//Scanner sc=new Scanner(ss);
		//System.out.println(sc.hasNext());
		int i=0;
		Scanner sc=new Scanner(ss);
		while(sc.hasNext())
		{
			/*if(ss.charAt(i)!=',')
			{
			   //System.out.println("ghj");
			   char c=ss.charAt(i);*/
			sc.useDelimiter(",");
				int n=Integer.parseInt(sc.next());
				//System.out.print(n);
				if(n%2==0)
					System.out.print(n);
				
			}
		

			
		}
		
	}


