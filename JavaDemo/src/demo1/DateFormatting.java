package demo1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date and time (yyyy-MM-dd HH:mm:ss):");
        String dateString = scanner.nextLine();

               
        Date inputDate = parseDate(dateString);

                
        String formattedDate = formatDate(inputDate);

             
        System.out.println("Formatted Date and Time: " + formattedDate);

        scanner.close();    }
      
    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd HH:mm:ss.");
            System.exit(1);
            return null;       
            }
    }

    
    private static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
