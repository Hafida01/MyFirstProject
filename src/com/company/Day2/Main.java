package com.company.Day2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.setLicensePlate("1-mpl 152");
        myCar.setLicensePlate2("1-xxx 000");
        myCar.setWeight(1100.5);
        myCar.setYear(2013);
        myCar.setConvertible(false);
        System.out.println(myCar);

        /*Dog myDog = new Dog();
        myDog.age = 5;
        myDog.colorDog = "black";
        myDog.nameDog = "Java";
        myDog.race = "Labrador";
        myDog.weight = 23.6;*/
        //  System.out.println("Hello everybody");    }

        // sol 1
        //String s = myCar.honkSound();
        //System.out.println(s);
        //System.out.println(myCar.honkSound());

        // sol 2
        //myCar.honkSound();
        //Vehicule vehicule = new Bike();
        //Vehicule myCar2 = new Car();
        //Vehicule vehicule = new Vehicule();
        //((Car) myCar2).convertible = true; //Polimorfisme
        //Car itsAC = (Car) myCar2;

        // sol 3
        //myCar.seatBelt = false;
        //myCar.notWearingSeatbelt();

        // sol 4
        //myCar.seatBelt = false;
        //String sound1 = "bip bip";
        //String sound2 = "ring ring";
        //myCar.notWearingSeatbeltWithSpecificSound(sound1, 2);
        //myCar.notWearingSeatbeltWithSpecificSound(sound2, 5);


    }
}
