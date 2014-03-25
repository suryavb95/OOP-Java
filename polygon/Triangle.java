/**
 * This class is the Triangle Class.
 *
 * @author Surya Bhamidipati
 * @version 1.0
 */

public class Triangle extends Polygon{
	
	private double base;
	private double height;
	private static boolean inDemand;
	
	/**
     * Constructor for triangle.
     * 
     * @param anId The ID of this triangle.
	 * @param aBase The Base of this triangle.
	 * @param aHeight The height of this triangle.
     */
	public Triangle(String anId, double aBase, double aHeight){
		super(anId);
		base = aBase;
		height = aHeight;
	}
	
	/**
     * Constructor for triangle.
     * 
     * @param anId The ID of this triangle.
     */
	public Triangle(String anId){
		this(anId, 20.0, 10.0);
	}
	
	 /**
     * This method gets the area of triangle.
     *
     * @return The area of this triangle
     */
	public double getArea(){
		return (0.5*base*height);
	}
	
	/**
     * This method gets the money total of a triangle. 
     * If the triangle is in demand, it costs twice its area - otherwise, it costs its area.
     *
     * @return The total cost of this triangle
     */
	public double getTotal(){
		if(inDemand == true)
			return (0.5*base*height)*2.0;
		else return (0.5*base*height);
	}
	
	/**
     * This method sets the triangle as In demand.
     */
	public static void setInDemand(){
		inDemand = true;
	}
	
	/**
     * Basic toString of the triangle. 
     *
     * @return triangle base, height and ID
     */
	public String toString(){
		return "Triangle with base " + base + " and height " + height + " and id " + id;
	}
}