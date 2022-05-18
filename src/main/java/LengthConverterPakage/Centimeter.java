package LengthConverterPakage;

import java.util.Hashtable;

/*
    This class is called Centimeter and extends from Length. Also, this class will handle the conversion from
    Centimeter to other unit Length (KM,MM,M).
*/

public class Centimeter extends Length{

    // Private field that store the name of the unit length (CM)
    private String unitName = "CM";

    // Hashtable that will store the name of the unit lengths (Key) and their conversion rate from CM (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (unit length) and their values (conversion rates).
    */
    public Centimeter(double m){
        super(m);
        rates = new Hashtable<>();
        rates.put("KM",0.00001);
        rates.put("M",0.01);
        rates.put("CM",1.0);
        rates.put("MM",10.0);
    }

    // Overridden method form Length class that return the name of this unit length. (in this case its CM)
    @Override
    public String getLengthUnit() {
        return this.unitName;
    }

    /*
       Overridden method from ConvertLength interface that takes a Length object and converts CM to that unit object.
     */
    @Override
    public double convert(Length unit) {
        return getMeasurement()*rates.get(unit.getLengthUnit());
    }
}
