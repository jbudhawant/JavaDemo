package demo1;

import java.util.Scanner;

public class Time {
 
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Time in HH:MM Form: ");
		
		double time = scr.nextDouble();
		
		if(time > 18)
		{
			System.out.println("Night Time...");
		}
		
		else
		{
			System.out.println("Day Time...");
		}
		
 
	}
 
}