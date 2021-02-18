import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		
		// Create a Scanner object so we can accept inputs from the user
		Scanner in = new Scanner(System.in);
		
		// Declare all variables
		String firstName = "";
		String lastName = "";
		String houseNumber = "";
		String street = "";
		String yORn = "";
		
		// Prompts for the user
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		
		// Replacement strings
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		
		// Prompt 1
		System.out.print(promptText1);
		firstName = in.nextLine();

		// Prompt 2
		System.out.print(promptText2);
		lastName = in.nextLine();
		
		// Replace the placeholders <firstName> and <lastName> with firstName and lastName
		replaceText1 = replaceText1.replace("<firstName>", firstName).replace("<lastName>", lastName);
		
		// Prompt 3
		System.out.print(promptText3);
		houseNumber = in.nextLine();

		// Prompt 4
		System.out.print(promptText4);
		street = in.nextLine();
		
		// Replace the placeholders <houseNumber> and <street> with houseNumber and street
		replaceText2 = replaceText2.replace("<houseNumber>", houseNumber).replace("<street>", street);
		
		System.out.println();
		
		// "Dear firstName lastName,"
		System.out.println(replaceText1);
		
		// "Please confirm that your address is houseNumber street."
		System.out.println(replaceText2);
		
		// Prompt 5
		System.out.print(promptText5);
		yORn = in.nextLine();
		
		// Replace the placeholder with the user's input of Yes or No
		replaceText3 = replaceText3.replace("<yORn>", yORn);
		
		// "Your answer is: <yORn> Goodbye!"
		System.out.println(replaceText3);
		
		// Stops asking for input
		in.close();
	}

}
