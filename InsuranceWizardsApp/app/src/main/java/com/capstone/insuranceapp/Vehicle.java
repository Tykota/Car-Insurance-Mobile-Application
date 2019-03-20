package com.capstone.insuranceapp;


import java.io.Serializable;

public class Vehicle implements Serializable {
    private String vin;
    private String make;
    private String year;
    private String model;

    public Vehicle(String make, String model, String year, String vin){
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }
}