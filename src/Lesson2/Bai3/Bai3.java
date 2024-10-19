package Lesson2.Bai3;

public class Bai3 {
    public static <T> void swap(T[] arr , int i, int j){
        if(i >=0  && j >=0 ){
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] num = {1,2,4,5,6};
        swap(num, 1,4);
        for (int x : num){
            System.out.println(x);
        }
        String[] str = {"abc" , "qwe", "zxc"};
        swap(str, 0, 2);
        for (String s : str){
            System.out.println(s);
        }
    }
}
