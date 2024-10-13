package Lesson1.LinkedHashSet;

import java.util.LinkedHashSet;

public class BaiTap2 {
    public static void main(String[] args) {
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("qwe");
        stringLinkedHashSet.add("asd");
        stringLinkedHashSet.add("zxc");
        for (String str : stringLinkedHashSet){
            System.out.println(str);
        }


    }
}
