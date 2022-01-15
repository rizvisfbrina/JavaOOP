package oop.belajar.java.data;

public class Application {
    //static block, akan dieksekusi sekali sebelum class di-load
    //hanya bisa mengambil data yg static juga

    public static final int PROCESSORS;
    static {
        System.out.println("Akses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
