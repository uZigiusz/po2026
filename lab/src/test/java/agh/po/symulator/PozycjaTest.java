package agh.po.symulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PozycjaTest {

    @Test
    public void przemiesc() {
        Pozycja cel = new Pozycja(3.0, 4.0);

        Pozycja start1 = new Pozycja(0.0, 0.0);
        start1.przemiesc(0.1, 10.0, cel); // droga = 10 * 0.1 = 1.0

        assertEquals(0.6, start1.getX(), 0.001);
        assertEquals(0.8, start1.getY(), 0.001);

        Pozycja start2 = new Pozycja(0.0, 0.0);
        start2.przemiesc(1.0, 50.0, cel);

        assertEquals(3.0, start2.getX(), 0.001);
        assertEquals(4.0, start2.getY(), 0.001);

        Pozycja start3 = new Pozycja(0.0, 0.0);
        start3.przemiesc(0.3, 8.0, cel);

        assertEquals(1.44, start3.getX(), 0.001);
        assertEquals(1.92, start3.getY(), 0.001);

    }

    @Test
    public void getPozycja() {
        Pozycja p = new Pozycja(2.5, 4.0);
        String wynik = p.getPozycja();

        assertTrue(wynik.contains("2"));
        assertTrue(wynik.contains("4"));
        assertTrue(wynik.contains("0"));
    }

    @Test
    public void getX() {
        Pozycja p1 = new Pozycja(12.5, -3.0);
        Pozycja p2 = new Pozycja(13.5, -3.0);
        Pozycja p3 = new Pozycja(14.5, -3.0);


        assertEquals(12.5, p1.getX(), 0.001);
        assertEquals(13.5, p2.getX(), 0.001);
        assertEquals(14.5, p3.getX(), 0.001);

    }

    @Test
    public void getY() {
        Pozycja p1 = new Pozycja(12.5, -3.0);
        Pozycja p2 = new Pozycja(12.5, -2.0);
        Pozycja p3 = new Pozycja(12.5, -1.0);

        assertEquals(-3.0, p1.getY(), 0.001);
        assertEquals(-2.0, p2.getY(), 0.001);
        assertEquals(-1.0, p3.getY(), 0.001);

    }
}