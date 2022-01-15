package oop.belajar.java;

public class PersonApp {
    public static void main(String[] args){
        System.out.println("Hello World!");

        var person1 = new Person("Eko", "Subang");
//        person1.name = "Eko";
//        person1.address = "Jakarta";
//        person.country = "Amerika"; ga bisa diubah final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Opi");

        Person person2 = new Person("Budi");
        person2.sayHello("Opi");

        Person person3;
        person3 = new Person();
//        person3.name = "Kulu";
        person3.sayHello("Opi");  //karena belum dideklarisikan maka return nama hanya null



    }
}
