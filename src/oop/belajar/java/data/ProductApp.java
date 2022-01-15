package oop.belajar.java.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Dell", 15000000);
        System.out.println(product.name);
        System.out.println(product.price);

        /*setelah menggunakan toString()*/
        System.out.println(product);

        Product product2 = new Product("Dell", 15000000);

        /* kalo tidak menggunakan override equals di method product,
        maka perbandingan equals dibawah akan berdasarkan memori, bukan value */
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
