package Lesson1.UnmodifiableCollection;

import java.util.*;
public class BaiTap1 {
    public static void main(String[] args) {
        try {
            List<String> stringList = new ArrayList<>();
            stringList.add("qwe");
            stringList.add("asd");
            stringList.add("zxc");
            stringList.add("rty");
            Collection<String> immutableList = Collections.unmodifiableCollection(stringList);
            immutableList.add("bmm");
        } catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
