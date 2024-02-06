package demo;

public class ShallowCopyExample {
    public static void main(String[] args) {
        try {
            // Creating an object
            Student student1 = new Student("John", 20);
 
            // Creating a shallow copy using clone()
            Student student2 = (Student) student1.clone();
 
            // Modifying the original object
            student1.setName("Jane");
            student1.setAge(22);
 
            // Displaying the original and cloned objects
            System.out.println("Original Object: " + student1);
            System.out.println("Cloned Object: " + student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}