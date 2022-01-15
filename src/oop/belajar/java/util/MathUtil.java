package oop.belajar.java.util;

public class MathUtil {
    //method static
    public static int sum(int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        return total;
    }
}