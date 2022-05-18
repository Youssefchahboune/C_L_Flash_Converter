package CurrencyConverterPakage;

import java.util.Hashtable;

/*
    This class is called EURO and extends from Currency. Also, this class will handle the conversion from
    EURO to other currencies (YEN,CAD,USD).
*/

public class EURO extends Currency {

    // Private field that store the name of the currency (EURO)
    private String currencyName = "EURO";

    // Hashtable that will store the name of the currencies (Key) and their conversion rate from EURO (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (currency name) and their values (conversion rates).
    */
    public EURO(double a){
        super(a);
        rates  = new Hashtable<>();
        rates.put("CAD",1.36);
        rates.put("USD",1.05);
        rates.put("YEN",136.92);
        rates.put("EURO",1.0);
    }

    // Overridden method form Currency class that return the name of this currency. (in this case its EURO)
    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    /*
       Overridden method from ConvertCurrency interface that takes a currency object and converts EURO to that currency.
       Returns a rounded number that has two decimal palaces.
     */
    @Override
    public double convert(Currency currency) {
        return Math.round((getAmount()*rates.get(currency.getCurrencyName()))*100.0)/100.0;
    }
}
