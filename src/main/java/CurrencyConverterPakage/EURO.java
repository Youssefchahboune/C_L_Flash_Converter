package CurrencyConverterPakage;

import CurrencyConverterPakage.Currency;

import java.util.Hashtable;

public class EURO extends Currency {
    private String currencyName = "EURO";

    private Hashtable<String,Double> rates;

    public EURO(double a){
        super(a);
        rates  = new Hashtable<>();
        rates.put("CAD",1.36);
        rates.put("USD",1.05);
        rates.put("YEN",136.92);
        rates.put("EURO",1.0);
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
