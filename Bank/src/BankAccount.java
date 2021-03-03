/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double interestRate;

   /**
      Constructs a bank account with zero balance.
      @param startingBalance the amount the bank account is initialized with
      @param interestPct the interest rate for the account
   */
   public BankAccount(double startingBalance, double interestPct)
   {
      balance = startingBalance;
      interestRate = interestPct;
      System.out.println("	Created new account with " + balance + " balance and interest rate " + interestPct);
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("	Deposited: " + amount);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public boolean withdraw(double amount)
   {
	  if (amount > balance)
	  {
		  System.out.println("	Insufficient funds to support withdrawal");
		  return false;
	  }
	  else
	  {
		  balance = balance - amount;
		  System.out.println("	Withdrew: " + amount);
		  return true;
	  }
   }

   /**
   	   Calculates the interest for this account.
    */
   public void calcInterest()
   {
	  double interest = balance * interestRate;
	  balance = balance + interest;
	  System.out.println("	Interest: " + interest);
   }

   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}
