package demo1;

public class Student {
       
private String name;
    private int age;
    private String studentId;

     
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
      
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
    public static void main(String[] args) {
               
    	Student student1 = new Student("John Doe", 20, "S12345");
        Student student2 = new Student("Jane Smith", 22, "S67890");

        
        System.out.println("Student 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();
    }
}
