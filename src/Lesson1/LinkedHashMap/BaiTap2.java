package Lesson1.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> cusLinkedHashMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChương trình quản lý hàng đợi phục vụ khách hàng trong ngân hàng");
            System.out.println("1. Thêm khách hàng vào hàng đợi");
            System.out.println("2. Hiển thị danh sách khách hàng trong hàng đợi");
            System.out.println("3. Phục vụ khách hàng (xóa khỏi hàng đợi)");
            System.out.println("4. Thoát");
            System.out.print("Chọn tùy chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String name = scanner.nextLine();
                    int customerNumber = cusLinkedHashMap.size() + 1;
                    queue.put(name, customerNumber);
                    System.out.println("Khách hàng '" + name + "' đã được thêm vào hàng đợi với số thứ tự: " + customerNumber);
                    break;
                case 2:
                    System.out.println("Danh sách khách hàng trong hàng đợi:");
                    for (String customerName : cusLinkedHashMap.keySet()) {
                        System.out.println("Tên: " + customerName + ", Số thứ tự: " + cusLinkedHashMap.get(customerName));
                    }
                    break;
                case 3:
                    if (!cusLinkedHashMap.isEmpty()) {
                        String servedCustomer = cusLinkedHashMap.keySet().iterator().next();
                        cusLinkedHashMap.remove(servedCustomer);
                        System.out.println("Khách hàng '" + servedCustomer + "' đã được phục vụ và xóa khỏi hàng đợi.");
                    } else {
                        System.out.println("Hàng đợi rỗng. Không có khách hàng nào để phục vụ.");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
