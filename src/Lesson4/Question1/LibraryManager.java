package Lesson4.Question1;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class LibraryManager {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Book> listBookOutput = new ArrayList<>();
    static ArrayList<Book> listBookInput = new ArrayList<>();


    static void headerMenu(){
        System.out.println("1. Add book");
        System.out.println("2. Write to file");
        System.out.println("3. Read from file");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

    }

    static  void inputBook() throws IOException{
        String bookID = "";
        String title = "";
        String author = "";

        Pattern pattern = Pattern.compile("^[FNS][MH][PD]\\d{4}$");

        System.out.print("Input BookID: ");
        do {
            bookID = input.readLine().trim();
        }while (!pattern.matcher(bookID).matches());

        System.out.print("Input Title: ");
        title = input.readLine();
        System.out.print("Input Author: ");
        author = input.readLine();

        Book newBook = new Book(bookID,title,author);
        listBookOutput.add(newBook);
    }

    static void writeFile() throws IOException{
        System.out.println("Write File.");
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream("library_books.ser");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(listBookOutput);
    }

    static void readFile() throws IOException,ClassNotFoundException{
        System.out.println("Read File");
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("library_books.ser");
        ois = new ObjectInputStream(fis);
        listBookInput = (ArrayList<Book>) ois.readObject();
        for (Book b : listBookInput){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        String choice;
        while (true){
            headerMenu();
            try {
                choice = input.readLine();
                switch (choice){
                    case "1":
                        inputBook();
                        break;
                    case "2":
                        writeFile();
                        break;
                    case "3":
                        readFile();
                        break;
                    case "4":
                        System.exit(0);
                        break;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
