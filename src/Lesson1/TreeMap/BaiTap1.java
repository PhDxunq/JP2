package Lesson1.TreeMap;

import java.util.TreeMap;

public class BaiTap1 {
    public static void main(String[] args) {
        TreeMap<String,Double> stuTreeMap = new TreeMap<>();
        stuTreeMap.put("qwe" , 7.0);
        stuTreeMap.put("asd" , 7.3);
        stuTreeMap.put("zxc" , 3.4);
        for (String str : stuTreeMap.keySet()){
            System.out.println(str + " : " + stuTreeMap.get(str) );
        }
    }
}
