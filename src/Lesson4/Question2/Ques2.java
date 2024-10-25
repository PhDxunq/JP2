package Lesson4.Question2;

public class Ques2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread depositThread = new Thread1(account);
        Thread withdrawThread = new Thread2(account);

        depositThread.start();
        withdrawThread.start();
    }
}
