package SS.Ques2;

public class ThreadPrinter extends Thread {
    private String reversedString;
    private final Object lock;

    public ThreadPrinter(Object lock) {
        this.lock = lock;
    }

    public void setReversedString(String reversedString) {
        this.reversedString = reversedString;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                if (reversedString == null) {
                    break;
                }
                System.out.println("Reversed string: " + reversedString);
                lock.notify();
            }
        }
    }
}