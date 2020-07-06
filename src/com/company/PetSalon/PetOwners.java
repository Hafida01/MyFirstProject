package com.company.PetSalon;

public class PetOwners {
    private String address;
    private Animal myAnimal;
    private String name;
    private boolean spacialOccasion;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getMyAnimal() {
        return myAnimal;
    }

    public void setMyAnimal(Animal myAnimal) {
        this.myAnimal = myAnimal;
    }

    public boolean isSpacialOccasion() {
        return spacialOccasion;
    }

    public void setSpacialOccasion(boolean spacialOccasion) {
        this.spacialOccasion = spacialOccasion;
    }
}
