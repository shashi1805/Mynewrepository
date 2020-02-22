package junit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Salexception extends Exception
{
	Salexception(String s)
	{
		super(s);
	}
}

public class Lab6_3  {
float sal;
	
	
	public void sException(	float sal) throws Salexception
	{
		
	if(sal<30000)
	{
		throw new Salexception("salary less than 30000");
	}
	else
		System.out.println("salary="+sal);

}
	public static void main(String a[]) throws Salexception
	{
		Lab6_3 l=new Lab6_3();
		l.sException(2345);
	}
}