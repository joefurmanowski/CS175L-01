import java.util.Scanner;

public class BankThreshold {

	public static void main(String[] args) 
	{
		
		// Create a Scanner object so we can accept data from the user
		Scanner in = new Scanner(System.in);
				
		// Initialize all variables
		double startBal = 0;
		double interestPct = 0;
		double withdrawAmount = 0;
		double balance = 0;
		int months = 0;
		
		System.out.print("Enter opening balance for your account: ");
		startBal = in.nextDouble();

		System.out.print("Enter the interest rate for your account: ");
		interestPct = in.nextDouble();
		
		// Create a BankAccount object
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		System.out.print("Enter the threshold for your account balance to reach or 'End': ");

		while (in.hasNextDouble())
		{
			double threshold = in.nextDouble();
			
			while (myBankAccount.getBalance() < threshold)
			{
				myBankAccount.calcInterest();
				months++;
			}
			
			System.out.println("	It will take " + months + " months to reach the threshold of " + threshold + ".");
		}
		System.out.println("	No threshold entered. Goodbye!");
				
		// Stop asking the user for input
		in.close();

	}

}