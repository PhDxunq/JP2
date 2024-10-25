package Lesson4.Question2;

import java.util.Random;

public class Thread1 extends Thread{
    private final BankAccount account;
    private final Random random = new Random();

    public Thread1(BankAccount account) {
        this.account = account;
    }

    public void run() {
        try {
            while (true) {
                int depositAmount = 100 + random.nextInt(901);
                account.deposit(depositAmount);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
