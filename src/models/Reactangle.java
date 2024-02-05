package models;

public class Reactangle {
    int length;
    int breadth;

    public Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return length * breadth;
    }
}
