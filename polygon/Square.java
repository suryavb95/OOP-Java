/**
 * This class is the Square Class.
 *
 * @author Surya Bhamidipati
 * @version 1.0
 */
 
public class Square extends Rectangle{

	/**
     * Constructor for square.
     * 
     * @param anId The ID of this square.
	 * @param aLength The Length of this square.
     */
	public Square(String anId, double aLength){
		super(anId,  aLength, aLength);
	}
	
	/**
     * Constructor for square.
     * 
     * @param anId The ID of this square.
     */
	public Square(String anId){
		super(anId, 10.0, 10.0);
	}
	
	 /**
     * Basic toString of the square. 
     *
     * @return square length and ID
     */
	public String toString(){
		return "Square with side length " + getLength() +  " and id " + getId();
	}
	
}