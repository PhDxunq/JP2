package SS.Ques1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BookTest {

    private static final String ISBN_PATTERN = "\\d{3}-[A-Z]{2}-\\d{4}";
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void headerMenu() {
        System.out.println("1. Nhap thong tin sach");
        System.out.println("2. Ghi vao file");
        System.out.println("3. Doc tu file");
        System.out.println("4. Thoat");
        System.out.print("Your choice: ");
    }

    public static void input(List<Book> bookOutput) throws IOException {
        String ISBN = " ";
        String title = " ";
        String author = " ";
        double price = 0;
        System.out.printf("Nhap ISBN: ");
        ISBN = input.readLine();
        if (!Pattern.matches(ISBN_PATTERN, ISBN)) {
            System.out.println("Invalid ISBN");
            return;
        }
        System.out.printf("Nhap title: ");
        title = input.readLine();
        System.out.printf("Nhap author: ");
        author = input.readLine();
        System.out.printf("Nhap price: ");
        price = Double.parseDouble(input.readLine());
        Book book = new Book(ISBN, title, author, price);
        bookOutput.add(book);
    }

    public static void writeToFile(List<Book> bookOutput) throws IOException {
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream("books.dat");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(bookOutput);
    }

    public static void readFromFile(List<Book> bookInput) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("books.dat");
        ois = new ObjectInputStream(fis);
        bookInput = (List<Book>) ois.readObject();
        for (Book b : bookInput) {
            System.out.println(b);
        }
    }



    public static void main(String[] args) {
        int choice;
        List<Book> bookInput = new ArrayList<>();
        List<Book> bookOutput = new ArrayList<>();
        do {
            headerMenu();
            try {
                choice = Integer.parseInt(input.readLine());
                switch (choice) {
                    case 1:
                        input(bookOutput);
                        break;
                    case 2:
                        writeToFile(bookOutput);
                        break;
                    case 3:
                        readFromFile(bookInput);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }
}
