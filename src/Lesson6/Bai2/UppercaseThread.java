package Lesson6.Bai2;

public class UppercaseThread extends Thread {
    private final DisplayThread displayThread;

    public UppercaseThread(DisplayThread displayThread) {
        this.displayThread = displayThread;
    }

    @Override
    public void run() {
        for (String word : WordContainer.words) {
            String uppercasedWord = word.toUpperCase();
            displayThread.display(uppercasedWord);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

