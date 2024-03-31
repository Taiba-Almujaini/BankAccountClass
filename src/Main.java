import object.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Example usage
        BankAccount account = new BankAccount("234144", 5000, "Ahmed");

        // Display account information
        System.out.println("Account Information:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance:" + account.getBalance());

        // deposit amount
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Prompt for withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: $" + account.getBalance());
    }
}