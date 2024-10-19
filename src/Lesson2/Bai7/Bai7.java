package Lesson2.Bai7;

import java.util.*;

public class Bai7 {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);
        print(listNum);
    }
}
