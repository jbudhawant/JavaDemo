package demo1;

import java.util.Scanner;

public class VotingAge {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Age: ");
		
		int age = scr.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Eligible for Voting...");
		}
		
		else
		{
			System.out.println("Not Eligible for Voting...");
		}
 
	}
 
}
 
