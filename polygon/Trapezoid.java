/**
 * This class is the Trapezoid Class.
 *
 * @author Surya Bhamidipati
 * @version 1.0
 */

public class Trapezoid extends Polygon{
	
	private double base1;
	private double base2;
	private double height;
	private static boolean inDemand;
	
	/**
     * Constructor for Trapezoid.
     * 
     * @param anId The ID of this Trapezoid.
	 * @param aBase1 The Base1 of this Trapezoid.
	 * @param aBase2 The Base2 of this Trapezoid.
	 * @param aHeight The height of this Trapezoid.
     */
	public Trapezoid(String anId, double aBase1, double aBase2, double aHeight){
		super(anId);
		base1 = aBase1;
		base2 = aBase2;
		height = aHeight;
	}
	
	/**
     * Constructor for Trapezoid.
     * 
     * @param anId The ID of this Trapezoid.
     */
	public Trapezoid(String anId){
		this(anId, 20.0, 10.0, 5.0);
	}
	
	/**
     * This method gets the area of Trapezoid.
     *
     * @return The area of this Trapezoid.
     */
	public double getArea(){
		return (0.5*(base1 + base2)*height);
	}
	
	/**
     * This method gets the money total of a Trapezoid. 
     * If the Trapezoid is in demand, it costs twice its area - otherwise, it costs its area.
     *
     * @return The total cost of this Trapezoid
     */
	public double getTotal(){
		if(inDemand == true)
			return (0.5*(base1 + base2)*height)*2.0;
		else return (0.5*(base1 + base2)*height);
	}
	
	/**
     * This method sets the Trapezoid as In demand.
     */
	public static void setInDemand(){
		inDemand = true;
	}
	
	/**
     * Basic toString of the Trapezoid. 
     *
     * @return Trapezoid bases, height and ID
     */
	public String toString(){
		return "Trapezoid with base1 " + base1 + " and base2 " + base2 + " and height " + height + " and id " + id;
	}
}