package bank;

public class Bexception {

	public static void main(String[] args)
	
	{
		BankATM A=new BankATM(10000,1,"Rohit","HYD ",10000);
		//creating objects which show details
		BankATM B=new BankATM(10000,2,"Dhoni","HYD",20000);
		BankATM C=new BankATM(20000,3,"Virat","HYD",10000);
		
		A.deposit(10000);//depositing the amount in rohit's account 
		try
		{
	//here the withdrawl throws an Exception with try catch showing withdrawal account
			A.withdraw(1000);
			B.withdraw(1000);
			C.withdraw(1000);
		}
		catch(InsufficientBalanceException e)
		//error occurs in output and shows insufficient balance
		/*the code is prone to exceptions is placed in the try block
		 *when exception occurs that exception occurred is handled by the 
		 *catch block associated with it
		 */
		{
			System.out.println("insufficent balance:");
		
					
		}
	}
	}
