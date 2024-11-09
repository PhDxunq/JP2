package Lesson9.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static List<Product> productListOutput = new ArrayList<>();
    static List<Product> productListInput = new ArrayList<>();


    public static void headerMenu(){
        System.out.println("1.Thêm thông tin sản phẩm vào danh sách.");
        System.out.println("2.Lưu danh sách sản phẩm vào tệp.");
        System.out.println("3.Đọc dữ liệu từ tệp và hiển thị thông tin sản phẩm trong console.");
        System.out.println("4.Tìm kiếm sản phẩm theo tên sản phẩm (productName) hoặc danh mục (category).");
        System.out.printf("Your Choice: ");
    }

    public static void input() throws IOException{
        String productID = " ";
        String productName = "";
        double price;
        int quantity;
        Product.category category = null;
        System.out.print("Nhap ID: ");
        productID = input.readLine();
        System.out.print("Nhap ten san pham: ");
        do {
            productName = input.readLine();
        }while (productName.length() > 3);
        System.out.print("Nhap gia sp: ");
        do {
            price = Double.parseDouble(input.readLine());
        }while (price > 0);

        System.out.print("Nhap so luong: ");
        quantity = Integer.parseInt(input.readLine());
        System.out.print("Nhap danh muc: ");
        String cate = input.readLine();
        switch (cate){
            case "FOOD":
                category = Product.category.FOOD;
                break;
            case "DRINK":
                category = Product.category.DRINK;
                break;
            case "CLOTHES":
                category = Product.category.CLOTHES;
                break;
            case "ELECTRONIC":
                category = Product.category.ELECTRONIC;
                break;
        }

        Product newProduct = new Product(productID,productName,price,quantity,category);
        productListOutput.add(newProduct);
    }

    public static void writeFile() throws IOException{
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream("inventory_data.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(productListOutput);
    }

    public static void readFile() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("inventory_data.txt");
        ois = new ObjectInputStream(fis);
        productListInput = (List<Product>) ois.readObject();
        for (Product p : productListInput){
            System.out.println(p);
        }
    }


    public static void search() throws IOException{
        String search = "";
        System.out.print("Nhap ten sp hoac danh muc: ");
        search = input.readLine();
        for (Product p : productListInput) {
            if (p.getProductName().contains(search) || p.getCategory().toString().contains(search)){
                System.out.println(p);
            }else {
                System.out.println("Khong tim thay san pham");
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        while (true){
           try {
               headerMenu();
               choice = Integer.parseInt(input.readLine());
               switch (choice){
                   case 1:
                       input();
                       break;
                   case 2:
                       writeFile();
                       break;
                   case 3:
                       readFile();
                       break;
                   case 4:
                       search();
                       break;
                   default:
                       System.exit(0);
                       break;
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
        }
    }
}
