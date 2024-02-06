package Utilities;

public class StringUtils {
    // Method to reverse a string    
	public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    // Method to check if a string is palindrome   
	public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }
}
	