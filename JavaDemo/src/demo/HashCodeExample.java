package demo;


import demo.HashCodeExample;

public class HashCodeExample {
    private String name;
    private int age;

    public HashCodeExample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        HashCodeExample person1 = new HashCodeExample("John", 25);
        HashCodeExample person2 = new HashCodeExample("Jane", 30);

           
        int hashCode1 = person1.hashCode();
        int hashCode2 = person2.hashCode();

             
       System.out.println("Hash Code for person1: " + hashCode1);
        System.out.println("Hash Code for person2: " + hashCode2);

          
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));
    }
    @Override    public int hashCode() {
             
    	int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
    @Override    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashCodeExample other = (HashCodeExample) obj;
        return age == other.age && name.equals(other.name);
    }
}