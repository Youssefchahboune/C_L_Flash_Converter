package CurrencyConverterPakage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurrencyConverter {

    String USD = "USD";
    String CAD = "CAD";
    String YEN = "YEN";
    String EURO = "EURO";


    //testing decimal input / amount
    @Test
    public void testing_Decimal_input(){
        double amount = 150.55;
        CurrencyConverter convertDecimalInput = new CurrencyConverter(amount);
        convertDecimalInput.setCurrency1(CAD);
        convertDecimalInput.setCurrency2(USD);
        convertDecimalInput.converting();

        assertEquals(convertDecimalInput.converting(),117.43);
    }

    //test CAD to USD
    @Test
    public void testing_CAD_To_USD(){
        int amount = 300;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(CAD);
        converter.setCurrency2(USD);
        converter.converting();

        assertEquals(converter.converting(),234);
    }

    //test CAD to CAD
    @Test
    public void testing_CAD_To_CAD(){

        int amount = 271;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(CAD);
        converter.setCurrency2(CAD);
        converter.converting();

        assertEquals(converter.converting(),271);
    }


    //test CAD to YEN
    @Test
    public void testing_CAD_To_YEN(){

        int amount = 15;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(CAD);
        converter.setCurrency2(YEN);
        converter.converting();

        assertEquals(converter.converting(),1516.5);
    }


    //test CAD to EURO
    @Test
    public void testing_CAD_To_EURO(){

        int amount = 254;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(CAD);
        converter.setCurrency2(EURO);
        converter.converting();

        assertEquals(converter.converting(),187.96);
    }

    //test USD to CAD
    @Test
    public void testing_USD_To_CAD(){

        int amount = 53;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(USD);
        converter.setCurrency2(CAD);
        converter.converting();

        assertEquals(converter.converting(),67.84);
    }

    //test USD to YEN
    @Test
    public void testing_USD_To_YEN(){

        int amount = 120;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(USD);
        converter.setCurrency2(YEN);
        converter.converting();

        assertEquals(converter.converting(),15574.8);
    }

    //test USD to EURO
    @Test
    public void testing_USD_To_EURO(){

        int amount = 175;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(USD);
        converter.setCurrency2(EURO);
        converter.converting();

        assertEquals(converter.converting(),166.25);
    }

    //test USD to USD
    @Test
    public void testing_USD_To_USD(){

        int amount = 12;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(USD);
        converter.setCurrency2(USD);
        converter.converting();

        assertEquals(converter.converting(),12);
    }

    //test YEN to CAD
    @Test
    public void testing_YEN_To_CAD(){

        int amount = 1200;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(YEN);
        converter.setCurrency2(CAD);
        converter.converting();

        assertEquals(converter.converting(),11.88);
    }

    //test YEN to YEN
    @Test
    public void testing_YEN_To_YEN(){

        int amount = 1376;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(YEN);
        converter.setCurrency2(YEN);
        converter.converting();

        assertEquals(converter.converting(),1376);
    }

    //test YEN to EURO
    @Test
    public void testing_YEN_To_EURO(){

        int amount = 20000;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(YEN);
        converter.setCurrency2(EURO);
        converter.converting();

        assertEquals(converter.converting(),146);
    }

    //test YEN to USD
    @Test
    public void testing_YEN_To_USD(){

        int amount = 45000;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(YEN);
        converter.setCurrency2(USD);
        converter.converting();

        assertEquals(converter.converting(),346.5);
    }

    //test EURO to CAD
    @Test
    public void testing_EURO_To_CAD(){

        int amount = 20;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(EURO);
        converter.setCurrency2(CAD);
        converter.converting();

        assertEquals(converter.converting(),27.2);
    }

    //test EURO to YEN
    @Test
    public void testing_EURO_To_YEN(){

        int amount = 66;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(EURO);
        converter.setCurrency2(YEN);
        converter.converting();

        assertEquals(converter.converting(),9036.72);
    }

    //test EURO to EURO
    @Test
    public void testing_EURO_To_EURO(){

        int amount = 50;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(EURO);
        converter.setCurrency2(EURO);
        converter.converting();

        assertEquals(converter.converting(),50);
    }

    //test EURO to USD
    @Test
    public void testing_EURO_To_USD(){

        int amount = 120;
        CurrencyConverter converter = new CurrencyConverter(amount);
        converter.setCurrency1(EURO);
        converter.setCurrency2(USD);
        converter.converting();

        assertEquals(converter.converting(),126);
    }


}
