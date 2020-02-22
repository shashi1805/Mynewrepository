package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExceptionCheck  {
	@Test (expected = Salexception.class)
	public void checkException() throws Salexception
	{
Lab6_3	 l=new Lab6_3();
	l.sException(40000);
	}
	

}
