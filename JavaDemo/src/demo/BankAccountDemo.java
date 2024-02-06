package demo;

public class BankAccountDemo {
    public static void main(String[] args) {
        // Create two bank accounts      
    	BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Open accounts and display information
        account1.openAccount("John Doe", 1000.00);
        account2.openAccount("Jane Doe", 2000.00);

        // Display account information
        System.out.println("Account Information for Account 1:");
        account1.getAccountInfo();

        System.out.println("Account Information for Account 2:");
        account2.getAccountInfo();
    }
}