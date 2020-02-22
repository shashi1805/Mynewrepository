package vjit;

import java.time.*;
import java.util.*;

public class datt {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		LocalDate p= LocalDate.of(2012,01,01);
		LocalDate s= LocalDate.of(2019,03,04);
		Period a=Period.between(p, s);
		System.out.print(a.getYears()+"years"+a.getMonths()+"months"+a.getDays()+"days");
		
		
		
		
		

	}

}
