package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        Pozycja start = new Pozycja(0.0, 0.0);
        Pozycja cel = new Pozycja(3.0, 4.0);

        System.out.println("Przed ruchem: " + start.getPozycja());

        start.przemiesc(0.3, 8.0, cel);

        System.out.println("Po 1 kroku: x = " + start.getX() + ", y = " + start.getY());
        System.out.println("Sformatowana pozycja: " + start.getPozycja());
    }
}