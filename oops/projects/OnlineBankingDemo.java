package oops.projects;

// ----------------- Abstract Class -----------------

abstract class BankAccount {
    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    public BankAccount(String holder, String accNo, double bal) {
        accountHolder = holder;
        accountNumber = accNo;
        balance = bal;
    }

    // Encapsulation: getters and setters
    public String getAccountHolder() { return accountHolder; }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    // Abstract methods — must be implemented by subclasses
    @SuppressWarnings("unused")
    abstract void calculateInterest();
    
    @SuppressWarnings("unused")
    abstract void withdraw(double amount);

    // Common method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void displayBalance() {
        System.out.println(getAccountHolder() + " (" + getAccountNumber() + ") Balance: " + getBalance());
    }
}

// ----------------- SavingsAccount -----------------
class SavingsAccount extends BankAccount {
    private final double interestRate = 0.04; // 4%

    public SavingsAccount(String holder, String accNo, double bal) {
        super(holder, accNo, bal);
    }

    // Runtime polymorphism: override abstract methods
    @Override
    void calculateInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest added: " + interest);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Compile-time polymorphism: method overloading
    void transfer(double amount, SavingsAccount receiver) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            receiver.deposit(amount);
            System.out.println("Transferred " + amount + " to " + receiver.getAccountHolder());
        } else {
            System.out.println("Insufficient funds to transfer!");
        }
    }
}

// ----------------- CurrentAccount -----------------
class CurrentAccount extends BankAccount {
    private final double overdraftLimit = 5000;

    public CurrentAccount(String holder, String accNo, double bal) {
        super(holder, accNo, bal);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current account has no interest.");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}

// ----------------- Main Class -----------------
public class OnlineBankingDemo {
    public static void main(String[] args) {
        System.out.println("=== Online Banking System Demo ===\n");

        // Create accounts
        SavingsAccount sa1 = new SavingsAccount("Jai Ganesh", "SA001", 10000);
        CurrentAccount ca1 = new CurrentAccount("Anika", "CA001", 5000);

        // Deposits
        sa1.deposit(2000);
        ca1.deposit(3000);

        // Withdrawals
        sa1.withdraw(5000);
        ca1.withdraw(9000); // uses overdraft

        // Transfer (overloaded method)
        SavingsAccount sa2 = new SavingsAccount("Ravi", "SA002", 8000);
        sa1.transfer(3000, sa2);

        // Interest calculation
        sa1.calculateInterest();
        ca1.calculateInterest();

        // Display balances
        System.out.println("\n=== Final Account Balances ===");
        sa1.displayBalance();
        sa2.displayBalance();
        ca1.displayBalance();
    }
}
