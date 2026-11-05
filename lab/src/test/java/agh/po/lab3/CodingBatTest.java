package agh.po.lab3;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void mapAB2() {
        CodingBat cb = new CodingBat();

        Map<String, String> test = new HashMap<>();
        test.put("a", "aaa");
        test.put("b", "aaa");
        test.put("c", "cake");

        Map<String, String> expected = new HashMap<>();
        expected.put("c", "cake");
        assertEquals(expected, cb.mapAB2(test));

    }



}