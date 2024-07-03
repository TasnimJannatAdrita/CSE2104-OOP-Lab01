/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

public class BankAccount {
     String accountNumber;
     double balance;

    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456789", 1000.0);

        
        account.displayAccountDetails();

        
        account.deposit(500.0);

        
        account.withdraw(300.0);

        
        account.withdraw(1500.0);

        
        account.displayAccountDetails();
    }
}


