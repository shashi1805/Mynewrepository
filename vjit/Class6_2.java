package vjit;
class ageexception extends Exception
{
	ageexception(String s)
	{
		super(s);
	}
}


public class Class6_2 extends lab4_1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		lab4_1 a= new lab4_1();
		a.setAge(28);
		try
		{
			if(a.getAge()<15)
			throw new ageexception("age less than 15");
			else
				System.out.println("age="+a.getAge());
		}
catch (Exception e)
		{
	System.out.println(e);
		}
	}

}

