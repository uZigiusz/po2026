package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String nazwa, double waga, double cena, String producent, String model, int iloscBiegow, Sprzeglo sprzeglo) {
        super(nazwa, waga, cena, producent, model);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    public void zwiekszBieg() {
        if (sprzeglo.isStanSprzegla() && aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            aktualnePrzelozenie = aktualnyBieg * 0.6;
        } else if (!sprzeglo.isStanSprzegla()) {
            System.out.println("Wciśnij sprzęgło przed zmianą biegu!");
        }
    }

    public void zmniejszBieg() {
        if (sprzeglo.isStanSprzegla() && aktualnyBieg > 0) {
            aktualnyBieg--;
            aktualnePrzelozenie = aktualnyBieg * 0.6;
        } else if (!sprzeglo.isStanSprzegla()) {
            System.out.println("Wciśnij sprzęgło przed zmianą biegu!");
        }
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public double getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }

    public void wyzerujBieg() {
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }
}