package oop.belajar.java.application;

import oop.belajar.java.data.City;

public class LocationApp {
    public static void main(String[] args) {
        /* ga bisa initiate menggunakan abstract class
        var location = new Location(); // ERROR */

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
