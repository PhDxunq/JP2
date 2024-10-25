package Lesson4.Question2;

public class BankAccount {
    private int balance = 0;
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Thread 1 deposits " + amount + " VND, total balance is " + balance + " VND.");
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Thread 2 withdraws " + amount + " VND, total balance is " + balance + " VND.");
        } else {
            System.out.println("Thread 2 tries to withdraw " + amount + " VND, insufficient funds. Balance is " + balance + " VND.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
