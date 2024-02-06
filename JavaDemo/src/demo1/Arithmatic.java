package demo1;

import java.util.Scanner;

public class Arithmatic {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		
		int num1 = scr.nextInt();
		
		System.out.println("Enter Second Number: ");
		
		int num2 = scr.nextInt();
 
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div= num1 / num2;
		
		System.out.println("Addition: " +add);
		
		System.out.println("Subtraction: " +sub);
		
		System.out.println("Multiplication: " +mul);
		
		System.out.println("Division: " +div);
 
	}
 
}
 
