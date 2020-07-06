package com.company.Day5;

public enum Color {
    BLUE("like the sky", 4), PURPLE("like eggplants", 6), YELLOW("like banana", 534), GREEN("like grass",8);

    private String description;
    private int something;

    public int getSomething() {
        return something;
    }

    public void setSomething(int something) {
        this.something = something;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Color(String description, int something) {
        this.description = description;
        this.something = something;
    }

}
