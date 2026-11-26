package agh.po.symulator;

public class Pozycja {

    double x;
    double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void przemiesc(double dt, double V, Pozycja cel) {
        double dx = cel.getX() - this.x;
        double dy = cel.getY() - this.y;
        double odleglosc = Math.sqrt(dx * dx + dy * dy);

        if (odleglosc == 0) {
            return;
        }

        double droga = V * dt;

        if (droga >= odleglosc) {
            this.x = cel.getX();
            this.y = cel.getY();
        } else {
            this.x += (dx / odleglosc) * droga;
            this.y += (dy / odleglosc) * droga;
        }
    }

    public String getPozycja(){
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
