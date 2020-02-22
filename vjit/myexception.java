
package vjit;
class nonameexception extends Exception
{
	nonameexception(String s)
	{
		super(s);
	}
}

public class myexception extends class2_3 {

	public static void main(String[] args) {
		class2_3 p=new class2_3();
		// TODO Auto-generated method stub
		try
		{
		
		
			if(p.firstname==""&&p.lastname=="")
			{
				throw new nonameexception("no name given");
				
			}
			
			
			else
			{
				System.out.println(p.firstname+p.lastname);
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println("caught"+e);
		}

	}

}
