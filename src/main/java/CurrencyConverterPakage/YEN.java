package CurrencyConverterPakage;

import java.util.Hashtable;

/*
    This class is called YEN and extends from Currency. Also, this class will handle the conversion from
    YEN to other currencies (USD,CAD,EURO).
*/

public class YEN extends Currency {

    // Private field that store the name of the currency (YEN)
    private String currencyName = "YEN";

    // Hashtable that will store the name of the currencies (Key) and their conversion rate from YEN (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (currency name) and their values (conversion rates).
    */
    public YEN(double a){
        super(a);
        rates  = new Hashtable<>();
        rates.put("CAD",0.0099);
        rates.put("USD",0.0077);
        rates.put("YEN",1.0);
        rates.put("EURO",0.0073);
    }

    // Overridden method form Currency class that return the name of this currency. (in this case its YEN)
    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    /*
       Overridden method from ConvertCurrency interface that takes a currency object and converts YEN to that currency.
       Returns a rounded number that has two decimal palaces.
     */
    @Override
    public double convert(Currency currency) {
        return Math.round((getAmount()*rates.get(currency.getCurrencyName()))*100.0)/100.0;
    }
}
