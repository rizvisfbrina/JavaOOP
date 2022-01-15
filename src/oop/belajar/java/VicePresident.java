package oop.belajar.java;

class VicePresident extends Manager{

    //selama parent ada constructor berparameter, maka di child juga harus menambahkan constructor
    //bisa diambil atau tidak valuenya
    //menggunakan super
    //kalo ada lebih dari satu const, maka bisa diambil satu const saja yg dipanggil di class child

    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }
}