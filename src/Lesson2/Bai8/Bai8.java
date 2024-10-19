package Lesson2.Bai8;

import java.util.List;

public class Bai8 {
    public static <T extends Comparable<T>> T maxEle(List<T> list, int begin, int end){
        T maxEle = list.getFirst();
        for (int i = begin; i < end; i++){
            if(list.get(i).compareTo(maxEle) > 0){
                maxEle = list.get(i);
            }
        }
        return maxEle;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 7, 2, 8, 6);
        System.out.println(maxEle(numbers, 1, 5));
    }
}
