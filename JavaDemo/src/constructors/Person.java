package constructors;

public class Person {
    private String name;
    private int age;

    // No-argument constructor  
    public Person() {
        // Default values or initialization can be done here  
    	}
    // Parameterized constructor with name   
    	public Person(String name) {
        this.name = name;
    }
    // Parameterized constructor with name and age  
    	public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter method for name   
    	public String getName() {
        return name;
    }
    // Getter method for age  
    	public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        // Creating objects using different constructors      
    	Person person1 = new Person(); // Using no-argument constructor      
    	Person person2 = new Person("John"); // Using parameterized constructor with name     
    	Person person3 = new Person("Alice", 25); // Using parameterized constructor with name and age

        // Accessing information using getter methods
        System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
        System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
        System.out.println("Person 3: Name - " + person3.getName() + ", Age - " + person3.getAge());
    }
}