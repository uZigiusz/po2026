package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void doubleX() {

        CodingBat aa = new CodingBat();
        assertEquals(true, aa.doubleX("axxbb"));
    }
}