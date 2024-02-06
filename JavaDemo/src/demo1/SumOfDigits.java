package demo1;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int inputNumber = scanner.nextInt();

              
        int number = Math.abs(inputNumber);

        int sum = 0;
        
        while (  number > 0) {
                     
        	int digit = number % 10;

          
            sum += digit;

            
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
 