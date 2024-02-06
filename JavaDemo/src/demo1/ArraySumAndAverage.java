package demo1;

import java.util.Scanner;
public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

            
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();        }
           
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / size;

        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}
