package demo;

import java.util.Random;
class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor   
    public BankAccount() {
        // Empty constructor 
    	}
    // Private method to generate a random account number  
    private void generateAccountNumber() {
        Random random = new Random();
        // Assuming a simple format for the account number (you can modify it based on your requirements)      
        accountNumber = String.format("%04d-%04d-%04d", random.nextInt(10000), random.nextInt(10000), random.nextInt(10000));
    }
    // Public method to open a new account    
    public void openAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        generateAccountNumber();
        // Call the private method to generate an account number 
        }
    // Public method to get account information   
        public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: $" + balance);
        System.out.println(); // Empty line for better readability   
        }

    }
    