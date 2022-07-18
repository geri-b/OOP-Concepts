package com.company;
import java.lang.String;

public class Doctor {

    private String name;
    private int phone_number;
    private String email;

    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    // Getter
    public Integer getPhone_number() {
        return phone_number;
    }

    // Setter
    public void setPhone_number(Integer newPhone_number) {
        this.phone_number = newPhone_number;
    }

    // Getter
    public String getEmail() {
        return email;
    }
    // Setter
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void Register(){
       System.out.println("Doc is registered");
    }

    public void setDeRegister() {
        System.out.println("Doc is unregistered");
    }

}
