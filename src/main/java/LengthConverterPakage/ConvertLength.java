package LengthConverterPakage;

/*
    Interface that has an abstract method that will take a Length object and then do the conversion
    when overridden in the kilometer, meter, centimeter and millimeter classes because they extend the Length class
    and the Length class implements this interface.
 */

public interface ConvertLength {
    public double convert(Length unit);
}
