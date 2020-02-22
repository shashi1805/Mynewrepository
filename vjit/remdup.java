
package vjit;

import java.util.Scanner;

public class remdup {
	Scanner s=new Scanner(System.in);
	String name=s.nextLine();
	int x,y=0,m=1,count=0;
	int length=name.length();
	char arr2[]=new char[length];

	void remdup()
	{
		arr2[0]=name.charAt(0);
		for(int x=1;x<length;x++)
		{
			y=0;
			count=0;
			
			while(y<x)
			{
				if(name.charAt(y)!=name.charAt(x))
				count++;
				y++;
				
		}
			if(count==x)
			{
				arr2[m]=name.charAt(x);
				m++;
			}
			/*
			  else m=m;
			 */	
		}
		for(int i=0;i<length;i++)
			System.out.print(arr2[i]);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remdup a=new remdup();
		a.remdup();

	

	}

}
