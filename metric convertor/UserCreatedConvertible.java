public class UserCreatedConvertible implements Convertible {
    private String name;
    private double conversionRate;
    private String coolFacts;
	
    public UserCreatedConvertible(String aName, double aConversionRate, String aCoolFacts ) {
	    name = aName;
		conversionRate = aConversionRate;
		coolFacts = aCoolFacts;
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