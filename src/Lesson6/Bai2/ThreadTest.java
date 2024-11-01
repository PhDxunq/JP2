package Lesson6.Bai2;

public class ThreadTest {
    public static void main(String[] args) {
        DisplayThread displayThread = new DisplayThread();
        UppercaseThread uppercaseThread = new UppercaseThread(displayThread);
        uppercaseThread.start();
    }
}
