package oop.belajar.java.application;

import oop.belajar.java.data.CreateUserRequest;
import oop.belajar.java.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Eko");
        request.setPassword("Eko");
        ValidationUtil.validationReflection(request);
    }
}
