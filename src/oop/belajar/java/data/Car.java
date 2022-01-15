package oop.belajar.java.data;

public interface Car extends HasBrand, IsMaintanance{

    /* default interface adalah public abstract,
    public abstract void drive();
     */

    void drive();
    int getTire();

    default boolean isBig(){
        return false;
    }
}
