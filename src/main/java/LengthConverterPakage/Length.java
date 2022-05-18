package LengthConverterPakage;

/*
      Length Class that has 1 field and 3 methods this class will be abstract because it will
      contain one abstract method and at the same time it will not make any sense if we are able to
      create a Length object.
 */

public abstract class Length implements ConvertLength{

    // field called measurement of type double
    private double measurement;

    // Length constructor that takes a double parameter / measurement
    public Length(double m){
        this.measurement = m;
    }

    // method that returns the measurement entered
    public double getMeasurement() {
        return this.measurement;
    }

    // Abstract method that needs to be overridden in the classes the extends from the Length class
    // This method will return the name of the unit like KM , M, CM and MM.
    public abstract String getLengthUnit();
}
