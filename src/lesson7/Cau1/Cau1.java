package lesson7.Cau1;

import java.util.Scanner;

public class Cau1 {
    private static final Object lock = new Object();
    private static int current = 0;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        n = scanner.nextInt();
        scanner.close();

        Thread evenThread = new Thread(() -> {
            while (current <= n) {
                synchronized (lock) {
                    if (current % 2 == 0) {
                        System.out.println("Luong Chan: " + current);
                        current++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            while (current <= n) {
                synchronized (lock) {
                    if (current % 2 != 0) {
                        System.out.println("Luong Le: " + current);
                        current++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
