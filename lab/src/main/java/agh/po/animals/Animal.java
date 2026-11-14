package agh.po.animals;

public abstract class Animal {

    String name;
    int legs;

    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    abstract String getDescription();

    public int getLegs() {
        return legs;
    }

    public abstract void makeSound();

}
