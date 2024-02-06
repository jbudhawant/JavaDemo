package demo1;

import java.util.Scanner;
public class TemperatureConverter {
     
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
   
	public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            
        System.out.println("Example 1: Convert 25 degrees Celsius to Fahrenheit.");
        double celsiusTemperature = 25;
        double fahrenheitResult = celsiusToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " degrees Celsius is " + fahrenheitResult + " degrees Fahrenheit.");

        System.out.println("\nExample 2: Convert 68 degrees Fahrenheit to Celsius.");
        double fahrenheitTemperature = 68;
        double celsiusResult = fahrenheitToCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " degrees Fahrenheit is " + celsiusResult + " degrees Celsius.");

        scanner.close();
    }
}
