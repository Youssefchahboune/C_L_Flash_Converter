package CurrencyConverterPakage;

import CurrencyConverterPakage.ConvertCurrency;

public abstract class Currency implements ConvertCurrency {

    private double amount;

    public Currency(double a){
        this.amount = a;
    }

    public double getAmount() {
        return this.amount;
    }

    public abstract String getCurrencyName();
}
