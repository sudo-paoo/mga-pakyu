public class TempConverter {
    public double celToFah(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double celToKel(double celsius) {
        return celsius + 273.15;
    }

    public double fahToCel(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double fahToKel(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public double kelToCel(double kelvin) {
        return kelvin - 273.15;
    }

    public double kelToFah(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
