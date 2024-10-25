package Lesson4.Question2;

import java.util.Random;

public class Thread2 extends Thread{
    private final BankAccount account;
    private final Random random = new Random();

    public Thread2 (BankAccount account) {
        this.account = account;
    }

    public void run() {
        try {
            while (true) {
                int withdrawAmount = 100 + random.nextInt(401);
                account.withdraw(withdrawAmount);
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
