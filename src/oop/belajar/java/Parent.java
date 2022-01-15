package oop.belajar.java;

class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do it in child");

        //super.name untuk akses variable di parent
        System.out.println("Parent name is " + super.name);
    }
}