package oop.belajar.java;

public class Person {
    String name;
    String address;
    final String country = "Indonesia"; //final = gabisa diubah

    //constructor
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //constructor baru, asal param atau jumlah param berbeda
    Person(String paramName){
        this(paramName, null); //memanggil const dgn 2 parameter
    }

    //constructor baru, asal param atau jumlah param berbeda
    Person(){
        this(null); //memanggil const dgn 1 parameter
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
