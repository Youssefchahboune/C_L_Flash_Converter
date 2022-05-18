package LengthConverterPakage;

import java.util.Hashtable;

/*
    This class is called Millimeter and extends from Length. Also, this class will handle the conversion from
    Millimeter to other unit Length (CM,KM,M).
*/

public class Millimeter extends Length{

    // Private field that store the name of the unit length (MM)
    private String unitName = "MM";

    // Hashtable that will store the name of the unit lengths (Key) and their conversion rate from MM (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (unit length) and their values (conversion rates).
    */
    public Millimeter(double m){
        super(m);
        rates = new Hashtable<>();
        rates.put("KM",0.000001);
        rates.put("M",0.001);
        rates.put("CM",0.1);
        rates.put("MM",1.0);
    }

    // Overridden method form Length class that return the name of this unit length. (in this case its MM)
    @Override
    public String getLengthUnit() {
        return this.unitName;
    }

    /*
       Overridden method from ConvertLength interface that takes a Length object and converts MM to that unit object.
       Returns a rounded number that has two decimal palaces.
     */
    @Override
    public double convert(Length unit) {
        return Math.round((getMeasurement()*rates.get(unit.getLengthUnit()))*100.0)/100.0;
    }

}
