package models;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return ((double) 22 /7) * radius * radius;
    }
}
