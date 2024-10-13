package Lesson1.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BaiTap1 {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();

        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);

        Iterator<Integer> it = listNum.iterator();

        while(it.hasNext()){
            Integer x = it.next();
            if((x%2) != 0){
                System.out.println(x);
            }
        }
    }
}
