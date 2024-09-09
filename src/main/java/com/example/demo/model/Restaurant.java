package com.example.demo.model;

import java.util.Arrays;

public class Restaurant {
    private String name;
    private int capacity;
    private Address address;
    private int phoneNumber;



    @Override
    public String toString() {
        return "Restaurant{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", phoneNumber=" + phoneNumber +
                '}';
    }



    public Restaurant(Address address, int capacity, String name, int phoneNumber) {
        this.address = address;
        this.capacity = capacity;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public Restaurant() {
    }



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }








}
