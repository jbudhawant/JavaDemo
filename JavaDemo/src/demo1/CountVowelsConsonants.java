package demo1;

import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine().toLowerCase(); 
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (char ch : inputString.toCharArray()) {
            if (isVowel(ch)) {
                vowelsCount++;           
                } 
            else if (Character.isLetter(ch)) {
                consonantsCount++;            }      
            }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);

        scanner.close();
    }

   
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}