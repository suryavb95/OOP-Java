/**
 * This class is the Customer Class. This contains all the details of the customers.
 *
 * @author Surya Bhamidipati
 * @version 1.5
 */
public class Customer {

    private String name;
    private double discount;

    /**
     * Constructor for Customer.
     * 
     * @param aName The name of the customer.
     */
	public Customer(String aName) {
        name = aName;
        // By default, customers get no discount
        discount = 0.0;
    }
	
	/**
     * Returns name of Customer.
     * 
     * @return name The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns amount of discount.
     * 
     * @return discount the amount of discount.
     */
	 public double getDiscount() {
        return discount;
    }

    /**
     * Sets amount of discount.
     * 
     * @param aDiscount The amount of the discount.
     */
	 public void setDiscount(double aDiscount) {
        discount = aDiscount;
    }

    /**
     * Basic toString of Customer.
     * 
     * @return getName() The name of the customer.
     */
	 public String toString() {
        return getName();
    }
}
