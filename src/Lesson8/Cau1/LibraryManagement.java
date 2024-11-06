package Lesson8.Cau1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static List<Library> newLibraryOutput = new ArrayList<>();
    static List<Library> newLibraryInput = new ArrayList<>();

    public static void headerMenu() {
        System.out.println("1.Thêm thông tin sách vào danh sách.");
        System.out.println("2.Lưu danh sách sách vào một tệp.");
        System.out.println("3.Đọc dữ liệu từ tệp và hiển thị thông tin sách trong console.");
        System.out.println("4.Tìm kiếm sách dựa trên tên sách (bookTitle) hoặc tác giả (author).");
        System.out.print("Your choice: ");
    }

    public static void inputBook() throws IOException{
        String ID = "";
        String bookTitle = "";
        String author = "";
        int publishedYear;
        String genre = "";

        System.out.print("Nhập ID sách: ");
        ID = input.readLine();
        System.out.print("Nhập tên sách: ");
        do {
            bookTitle = input.readLine();
        }while (bookTitle.length() < 5);
        System.out.print("Nhập tên tác giả: ");
        author = input.readLine();
        System.out.print("Nhập năm xuất bản: ");
        do {
            publishedYear = Integer.parseInt(input.readLine());
        }while (publishedYear < 1900);
        System.out.print("Nhập thể loại: ");
        genre = input.readLine();
        Library library = new Library(ID, bookTitle, author, publishedYear, genre);
        newLibraryOutput.add(library);
    }

    public static void writeFile() throws IOException{
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream("library_data.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(newLibraryOutput);
    }

    public static void readFile() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("library_data.txt");
        ois = new ObjectInputStream(fis);
        newLibraryInput = (List<Library>) ois.readObject();
        for (Library l : newLibraryInput){
            System.out.println(l);
        }
    }

    public static void findBook () throws IOException{
        String search;
        System.out.print("Nhập tên sách hoặc tên tác giả cần tìm: ");
        search = input.readLine();
        for (Library l : newLibraryInput){
            if (l.getBookTitle().contains(search) || l.getAuthor().contains(search)){
                System.out.println(l);
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
                        inputBook();
                        break;
                    case 2:
                        writeFile();
                        break;
                    case 3:
                        readFile();
                        break;
                    case 4:
                        findBook();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
