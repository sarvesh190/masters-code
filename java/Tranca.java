class LessBalExe extends Exception
{
	float b;
	public LessBalExe(float amt)
	{
		b=amt;
		System.out.println("Withdrawing amount is invalid"+b);
	}
}
class Account
{
	float bal;
	public Account(float b)
	{
		if (b<500.00f)
		{
			System.out.println("No Sufficient balance\n");
		}
		else
		{
			bal=b;
		}
	}
	public void deposit(float amt)
	{
		bal=bal+amt;
		System.out.println("The balance is="+bal);
	}
	public void withdraw(float amt) throws LessBalExe
	{
		float x;
		x=bal-amt;
		if(x>=500.00f)
		{
			bal=bal-amt;
			System.out.println("Remaining balance is="+bal);
		}
		else
		{
			throw new LessBalExe(x);
		}
	}
}
class Transact
{
	public static void main(String args[])
	{
		try
		{
			Account ob1=new Account(500.00f);
			ob1.deposit(100.00f);
			ob1.withdraw(100.00f);
			Account ob2=new Account(1500.00f);
			ob2.deposit(200.00f);
			ob2.withdraw(1000.00f);
		}
		catch(Exception e)
		{}
	}
}
