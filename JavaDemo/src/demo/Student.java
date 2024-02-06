package demo;

class Student implements Cloneable {
    private String name;
    private int age;
 
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Getter and Setter methods
 
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
 
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}