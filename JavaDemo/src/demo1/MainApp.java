package demo1;

import Utilities.MathFunctions;
import Utilities.StringUtils;
public class MainApp {
    public static void main(String[] args) {
        // Using methods from MathFunctions class       
    	double squareResult = MathFunctions.square(5.0);
        double cubeResult = MathFunctions.cube(3.0);

        System.out.println("Square of 5: " + squareResult);
        System.out.println("Cube of 3: " + cubeResult);

        // Using methods from StringUtils class
        String reversedString = StringUtils.reverseString("hello");
        boolean isPalindrome = StringUtils.isPalindrome("level");

        System.out.println("Reversed String: " + reversedString);
        System.out.println("Is 'level' a palindrome? " + isPalindrome);
    }
}