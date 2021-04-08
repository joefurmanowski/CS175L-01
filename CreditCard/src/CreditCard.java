import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String creditCardNumber = "";
		//4123-5678-9012-3450
		int i = 0;
		while (!creditCardNumber.equals("-99"))
		{
			System.out.print("Enter a credit card number or -99 to end: ");
			creditCardNumber = in.nextLine();
			while (i < creditCardNumber.length() && !creditCardNumber.equals("-99"))
			{
				char character = creditCardNumber.charAt(i);
				if (character == ' ' || character == '-')
				{
					String before = creditCardNumber.substring(0, i);
					String after = creditCardNumber.substring(i + 1);
					creditCardNumber = before + after;
				}
				else
				{
					i++;
				}
			}
			System.out.println(creditCardNumber);
			i = 0;
		}
		System.out.println("Goodbye!");
		
		in.close();

	}

}
