import java.util.Random;

public class randArrayAndSearch {

	public static void main(String[] args) {
		
		// Create an integer array that can hold 50 integers
		int[] numbers = new int[50];
		
		// Create a random number generator
		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++)
		{
			// Generate a random integer between 1 and 25
			int random = rand.nextInt(25) + 1; // 0 to 24 --> 1 to 25
			numbers[i] = random;
			System.out.print(numbers[i]);
			if (i < numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
		
		// Find largest and smallest numbers
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int j = 1; j < numbers.length; j++)
		{
			if (numbers[j] > largest)
			{
				largest = numbers[j];
			}
			if (numbers[j] < smallest)
			{
				smallest = numbers[j];
			}			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Largest integer: " + largest);
		System.out.println("Smallest integer: " + smallest);
		int product = largest * smallest;
		System.out.println("Product of largest and smallest integer: " + product);
		
		// Find most common element
		int element = 0;
		int count = 0;
		
		for (int k = 0; k < numbers.length; k++)
		{
			int tempElement = numbers[k];
			int tempCount = 0;
			for (int l = 0; l < numbers.length; l++)
			{
				if (numbers[l] == tempElement)
				{
					tempCount++;
				}
			}
			if (tempCount > count)
			{
				element = tempElement;
				count = tempCount;
			}
		}
		
		System.out.println("Most common element: " + element + ", seen in the array " + count + " times");

	}

}
