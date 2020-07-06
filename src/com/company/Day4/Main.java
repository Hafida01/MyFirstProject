package com.company.Day4;

public class Main {


    public static void main(String[] args) {

        //exercice 1
        //FunWithArray fun = new FunWithArray();
        //fun.EnjoyArray();

        //exercice 2
        double[][] m = {
                {1.5, 2.0, 3, 4},
                {5.5, 6, 7, 8},
                {9.5, 1, 3, 1}
        };

        double [] row = new double[3];

        for (int i = 0; i < m.length; i++) {
            row[i] = 0;
            System.out.println("Array " + i + " " + m[i]);
            for (int j = 0; j < 4; j++) {
                row[i] = row[i] + m[i][j];
            }
            System.out.println("sum of element row " + i + " = " + row[i]);
        }

    }

    }

