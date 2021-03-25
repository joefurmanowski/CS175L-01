import java.util.Scanner;

public class hasNextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a threshold or 'End': ");
		while (in.hasNextDouble())
		{
			double numb = in.nextDouble();
			System.out.println("You entered " + numb);
		}
		System.out.println("No double entered. Goodbye.");
	}

}
