package lesson7.Cau2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static List<Student> studentInput = new ArrayList<>();
    static List<Student> studentOutput = new ArrayList<>();


    public static void headerMenu() {
        System.out.println("1. Nhap thong tin sinh vien");
        System.out.println("2. Ghi vao file");
        System.out.println("3. Doc tu file");
        System.out.println("4. Thoat");
        System.out.print("Your choice: ");
    }

    public static void input() throws IOException {
        String name = " ";
        int age ;
        String phone = " ";
        System.out.printf("Nhap ten: ");
        name = input.readLine();
        System.out.printf("Nhap tuoi: ");
        age = Integer.parseInt(input.readLine());
        System.out.printf("Nhap so dien thoai: ");
        phone = input.readLine();
        Student student = new Student(name, age, phone);
        studentOutput.add(student);
    }

    public static void writeToFile() throws IOException{
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream("input.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(studentOutput);
    }

    public static void readFromFile() throws IOException,ClassNotFoundException {
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("input.txt");
        ois = new ObjectInputStream(fis);
        studentInput = (List<Student>) ois.readObject();
        for (Student s : studentInput) {
            System.out.println(s);
        }
    }



    public static void main(String[] args) {
        int choice;
        do {
            headerMenu();
            try {
                choice = Integer.parseInt(input.readLine());
                switch (choice) {
                    case 1:
                        input();
                        break;
                    case 2:
                        writeToFile();
                        break;
                    case 3:
                        readFromFile();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}