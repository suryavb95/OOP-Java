public class MetricConvertor {
    private Convertible[] convertibles = new Convertible[10];
	private Convertible[] convertibles2 = new Convertible[100];
	private int i;
	private int length;
	private int found;
	
	public MetricConvertor() {
	    convertibles[0] = new Mile();
		convertibles[1] = new Foot();
		convertibles[2] = new Yard();
		convertibles[3] = new Inch();
		convertibles[4] = new Kilometre();
		i = 5;
		length = 10;
	}
	
	public void addUnit(double rate, String name, String fact) {
	    try {
		    if(rate<=0)
			    throw new UnsupportedRateException("Sorry! Rate is negative.");
			for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == name)
				    throw new DuplicateUnitException("Sorry! Name already exists.");
			}
		}
		catch(UnsupportedRateException U) {
		    System.out.println(U.getMessage());
		}
		catch(DuplicateUnitException D) {
		    System.out.println(D.getMessage());
		}
		
		if(i >= length) {
			for(int k = 0; k < i-1; k++) {
			    convertibles2[i] = convertibles[i];
			}
			convertibles = new Convertible[2*length];
			for(int l = 0; l < i-1; l++) {
			    convertibles[i] = convertibles2[i];
			}
		}
		
		convertibles[i] = new UserCreatedConvertible(name, rate, fact);
		i++;
	}
	
	public double convertToMeters(String name, double x) {
	    found = 0;
		try {
			for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == name)
				   found = 1;
			}
			
			if(found == 0)
			    throw new UnsupportedUnitException("Sorry! Unit does not exist.");
	    }
		
		catch(UnsupportedUnitException U) {
			System.out.println(U.getMessage());
		}
		
		for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == name)
				    return convertibles[i].convertToMeters(x);
				j = i;
		}
		
	}
	
	public double convertToDifferentUnit(String baseUnit, String targetUnit, double x) {
	    found = 0;
		try {
			for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == baseUnit)
				   found = 1;
			}
			
			if(found == 0)
			    throw new UnsupportedUnitException("Sorry! Unit does not exist.");
			
			for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == targetUnit)
				   found = 1;
			}
			
			if(found == 0)
			    throw new UnsupportedUnitException("Sorry! Unit does not exist.");
	    }
		
		catch(UnsupportedUnitException U) {
			System.out.println(U.getMessage());
		}
		
		for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == baseUnit)
				    return convertibles[i].convertToDifferentMeasurement(x, convertibles[i].getConversionRate());
				j = i;
		}
		
	}
	
	public String getCoolFact(String name) {
	    found = 0;
		try {
			for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == name)
				   found = 1;
			}
			
			if(found == 0)
			    throw new UnsupportedUnitException("Sorry! Unit does not exist.");
	    }
		
		catch(UnsupportedUnitException U) {
			System.out.println(U.getMessage());
		}
		
		for(int j = 0; j < i-1; j++) {
			    if(convertibles[i].getName() == name)
				    return convertibles[i].specialInformation();
				j = i;
		}
		
	}
}
	
	