/**
 * This class is the Car Class. This is the parent class of all cars. 
 *
 * @author Surya Bhamidipati
 * @version 1.5
 */
public abstract class Car {

	private String licensePlate;
    private double baseDailyRate;
    private int passengerCapacity;

	/**
     * Constructor for Car.
     *
     * @param aLicensePlate The LicensePlate of the Car.
     */
	public Car(String aLicensePlate) {
        licensePlate = aLicensePlate;
	}

	/**
     * Returns base dailyrate of car.
     *
     * @return baseDailyRate
     */
	public double baseDailyRate() {
        return baseDailyRate;
    }

    /**
     * Returns passenger Capacity of car.
     *
     * @return passengerCapacity
     */
	 public int passengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Basic toString of Car.
     *
     * @return LicensePlate of Car
     */
	 public String toString() {
        return "Car with license plate " + licensePlate;
    }
}