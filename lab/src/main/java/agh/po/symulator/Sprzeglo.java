package agh.po.symulator;

public class Sprzeglo extends Komponent{

    boolean stanSprzegla;


    public Sprzeglo(String nazwa, double waga, double cena, String producent, String model) {
        super(nazwa, waga, cena, producent, model);
        this.stanSprzegla = false;
    }

    public void wcisnij(){
        this.stanSprzegla = true;
    }

    public void zwolnij(){
        this.stanSprzegla = false;
    }

    public boolean isStanSprzegla(){
        return stanSprzegla;
        }
}
