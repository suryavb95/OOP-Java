public class Yard implements Convertible {
    private String name;
    private double conversionRate;
    private String coolFacts;
	
    public Yard() {
	    name = "Yard";
		conversionRate = 0.9144;
		coolFacts = "A football field is a 100 yards.";
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