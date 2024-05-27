package entryAcademyPart.week2_lecture2.task3;

public class BankAccount {
    public static int currentID = 0;
    private final int id;
    private double balance;
    private static double interestRate;

    public BankAccount() {
        this.id = ++BankAccount.currentID;
        this.setBalance(0.0);
        BankAccount.interestRate = 0.02;
    }
    public BankAccount(double balance) {
        this.id = ++BankAccount.currentID;
        this.setBalance(balance);
        BankAccount.interestRate = 0.02;
    }

    public double getInterestRate(int years) {
        return interestRate * years * this.balance;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = Math.max(0.0,interestRate);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = Math.max(0.0, balance);
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount) {
        if(0 < amount) {
            this.balance += amount;
        }
    }
}