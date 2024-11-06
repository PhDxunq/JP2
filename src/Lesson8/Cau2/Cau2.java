package Lesson8.Cau2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cau2 {

    private static final Map<String, Integer> bookCountByGenre = new HashMap<>();
    private static int totalBooks = 0;

    public static void main(String[] args) {
        bookCountByGenre.put("Tiểu thuyết", 10);
        bookCountByGenre.put("Khoa học", 7);
        bookCountByGenre.put("Văn học", 12);

        Thread genreUpdater = new Thread(() -> {
            Random random = new Random();
            String[] genres = bookCountByGenre.keySet().toArray(new String[0]);

            while (true) {
                synchronized (bookCountByGenre) {
                    String selectedGenre = genres[random.nextInt(genres.length)];
                    bookCountByGenre.put(selectedGenre, bookCountByGenre.get(selectedGenre) + 1);
                    totalBooks++;
                    System.out.println("Updated genre: " + selectedGenre + ", Count: " + bookCountByGenre.get(selectedGenre));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread totalBooksMonitor = new Thread(() -> {
            while (true) {
                synchronized (bookCountByGenre) {
                    System.out.println("Total books: " + totalBooks);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        genreUpdater.start();
        totalBooksMonitor.start();
    }
}