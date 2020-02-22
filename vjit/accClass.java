package vjit;
abstract class account1
{
	abstract void Withdraw(double withdraw,double bal);
	
}

public class accClass extends account1 {

	void Withdraw(double withdraw,double bal)
	{
		bal = bal-withdraw;
		System.out.println(bal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bal=5000;
		double withdraw=1000;
		
		accClass a = new accClass();
		a.Withdraw(withdraw,bal);
	}

	

	
}