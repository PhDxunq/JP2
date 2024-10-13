package Lesson1.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class BaiTap1 {
    public static void main(String[] args) {
        LinkedList<String> newList = new LinkedList<>();
        newList.addFirst("Cong viec dau");
        newList.addLast("Cong viec cuoi");
        for (String x : newList){
            System.out.println(x);
        }
    }
}
