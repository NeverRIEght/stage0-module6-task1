package com.epam.mjc.stage0;

public class Animal {
    public String color;
    public int numberOfPaws;
    public boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly "  + color + ". It has " + (numberOfPaws == 1 ? (numberOfPaws + " paw") : (numberOfPaws + " paws")) + " and " + (hasFur == true ? "a" : "no") + " fur.";
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
