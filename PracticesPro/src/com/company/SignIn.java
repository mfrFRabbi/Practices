package com.company;

import java.util.ArrayList;
import java.util.List;

public class SignIn {
 private String name;
  private String email;
    private String password;
    List<SignIn> list = new ArrayList<>();

    public SignIn() {

    }

    public SignIn(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: "+this.name +"\n"+"Email:"+this.email+"\n"+"Password:"+this.password;
    }
}
