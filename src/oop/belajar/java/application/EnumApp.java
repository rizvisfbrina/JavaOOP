package oop.belajar.java.application;

import oop.belajar.java.data.Customer;
import oop.belajar.java.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("pii");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());


        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //konversi enum to string
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        //ambil semua opsi enum menggunakan value
        System.out.println("Print Level");
        for (var value: Level.values()) {
            System.out.println(value);
        }
    }
}
