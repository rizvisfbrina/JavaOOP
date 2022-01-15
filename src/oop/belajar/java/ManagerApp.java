package oop.belajar.java;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("opii");
//        manager.name = "opi";
        manager.sayHello("kk");

        var vicePresident = new VicePresident("pioo");
//        vicePresident.name = "pio";
        vicePresident.sayHello("ll");

        System.out.println(manager);
        System.out.println(vicePresident);
    }
}
