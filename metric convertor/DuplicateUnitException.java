public class DuplicateUnitException extends RuntimeException {
    public DuplicateUnitException() {
	    super("Sorry! This unit already exists");
	}
	
	public DuplicateUnitException(String msg) {
	    super(msg);
	}
}