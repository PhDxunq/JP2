package Lesson3.Bai1.Question1;

import java.io.Serializable;

public class Member implements Serializable {
    protected String memberID;
    protected String memberName;
    protected String address;

    public Member() {
    }

    public Member(String memberID, String memberName, String address) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.address = address;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID='" + memberID + '\'' +
                ", memberName='" + memberName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
