package object;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance=balance-amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("invalid withdrawal amount.");
        }

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance=balance+ amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }}