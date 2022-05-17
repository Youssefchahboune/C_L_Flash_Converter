package CurrencyConverterPakage;

import CurrencyConverterPakage.Currency;

import java.util.Hashtable;

public class YEN extends Currency {
    private String currencyName = "YEN";

    private Hashtable<String,Double> rates;

    public YEN(double a){
        super(a);
        rates  = new Hashtable<>();
        rates.put("CAD",0.0099);
        rates.put("USD",0.0077);
        rates.put("YEN",1.0);
        rates.put("EURO",0.0073);
    }

    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    @Override
    public double convert(Currency currency) {
        return getAmount()*rates.get(currency.getCurrencyName());
    }
}
