package agh.po.symulator;

public class Silnik extends Komponent{

    int maxObroty;
    int obroty;

    public Silnik(String nazwa, double waga, double cena, String producent, String model, int maxObroty){
        super(nazwa, waga, cena, producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }


    public void uruchom(){

        this.obroty = 800;
    }

    public void zatrzymaj(){

        this.obroty = 0;
    }

    public void zwiekszObroty(){
        if(obroty > 0 && obroty + 300 < maxObroty){
            obroty += 300;
        }
    }

    public void zmniejszObroty() {
        if (obroty - 300 >= 800) {
            obroty -= 300;
        }
    }

    public int getObroty(){
        return obroty;
    }

    public int getMaxObroty(){
        return maxObroty;
    }
}




