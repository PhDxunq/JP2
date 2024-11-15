package SS.Ques2;

public class ThreadProcessor extends Thread {
    private final Data data;
    private final ThreadPrinter printer;
    private final Object lock;

    public ThreadProcessor(Data data, ThreadPrinter printer, Object lock) {
        this.data = data;
        this.printer = printer;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (String str : data.data) {
            String reversed = new StringBuilder(str).reverse().toString();
            synchronized (lock) {
                printer.setReversedString(reversed);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        synchronized (lock) {
            printer.setReversedString(null); // Signal completion
            lock.notify();
        }
    }
}