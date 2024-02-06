package demo;

public class PersonDemo {
    public static void main(String[] args) {
        // Create an object of the Person class      
    	Person person = new Person("John Doe", 25);

        // Access instance variables using methods
        System.out.println("Original Name: " + person.getName());
        System.out.println("Original Age: " + person.getAge());

        // Modify instance variables using methods
        person.setName("Jane Doe");
        person.setAge(30);

        // Access modified instance variables using methods
        System.out.println("Modified Name: " + person.getName());
        System.out.println("Modified Age: " + person.getAge());
    }
}