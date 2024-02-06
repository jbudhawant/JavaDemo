package demo1;

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

          
        boolean isPalindrome = checkPalindrome(inputString);

            
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else
        {
            System.out.println("The entered string is not a palindrome.");
        }
        scanner.close();    }
      
private static boolean checkPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;     
            }
       
        StringBuffer stringBuffer = new StringBuffer(str);

        
        StringBuffer reversedStringBuffer = stringBuffer.reverse();

       
        return str.equals(reversedStringBuffer.toString());
    }
}