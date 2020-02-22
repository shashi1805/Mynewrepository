package vjit;
import java.lang.reflect.Array;
import java.util.*;


public class Lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		s[i]=sc.nextLine();
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		Arrays.sort(s);
		System.out.println("arrays after sorting");
		
		for(int i=0;i<s.length;i++)
			System.out.println(s[i] );
		
		
		
		

	}

}
