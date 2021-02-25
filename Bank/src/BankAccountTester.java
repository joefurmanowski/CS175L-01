import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) 
	{
		
		// Create a Scanner object so we can accept data from the user
		Scanner in = new Scanner(System.in);
		
		// Declare all variables
		double startBal;
		double withdrawAmount;
		double depositAmount;
		double balance;
		
		System.out.print("How much would you like to start your bank account with?: ");

		startBal = in.nextDouble();
		
		// Create a BankAccount object with the amount given by the user
		BankAccount myBankAccount = new BankAccount(startBal);
		
		System.out.print("How much would you like to withdraw from your account?: ");
		withdrawAmount = in.nextDouble();
		
		// Withdraw the amount the user specified
		myBankAccount.withdraw(withdrawAmount);
		
		System.out.print("How much would you like to deposit into your account?: ");
		depositAmount = in.nextDouble();
		
		// Deposit the amount the user specified
		myBankAccount.deposit(depositAmount);
		
		// Stop asking the user for input
		in.close();
		
		// Assign the most recent bank account balance to the balance variable
		balance = myBankAccount.getBalance();
		
		// Output result
		System.out.println("\nYour bank account balance is: " + balance);

	}

}
