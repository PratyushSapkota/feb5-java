package models;

public class Cuboid extends Reactangle {
    int height;

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public void generateVolume() {
        int volume = height * getArea();
        System.out.println("The volume of cuboid is: " + volume);
    }
}
