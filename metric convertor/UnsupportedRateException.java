public class UnsupportedRateException extends RuntimeException {
    public UnsupportedRateException() {
	    super("Sorry! This rate cannot be accepted.");
	}
	
	public UnsupportedRateException(String msg) {
	    super(msg);
	}
}