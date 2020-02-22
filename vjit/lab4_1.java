package vjit;

public class lab4_1 extends person {
	long accnum;
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	double balance;
	
void Deposit(double deposit)
{
	balance=balance+deposit;
}
void Withdraw(double withdraw)
{
	if(balance<500)
		System.out.println("amount cannot be withdrawn");
	else
	balance=balance-withdraw;
}
public String toString()
{
return getBalance()+" "+getName()+" "+getAccnum();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
lab4_1 b=new lab4_1();
b.setAccnum(100);
b.setName("smith");
b.setBalance(2000);
b.Deposit(1000);;
b.Withdraw(2000);
System.out.println(b.toString());
lab4_1 b1=new lab4_1();
b1.setAccnum(102);
b1.setBalance(3000);
b1.Deposit(2000);
b1.Withdraw(2000);
b1.setName("kathy");

System.out.println(b1.toString());

	}

}

