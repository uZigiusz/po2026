package agh.po.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }

    @Override
    public String getDescription(){
        return "Dog: " + name;
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }



}
