package CurrencyConverterPakage;

/*
      Currency Class that has 1 field and 3 methods this class will be abstract because it will
      contain one abstract method and at the same time it will not make any sense if we are able to
      create a currency object.
 */



public abstract class Currency implements ConvertCurrency {

    // field called amount of type double
    private double amount;

    // Currency constructor that takes a double parameter / amount
    public Currency(double a){
        this.amount = a;
    }

    // method that will get the amount entered
    public double getAmount() {
        return this.amount;
    }

    //abstract method that needs to be overridden in the classes the extends from the Currency class
    // This method will return the name of the currencies.
    public abstract String getCurrencyName();
}
