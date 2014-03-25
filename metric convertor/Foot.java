public class Foot implements Convertible {
    private String name;
    private double conversionRate;
    private String coolFacts;
	
    public Foot() {
	    name = "Foot";
		conversionRate = 0.3048;
		coolFacts = "A foot is approximately the size of some king's foot.";
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