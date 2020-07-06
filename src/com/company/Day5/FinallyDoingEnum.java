package com.company.Day5;

import com.company.Day2.Car;
import com.company.Day2.Vehicule;

public class FinallyDoingEnum {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        Color c2 = Color.YELLOW;
      /*  System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.getDescription());
        System.out.println(c2.getDescription());
        System.out.println(c1.ordinal()); //l'ordre dans lequel il est */

       /* Brand b1 = Brand.AUDI;
        Car brandCar = new Car();
        brandCar.setBrand(b1);
        System.out.println();*/

        if (c1.getSomething()==c2.getSomething()){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }

        switch (c2){
            case BLUE:
                System.out.println("aaah blue");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case PURPLE:
                System.out.println("purple");
                break;
            default:
                System.out.println("BAD !!!");
                break;

        }
    }
}
