package vjit;

import java.text.*;
import java.util.*;
public class lab221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
		System.out.println(d);
		SimpleDateFormat m= new SimpleDateFormat("dd/MM/yyyy");
		String s=m.format(d);
		System.out.println(s);
	}

}
