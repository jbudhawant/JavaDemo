package demo1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class AgeCalculator {

    public static void main(String[] args) {
          
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateStr = scanner.nextLine();
        scanner.close();
        
        Date birthdate = parseDate(birthdateStr);

            
        int age = calculateAge(birthdate);

              
        System.out.println("Your age is: " + age);
    }
       
    private static Date parseDate(String dateStr) {
        try {
            return new Date(java.text.DateFormat.getDateInstance().parse(dateStr).getTime());
        } catch (java.text.ParseException e) {
            e.printStackTrace();            return null;
        }    }
      
    private static int calculateAge(Date birthdate) {
        Calendar birthdateCalendar = Calendar.getInstance();
        birthdateCalendar.setTime(birthdate);

        Calendar now = Calendar.getInstance();

        int age = now.get(Calendar.YEAR) - birthdateCalendar.get(Calendar.YEAR);

  
        if (now.get(Calendar.DAY_OF_YEAR) < birthdateCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }
}