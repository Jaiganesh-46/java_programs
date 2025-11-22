package oops.encapsulation;

// Encapsulation Example in Java
// Save this file as EncapsulationDemo.java
// Run: javac EncapsulationDemo.java && java EncapsulationDemo

// Step 1: Create a class with private data members
class Account {
    // Private fields — data hiding (core of encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor to initialize values
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance (with validation)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    // Business logic method — deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Business logic method — withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Step 2: Main class to demonstrate encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an Account object using the constructor
        Account acc = new Account("Jai Ganesh", 5000);

        // Accessing data only via getters/setters — not directly
        acc.displayAccountInfo();

        // Updating data safely
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000); // invalid (should fail)
        acc.setBalance(-1000); // invalid (should fail)

        // Viewing updated account info
        acc.displayAccountInfo();
    }
}
