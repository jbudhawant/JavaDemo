package demo1;

import java.util.Scanner;
public class RectangleAreaCalculator {
     
	private static double calculateRectangleArea(double length, double width) {
              
		double area = length * width;
        return area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        
        double area = calculateRectangleArea(length, width);

        
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}