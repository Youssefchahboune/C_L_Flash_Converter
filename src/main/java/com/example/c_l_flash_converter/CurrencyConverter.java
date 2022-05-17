package com.example.c_l_flash_converter;

public class CurrencyConverter {

    private double amount;
    private Currency currency1;
    private Currency currency2;

    public CurrencyConverter(double a){
        this.amount = a;
    }
    public Currency getCurrency(String c){
        if(c.equalsIgnoreCase("CAD")) {
            return  new CAD(this.amount);
        }
        else if (c.equalsIgnoreCase("USD")){
            return  new USD(this.amount);
        }
        else if (c.equalsIgnoreCase("YEN")){
            return new YEN(this.amount);
        }
        else if (c.equalsIgnoreCase("EURO")){
            return new EURO(this.amount);
        }

        return null;
    }

    public void setCurrency1(String currency1) {
        this.currency1 = getCurrency(currency1);
    }

    public void setCurrency2(String currency2) {
        this.currency2 = getCurrency(currency2);
    }

    public double converting(){
        return currency1.convert(currency2);
    }
}
