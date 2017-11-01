package com.niketgoel.assignmenr82;

/**
 * Created by niketgoel on 31/10/17.
 */

public class Customer {

    private String name = "";
    private String phone = "";


    public Customer(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
