package oop.belajar.java.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintanance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
