package demo1;

public class Constants {
       
	public static final double PI = 3.14159;
    public static final double E = 2.71828;

       
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
    public static double calculateExponential(double base, double exponent) {
        return Math.pow(E, exponent);
    }
    public static void main(String[] args) {
             
    	System.out.println("Example 1: Calculate the area of a circle with radius 5.");
        double circleArea = calculateCircleArea(5);
        System.out.println("Area of the circle: " + circleArea);

        System.out.println("\nExample 2: Calculate e raised to the power of 2.");
        double exponentialResult = calculateExponential(E, 2);
        System.out.println("e^2: " + exponentialResult);
    }
}