package demo1;

import java.util.StringTokenizer;
import java.util.Scanner;
public class TokenizeSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();

               
        StringTokenizer tokenizer = new StringTokenizer(inputSentence);

            
        System.out.println("Individual words in the sentence:");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            System.out.println(word);
        }

        scanner.close();
    }
}