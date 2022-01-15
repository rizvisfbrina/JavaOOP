package oop.belajar.java.application;

//import static

import oop.belajar.java.data.Application;
import static oop.belajar.java.data.Constant.*;
import oop.belajar.java.data.Country;
import oop.belajar.java.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.VERSION);

        //setelah menggunakan import static, tidak perlu menggunakan nama class lagi
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Subang");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
