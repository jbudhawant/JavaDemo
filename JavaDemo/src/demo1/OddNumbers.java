package demo1;

public class OddNumbers {
    public static void main(String[] args) {
        int number = 1;

        System.out.println("Odd numbers from 1 to 15:");

        do {
            System.out.println(number);          
            number += 2; 
        } while (number <= 15);
    }
}