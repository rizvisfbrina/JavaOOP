package oop.belajar.java.application;

import oop.belajar.java.data.Avanza;
import oop.belajar.java.data.Car;

public class CarApp {
    public static void main(String[] args) {
        /* karena Car adalah Interface, maka ga bisa di initiate
            Car car = new Car(); //error
        */

        /*menggunakan polimorphism*/
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
    }
}
