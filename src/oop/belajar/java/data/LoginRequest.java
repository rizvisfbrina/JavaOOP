package oop.belajar.java.data;

public class LoginRequest {
    private String username, password;

    public LoginRequest(String username, String password) {
        System.out.println("Membuat loginRequest");
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
