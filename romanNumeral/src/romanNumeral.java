import java.util.Scanner;

public class romanNumeral {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number (1-3999): ");
		int num = in.nextInt();
		
		// Check if it is a number we can convert to Roman numeral first
		if (num > 0 && num <= 3999)
		{
			
			String romanNumeral = ""; // We will form a Roman numeral by appending numerals to this
			
			int thousandths = (num / 1000) % 10; // Thousandths place value
			int hundredths = (num / 100) % 10; // Hundredths place value
			int tenths = (num / 10) % 10; // Tenths place value
			int ones = num % 10; // Ones place value
			
			int numDigits = 0; // Number of digits in the number
			int digit = 0; // Placeholder digit
			int position = 0; // Position in the number
			
			while (num > 0) // Count the number of digits in the number
			{
				num = num / 10;
				numDigits++;
			}
			
			String base = "";
			String nextHigh = "";
			String highest = "";
						
			while (position <= 4) // Max 4 digits; loop through all of them
			{
				
				if (position == 1) // Thousandths place
				{
					while (thousandths > 0)
					{
						romanNumeral += "M";
						num -= 1000;
						thousandths--;
					}
				}
				else if (position == 2) // Hundredths place
				{
					digit = hundredths;
					base = "C";
					nextHigh = "D";
					highest = "M";
				}
				else if (position == 3) // Tenths place
				{
					digit = tenths;
					base = "X";
					nextHigh = "L";
					highest = "C";
				}
				else if (position == 4) // Ones place
				{
					digit = ones;
					base = "I";
					nextHigh = "V";
					highest = "X";
				}
				
				if (digit == 9)
				{
					romanNumeral += base + highest;
				}
				else if (digit == 8)
				{
					romanNumeral += nextHigh + base + base + base;
				}
				else if (digit == 7)
				{
					romanNumeral += nextHigh + base + base;
				}
				else if (digit == 6)
				{
					romanNumeral += nextHigh + base;
				}
				else if (digit == 5)
				{
					romanNumeral += nextHigh;
				}
				else if (digit == 4)
				{
					romanNumeral += base + nextHigh;
				}
				else if (digit == 3)
				{
					romanNumeral += base + base + base;
				}
				else if (digit == 2)
				{
					romanNumeral += base + base;
				}
				else if (digit == 1)
				{
					romanNumeral += base;
				}
				
				position++;
				
			}
				System.out.println(romanNumeral);
		}
		else
		{
			System.out.println("This number cannot be converted to Roman numeral format.");
		}
		
	}

}