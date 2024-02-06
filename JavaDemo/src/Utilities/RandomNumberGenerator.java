package Utilities;

import java.util.Random;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of the Random class      
    	Random random = new Random();

        // Generate and print 5 random numbers between 1 and 100       
    	System.out.println("Random Numbers between 1 and 100:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1; // Generates a random number between 0 (inclusive) and 100 (exclusive), then add 1
            System.out.println(randomNumber);
        }
    }
}