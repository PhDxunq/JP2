package Lesson1.Vector;

import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class BaiTap2 {
    public static void main(String[] args) {
        Vector<String> customerVector = new Vector<>();
        customerVector.add("Khach Hang 1.");
        customerVector.add("Khach Hang 2.");
        customerVector.add("Khach Hang 3.");
        customerVector.add("Khach Hang 4.");
        customerVector.add("Khach Hang 5.");
        for(int i = 0 ; i < 10; i++){
            if (!customerVector.isEmpty()){
                String removeCustomer = customerVector.remove(0);
                System.out.println("Da phuc vu " + removeCustomer);
                if ((6+i) < 10){
                    String addCustomer = "Khach hang thu " + (6+i);
                    customerVector.add(addCustomer);
                    System.out.println("Da them " + addCustomer);
                }
            }
        }
    }
}
