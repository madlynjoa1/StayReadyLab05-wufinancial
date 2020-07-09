package com.codedifferently;

import static org.junit.Assume.assumeNoException;

import org.junit.Assert;
import org.junit.Test;


public class RatesTest {
    @Test
    public void getusDollarTest(){
        //Given
        Rates rates = new Rates();
        //When 
        Double expected= 1.0;
        Double actual= rates.getusDollar();
        //Then
        Assert.assertEquals(expected, actual,0.0);
       
    }
     @Test
     public void geteuroTest(){
         //Given
         Rates rates = new Rates();
         //When
         Double expected = 0.94;
         Double actual = rates.getEuro();
         //Then
         Assert.assertEquals(expected, actual, 0.0);
     }
     @Test
     public void getbritishPound(){
         //Given
         Rates rates = new Rates();

         //When
         Double expected = 0.82;
         Double actual = rates.getBritishPound();
         
         //Then
         Assert.assertEquals(expected, actual, 0.0);
     }
     @Test
     public void getindianRupee(){
         //Given
         Rates rates = new Rates();
         
         //When
         Double expected = 68.32;
         Double actual = rates.getIndianRupee();
         //Then
         Assert.assertEquals(expected, actual, 0.0);
     }
     @Test
     public void getaustralianDollar(){
         //Given
         Rates rates = new Rates();
         
         //When
         Double expected = 1.35;
         Double actual = rates.getAustralianDollar();
         //Then
         Assert.assertEquals(expected, actual, 0.0);
     }
     
     






    @Test
    public void getCanadianDollarTest(){
        Rates rates= new Rates();

        double expected = 1.32;
        double actual = rates.getCanadianDollar();

        Assert.assertEquals(expected, actual, 0.0);
        
    }
    @Test
    public void singaporeDollarTest(){
        Rates rates = new Rates();
        
        double expected =1.43;
        double actual = rates.getSingaporeDollar();

        Assert.assertEquals(expected, actual, 0.0);
        
    }
    @Test
    public void swissFrancTest(){
        Rates rates= new Rates();

        double expected = 1.43;
        double actual = rates.getSwissFranc();

        Assert.assertEquals(expected,actual ,0.0);
        
    }
    @Test 
    public void malaysianRinggit(){
        Rates rates= new Rates();
        
        double expected = 4.47;
        double actual = rates.getMalaysianRinggit();

        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void japaneseYenTest(){
        Rates rates= new Rates();

        double expected= 115.84;
        double actual = rates.getJapaneseYen();

        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
     public void yuanRenminbiTest(){
         Rates rates = new Rates();

         double expected = 6.92;
         double actual = rates.getYuanRenminbi();
         
         Assert.assertEquals(expected, actual, 0.0);
     }
    
}