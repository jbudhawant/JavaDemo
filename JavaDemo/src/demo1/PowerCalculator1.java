package demo1;

import java.util.Scanner;
public class PowerCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base:");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();

        long result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();    }
    
    private static long calculatePower(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Exponent should be a non-negative integer.");
            return -1;       
            }

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
    }

