package com.company.Day2;

import com.company.Day5.Brand;

public class Vehicule {
    String brand;
    int year;  // integer, no decimal number
    double weight; // decimal number

    public String getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = getBrand();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
