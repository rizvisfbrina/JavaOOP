package oop.belajar.java;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Opi";
        child.doIt();
        System.out.println(child.name);

//        kalo akses method overriding, maka yg diakses method yg di overridenya(method child)
//        kalo akses variable overriding, variable tersebut independent, sehingga ga ngaruh apa2

        Parent parent = (Parent) child;
        parent.doIt(); //print = method yg di child, karena objectnya merupakan child
        System.out.println(parent.name);

    }
}
