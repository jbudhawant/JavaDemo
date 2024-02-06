package demo1;

import java.util.Scanner;

public class SwapTwoNumbers {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		
		int num1 = scr.nextInt();
		
		System.out.println("Enter Second Number:");
		
		int num2 = scr.nextInt();
		
		System.out.println("Numbers Before Swapping: Number1 = " +num1  +  "Number2 = "  +num2);
		
		num1 = num1 + num2;
		
		num2 = num1 - num2;
		
		num1 = num1 - num2;
		
		System.out.println("Numbers After Swapping: Number1 = " +num1  +  "Number2 = "  +num2);
 
	}
 
}