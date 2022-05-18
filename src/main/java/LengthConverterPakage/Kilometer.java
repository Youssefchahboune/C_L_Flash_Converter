package LengthConverterPakage;

import java.util.Hashtable;

/*
    This class is called Kilometer and extends from Length. Also, this class will handle the conversion from
    kilometer to other unit Length (CM,MM,M).
*/

public class Kilometer extends Length{

    // Private field that store the name of the unit length (KM)
    private String unitName = "KM";

    // Hashtable that will store the name of the unit lengths (Key) and their conversion rate from KM (Value)
    private Hashtable<String,Double> rates;

    /*
        Constructor that makes a call to the super constructor from the parent and create a new hashtable that
        stores keys (unit length) and their values (conversion rates).
    */
    public Kilometer(double m){
        super(m);
        rates = new Hashtable<>();
        rates.put("KM",1.0);
        rates.put("M",1000.0);
        rates.put("CM",100000.0);
        rates.put("MM",1000000.0);
    }

    // Overridden method form Length class that return the name of this unit length. (in this case its KM)
    @Override
    public String getLengthUnit() {
        return this.unitName;
    }

    /*
       Overridden method from ConvertLength interface that takes a Length object and converts KM to that unit object.
     */
    @Override
    public double convert(Length unit) {
        return getMeasurement()*rates.get(unit.getLengthUnit());
    }

}
