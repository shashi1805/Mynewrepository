package vjit;

public class Savings extends lab4_1{
	final double minbal=1000;
	void Withdraw(long withdraw)
	{
		balance=balance-withdraw;
		if(balance>1000)
		{
		System.out.println("balance withdrawn is"+balance);
		
	}
		else
		{
			System.out.println("balance cannot be withdrawn"+balance);
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings s=new Savings();
		s.setBalance(2000);
		s.Deposit(1000);
		s.Withdraw(1000);
	}

}
