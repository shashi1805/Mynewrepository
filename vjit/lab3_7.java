package vjit;
import java.util.*;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class lab3_7 {
	void calculateAge() 
	{
		DateTimeFormatter my=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Scanner s=new Scanner(System.in);
		String date=s.nextLine();
		LocalDate a=LocalDate.parse(date,my);
		LocalDate now=LocalDate.now();
		Period diff=Period.between(a,now);
		System.out.println("age="+diff.getYears());		
	}
	void getFullName(String firstname, String lastname)
	{
		String fullname=firstname+lastname;
		System.out.println(fullname);	
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		lab3_7 b=new lab3_7();
		b.calculateAge();
		String x="reddy";
		String y="shashi";
		b.getFullName(y,x);
		
	}

}
