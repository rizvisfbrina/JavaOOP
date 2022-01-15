package oop.belajar.java.util;

import oop.belajar.java.annotation.NotBlank;
import oop.belajar.java.data.LoginRequest;
import oop.belajar.java.error.BlankException;
import oop.belajar.java.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if(loginRequest.getUsername() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.getUsername().isBlank()){
            throw new ValidationException("Username is blank");
        }else if(loginRequest.getPassword() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.getPassword().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }

    //Runtime Exception : tidak wajib memasukkan throws BlankException
    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.getUsername() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.getUsername().isBlank()){
            throw new BlankException("Username is blank");
        }else if(loginRequest.getPassword() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.getPassword().isBlank()){
            throw new BlankException("Password is blank");
        }
    }

    //reflection
    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){

            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class) != null){
                //validate
                try {
                    String value = (String) field.get(object);
                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }
                }catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }

    }

}
