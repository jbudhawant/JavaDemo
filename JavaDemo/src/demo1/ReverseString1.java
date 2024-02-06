package demo1;

import java.util.Scanner;
public class ReverseString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

            
        String reversedString = reverseString(inputString);

               
        System.out.println("Reversed String:");
        System.out.println(reversedString);
        scanner.close();    }
      
    private static String reverseString(String str) {
        if (str == null) {
            return "Invalid input. Please provide a non-null string.";
        }
              
        char[] charArray = str.toCharArray();

             
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
           
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

     
            left++;
            right--;
        }

       
        return new String(charArray);
    }
}