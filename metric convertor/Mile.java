public class Mile implements Convertible {
    private String name;
    private double conversionRate;
    private String coolFacts;
	
    public Mile() {
	    name = "Mile";
		conversionRate = 1609.34;
		coolFacts = "The city of Denver is exactly a mile high";
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