package oop.belajar.java.data;

import oop.belajar.java.annotation.NotBlank;

public class CreateUserRequest {
    //reflection
    @NotBlank
    private String username, password, name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
