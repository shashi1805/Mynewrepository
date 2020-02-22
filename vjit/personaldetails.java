package vjit;

import java.util.Scanner;

public class personaldetails {
	public static void main(String[]args)
	{
		String firstname;
		String lastname;
      char gender;
      int age;
      float weight;
      Scanner scan=new Scanner(System.in);
      firstname=scan.nextLine();
      lastname=scan.nextLine();
      gender=scan.next().charAt(0);
      age=scan.nextInt();
      weight=scan.nextFloat();
      System.out.println("First Name:"+firstname);
      System.out.println("last Name:"+lastname);
      System.out.println("gender:"+gender);
      System.out.println("age:"+age);
      System.out.println("weight:"+weight);
      
      
      
      
	}
}

