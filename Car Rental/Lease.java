/**
 * This class is the Lease Class. This is the class that helps lease cars. 
 *
 * @author Surya Bhamidipati
 * @version 1.5
 */
 public class Lease {

    private Car car;
    private Customer customer;

     /**
     * Constructor for Lease.
     * 
     * @param aCar Object of car.
	 * @param aCustomer Object of Customer.
     */
	public Lease(Car aCar, Customer aCustomer) {
        car = aCar;
        customer = aCustomer;
    }

    /**
     * Returns object of Car.
     * 
     * @return car the car being leased.
     */
	public Car getCar() {
        return car;
    }

    /**
     * Calculates daily rate.
     * 
     * @return the rate.
     */
	public double dailyRate() {
        return car.baseDailyRate() * (1.0 - customer.getDiscount());
    }

    /**
     * Basic toString of Lease.
     * 
     * @return name of car and customer.
     */
	public String toString() {
        return car.toString() + " leased to " + customer;
    }
}
