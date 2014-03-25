import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * This class is the FordTaurus Class. This is the subclass of Car. 
 *
 * @author Surya Bhamidipati
 * @version 1.5
 */

public class RentalCompany {

    private String name;
    private List<Car> availableCars;
    private List<Lease> leases;

    /**
     * Constructor for RentalCompany.
     *
     * @param aName,  Car ... initialInventory
     */
	public RentalCompany(String aName, Car ... initialInventory){
        name = aName;
        availableCars = new ArrayList<Car>();
        availableCars.addAll(Arrays.asList(initialInventory));
        leases = new ArrayList<Lease>();
    }

    /**
     * Returns name
     *
     * @return name
     */
	 public String getName() {
        return name;
    }

    /**
     * Returns list of available cars
     * 
     * @return availableCars
     */
	 public List<Car> getAvailableCars() {
        return availableCars;
    }

    /**
     * Returns list of leases
     *
     * @return leases.
     */
	 public List<Lease> getLeases() {
        return leases;
    }

    /**
     * Returns whether there are available cars or not
     *
     * @return availableCars.
     */
	 public boolean hasCarAvailable(int numPassengers) {
        return availableCars(numPassengers).size() > 0;
    }

    /**
     * Assumes #isCarAvailable returns true, otherwise behaviro is
     * undefined.
	 * @return availableCars.
     */
    public Car nextAvailableCar(int numPassengers) {
        return availableCars(numPassengers).get(0);
    }

    public List<Car> availableCars(int numPassengers) {
        List<Car> bigEnoughs = new ArrayList<Car>();
        for (Car car: availableCars) {
            if (car.passengerCapacity() >= numPassengers) {
                bigEnoughs.add(car);
            }
        }
        return bigEnoughs;
    }

    /**
     * Leases a car by removing it from the available list and adding
     * a lease to the lease list.  Assumes car is available.
     */
    public Lease lease(Car car, Customer customer) {
        availableCars.remove(car);
        Lease lease = new Lease(car, customer);
        leases.add(lease);
        return lease;
    }

	 public void returnCar(Lease lease) {
        availableCars.add(lease.getCar());
        leases.remove(lease);
    }
}
