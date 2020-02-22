package vjit;

public class current4_2 extends lab4_1 {
	double overdraftlimit=-2000;
	void Withdraw(long withdraw)
	{
		balance=balance-withdraw;
		if(balance<=overdraftlimit)
		{
			System.out.println("true");
			
		}
		else
			System.out.println("false");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         current4_2 c=new current4_2();
         c.setBalance(200);
         c.Deposit(1000);
         c.Withdraw(500);
	}

}
