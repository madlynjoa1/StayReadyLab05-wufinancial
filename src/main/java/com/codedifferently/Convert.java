package com.codedifferently;

public class Convert{
    private Double usDollar = 1.0;
    private Double euro = 0.94;
    private Double britishPound = 0.82;
    private Double indianRupee = 68.32;
    private Double australianDollar= 1.35;
    private Double canadianDollar=1.32;
    private Double singaporeDollar= 1.43;
    private Double swissFranc= 1.01;
    private Double malaysianRinggit= 4.47;
    private Double japaneseYen= 115.84;
    private Double yuanRenminbi= 6.92;

    //TOUs() usDolar/ currentCurrency

     public double toUs(String currentCurrency){
         double rate;
         switch(currentCurrency){
             case("euro"):
                 rate= usDollar/euro;
                 break;
             case("britishPound"):
                 rate = usDollar/britishPound;
                 break;
             case("indianRupee"):
                 rate = usDollar/indianRupee;
                 break;
             case("australianDollar"):
                 rate = usDollar/australianDollar;
                 break;
             case("canadianDollar"):
                rate = usDollar/canadianDollar;
                break;
             case("singaporeDollar"):
                 rate= usDollar/singaporeDollar;
                 break;
             case("swissFranc"):
                 rate= usDollar/swissFranc;
                 break;
             case("malaysianRinggit"):
                 rate= usDollar/malaysianRinggit;
                 break;
             case("japaneseYen"):
                 rate= usDollar/japaneseYen;
                 break;
             case("yuanRenminbi"):
                 rate = usDollar/yuanRenminbi;
             default:
                 return 0.0;
         }
            return rate;
         }

    public double convert(double amount, String currCurrency, String toCurrency){
         double firstRate= toUs(currCurrency);
         double secondRate =1/toUs(toCurrency);
         return amount* firstRate* secondRate;
    }

}
