/** 2) Bank account: deposit, withdraw and check balance.
 *  The balance can never be negative. */

public class BankAccount {

    // attributes
    private String owner;
    private double balance;

    // constructor
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The amount must be positive");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient funds or invalid amount");
        return false;
    }

    public void show() {
        System.out.println(owner + " - balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ana", 50000);
        account.show();
        account.deposit(20000);
        account.withdraw(30000);
        account.withdraw(100000);
        account.show();
    }
}
