package oop.belajar.java.application;

import oop.belajar.java.data.LoginRequest;
import oop.belajar.java.error.ValidationException;
import oop.belajar.java.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "aa");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }
        //multiple exception
        catch (ValidationException | NullPointerException exception){
            System.out.println("Data tidak valid : " + exception.getMessage());
        }
        //tetap dieksekusi, baik terjadi exception atau tidak
        finally {
            System.out.println("Selalu dieksekusi");
        }

        //Runtime Exception tidak wajib menambahkan try and catch
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("sukses");

    }
}
