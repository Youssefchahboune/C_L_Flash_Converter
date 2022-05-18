package LengthConverterPakage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLengthConverter {
    @Test
    public void test(){

        LengthConverter converter = new LengthConverter(5);
        converter.setUnit1("M");
        converter.setUnit2("MM");
        converter.converting();

        assertEquals(converter.converting(),5000);
    }

}
