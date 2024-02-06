package demo1;

import java.util.Scanner;

public class PositiveNegativeZero {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		
		int num = scr.nextInt();
		
		if(num > 0)
		{
			System.out.println("Number is Positive...");
		}
		
		else if(num < 0)
		{
			System.out.println("Number is Negative...");
		}
		
		else
		{
			System.out.println("Number is Zero...");
		}
 
	}
 
}