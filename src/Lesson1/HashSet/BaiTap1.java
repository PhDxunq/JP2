package Lesson1.HashSet;

import java.util.*;

public class BaiTap1 {
    public static void main(String[] args) {
        String doanVan = "Lớp HashSet triển khai giao diện Set. Một HashSet tạo một bộ sưu tập sử dụng bảng băm cho việc lưu trữ dữ liệu. Bảng băm là một cấu trúc dữ liệu lưu trữ thông tin bằng cách ánh xạ khóa của mỗi phần tử dữ liệu vào một vị trí hoặc chỉ số trong mảng. Một khóa là một bộ nhận dạng được sử dụng để tìm hoặc tra cứu một giá trị trong bảng băm. Ý nghĩa cụ thể của các khóa trong bất kỳ bảng băm nào hoàn toàn phụ thuộc vào cách bảng này được sử dụng và dữ liệu nó chứa. Việc biến đổi của một khóa thành mã băm của nó được thực hiện tự động. Mã nguồn của người dùng không thể truy cập trực tiếp vào bảng băm.";
        HashSet<String> wordSet = new HashSet<>();
        String[] words = doanVan.split(" ");
        for(String s : words){
            wordSet.add(s.toLowerCase());
        }
        for (String word : wordSet){
            System.out.println(word);
        }
    }
}
