package oop.belajar.java;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        var rectangle = new Rectangle();

        System.out.println(shape.getCorner());
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
