package oop.belajar.java.application;

import oop.belajar.java.data.Animal;
import oop.belajar.java.data.Cat;

public class AnimalAbstractApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Ketty";
        animal.run();
    }
}
