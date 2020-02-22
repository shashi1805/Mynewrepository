package vjit;

import java.util.ArrayList;
import java.util.Collections;

public class Lab7_2 {
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("shashi");
		a.add("bharath");
		a.add("naveen");
		a.add("priyanka");
		a.add("kishore");
		Collections.sort(a);
		for(String e:a)
			System.out.println(e);
		
		
	}

}
