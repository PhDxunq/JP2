package Lesson1.LinkedHashMap;

import java.util.LinkedHashMap;

public class BaiTap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> stuLinkedHashMap = new LinkedHashMap<>();
        stuLinkedHashMap.put("qwe",12);
        stuLinkedHashMap.put("asd",13);
        stuLinkedHashMap.put("zxc",14);
        stuLinkedHashMap.put("rty",15);
        stuLinkedHashMap.put("fgh",16);
        for (String str : stuLinkedHashMap.keySet()){
            System.out.println(str + " : " + stuLinkedHashMap.get(str));
        }
    }
}
