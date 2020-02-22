package vjit;

import java.util.Scanner;

 class Thanos {
	public static void main(String[] args)
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		String name1=name;
		for(i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
			char c=name.charAt(i);
			char n=Character.toUpperCase(c);
			System.out.print(n);
			
			}
			else
			{
				System.out.print(name.charAt(i));
			
			}
			
		}
	
				
	}

}
