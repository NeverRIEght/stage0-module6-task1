package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFur() {
        return hasFur;
    }

    public void setFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly "  + getColor() + ". It has " +
                (getNumberOfPaws() == 1 ? (getNumberOfPaws() + " paw") : (getNumberOfPaws() + " paws")) +
                " and " + (getFur() == true ? "a" : "no") + " fur.";
    }

    public static void main(String args[]) {
        Animal animal = new Animal("red", 2, false);
        Bird bird = new Bird();
        Dog dog = new Dog();

        animal.getDescription();
        bird.getDescription();
        dog.getDescription();
    }
}
