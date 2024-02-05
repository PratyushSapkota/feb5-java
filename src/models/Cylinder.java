package models;

public class Cylinder extends Circle {

    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public void generateVolume(){
        double areaOfCircle = getArea();

        double volumeOfCylinder = areaOfCircle * height;

        System.out.println("The area of Cylinder is: " + volumeOfCylinder);
    }

}
