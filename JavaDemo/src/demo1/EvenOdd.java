package demo1;

import java.util.Scanner;

public class EvenOdd {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		
		int num = scr.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Number is Even...");
		}
		
		else
		{
			System.out.println("Number is Odd...");
		}		
 
	}
 
}