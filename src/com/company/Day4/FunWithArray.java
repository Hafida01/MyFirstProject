package com.company.Day4;

public class FunWithArray {
    public void EnjoyArray() {
        int i;
        String[] favoriteFood = new String[6];

        favoriteFood[0] = "something1";
        favoriteFood[2] = "something2";
        favoriteFood[3] = "something3";
        favoriteFood[4] = "something4";
        favoriteFood[5] = "something5";

        for (i = 0; i < 5; i++) {
            System.out.println(favoriteFood[i]);
        }
    }
}
