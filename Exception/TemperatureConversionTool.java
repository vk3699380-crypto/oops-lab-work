class InvalidTemperatureException extends Exception { InvalidTemperatureException(String msg) { super(msg); } }
class TemperatureConversionTool {
    void convert(double temp, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' && temp < -273.15) || (unit == 'F' && temp < -459.67)) throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        if (unit == 'C') System.out.println((temp * 9 / 5) + 32 + "°F");
        else System.out.println((temp - 32) * 5 / 9 + "°C");
    }
    public static void main(String[] args) {
        TemperatureConversionTool t = new TemperatureConversionTool();
        try {
            t.convert(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}