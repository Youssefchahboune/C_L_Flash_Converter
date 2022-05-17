package com.example.c_l_flash_converter;

public abstract class Currency implements ConvertCurrency{

    private double amount;

    public Currency(double a){
        this.amount = a;
    }

    public double getAmount() {
        return this.amount;
    }

    public abstract String getCurrencyName();
}
