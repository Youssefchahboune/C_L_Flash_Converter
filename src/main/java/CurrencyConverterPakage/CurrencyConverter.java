package CurrencyConverterPakage;

/*
    This class is called CurrencyConverter and will serve as the converter that sets the currencies and
    makes a call to the convert method which will perform the conversion.
 */

public class CurrencyConverter {

    // private field called amount
    private double amount;

    //Currency object called currency1
    private Currency currency1;

    //Currency object called currency2
    private Currency currency2;

    // Constructor that takes as a parameter (double).
    public CurrencyConverter(double a){
        this.amount = a;
    }

    /*
        method that returns a Currency object.
        This method takes a string and creates an object based on what the string is and puts the amount as the object
        parameter.
     */
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

    // method that takes a string and sets currency1
    // This method makes a call to the getCurrency method which will return a currency object and store it in currency1.
    public void setCurrency1(String currency1) {
        this.currency1 = getCurrency(currency1);
    }

    // method that takes a string and sets currency2
    // This method makes a call to the getCurrency method which will return a currency object and store it in currency2.
    public void setCurrency2(String currency2) {
        this.currency2 = getCurrency(currency2);
    }

    // method that returns a double value which is the converted amount from currency1 to currency2
    public double converting(){
        return currency1.convert(currency2);
    }
}
