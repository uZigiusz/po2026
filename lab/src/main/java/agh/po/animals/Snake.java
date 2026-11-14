package agh.po.animals;

public class Snake extends Animal {
    public Snake(String name ) {
        super(name, 0);
    }

    @Override
    public String getDescription(){
        return "Snake: " + name;
    }

    @Override
    public void makeSound() {
        System.out.println("sss");
    }


}
