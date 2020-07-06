package com.company.Day2;

public class Car extends Vehicule {
    private String licensePlate;
    int year;
    // integer, no decimal number
    double weight;
    // decimal number
    boolean convertible;
    boolean seatBelt;

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        System.out.println(this.licensePlate);
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

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }
// public/private =whatever the method sends back
    // + name of the method
    // + () + that might containinput params

    // sol 1
    //public String honkSound() {
    //   return  "TTUT TTUUUUUT";
    //}

    // sol 2
    // public void honkSound() {
    //    System.out.println("TTUT TTUUUUUT");
    //}

    // sol 3
    //public void notWearingSeatbelt() {
    //    if (seatBelt != true) {
    //        System.out.println("Bip Bip");
    //    }
    //}

    // sol 4
    //public void notWearingSeatbeltWithSpecificSound(String annoyingSound, int i) {
    //    if (seatBelt != true) {
    //        System.out.println(i + " times " + annoyingSound);
    //    }
    //}

    // getters and setters
    public  String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate2(String licensePlate){
        this.licensePlate = licensePlate;
        System.out.println(this.licensePlate);
    }
}
