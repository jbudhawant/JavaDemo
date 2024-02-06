package demo1;

import java.util.Scanner;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();

              
        String capitalizedSentence = capitalizeFirstLetter(inputSentence);

              
        System.out.println("Capitalized Sentence:");
        System.out.println(capitalizedSentence);
        scanner.close();    }
       
    private static String capitalizeFirstLetter(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "Invalid input. Please provide a non-empty sentence.";
        }
        StringBuilder result = new StringBuilder();

       
        String[] words = sentence.split("\\s");

        for (String word : words) {
            if (!word.isEmpty()) {
                
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

       
        return result.toString().trim();
    }
}
