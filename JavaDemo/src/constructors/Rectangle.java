package constructors;

public class Rectangle {
    private double width;
    private double height;

    // Default constructor   
    public Rectangle() {
        // Default values or initialization can be done here  
    	}
    // Parameterized constructor with width and height   
    public Rectangle(double width, double height) {
        // Using 'this' keyword to distinguish instance variables from parameters      
    	this.width = width;
        this.height = height;
    }
    // Getter method for width  
    public double getWidth() {
        return width;
    }
    // Getter method for height   
    public double getHeight() {
        return height;
    }
    public static void main(String[] args) {
        // Creating objects using different constructors     
    	Rectangle rectangle1 = new Rectangle(); // Using default constructor      
    	Rectangle rectangle2 = new Rectangle(5.0, 10.0); // Using parameterized constructor with width and height

        // Accessing information using getter methods
        System.out.println("Rectangle 1: Width - " + rectangle1.getWidth() + ", Height - " + rectangle1.getHeight());
        System.out.println("Rectangle 2: Width - " + rectangle2.getWidth() + ", Height - " + rectangle2.getHeight());
    }
}