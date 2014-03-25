/**
 * This class is the Rectangle Class.
 *
 * @author Surya Bhamidipati
 * @version 1.0
 */

public class Rectangle extends Polygon{
	
	private double length;
	private double width;
	private static boolean inDemand;
	
	 /**
     * Constructor for rectangle.
     * 
     * @param anId The ID of this rectangle.
	 * @param aLength The Length of this rectangle.
	 * @param aWidth The Width of this rectangle.
     */
	public Rectangle(String anId, double aLength, double aWidth){
		super(anId);
		length = aLength;
		width = aWidth;
	}
	
	/**
     * Constructor for rectangle.
     * 
     * @param anId The ID of this rectangle.
     */
	public Rectangle(String anId){
		this(anId, 20.0, 10.0);
	}
	
	 /**
     * This method gets the area of Rectangle.
     *
     * @return The area of this rectangle
     */
	public double getArea(){
		return (length*width);
	}
	
	public double getLength(){
		return length;
	}
	
	public String getId(){
		return id;
	}
	
	
	/**
     * This method gets the money total of a Rectangle. 
     * If the Rectangle is in demand, it costs twice its area - otherwise, it costs its area.
     *
     * @return The total cost of this Rectangle
     */
	public double getTotal(){
		if(inDemand == true)
			return (length*width)*2.0;
		else return (length*width);
	}
	
	/**
     * This method sets the rectangle as In demand.
     */
	public static void setInDemand(){
		inDemand = true;
	}
	
	 
    /**
     * Basic toString of the Rectangle. 
     *
     * @return Rectangle length, width and ID
     */
	public String toString(){
		return "Rectangle with length " + length + " and width " + width + " and id " + id;
	}
}
	