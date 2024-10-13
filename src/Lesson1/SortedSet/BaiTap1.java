package Lesson1.SortedSet;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BaiTap1 {
    public static void main(String[] args) {
        SortedSet<Integer> listNum = new TreeSet<>();
        for (int i = 0; i < 5; i++){
            int num = (int) (Math.random() * 101);
            listNum.add(num);
        }
        Iterator<Integer> it = listNum.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
