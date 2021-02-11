import java.util.Scanner;

public class HousePainting 
{

	public static void main(String[] args) 
	{
		// Create a Scanner so we can start taking inputs for our computations
		Scanner in = new Scanner(System.in);
		
		// Initialize all variables
		int length = 0;
		int width = 0;
		int height = 0;
		int numWindows = 0;
		int lengthWindow = 0;
		int widthWindow = 0;
		int numDoors = 0;
		int lengthDoor = 0;
		int widthDoor = 0;
		int normalSideSqFt = 0;
		int totalNormalSideSqFt = 0;
		int peakSideSqFt = 0;
		int totalPeakSideSqFt = 0;
		int totalSurfaceArea = 0;
		int windowsSurfaceArea = 0;
		int doorsSurfaceArea = 0;
		int sqFtToPaint = 0;
		double costPerSqFt = 0;
		double costToPaint = 0;
		
		// Ask for all pertinent information for the cost and surface area computations
		System.out.print("Please enter the cost per square foot: ");
		costPerSqFt = in.nextDouble();
		
		System.out.print("Please enter the length of the house: ");
		length = in.nextInt();
		
		System.out.print("Please enter the width of the house: ");
		width = in.nextInt();
		
		System.out.print("Please enter the height of the house: ");
		height = in.nextInt();
		
		System.out.print("Please enter the number of windows: ");
		numWindows = in.nextInt();
		
		System.out.print("Please enter the length of a window: ");
		lengthWindow = in.nextInt();
		
		System.out.print("Please enter the width of a window: ");
		widthWindow = in.nextInt();
		
		System.out.print("Please enter the number of doors: ");
		numDoors = in.nextInt();
		
		System.out.print("Please enter the length of a door: ");
		lengthDoor = in.nextInt();
		
		System.out.print("Please enter the width of a door: ");
		widthDoor = in.nextInt();
		
		// Computes the square footage of a non-peak side
		normalSideSqFt = length * width;
		
		// Computes the total square footage of both non-peak sides
		totalNormalSideSqFt = normalSideSqFt * 2;
		
		// Computes the square footage of a peak side
		peakSideSqFt = (length * width) + (length * (height - width))/2;
		
		// Computes the total square footage of both peak sides
		totalPeakSideSqFt = peakSideSqFt * 2;
		
		// Computes the total surface area of both non-peak sides and both peak sides
		totalSurfaceArea = totalNormalSideSqFt + totalPeakSideSqFt;
		
		// Computes the total surface area of all windows
		windowsSurfaceArea = numWindows * lengthWindow * widthWindow;
		
		// Computes the total surface area of all doors
		doorsSurfaceArea = numDoors * lengthDoor * widthDoor;
		
		// Computes the total paintable surface area (this means not painting the windows and doors)
		sqFtToPaint = totalSurfaceArea - (windowsSurfaceArea + doorsSurfaceArea);
		
		// Computes the cost to paint the paintable surface area
		costToPaint = sqFtToPaint * costPerSqFt;
		
		// Tells the user the paintable surface area and provides a cost estimate
		System.out.println("\n" + "Your total paintable surface area is " + sqFtToPaint + " square feet.");
		System.out.println("Your estimate is " + costToPaint + " dollars.");
		
		// Stops asking for input
		in.close();
	}

}
