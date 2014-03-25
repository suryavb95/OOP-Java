public class Inch implements Convertible {
    private String name;
    private double conversionRate;
    private String coolFacts;
	
    public Inch() {
	    name = "Inch";
		conversionRate = 0.0254;
		coolFacts = "Bamboo grows 39 inches a day";
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