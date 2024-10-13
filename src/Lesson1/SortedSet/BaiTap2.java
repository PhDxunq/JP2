package Lesson1.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class BaiTap2 {
    public static void main(String[] args) {
        SortedSet<String> listString = new TreeSet<>();
        listString.add("fgh");
        listString.add("cvb");
        listString.add("asd");
        String[] arrayCheck = {"asd" , "cvb" ,"fgh"};
        if (listString.equals(arrayCheck)){
            System.out.println("Tuan theo sap xep");
        } else {
            System.out.println("Khong tuan theo sap xep");
        }
    }
}
