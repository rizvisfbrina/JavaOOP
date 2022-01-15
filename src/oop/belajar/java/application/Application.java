package oop.belajar.java.application;

import oop.belajar.java.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Dell", 15000000);
        //kalo product.name protected == gabisa di akses diluar package
//        System.out.println(product.name);
        System.out.println(product.name);
    }
}
