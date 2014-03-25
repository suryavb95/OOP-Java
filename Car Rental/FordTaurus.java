/**
 * This class is the FordTaurus Class. This is the subclass of Car. 
 *
 * @author Surya Bhamidipati
 * @version 1.5
 */
 
public class FordTaurus extends Car{
	
	/**
     * Constructor for FordTaurus.
     * 
     * @param aLicensePlate The LicensePlate of the FordTaurus.
     */
    public FordTaurus(String aLicensePlate) {
        super(aLicensePlate);
        baseDailyRate = 30.00;
        passengerCapacity = 4;
    }
	 
	/**
     * Basic toString of FordTaurus.
     * 
     * @return LicensePlate of Ford Taurus
     */
    public String toString() {
        return "Ford Taurus with license plate " + licensePlate;
    }
}
