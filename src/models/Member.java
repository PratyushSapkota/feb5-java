package models;

public class Member {
    String name;
    int age;


    String contact;
    String address;
    double salaryPerDay;

    public Member(String name, int age, String contact, String address, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(int leavesPerMonths) {
        int workingDays = 24 - leavesPerMonths;
        return salaryPerDay * workingDays;
    }

}
