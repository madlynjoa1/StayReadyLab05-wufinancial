package com.codedifferently;

public class Convert extends Rates{
    public Double dollarToEuro(double amount){
        double num= (getusDollar()/getEuro()) *amount;
        return num;
    }
    public Double euroTobritishPound(double amount){
        double num = (getEuro()/getBritishPound()) * amount;
        return num;
    }
    public Double EuroTodollar(double amount){
        double num = (getEuro()/getusDollar()) * amount;
        return num; 
    }
    public Double britishPoundToindianRupee(double amount){
        double num = (getBritishPound()/getIndianRupee()) * amount;
        return num;
    }
    public Double indianRupeeTOcanadianDollar(double amount){
        double num = (getIndianRupee()/getCanadianDollar()) * amount;
        return num;
    }
    public Double canadianDollarTosingaporeDollar(double amount){
        double num = (getCanadianDollar()/getSingaporeDollar()) * amount;
        return num;
    }

    public Double singaporDolToSwissFranc(double amount){
        double num = (getSingaporeDollar()/getSwissFranc())*amount;
        return num;
    }
    public Double swissFrancToMalaysianRinggit(Double amount){
        double num = (getSwissFranc()/getMalaysianRinggit())*amount;
        return num;
    }
    public Double malaysianRinToJapaneseYen(Double amount){
        double num = (getMalaysianRinggit()/getJapaneseYen())*amount;
        return num;
    }
    public Double japaneseYenToChineseYuan(Double amount){
        double num=(getJapaneseYen()/getYuanRenminbi())*amount;
        return num;
    }
}
