package vjit;

import java.util.*;
import java.io.*;


public class Stringtoitself {
Scanner s=new Scanner(System.in);
String name=s.nextLine();
String name2=s.nextLine();
int length=name.length();
char arr[]=new char[length];
//char arr2[]=new char[length];
int y=0,m=1,count=0;
void concat()
{
	name=name+name2;
	System.out.print(name);
}
void details()
{
	for(int i=0;i<length;i++)
	{
		if(i%2==0)
			arr[i]='#';
		else
			arr[i]=name.charAt(i);
		
	}
}
/*void remdup()
{
	arr2[0]=name.charAt(0);
	for(int x=1;x<length;x++)
	{
		while(y<x)
		{
			if(name.charAt(y)!=name.charAt(x))
			count++;
			
	}
		if(count==x)
		{
			arr2[m]=name.charAt(x);
			m++;
		}
			
	}
}*/

void display()
{
	for(int j=0;j<length;j++)
	System.out.print(arr[j]);
}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Stringtoitself b=new Stringtoitself();
	  b.concat();
      b.details();
	  b.display();
     // b.remdup();
      
	}

}
