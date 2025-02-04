package Assignment_BTech2026_2201920100166;

import java.util.*;

public class OOP_Problem1 {
    public static void main(String[] args) {
        Bank pnb = new Bank();

        Account a1 = new Account("Ravi", 101, 10_000);
        pnb.addNewAccount(a1);

        Account a2 = new Account("Rohan", 102, 5_000);
        pnb.addNewAccount(a2);

        ArrayList<Account> accounts = pnb.getAccounts();
        for(Account acc: accounts){
            acc.getAccountInfo();
            System.out.println();
        }

        pnb.depositMoney(a2, 900);
        pnb.withdrawMoney(a2, 6000);
    }
}

class Bank{
    ArrayList<Account> accounts;

    Bank(){
        accounts = new ArrayList<Account>();
    }

    public void addNewAccount(Account account){
        accounts.add(account);
    }

    public void deleteAccount(Account account){
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount){
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount){
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }
}

class Account{
    private String name;
    private int accountNumber;
    private double balance;

    Account(String name, int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Credited " + amount + " in " + name + "'s account");
        System.out.println("Now your Current Balance is " + balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance!!!!");
        }
        else{
            balance -= amount;
            System.out.println("Debited " + amount + " from your account");
            System.out.println("Now your Current Balance is " + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAccountInfo(){
        System.out.print("Name: " + name + "\nAccountNumber: " + accountNumber + "\nCurrent_Balance: " + balance);
    }
}

