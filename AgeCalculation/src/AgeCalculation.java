import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculation {

    public static void main(String[] args) {
    	
        String birthday = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
        String [] splitBirthday = birthday.split("/");
        
        int birthdayMonth = Integer.parseInt(splitBirthday[0]);
        int birthdayDay = Integer.parseInt(splitBirthday[1]);
        int birthdayYear = Integer.parseInt(splitBirthday[2]);
        
        String today = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY):");
        String [] splitToday = today.split("/");
        
        int todayMonth = Integer.parseInt(splitToday[0]);
        int todayDay = Integer.parseInt(splitToday[1]);
        int todayYear = Integer.parseInt(splitToday[2]);
        
        LocalDate birthDate = LocalDate.of(birthdayYear, birthdayMonth, birthdayDay);
        LocalDate todaysDate = LocalDate.of(todayYear, todayMonth, todayDay);
        
        Period period = Period.between(birthDate, todaysDate);
        
        JOptionPane.showMessageDialog(null, "You are " + period.getYears() + " year(s) and " + period.getMonths() + " month(s) old.");
    }

}