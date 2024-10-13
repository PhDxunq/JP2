package Lesson1.TreeSet;

import java.util.TreeSet;

public class BaiTap2 {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for(int i = 0; i < 5; i++){
            int numRan =  (int) (Math.random() *101);
            integerTreeSet.add(numRan);
        }
        System.out.println("Day so");
        for (Integer x : integerTreeSet){
            System.out.println(x);
        }

        System.out.println("So nho nhat: " + integerTreeSet.first());
        System.out.println("So lon nhat: " +integerTreeSet.last());
    }

}
