package com.company.Day5;

public class ExplainConstructor {
    public static void main(String[] args) {
        Boat boat1 = new Boat(30);
        System.out.println(boat1.getMaxSpeed());

        Boat boat2 = new Boat();
        System.out.println(boat2.getMaxSpeed());

    }
}
