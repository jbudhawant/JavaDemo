package demo1;

import java.util.Scanner;

public class EvenOdd2 {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		
		int num = scr.nextInt();
		
		if(num % 2 != 0)
		{
			System.out.println("Team...");
		}
		
		else if(num % 2 == 0 && num >= 2 && num <= 5)
		{
			System.out.println("Australia...");
		}
		
		else if(num % 2 == 0 && num >= 6 && num <= 20)
		{
			System.out.println("Allianz...");
		}
		
		else if(num % 2 == 0 && num > 20)
		{
			System.out.println("Testing...");
		}
	}
 
}