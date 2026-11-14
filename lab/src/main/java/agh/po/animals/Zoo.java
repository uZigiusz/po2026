package agh.po.animals;
import java.util.ArrayList;
import java.util.Random;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;


public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int wybor = random.nextInt(3);
            if (wybor == 0) {
                animals[i] = new Parrot("czarny" + i);
            } else if (wybor == 1) {
                animals[i] = new Dog("Borys" + i);
            } else {
                animals[i] = new Snake("judasz" + i);
            }
        }

        for (Animal animal : animals) {
            int legs = animal.getLegs();
            String description = animal.getDescription();
            System.out.println(description);
            animal.makeSound();
        }



        int totalLegs = countTotalLegs(animals);
        System.out.println("suma nog wszystkich zwierzat: " + totalLegs);



    }

    public static int countTotalLegs(Animal[] animals) {
        int sum = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.getLegs();
            }
        }
        return sum;
    }

}