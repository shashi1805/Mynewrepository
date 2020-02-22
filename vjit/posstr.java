package vjit;

import java.util.Scanner;

public class posstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         String name= s.nextLine();
 
         int count=0;
         for(int i=1;i<name.length();i++)
         {
        	 for(int j=0;j<i;j++)
        	 {
        		 if(name.charAt(j)<name.charAt(i))
        		 {
                    count=0;
        		 }
        		 else
        		 {
        			 count++;
        			 break;
        		 }
        	 }
         }
         if(count==0)
        	 System.out.println("string is positive"+name);
         else
        	 System.out.println("string is negative:"+name);
         	 
         
	}

}
