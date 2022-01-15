package oop.belajar.java.application;

import oop.belajar.java.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        //anonymous class HelloWorld
        //digunakan pada clas sederhana
        //tidak bisa di re-use

        HelloWorld english = new HelloWorld(){

            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
    }
}
