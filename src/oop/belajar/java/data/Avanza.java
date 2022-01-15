package oop.belajar.java.data;

public class Avanza implements Car {
    /* karena implement dari Interface Class,
    maka semua abstract method harus dioverride di class turunannya
     */

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintanance() {
        return false;
    }
}
