package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest1 {

    @org.junit.Test
    public void doubleX() {
        CodingBat aa = new CodingBat();
        assertEquals(true, aa.doubleX("axxbb"));
        assertEquals(false, aa.doubleX("xaxx"));

    }

    @org.junit.Test
    public void last2() {
        CodingBat aa = new CodingBat();
        assertEquals(1, aa.doubleX("hixxhi"));

    }

    @org.junit.Test
    public void stringTimes() {
        CodingBat aa = new CodingBat();
        assertEquals("hihi", aa.doubleX("hi"));


    }
}