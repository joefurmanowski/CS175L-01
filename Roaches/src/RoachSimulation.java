import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RoachSimulation {

    public static void main(String[] args) {
    	
        String input_startingPopulation = JOptionPane.showInputDialog("Enter starting roach population:");
        int initialPopulation = Integer.parseInt(input_startingPopulation);
        
        // Create a RoachPopulation object with a given initial population
        RoachPopulation bugs = new RoachPopulation(initialPopulation);

        // Output format
        DecimalFormat wholeFormat = new DecimalFormat("0");
        
        JOptionPane.showMessageDialog(null, "The initial roach population is " + wholeFormat.format(bugs.getRoaches()));

        // We are simulating 4 cycles; ask the same set of questions 4 times
        for (int i = 1; i < 5; i++) {
        	
            JOptionPane.showMessageDialog(null, "The roach population after cycle " + i + " breeding is " + wholeFormat.format(bugs.breed()));

            String input_sprayPct = JOptionPane.showInputDialog("Enter spray percentage for cycle " + i + ":");
            double sprayPct = Double.parseDouble(input_sprayPct);

            bugs.spray(sprayPct);

            JOptionPane.showMessageDialog(null, "The roach population after cycle " + i + " " + wholeFormat.format(sprayPct * 100) + "% spraying is " + wholeFormat.format(bugs.getRoaches()));
        }
        
    }

}