package Lesson9.Bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bai2 {

    private static final Map<String, Integer[]> productCount = new HashMap<>();
    private static final Random random = new Random();

    public static void main(String[] args) {
        productCount.put("Điện thoại", new Integer[]{20, 5});
        productCount.put("Tivi", new Integer[]{15, 3});
        productCount.put("Laptop", new Integer[]{10, 2});

        Thread importUpdater = new Thread(() -> {
            String[] products = productCount.keySet().toArray(new String[0]);

            while (true) {
                synchronized (productCount) {
                    String selectedProduct = products[random.nextInt(products.length)];
                    Integer[] counts = productCount.get(selectedProduct);
                    counts[0] += 1;
                    System.out.println("Imported product: " + selectedProduct + ", New import count: " + counts[0]);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread exportUpdater = new Thread(() -> {
            String[] products = productCount.keySet().toArray(new String[0]);

            while (true) {
                synchronized (productCount) {
                    String selectedProduct = products[random.nextInt(products.length)];
                    Integer[] counts = productCount.get(selectedProduct);
                    if (counts[1] > 0) {
                        counts[1] -= 1; 
                        System.out.println("Exported product: " + selectedProduct + ", New export count: " + counts[1]);
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        importUpdater.start();
        exportUpdater.start();
    }
}