package Lesson1.TreeMap;

import java.util.TreeMap;

public class BaiTap2 {
    public static void main(String[] args) {
        String doanVan = "Lớp TreeMap triển khai giao diện NavigableMap và lưu trữ các phần tử trong một cấu trúc cây (tree structure). TreeMap trả về các khóa (keys) theo thứ tự được sắp xếp. Nếu không cần lấy các phần tử từ Map theo khóa đã được sắp xếp, thì lớp HashMap sẽ là một cấu trúc hiệu quả hơn để sử dụng.";
        doanVan = doanVan.toLowerCase().replaceAll("[,.()/]", "");
        String[] words = doanVan.split(" ");
        TreeMap<String,Integer> wordTreeMap = new TreeMap<>();
        for (String w : words){
            if (wordTreeMap.containsKey(w)){
                wordTreeMap.put(w, wordTreeMap.get(w) + 1);
            } else{
                wordTreeMap.put(w,1);
            }
        }
        for (String w : wordTreeMap.keySet()){
            System.out.println(w + " : " + wordTreeMap.get(w));
        }
    }
}
