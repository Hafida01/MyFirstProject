package com.company.Day5;

public class Boat {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public Boat (int max){
    maxSpeed = max;
            }

    public Boat (){
        System.out.println("I'm in the empty constructor");
    }
}
