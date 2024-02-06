package demo1;

import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

              
        String resultString = removeDuplicates(inputString);

             
System.out.println("String after removing duplicates:");
        System.out.println(resultString);
        scanner.close();    }
        
    private static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return "Invalid input. Please provide a non-empty string.";
        }
               
        StringBuffer resultBuffer = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            
            if (resultBuffer.indexOf(String.valueOf(currentChar)) == -1) {
                resultBuffer.append(currentChar);
            }
        }

        return resultBuffer.toString();
    }
}