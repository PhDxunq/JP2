package Lesson1.Vector;

import java.util.Scanner;
import java.util.Vector;

public class BaiTap1 {
    public static void main(String[] args) {
        Vector<String> stuVector = new Vector<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap ten sinh vien: ");
            String newStu = sc.nextLine();
            stuVector.add(newStu);
        }
        for(String s : stuVector){
            System.out.println(s);
        }
    }
}
