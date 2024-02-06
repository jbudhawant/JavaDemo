package demo1;

import java.util.Scanner; 
public class MultiplicationTable {     
public static void main(String[] args) {         
Scanner scanner = new Scanner(System.in);         
System.out.println("Enter an integer to display its multiplication table:");         
int number = scanner.nextInt();         
System.out.println("Multiplication table for " + number + ":");         
int i = 1;         
while (i <= 10) {             
int product = number * i;             
System.out.println(number + " x " + i + " = " + product);             
i++;         
}         
scanner.close();     
}
}
