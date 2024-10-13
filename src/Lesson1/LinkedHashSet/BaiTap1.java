package Lesson1.LinkedHashSet;

import java.util.LinkedHashSet;

public class BaiTap1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numLinkedHashSet = new LinkedHashSet<>();
        for(int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() *101);
            numLinkedHashSet.add(randomNum);
        }
        for (Integer num : numLinkedHashSet){
            System.out.println(num);
        }
    }
}
