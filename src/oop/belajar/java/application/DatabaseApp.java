package oop.belajar.java.application;

import oop.belajar.java.error.DatabaseError;

public class DatabaseApp {
    //Exxception error biasa digunakan untuk error yang fatal akibatnya,
    // sehingga tidak direkomendasikan menggunakan try-catch
    public static void main(String[] args) {
        connectDatabase("a", null);
        System.out.println("Sukses");
    }
    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa connect database");
        }
    }
}
