package CurrencyConverterPakage;

import java.util.Hashtable;

/*
    This class is called USD and extends from Currency. Also, this class will handle the conversion from
    USD to other currencies (YEN,CAD,EURO).
*/

public class USD extends Currency {

    // Private field that store the name of the currency (USD)
    private String currencyName = "USD";

    // Hashtable that will store the name of the currencies (Key) and their conversion rate from USD (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (currency name) and their values (conversion rates).
    */
    public USD(double a){
        super(a);
        rates = new Hashtable<>();
        rates.put("CAD",1.28);
        rates.put("USD",1.0);
        rates.put("YEN",129.79);
        rates.put("EURO",0.95);
    }

    // Overridden method form Currency class that return the name of this currency. (in this case its USD)
    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    /*
       Overridden method from ConvertCurrency interface that takes a currency object and converts USD to that currency.
       Returns a rounded number that has two decimal palaces.
     */
    @Override
    public double convert(Currency currency) {
        return Math.round((getAmount()*rates.get(currency.getCurrencyName()))*100.0)/100.0;
    }
}
