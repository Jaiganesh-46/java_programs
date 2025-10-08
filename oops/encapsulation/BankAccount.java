package oops.encapsulation;

public class BankAccount {
    // Private fields (encapsulation)
    private final String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul", 5000);
        System.out.println("Account Holder: " + acc.getAccountHolder());
        acc.deposit(2000);
        acc.withdraw(1000);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
