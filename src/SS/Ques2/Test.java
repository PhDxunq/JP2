package SS.Ques2;

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        Data data = new Data();
        ThreadPrinter printer = new ThreadPrinter(lock);
        ThreadProcessor processor = new ThreadProcessor(data, printer, lock);

        printer.start();
        processor.start();
    }
}