import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) 
	{
		
		// Create a Scanner object so we can accept data from the user
		Scanner in = new Scanner(System.in);
				
		// Initialize all variables
		double startBal = 0;
		double interestPct = 0;
		double withdrawAmount = 0;
		double depositAmount = 0;
		double balance = 0;
		boolean sufficientBalance = false; // Assume user does not have enough to make a withdrawal yet
		String response = "";
		
		System.out.print("Enter amount to start the account: ");
		startBal = in.nextDouble();

		System.out.print("Enter the interest rate for this account: ");
		interestPct = in.nextDouble();
		
		// Create a BankAccount object
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		System.out.print("Enter amount to deposit in the account: ");
		depositAmount = in.nextDouble();
		
		// Deposit the amount the user specified
		myBankAccount.deposit(depositAmount);
				
		// For as long as the user does not have enough to withdraw, keep asking for a withdrawal amount
		while (sufficientBalance == false)
		{
			System.out.print("Enter amount to withdraw from the account: ");
			withdrawAmount = in.nextDouble();
			if (myBankAccount.withdraw(withdrawAmount)) // if (true)
			{
				sufficientBalance = true; // User had enough funds to support withdrawal; stop asking for withdrawal
			}
		}

		System.out.print("If you want me to generate interest, enter 'Yes': ");
		response = in.next();
		
		// Calculate the interest on the account
		if (response.equals("Yes"))
		{
			myBankAccount.calcInterest();
		}
		
		// Stop asking the user for input
		in.close();
		
		// Get latest balance
		balance = myBankAccount.getBalance();
		
		// Output result
		System.out.println("The account balance is: " + balance);

	}

}
