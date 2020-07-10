package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    @Test
    public void toUsTest(){
        Convert convert= new Convert();

        double expected= 1.0638297872340425;
        double actual= convert.toUs("euro");

        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void  convertTest()
    {
        Convert c = new Convert();

        double expected = 34.8936170212766;
        double actual = c.convert(40,"euro", "britishPound");

        Assert.assertEquals(expected, actual, 0.0);
    }
    //Convert Canadian Dollar to Singapore Dollar
    @Test
    public void  convertTest1()
    {
        Convert c = new Convert();

        double expected = 54.16666666666666;
        double actual = c.convert(50,"canadianDollar", "singaporeDollar");

        Assert.assertEquals(expected, actual, 0.0);
    }
    //Convert Malaysian Ringgit to Japanese Yen
    @Test
    public void  convertTest2()
    {
        Convert c = new Convert();

        double expected = 518.2997762863534;
        double actual = c.convert(20,"malaysianRinggit", "japaneseYen");

        Assert.assertEquals(expected, actual, 0.0);
    }

}