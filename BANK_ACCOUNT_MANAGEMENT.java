import java.util.*;
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void displayAccount() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("ACC101", 5000);
        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        acc.deposit(d);
        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        acc.withdraw(w);
        acc.displayAccount();       
    }
}