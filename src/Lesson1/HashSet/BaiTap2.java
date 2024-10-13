package Lesson1.HashSet;

import java.util.*;

public class BaiTap2 {
    public static void main(String[] args) {
        HashSet<Integer> numHashSet = new HashSet<>();
        for(int i = 1; i <= 20 ; i++){
            numHashSet.add(i);
        }

        Iterator<Integer> it = numHashSet.iterator();
        while (it.hasNext()){
            Integer num = it.next();
            if ((num % 3) == 0){
                it.remove();
            }
        }

        for (Integer x : numHashSet){
            System.out.println(x);
        }
    }
}
