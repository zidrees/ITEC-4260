package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAbsoluteValue() {
        Assert.assertEquals(10, Math.abs(-10));
        //Assert.assertEquals(9,Math.abs(-8));
    }

    @Test
    public void testLocalDate() {
        LocalDate today = LocalDate.of(2021, 1, 27);
        System.out.println(today);
        System.out.println(today.getDayOfYear());
    }

    @Test
    public void testCalc() {
        System.out.println(0.1 + 0.2);
    }
}
