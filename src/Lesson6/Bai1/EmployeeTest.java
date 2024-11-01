package Lesson6.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmployeeTest {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static List<Employee> employeeList = new ArrayList<>();
    static List<Employee> employeeListInput = new ArrayList<>();

    public static void headerMenu(){
        System.out.println("1.Nhap thong tin Employee.");
        System.out.println("2.Ghi danh sach.");
        System.out.println("3.Doc tep.");
        System.out.println("4.Hien thi danh sach nhan vien.");
        System.out.print("Your Choice: ");
    }

    public static void input() throws IOException{
        String employeeID = "";
        String fullName = "";
        String address = "";
        int age;

        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{4}[A-Z]{1,2}$");
        do {
            System.out.print("Input EmployeeID: ");
            employeeID = input.readLine();

        }while (!pattern.matcher(employeeID).matches());

        System.out.print("Input Full Name: ");
        fullName = input.readLine();
        System.out.print("Input Address: ");
        address = input.readLine();
        System.out.printf("Input Age: ");
        age = Integer.parseInt(input.readLine());

        Employee employee = new Employee(employeeID,fullName,address,age);
        employeeList.add(employee);
    }

    public static void writeFile() throws IOException {
        System.out.println("Write File.");
        try (FileOutputStream fos = new FileOutputStream("employee.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employeeList);
        }
    }

    public static void readFile() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("employee.dat");
        ois = new ObjectInputStream(fis);
        employeeListInput = (ArrayList<Employee>) ois.readObject();
        for (Employee e : employeeListInput){
            System.out.println(e);
        }
    }

    public static void readFileAge() throws IOException,ClassNotFoundException{
        System.out.println("Hien Thi Nhan Vien Tren 25 tuoi.");
        readFile();
        for (Employee e : employeeListInput){
            if (e.getAge() > 25){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        while (true){
            headerMenu();
            try {
                choice = Integer.parseInt(input.readLine());
                switch(choice){
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
                        readFileAge();
                        break;
                    default:
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
