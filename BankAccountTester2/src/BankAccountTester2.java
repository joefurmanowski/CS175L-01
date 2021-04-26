import java.util.ArrayList;

public class BankAccountTester2 {

	public static void main(String[] args) {
		
		// Add some BankAccounts
		BankAccount gil = new BankAccount("Gil",500);
		BankAccount joe = new BankAccount("Joe",1000);
		BankAccount fred = new BankAccount("Fred",2000);
		BankAccount sally = new BankAccount("Sally",2500);
		
		// Create an ArrayList of BankAccounts
		ArrayList<BankAccount> accountList= new ArrayList<>();
		
		// Add the BankAccounts to the ArrayList
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		System.out.println("-- Current list of bank accounts --");
		
		// Retrieve info for each BankAccount
		for(BankAccount account: accountList){
			System.out.println(account.getAccount());
		}
		
		// Add Sally to the ArrayList
		accountList.add(sally);
		
		System.out.println("\n** Sally's bank account has been added. **\n");
		
		// Counter for enhanced for loop
		int i = 0;
		
		// First, assume that the BankAccount at index 0 is the highest
		BankAccount highest = accountList.get(0);
		
		// Loop through each account and compare them to determine which has the highest balance
		for(BankAccount account: accountList){
			if (account.getBalance() > highest.getBalance())
			{
				highest = accountList.get(i);
			}
			i++;
		}
		
		// Retrieve info for the account with the highest balance
		System.out.println("-- Account with highest balance --");
		System.out.println(highest.getAccount());
		
		System.out.println("\n** Sally's bank account has been removed. **");
		
		// Remove Sally from the ArrayList
		accountList.remove(sally);
		
		System.out.println();
		
		// Reset counter to 0
		i = 0;
		
		// Again, assume that the BankAccount at index 0 is the highest
		highest = accountList.get(0);
		
		// Loop through each account and compare them to determine which has the highest balance
		for(BankAccount account: accountList){
			if (account.getBalance() > highest.getBalance())
			{
				highest = accountList.get(i);
			}
			i++;
		}

		// Retrieve info for the account with the highest balance
		System.out.println("-- Account with highest balance --");
		System.out.println(highest.getAccount());
		
	}

}
