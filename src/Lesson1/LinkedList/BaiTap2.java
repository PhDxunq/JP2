package Lesson1.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        LinkedList<String> marketList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten khach hang: ");
        String addCus = sc.nextLine();
        marketList.addLast(addCus);
        System.out.println("Khach hang " + addCus + " da them vao hang doi");
        String removeCus = marketList.removeFirst();
        System.out.println("Khach hang " + removeCus + " da xoa khoi hang doi");
    }
}
