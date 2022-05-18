package LengthConverterPakage;

/*
    This class is called LengthConverter and will serve as the converter that sets the unit lengths and
    makes a call to the convert method which will perform the conversion.
 */

public class LengthConverter {

    // private field called measurement
    private double measurement;

    //Currency object called unit1
    private Length unit1;

    //Currency object called unit2
    private Length unit2;

    // Constructor that takes as a parameter (double).
    public LengthConverter(double m){
        this.measurement = m;
    }

    /*
        Method that returns a Length object.
        This method takes a string and creates an object based on what the string is and puts the measurement as
        the object parameter.
     */
    public Length getUnit(String u){

        if(u.equalsIgnoreCase("KM")) {
            return  new Kilometer(this.measurement);
        }
        else if (u.equalsIgnoreCase("M")){
            return  new Meter(this.measurement);
        }
        else if (u.equalsIgnoreCase("CM")){
            return new Centimeter(this.measurement);
        }
        else if (u.equalsIgnoreCase("MM")){
            return new Millimeter(this.measurement);
        }

        return null;
    }

    // method that takes a string and sets unit1
    // This method makes a call to the getUnit method which will return a Length object and store it in unit1.
    public void setUnit1(String u1) {
        this.unit1 = getUnit(u1);
    }

    // method that takes a string and sets unit2
    // This method makes a call to the getUnit method which will return a Length object and store it in unit2.
    public void setUnit2(String u2) {
        this.unit2 = getUnit(u2);
    }

    // method that returns a double value which is the converted measurement from unit1 to unit2
    public double converting(){
        return unit1.convert(unit2);
    }
}
