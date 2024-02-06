package demo1;

import java.util.Scanner;
public class ShapeAreaCalculator {
      
	public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
      
	public static double calculateArea(double length, double width) {
        return length * width;
    }
       
	public static double calculateArea(double base, double height, String shape) {
        if ("triangle".equalsIgnoreCase(shape)) {
            return 0.5 * base * height;
        } else {
            System.out.println("Invalid shape specified for triangle area calculation.");
            return -1;       
            }   
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              
        System.out.println("Example 1: Calculate the area of a circle with radius 5.");
        double circleArea = calculateArea(5);
        System.out.println("Area of the circle: " + circleArea);

        System.out.println("\nExample 2: Calculate the area of a rectangle with length 4 and width 6.");
        double rectangleArea = calculateArea(4, 6);
        System.out.println("Area of the rectangle: " + rectangleArea);

        System.out.println("\nExample 3: Calculate the area of a triangle with base 3 and height 8.");
        double triangleArea = calculateArea(3, 8, "triangle");
        if (triangleArea != -1) {
            System.out.println("Area of the triangle: " + triangleArea);
        }

        scanner.close();
    }
}
