package com.company.PetSalon;

public class PetSalon {

    public static void main(String[] args) {

        PetOwners client = new PetOwners();
        CleanPet cleaner = new CleanPet();
        Animal theAnimal = new Animal();
        String day;

        theAnimal.setAnimal("Labrador");
        theAnimal.setDirty(false);
        client.setAddress("rue du chien");
        client.setMyAnimal(theAnimal);
        client.setName("Java");
        client.setSpacialOccasion(false);
        day = "Wednesday";

        cleaner.setCleaner("Vivian");
        cleaner.setHour(1);
        cleaner.setTime(1.5);

        // dirty or special occasion ==> wash
        if (theAnimal.isDirty() || client.isSpacialOccasion()){
            System.out.println("clean the animal (dirty) : " + client.getName());
        // day i Wednesday ==> wash
        } else if (day == "Wednesday") {
            System.out.println("clean the animal (Wednesday): " + client.getName());
        } else {
            System.out.println("no need to clean the animal : " + client.getName());
        }

        int x = 1;
        int y = 0;
        while(x <= 1000000){
            y= y + 1;
            System.out.println("Line = " + y + " and x = " + x);
            x= x + x;
        }
        System.out.println("x = " + x);
        System.out.println("counter = " + y);

        // System.out.println(client.getName() + " " + cleaner.getTime());

        // For loop

        for (int i = 0; i<10;i++) {
            System.out.println("i : " + i);
        }


    }
}
