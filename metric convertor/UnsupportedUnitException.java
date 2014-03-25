public class UnsupportedUnitException extends RuntimeException {
    public UnsupportedUnitException() {
	    super("Sorry! This unit cannot be accepted.");
	}
	
	public UnsupportedUnitException(String msg) {
	    super(msg);
	}
}