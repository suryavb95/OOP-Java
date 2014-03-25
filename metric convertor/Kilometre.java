public class Kilometre implements Convertible {
    private String name;
    private double conversionRate;
    private String coolFacts;
	
    public Kilometre() {
	    name = "Kilometre";
		conversionRate = 1000.0;
		coolFacts = "A marathon is about 42 kilometres long.";
	}
	
	public double getConversionRate() {
	    return conversionRate;
	}
	
    public double convertToMeters(double x) {
	    return x*conversionRate;
	}
	
    public String specialInformation() {
	    return coolFacts;
	}
	
    public String getName() {
	    return name;
	}
	
	public double convertToDifferentMeasurement(double x, double rate) {
	    return x*rate;
	}
}