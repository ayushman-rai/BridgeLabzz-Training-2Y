// Base class
public class BankAccount {
    public int accountNumber;        // can be accessed from anywhere
    protected String accountHolder;  // accessible within package & subclass
    private double balance;          // only accessible within this class

    // Constructor
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Getter for private balance
    public double getBalance() {
        return balance;
    }

    // Display account info
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + 
                           ", Holder: " + accountHolder + 
                           ", Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void showAccountInfo() {
        System.out.println("Accessing from subclass:");
        System.out.println("Account Number: " + accountNumber);    
        System.out.println("Account Holder: " + accountHolder);    
    }

        public static void main(String[] args) {
            SavingsAccount sa = new SavingsAccount(12345, "Ayushman Rai", 5000);
            sa.displayDetails();
            sa.deposit(2000);
            sa.withdraw(1500);
            sa.displayDetails();
            sa.showAccountInfo(); // Call the method to use it
        }
    }
