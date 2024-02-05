import models.Cylinder;
import models.Cuboid;

import models.Manager;
import models.Employee;

public class Main {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(3, 4);
        cyl.generateVolume();

        Cuboid cub = new Cuboid(2, 4, 6);
        cub.generateVolume();


        Manager m1 = new Manager(
                "Manager1",
                3,
                "manager2@gmail",
                "m1add",
                60,
                "HR"
        );

        System.out.println("Salary for " + m1.getName() + " is " + m1.getSalary(2));

        Employee e1 = new Employee(
                "Employee1",
                5,
                "employee1@gmail",
                "e1add",
                40,
                "IT"
        );

        System.out.println("Salary for " + e1.getName() + " is " + e1.getSalary(5));


    }
}
