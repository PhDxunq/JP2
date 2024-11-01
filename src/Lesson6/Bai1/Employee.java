package Lesson6.Bai1;

import java.io.Serializable;

public class Employee implements Serializable {
    private String employeeID;
    private String fullName;
    private String address;
    private int age;

    public Employee() {
    }

    public Employee(String employeeID, String fullName, String address, int age) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


}
