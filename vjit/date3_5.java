package vjit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.*;

public class date3_5  {
	
	
	
	

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		DateTimeFormatter my=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Scanner s=new Scanner(System.in);
	String date=s.nextLine();
	LocalDate l=LocalDate.parse(date,my);
	int months=12;
	
	LocalDate ll=l.plusMonths(months);

	System.out.println("warranty date"+ll);
	
	
	
	}


}
