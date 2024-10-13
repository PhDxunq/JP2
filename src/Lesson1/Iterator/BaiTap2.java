package Lesson1.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class BaiTap2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListNum = new LinkedList<>();

        linkedListNum.add(11);
        linkedListNum.add(1);
        linkedListNum.add(7);
        linkedListNum.add(121);
        linkedListNum.add(11);
        linkedListNum.add(5);
        linkedListNum.add(3);
        linkedListNum.add(9);
        linkedListNum.add(4);
        linkedListNum.add(54);

        Iterator<Integer> it = linkedListNum.iterator();
        while (it.hasNext()){
            Integer x = it.next();
            if(x < 10){
                System.out.println(x);
            }
        }
    }
}
