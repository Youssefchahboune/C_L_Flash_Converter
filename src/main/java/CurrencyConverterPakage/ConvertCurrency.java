package CurrencyConverterPakage;

/*
    Interface that has an abstract method that will take a Currency object and then do the conversion
    when overridden in the USD, CAD, EURO and YEN classes because they extend the Currency class and the
    Currency class implements this interface.
 */


public interface ConvertCurrency {
    public double convert(Currency currency);
}
