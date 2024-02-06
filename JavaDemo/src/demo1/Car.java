package demo1;

public class Car {
     
	private String make;
    private String model;
    private int year;

        
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
      
public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
              
    	Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        
        System.out.println("Car 1:");
        car1.displayInfo();

        System.out.println("\nCar 2:");
        car2.displayInfo();
    }
}