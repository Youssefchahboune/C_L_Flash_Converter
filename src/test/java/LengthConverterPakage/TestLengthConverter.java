package LengthConverterPakage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLengthConverter {

    // Fields
    String KM = "KM";
    String M = "M";
    String CM = "CM";
    String MM = "MM";


    //test Decimal input
    @Test
    public void test_Decimal_Input(){

        double measurement = 5.5;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(M);
        converter.setUnit2(MM);
        converter.converting();

        assertEquals(converter.converting(),5500);
    }

    // test KM to KM
    @Test
    public void test_KM_To_KM(){

        int measurement = 400;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(KM);
        converter.setUnit2(KM);
        converter.converting();

        assertEquals(converter.converting(),400);
    }

    // test KM to M
    @Test
    public void test_KM_To_M(){

        int measurement = 56;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(KM);
        converter.setUnit2(M);
        converter.converting();

        assertEquals(converter.converting(),56000);
    }

    // test KM to CM
    @Test
    public void test_KM_To_CM(){

        int measurement = 145;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(KM);
        converter.setUnit2(CM);
        converter.converting();

        assertEquals(converter.converting(),14500000);
    }

    // test KM to MM
    @Test
    public void test_KM_To_MM(){

        int measurement = 27;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(KM);
        converter.setUnit2(MM);
        converter.converting();

        assertEquals(converter.converting(),27000000);
    }

    // test M to M
    @Test
    public void test_M_To_M(){

        int measurement = 90;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(M);
        converter.setUnit2(M);
        converter.converting();

        assertEquals(converter.converting(),90);
    }

    // test M to KM
    @Test
    public void test_M_To_KM(){

        int measurement = 1;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(M);
        converter.setUnit2(KM);
        converter.converting();

        assertEquals(converter.converting(),0.001);
    }

    // test M to CM
    @Test
    public void test_M_To_CM(){

        int measurement = 4;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(M);
        converter.setUnit2(CM);
        converter.converting();

        assertEquals(converter.converting(),400);
    }

    // test M to MM
    @Test
    public void test_M_To_MM(){

        int measurement = 12;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(M);
        converter.setUnit2(MM);
        converter.converting();

        assertEquals(converter.converting(),12000);
    }

    // test CM to CM
    @Test
    public void test_CM_To_CM(){

        int measurement = 5;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(CM);
        converter.setUnit2(CM);
        converter.converting();

        assertEquals(converter.converting(),5);
    }

    // test CM to KM
    @Test
    public void test_CM_To_KM(){

        int measurement = 10;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(CM);
        converter.setUnit2(KM);
        converter.converting();

        assertEquals(converter.converting(),0.0001);
    }

    // test CM to M
    @Test
    public void test_CM_To_M(){

        int measurement = 23;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(CM);
        converter.setUnit2(M);
        converter.converting();

        assertEquals(converter.converting(),0.23);
    }

    // test CM to MM
    @Test
    public void test_CM_To_MM(){

        int measurement = 33;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(CM);
        converter.setUnit2(MM);
        converter.converting();

        assertEquals(converter.converting(),330);
    }

    // test MM to MM
    @Test
    public void test_MM_To_MM(){

        int measurement = 85;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(MM);
        converter.setUnit2(MM);
        converter.converting();

        assertEquals(converter.converting(),85);
    }

    // test MM to KM
    @Test
    public void test_MM_To_KM(){

        int measurement = 63;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(MM);
        converter.setUnit2(KM);
        converter.converting();

        assertEquals(converter.converting(),0.000063);
    }

    // test MM to M
    @Test
    public void test_MM_To_M(){

        int measurement = 15;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(MM);
        converter.setUnit2(M);
        converter.converting();

        assertEquals(converter.converting(),0.015);
    }

    // test MM to CM
    @Test
    public void test_MM_To_CM(){

        int measurement = 9;
        LengthConverter converter = new LengthConverter(measurement);
        converter.setUnit1(MM);
        converter.setUnit2(CM);
        converter.converting();

        assertEquals(converter.converting(),0.9);
    }


}
