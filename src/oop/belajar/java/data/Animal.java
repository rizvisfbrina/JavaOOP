package oop.belajar.java.data;

public abstract class Animal {
    public String name;

    //abstract method == ga perlu deklarasi method ==> run(){ }

    /* semua turunan Animal wajib membuat abstract method ini */
    public abstract void run();
}
