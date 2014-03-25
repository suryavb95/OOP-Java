/**
 * This class is the DodgeCaravan Class. This is the subclass of Car. 
 *
 * @author Surya Bhamidipati
 * @version 1.5
 */
public class DodgeCaravan extends Car{

    /**
     * Constructor for DodgeCaravan.
     * 
     * @param aLicensePlate The LicensePlate of the DodgeCaravan.
     */
	 public DodgeCaravan(String aLicensePlate) {
        super(aLicensePlate);
        baseDailyRate = 40.00;
        passengerCapacity = 8;
    }

	/**
     * Basic toString of DodgeCaravan.
     * 
     * @return LicensePlate of Dodge Caravan
     */
	public String toString() {
        return "Dodge Caravan with license plate " + licensePlate;
    }
}