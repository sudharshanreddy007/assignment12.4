package bank;

public class BankATM {

	int id;//these are bank attributes
	String bankName;
	double balance;
	double amount;
	public void BankATM()
	
	{
		id=1;
		bankName="abc";
		balance=1000;
		amount=0;
	}
	BankATM(double bal,int n,String abc,String xyz,double amt)
	{//parameterized constructor
		balance=bal;
		id=n;
	}
	public void deposit(double amount)
	{//creating a method to deposit
		balance=balance+amount;//adds the amount at deposit
		System.out.println("money is deposited successfully:"+balance);
	}
	public void withdraw(double amount) throws InsufficientBalanceException{
//in this withdrawl method it will show exception when amount is less than 10000
		if(balance-amount<1000)
		{
			throw new InsufficientBalanceException("withdrawal failure if you have insufficient balance.your balance isRs."+amount);
		//handles the exception
		}
		else
		{
			balance=balance-amount;//shows amount after withdrawal
			System.out.println("money withdrawn:available balance is Rs.:"+balance);
		}
		/*the code is prone to exceptions is placed in the try block
		 *when exception occurs that exception occurred is handled by the 
		 *catch block associated with it
		 */

	}
	

}
