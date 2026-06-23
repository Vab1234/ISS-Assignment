package Java.helper;

public class TempConvertor {
    public double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }
}