package junit;

import static org.junit.Assert.*; 

import org.junit.*;

public class  TestPerson 
{
	
    @Test
	public void getFullName()
	{
		Person p1= new Person("Shashi","Reddy");
		assertEquals("Shashi Reddy",p1.getFullName());
	}
	@Test
	public void getFirstName()
	{
		Person p2 = new Person("Bharath", "Malyala");
		assertEquals( "Bharath",p2.getFirstName());
	}
	@Test
	public void testgetLastName()
	{
		Person p3 = new Person("Naveen", "Gudise");
		assertEquals(p3.getLastName(), "Gudise");
	}
	public static void main(String arg[])
	{
		TestPerson a=new TestPerson();
		a.getFullName();
		a.getFirstName();
	a.testgetLastName();
		
	}
}