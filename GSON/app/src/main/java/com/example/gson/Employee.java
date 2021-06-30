package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("user_name")
    private String name;
    @SerializedName("user_email")
    private String email;
    @SerializedName("user_age")
    private int age;

    private Address address;

    public Employee(String name, String email, int age,Address address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address=address;
    }
}
