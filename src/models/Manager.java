package models;

public class Manager extends Member {
    String specialization;

    public Manager(String name, int age, String contact, String address, double salaryPerDay, String specialization) {
        super(name, age, contact, address, salaryPerDay);
        this.specialization = specialization;
    }


    @Override
    public double getSalary(int leaveDays) {
        double baseSalary = super.getSalary(leaveDays);
        double salaryFactor = 1;

        if(specialization == "HR"){
            salaryFactor = 3;
        }else if(specialization == "IT"){
            salaryFactor = 5;
        }

        return baseSalary * salaryFactor ;
    }
}
