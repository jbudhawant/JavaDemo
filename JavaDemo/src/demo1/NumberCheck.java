package demo1;

import java.util.Scanner;

public class NumberCheck {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		
		int num = scr.nextInt();
		
		if(num < 100)
		{
			if(num > 50)
			{
				System.out.println("Entered number is greater than 50 and lesser than 100...");
			}
			else
			{
				System.out.println("Entered number is lesser than 100...");
			}
		}
 
	}
 
}