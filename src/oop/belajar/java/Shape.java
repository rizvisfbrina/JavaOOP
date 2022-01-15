package oop.belajar.java;

public class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }
    int getParentCorner(){
        //menggunakan super keywoard untuk mengakses method dari class parent
        return super.getCorner();
    }
}