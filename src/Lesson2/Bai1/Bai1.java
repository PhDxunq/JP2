package Lesson2.Bai1;

import java.util.*;

public class Bai1 {
    public static <T> int countElementsWithProperty(Collection<T> collection) {
        int count = 0;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()){
            T x = it.next();
            if (((int)x%2) != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Collection<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);
        System.out.println("So luong so le: " + countElementsWithProperty(listNum));
    }
}
