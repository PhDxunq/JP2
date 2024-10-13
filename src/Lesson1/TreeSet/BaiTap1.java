package Lesson1.TreeSet;

import java.util.TreeSet;

public class BaiTap1 {
    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("qwe");
        stringTreeSet.add("asd");
        stringTreeSet.add("zxc");
        for (String str : stringTreeSet) {
            System.out.println(str);
        }
    }
}
