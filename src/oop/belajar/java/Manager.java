package oop.belajar.java;

class Manager extends Employee{

    String company;

    Manager(String name){
//        this.name = name;

        //karena extends ke kelas Employee, maka name diambil menggunakan super
        super(name);
    }

    Manager(String name, String company){
//        this.name = name;
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}

