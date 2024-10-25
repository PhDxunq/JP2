package Lesson3.Bai1.Question1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ClubManager {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static List<Member> lst = new ArrayList<>();
    static List<Member> lstOutput = new ArrayList<>();

    static void menu() {
        System.out.println("1. Add member");
        System.out.println("2. Write to file");
        System.out.println("3. Read from file");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }


    static void input() throws IOException {
        String memberID = "";
        String memberName = "";
        String address = "";
        Pattern pattern = Pattern.compile("^[TVA](MB|MT|MN)\\d{5}$");

        System.out.println("Enter member ID: ");
        do {
            memberID = input.readLine().trim();
        } while (!pattern.matcher(memberID).matches());

        System.out.println("Enter member name: ");
        memberName = input.readLine();
        System.out.println("Enter address: ");
        address = input.readLine();
        Member mb = new Member(memberID, memberName, address);
        lst.add(mb);
    }

    static void show() {
        for (Member member : lst) {
            System.out.println(member);
        }
    }

    static void writeFile() throws IOException {
        System.out.println("Write to file");
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream("member.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(lst);
    }

    static void readFile() throws IOException, ClassNotFoundException {
        System.out.println("Read from file");
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream("member.txt");
        ois = new ObjectInputStream(fis);
        lstOutput = (List<Member>) ois.readObject();

        for (Member member : lstOutput) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        String choice = "";
        while (true) {
            menu();
            try {
                choice = input.readLine();
                switch (choice) {
                    case "1":
                        input();
                        show();
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

