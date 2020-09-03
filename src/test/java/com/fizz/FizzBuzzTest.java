package com.fizz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testNumberWithNormal() {
        Assert.assertEquals("1", FizzBuzz.getNameBy(1));
        Assert.assertEquals("19", FizzBuzz.getNameBy(19));
    }

    @Test
    public void testNumberAbout3() {
        Assert.assertEquals("fizz", FizzBuzz.getNameBy(3));
        Assert.assertEquals("fizz", FizzBuzz.getNameBy(13));
    }

    @Test
    public void testNumberAbout5() {
        Assert.assertEquals("buzz", FizzBuzz.getNameBy(5));
        Assert.assertEquals("buzz", FizzBuzz.getNameBy(52));
    }

    @Test
    public void testNumberAbout3And5() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.getNameBy(35));
        Assert.assertEquals("fizzbuzz", FizzBuzz.getNameBy(51));
        Assert.assertEquals("fizzbuzz", FizzBuzz.getNameBy(53));
    }

    @Test
    public void funGame() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ":" + FizzBuzz.getNameBy(i));
        }
    }
}
