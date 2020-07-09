package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    @Test
    public void dollarToEuroTest(){
        Convert convert= new Convert();
        
        Double expected = 10.638297872340425;
        Double actual = convert.dollarToEuro(10.0);

        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void EuroToDollarTest(){
        Convert convert = new Convert();

        Double expected = 9.399999999999999;
        Double actual = convert.EuroTodollar(10.0);
        
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void euroToBritishPoundTest(){
        Convert convert = new Convert();

        Double expected = 11.463414634146341;
        Double actual = convert.euroTobritishPound(10.0);
        
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void britishPoundToIndianRupeeTest(){
        Convert convert = new Convert();

        Double expected = 0.12002341920374708;
        Double actual = convert.britishPoundToindianRupee(10.0);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void indianRupeeToCanadianDollarTest(){
        Convert convert = new Convert();

        Double expected = 517.5757575757575;
        Double actual = convert.indianRupeeTOcanadianDollar(10.0);

        Assert.assertEquals(expected, actual);
    }
   


// Convert Canadian Dollar to Singapore Dollar
    @Test
    public void canadianDollarToSingaporeDollarTest(){
        Convert convert= new Convert();
        
        double expected = 4.615384615384616;
        double actual = convert.canadianDollarTosingaporeDollar(5.0);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void singaporDolToSwissFrancTest(){
        Convert convert= new Convert();
        
        double expected = 7.079207920792079;
        double actual = convert.singaporDolToSwissFranc(5.0);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void swissFrancToMalaysianRinggitTest(){
        Convert convert= new Convert();
        
        double expected =1.1297539149888145;
        double actual = convert.swissFrancToMalaysianRinggit(5.0);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void malaysianRinToJapaneseYenTest(){
        Convert convert= new Convert();
        
        double expected = 0.7717541436464087;
        double actual = convert.malaysianRinToJapaneseYen(20.0);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void japaneseYenToChineseYuanTest(){
        Convert convert= new Convert();
        
        double expected = 167.39884393063585;
        double actual = convert.japaneseYenToChineseYuan(10.0);
        Assert.assertEquals(expected, actual, 0.0);
    }
    
}