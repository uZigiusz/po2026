package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    @Test
    public void doubleX() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.doubleX("axxbb"));
        assertFalse(cb.doubleX("xaxx"));
        assertFalse(cb.doubleX("aaaax"));
    }

    @Test
    public void last2() {
        CodingBat cb = new CodingBat();
        assertEquals(1, cb.last2("hixxhi"));
        assertEquals(2, cb.last2("axxxaxx"));
        assertEquals(3, cb.last2("xxaxxaxxaxx"));
    }

    @Test
    public void stringTimes() {
        CodingBat cb = new CodingBat();
        assertEquals("hihi", cb.stringTimes("hi", 2));
        assertEquals("hihihi", cb.stringTimes("hi", 3));
        assertEquals("xxxx", cb.stringTimes("x", 4));
    }

    @Test
    public void array123() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.array123(new int[]{1, 2, 1, 2, 3}));
        assertFalse(cb.array123(new int[]{1, 2, 1, 4, 3}));
        assertTrue(cb.array123(new int[]{1, 2, 3}));
    }
}