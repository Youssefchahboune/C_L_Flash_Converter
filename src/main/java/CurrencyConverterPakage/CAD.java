package CurrencyConverterPakage;

import java.util.Hashtable;

/*
    This class is called CAD and extends from Currency. Also, this class will handle the conversion from
    CAD to other currencies (YEN,USD,EURO).
*/

public class CAD extends Currency {

    // Private field that store the name of the currency (CAD)
    private String currencyName = "CAD";

    // Hashtable that will store the name of the currencies (Key) and their conversion rate from CAD (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (currency name) and their values (conversion rates).
    */
    public CAD(double a){
        super(a);
        rates  = new Hashtable<>();
        rates.put("CAD",1.0);
        rates.put("USD",0.78);
        rates.put("YEN",101.1);
        rates.put("EURO",0.74);
    }

    // Overridden method form Currency class that return the name of this currency. (in this case its CAD)
    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    /*
       Overridden method from ConvertCurrency interface that takes a currency object and converts CAD to that currency.
       Returns a rounded number that has two decimal palaces.
     */
    @Override
    public double convert(Currency currency) {
        return Math.round((getAmount()*rates.get(currency.getCurrencyName()))*100.0)/100.0;
    }
}
